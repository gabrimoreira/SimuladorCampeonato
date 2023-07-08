
import java.util.Random;
public class Partida {

	// Será instanciada pela função de realizar rodada do campeonato.
	// Cada rodada do campeonato terá as 5 partidas a serem instanciadas de uma vez,
	// passando clubes mandante e visitante.

	private Clube clubeMandante;
	private Clube clubeVisitante;
	private EstatisticasPartida estatisticasMandante;
	private EstatisticasPartida estatisticasVisitante;
	double chanceVitoria;
	double numeroAcoes;
	Random random = new Random();
    Jogador[] jogadoresMandante = clubeMandante.definirEscalacoesPadrao();
    Jogador[] jogadoresVisitante = clubeVisitante.definirEscalacoesPadrao();
	public Partida(Clube clubeMandante, Clube clubeVisitante) {
		this.clubeMandante = clubeMandante;
		this.clubeVisitante = clubeVisitante;
	}

	public void simularPartida() {
        probabilidadeBase();
		simularChutesGol();

		simularCartoes();
		simularLesoes();

		atualizarCampanha();
		imprimirResultado();
	}

	private void probabilidadeBase() {
	    // chance de vitória do time da casa
	    this.chanceVitoria = (double) (clubeMandante.getGeral() * 1.1) / clubeVisitante.getGeral();
	    this.numeroAcoes = random.nextInt(100);
	}

	private void simularChutesGol() {
	    int chutes = random.nextInt(40);

        double probabilidadeDefesaMandante = calcularProbabilidadeDefesa(jogadoresMandante);
        double probabilidadeDefesaVisitante = calcularProbabilidadeDefesa(jogadoresVisitante);
	    // Distribuir os gols Mandante
	    for (Jogador jogador : jogadoresMandante) {
	        double probabilidadeTotal = calcularProbabilidadeAcerto(jogador) - probabilidadeDefesaVisitante;
            if(probabilidadeTotal < 0){
                probabilidadeTotal = 0;
            }
	        int chutesJogador = distribuirChutes(chutes);
	        int golsJogador = distribuirGols(chutesJogador, probabilidadeTotal);
            estatisticasMandante.setGols(estatisticasMandante.getGols() + golsJogador);
            jogador.getEstatisticasJogador().setGols(jogador.getEstatisticasJogador().getGols() + golsJogador);
	        escolheAssistencia(golsJogador, jogador); // jogador que marcou o gol para garantir que não seja ele que deu a assistência.
	    }

        for (Jogador jogador : jogadoresVisitante) {
            double probabilidadeTotal = calcularProbabilidadeAcerto(jogador) - probabilidadeDefesaMandante;
            if (probabilidadeTotal < 0) {
                probabilidadeTotal = 0;
            }
            int chutesJogador = distribuirChutes(chutes);
            int golsJogador = distribuirGols(chutesJogador, probabilidadeTotal);
            estatisticasVisitante.setGols(estatisticasVisitante.getGols() + golsJogador);
            jogador.getEstatisticasJogador().setGols(jogador.getEstatisticasJogador().getGols() + golsJogador);
            escolheAssistencia(golsJogador, jogador);
        }
    }


    private double calcularProbabilidadeDefesa(Jogador[] jogadores){
        for (Jogador jogador : jogadores) {
            if (jogador instanceof Goleiro) {
                double probabilidadeDefesa = 0.7;
                probabilidadeDefesa *= (jogador.getHabilidades().getReflexoGol() * 0.01) * (jogador.getHabilidades().getSaltoGol() * 0.005) * (jogador.getHabilidades().getPosicionamentoGol() * 0.005);
                return probabilidadeDefesa;
            }
        }
        return 0.0;
    }
	private double calcularProbabilidadeAcerto(Jogador jogador) {
	    double probabilidadeAcerto;

	    if (jogador instanceof Atacante) {
	        probabilidadeAcerto = 0.7; // base
            probabilidadeAcerto *= (jogador.getHabilidades().getFinalizacao() * 0.01 * jogador.getHabilidades().getVelocidade() * 0.005);
	    } else if (jogador instanceof MeioCampista) {
	        probabilidadeAcerto = 0.5;
            probabilidadeAcerto *= (jogador.getHabilidades().getFinalizacao() * 0.01 * jogador.getHabilidades().getVelocidade() * 0.005);
	    } else {
	        probabilidadeAcerto = 0.4;
            probabilidadeAcerto *= (jogador.getHabilidades().getFinalizacao() * 0.01 * jogador.getHabilidades().getVelocidade() * 0.005);
	    }

	    return probabilidadeAcerto;
	}

    private void escolheAssistencia(int gols, Jogador jogadorQueMarcouGol){
        if(gols > 0){
            for(int i = 0;  i < gols;){
                for(Jogador jogador: jogadoresMandante){
                    if(jogador != jogadorQueMarcouGol){
                        double probabilidadeAssistencia = (jogador.getHabilidades().getPasse() * 0.008 + jogador.getHabilidades().getDrible() * 0.003);
                        boolean foiAssistencia = sortearComProbabilidade(probabilidadeAssistencia);
                        if(foiAssistencia == true){
                            jogador.getEstatisticasJogador().setAssistencias(jogador.getEstatisticasJogador().getAssistencias() + 1);
                        }
                    }
                }
            }
        }
    }
    private boolean sortearComProbabilidade(double probabilidade) {
        Random random = new Random();
        double sorteio = random.nextDouble(); // Gera um número aleatório entre 0 (inclusive) e 1 (exclusivo)

        return sorteio < probabilidade;
    }


	private int distribuirChutes(int totalChutes) {
	    return (int)(0.01*totalChutes);
	}

	private int distribuirGols(int totalChutes, double probabilidadeAcerto) {
	    int gols = 0;
        probabilidadeAcerto = probabilidadeAcerto * 1000;
        double probabilidadeErro = (1- probabilidadeAcerto) * 1000; 
	    for (int i = 0; i < totalChutes; i++) {
	        if (random.nextDouble(probabilidadeAcerto + probabilidadeErro) <= probabilidadeAcerto) {
	            gols++;
	        }
	    }
	    return gols;
	}

    private void simularCartoes() {
        for (Jogador jogador : jogadoresMandante) {
            double probabilidadeCartaoAmarelo = calcularProbabilidadeCartaoAmarelo(jogador);
            if (sortearComProbabilidade(probabilidadeCartaoAmarelo)) {
                int numeroCartoes = obterNumeroCartoes();
                for (int i = 0; i < numeroCartoes; i++) {
                    jogador.getEstatisticasJogador().setCartoesAmarelos(jogador.getEstatisticasJogador().getCartoesAmarelos() + 1);
                    estatisticasMandante.setCartoesAmarelos(estatisticasMandante.cartoesAmarelos + 1);
                    if( numeroCartoes < 2){
                        double probabilidadeCartaoVermelho = calcularProbabilidadeCartaoVermelho(jogador);
                        if (sortearComProbabilidade(probabilidadeCartaoVermelho)) {
                            jogador.getEstatisticasJogador().setCartoesVermelhos(jogador.getEstatisticasJogador().getCartoesVermelhos() + 1);
                            estatisticasMandante.setCartoesVermelhos(estatisticasMandante.cartoesVermelhos + 1);
                        }
                    }
                }
            }
        }
    
        for (Jogador jogador : jogadoresVisitante) {
            double probabilidadeCartaoAmarelo = calcularProbabilidadeCartaoAmarelo(jogador);
            if (sortearComProbabilidade(probabilidadeCartaoAmarelo)) {
                int numeroCartoes = obterNumeroCartoes();
                for (int i = 0; i < numeroCartoes; i++) {
                    jogador.getEstatisticasJogador().setCartoesAmarelos(jogador.getEstatisticasJogador().getCartoesAmarelos() + 1);
                    estatisticasVisitante.setCartoesAmarelos(estatisticasMandante.cartoesAmarelos + 1);
                }
                if(numeroCartoes < 2){
                    double probabilidadeCartaoVermelho = calcularProbabilidadeCartaoVermelho(jogador);
                    if (sortearComProbabilidade(probabilidadeCartaoVermelho)) {
                        jogador.getEstatisticasJogador().setCartoesVermelhos(jogador.getEstatisticasJogador().getCartoesVermelhos() + 1);
                        estatisticasVisitante.setCartoesVermelhos(estatisticasMandante.cartoesVermelhos + 1);
                    }
                }
            }
        }
    }
    
    
    private int obterNumeroCartoes() {
        int numeroCartoes = 1;
    
        if (sortearComProbabilidade(0.3)) {
            numeroCartoes = sortearComProbabilidade(0.7) ? 2 : 1;
        }
    
        return numeroCartoes;
    }
    
    private double calcularProbabilidadeCartaoAmarelo(Jogador jogador) {
        double probabilidadeCartaoAmarelo = 0.1; // Probabilidade base inicial
    
        if (jogador instanceof Defensor) {
            Defensor defensor = (Defensor) jogador;
            probabilidadeCartaoAmarelo -= defensor.getHabilidades().getDefesa() * 0.01; // Diminuir probabilidade com base na habilidade de defesa
            probabilidadeCartaoAmarelo += defensor.getHabilidades().getFisico() * 0.01; // Aumentar probabilidade com base no atributo físico
        }
    
        return probabilidadeCartaoAmarelo;
    }
    
    private double calcularProbabilidadeCartaoVermelho(Jogador jogador) {
        double probabilidadeCartaoVermelho = 0.05; // Probabilidade base inicial
    
        if (jogador instanceof Defensor) {
            Defensor defensor = (Defensor) jogador;
            probabilidadeCartaoVermelho -= defensor.getHabilidades().getDefesa() * 0.005; // Diminuir probabilidade com base na habilidade de defesa
            probabilidadeCartaoVermelho += defensor.getHabilidades().getFisico() * 0.01; // Aumentar probabilidade com base no atributo físico
        }
    
        return probabilidadeCartaoVermelho;
    }
    
    private void simularLesoes() {
        for (Jogador jogador : jogadoresMandante) {
            int duracaoLesao = calcularDuracaoLesao(jogador, estatisticasVisitante.getCartoesAmarelos() + estatisticasVisitante.getCartoesVermelhos());
            if (duracaoLesao > 0) {
                jogador.getEstatisticasJogador().setLesaoSofridaNaUltimaPartida(jogador.getEstatisticasJogador().getLesaoSofridaNaUltimaPartida() + duracaoLesao);
                estatisticasMandante.setLesionados(estatisticasMandante.getLesionados() + 1);
            }
        }
        
        for (Jogador jogador : jogadoresVisitante) {
            int duracaoLesao = calcularDuracaoLesao(jogador, estatisticasMandante.getCartoesAmarelos() + estatisticasMandante.getCartoesVermelhos());
            if (duracaoLesao > 0) {
                jogador.getEstatisticasJogador().setLesaoSofridaNaUltimaPartida(jogador.getEstatisticasJogador().getLesaoSofridaNaUltimaPartida() + duracaoLesao);
                estatisticasVisitante.setLesionados(estatisticasVisitante.getLesionados() + 1);
            }
        }
    }
    
    private int calcularDuracaoLesao(Jogador jogador, int cartoesAdversario) {
        double probabilidadeLesao = jogador.getHabilidades().getFisico() * 0.001;
        probabilidadeLesao += cartoesAdversario * 0.02;
        
        if (sortearComProbabilidade(probabilidadeLesao)) {
            int duracaoMaxima = 18;
            int duracaoMinima = 1;
            int duracaoLesao = random.nextInt(duracaoMaxima - duracaoMinima + 1) + duracaoMinima;
            return duracaoLesao;
        }
        
        return 0; // Sem lesão
    }
    
    

	private void atualizarCampanha() {
        if (estatisticasMandante.getGols() > estatisticasVisitante.getGols()) {
            clubeMandante.getCampanha().setPontos(clubeMandante.getCampanha().getPontos() + 3);
        
            clubeMandante.getCampanha().setNumeroDeVitorias(clubeMandante.getCampanha().getNumeroDeVitorias() + 1);
            clubeVisitante.getCampanha().setNumeroDeDerrotas(clubeVisitante.getCampanha().getNumeroDeDerrotas() + 1);
        
            clubeMandante.getCampanha().setGolsMarcados(clubeMandante.getCampanha().getGolsMarcados() + estatisticasMandante.getGols());
            clubeMandante.getCampanha().setGolsSofridos(clubeMandante.getCampanha().getGolsSofridos() + estatisticasVisitante.getGols());
        } else if (estatisticasMandante.getGols() < estatisticasVisitante.getGols()) {
            clubeVisitante.getCampanha().setPontos(clubeVisitante.getCampanha().getPontos() + 3);
        
            clubeVisitante.getCampanha().setNumeroDeVitorias(clubeVisitante.getCampanha().getNumeroDeVitorias() + 1);
            clubeMandante.getCampanha().setNumeroDeDerrotas(clubeMandante.getCampanha().getNumeroDeDerrotas() + 1);
        
            clubeVisitante.getCampanha().setGolsMarcados(clubeVisitante.getCampanha().getGolsMarcados() + estatisticasVisitante.getGols());
            clubeVisitante.getCampanha().setGolsSofridos(clubeVisitante.getCampanha().getGolsSofridos() + estatisticasMandante.getGols());
        } else {
            clubeMandante.getCampanha().setPontos(clubeMandante.getCampanha().getPontos() + 1);
            clubeVisitante.getCampanha().setPontos(clubeVisitante.getCampanha().getPontos() + 1);
        
            clubeMandante.getCampanha().setNumeroDeEmpates(clubeMandante.getCampanha().getNumeroDeEmpates() + 1);
            clubeVisitante.getCampanha().setNumeroDeEmpates(clubeVisitante.getCampanha().getNumeroDeEmpates() + 1);
        
            clubeMandante.getCampanha().setGolsMarcados(clubeMandante.getCampanha().getGolsMarcados() + estatisticasMandante.getGols());
            clubeMandante.getCampanha().setGolsSofridos(clubeMandante.getCampanha().getGolsSofridos() + estatisticasVisitante.getGols());
        
            clubeVisitante.getCampanha().setGolsMarcados(clubeVisitante.getCampanha().getGolsMarcados() + estatisticasVisitante.getGols());
            clubeVisitante.getCampanha().setGolsSofridos(clubeVisitante.getCampanha().getGolsSofridos() + estatisticasMandante.getGols());
        }
        
	}

	private void imprimirResultado() {
        //System.out.println(estatisticasMandante.getGols());
        //System.out.println(estatisticasVisitante.getGols());
	}
}
