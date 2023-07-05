package Application;

import java.util.List;
import java.util.Random;
public class Partida {

	// Será instanciada pela função de realizar rodada do campeonato.
	// Cada rodada do campeonato terá as 5 partidas a serem instanciadas de uma vez,
	// passando clubes mandante e visitante.

	private Clube clubeMandante;
	private Clube clubeVisitante;
	private EstatisticasPartida estatisticasMandante;
	private EstatisticasPartida estatisticasVisitante;
	private EstatisticasPartida estatisticas; // Estatística geral
	//private List<EstatisticaPartida> estatisticasPassada  pra cada jogador?
	double chanceVitoria;
	double numeroAcoes;
	Random random = new Random();

	public Partida(Clube clubeMandante, Clube clubeVisitante) {
		this.clubeMandante = clubeMandante;
		this.clubeVisitante = clubeVisitante;
		definirEscalacoesPadrao(clubeMandante.elenco);
		definirEscalacoesPadrao(clubeVisitante.elenco);
	}
	public int definirFormacao(int formacao) {
		//frontend botao
	}

	public void simularPartida() {

		// 1. Põe o usuário numa tela pré-partida onde ele pode ver a escalação do
		// adversário e overall, e escolher a escalação que ele irá usar dentre as
		// escalações padrão(chamar a funcao do clube que define as escalacoes padrao,
		// ja que podem have jogadores de fora. Podem haver tambem mudancas nos overais
		// dos jogares conforme seu desempenho. Usuario escolhera entao com base nas
		// escalacoes feitas com os jogadores disponiveis para aquela partida e nas
		// habilidades atualizadas).

		// 2. Começa a simulação depois de escolhida a escalaçao

		// 3. Sorteia número de chutes e o número de chutes a gol (chutes certos) para
		// cada time com base na qualidade geral de seu ataque, e na qualidade geral da
		// defesa adversária.
		// Com base na qualidade dos atacantes e do goleiro adversário determina quantos
		// chutes a gol vão entrar, definindo o placar. Define dentre o número de chutes
		// quantos foram comuns ou de cabeça(defensores terão participação aumentada de
		// caeça em relaçao a comuns),
		// daí, distribui o número de chutes certos/errados dos times para cada jogador
		// daquele time, com base em sua posição e qualidade de finalização(ou de
		// físico, se for de cabeça). Dentro do número de chutes certos de cada jogador,
		// define quais marcaram os gols do time e quem deu a assistência: Para o gol,
		// com base em qualidades de finalização, drible e velocidade; caso o gol tenha
		// sido de cabeça, no físico. Para a assistência, com base no passe e drible.
		// Calcula-se número de chutes a gol menos os gols para definir o número de
		// defesas do goleiro adversário.
		// 3. Simular chutes a gol
		simularChutesGol();

		// 4. Sorteia posse de bola e com base na posse e na qualidade geral de meio
		// campo do time, o número de passes no geral e número de passes que foram
		// acertados para cada time.
		// Além da posse de bola, para os passes em geral, levará em conta a qualidade
		// de defesa dos jogadores adversários, pois quanto maior for, mais passes
		// errados o time terá.
		// Distribui quantos passes cada jogador errou e acertou com base na sua posição
		// (via de regra, meio campistas darão mais passes, mas se o time tiver dado um
		// número alto de chutes, a proporção de passes dos atacantes aumentará, pois
		// terão atacado mais constantemente)
		// e qualidade de passe de cada jogador.
		simularPosseBolaEPasses();
		// 5. Sorteia o número de dribles certos e errados para cada jogador, com base
		// em sua posição e qualidade de drible,
		// e na qualidade de defesa geral do time adversário.
		simularDribles();
		// 6. Sorteia número de divididas geral e dividias ganhas, interceptações e
		// duelos aéreos com base no número de chutes que o outro time deu (quanto mais
		// chutes o adversário deu, via de regra, mais a defesa foi exigida).
		// Taxa de divididas ganhas levará em consideração a qualidade de drible e
		// velocidade dos jogadores do time adversário. Distribui-os para cada jogador
		// com base na sua posição e em suas qualidades de defesa para as
		// interceptações, defesa e físico para divididas, e físico para duelos aéreos.
		// (O número de interceptações a ser sorteado estará ligado ao número de passes
		// errados geral no time adversário, consideraremos que a maioria dos passes
		// errados serão interceptações adversárias)
		simularDivididasEInterceptacoes();
		// 7. Sorteia cartôes e lesões. Distribui-os entre os jogadores.
		simularCartoesELesoes();
		// 8. Atribui notas aos jogadores com base no que fizeram durante a partida.
		// Gols, assistências, passes certos, dribls certos, divididas certas,
		// interceptações, duelos aéreos ganhos e defesas do goleiro, aumentarão a nota
		// dos jogadores conforme suas posições.
		// Gols sofridos, chutes errados, passes errados, dribles errados, divididas
		// erradas e cartões tomados diminuirão a nota dos jogadores conforme suas
		// posições.
		atribuirNotas();
		// 9. Atualiza a campanha dos times com base no placar. Todos os atributos em
		// clubeMandante.Campanha e do visitante tambem, serão alterados.
		atualizarCampanha();

		// 10. Atualiza as estatísticas dos jogadores conforme aquilo que está em seu
		// quadro de estatísticas: gols, assistências, cartões, nota etc, etc. O quadro
		// de estatisticas deve ser devidamente atualizado a cada partida jogada.
		atualizarEstatisticasJogadores();
		// 11. Printa o resultado, eventos da partida e os melhores jogadores em
		// campo(que receberam melhor nota). Mostra opção de ver detallhadamente todas
		// as estatísticas da partida e o desempenho de todos os jogadores.
		imprimirResultado();
	}

	private void probabilidadeBase() {
	    // chance de vitória do time da casa
	    this.chanceVitoria = (double) (clubeMandante.getGeral() * 1.1) / clubeVisitante.getGeral();
	    this.numeroAcoes = random.nextInt(100);
	}

	private void simularChutesGol() {
	    int chutes = random.nextInt(40);
	    int chutesErrados = random.nextInt(chutes + 1);
	    int chutesCertos = chutes - chutesErrados;
	    int cabecadas = random.nextInt(15);
	    int cabecadasErradas = random.nextInt(cabecadas + 1);
	    int cabecadasCertas = cabecadas - cabecadasErradas;

	    estatisticasMandante.setChutesCertos((int) Math.round(chanceVitoria * chutesCertos));
	    estatisticasVisitante.setChutesCertos(chutesCertos - estatisticasMandante.getChutesCertos());

	    List<Atacante> atacantesMandante = clubeMandante.getAtacantes();
	    List<Atacante> atacantesVisitante = clubeVisitante.getAtacantes();

	    // Distribuir os chutes certos entre os jogadores do time mandante
	    for (Atacante atacante : atacantesMandante) {
	        double probabilidadeAcerto = calcularProbabilidadeAcerto(atacante);
	        int chutesJogador = distribuirChutes(chutesCertos, probabilidadeAcerto);
	        int golsJogador = distribuirGols(chutesJogador, probabilidadeAcerto);
	        int assistenciasJogador = chutesJogador - golsJogador;

	        atacante.getEstatisticas().setChutes(chutesJogador);
	        atacante.getEstatisticas().setGols(golsJogador);
	        atacante.getEstatisticas().setAssistencias(assistenciasJogador);
	    }

	    // Distribuir os chutes certos entre os jogadores do time visitante
	    for (Atacante atacante : atacantesVisitante) {
	        double probabilidadeAcerto = calcularProbabilidadeAcerto(atacante);
	        int chutesJogador = distribuirChutes(chutesCertos, probabilidadeAcerto);
	        int golsJogador = distribuirGols(chutesJogador, probabilidadeAcerto);
	        int assistenciasJogador = chutesJogador - golsJogador;

	        atacante.getEstatisticas().setChutes(chutesJogador);
	        atacante.getEstatisticas().setGols(golsJogador);
	        atacante.getEstatisticas().setAssistencias(assistenciasJogador);
	    }
	}


	private double calcularProbabilidadeAcerto(Jogador jogador) {
	    double probabilidadeAcerto;

	    if (jogador instanceof Atacante) {
	        probabilidadeAcerto = 0.7;
	    } else if (jogador instanceof MeioCampista) {
	        probabilidadeAcerto = 0.6;
	    } else {
	        probabilidadeAcerto = 0.5;
	    }

	    probabilidadeAcerto += jogador.getHabilidade() * 0.1;

	    return probabilidadeAcerto;
	}


	private int distribuirChutes(int totalChutes, double probabilidadeAcerto) {
	    int chutes = 0;
	    for (int i = 0; i < totalChutes; i++) {
	        if (random.nextDouble() < probabilidadeAcerto) {
	            chutes++;
	        }
	    }
	    return chutes;
	}

	private int distribuirGols(int totalChutes, double probabilidadeAcerto) {
	    int gols = 0;
	    for (int i = 0; i < totalChutes; i++) {
	        if (random.nextDouble() < probabilidadeAcerto) {
	            gols++;
	        }
	    }
	    return gols;
	}

	private void simularPosseBolaEPasses() {
	    int passes = random.nextInt(1200);
	    int passesCertos = distribuirPasses(passes);
	    int passesErrados = passes - passesCertos;
	    estatisticas.setPassesCertos(passesCertos);
	    estatisticas.setPassesErrados(passesErrados);
	}

	private int distribuirPasses(int totalPasses) {
	    int passesCertos = 0;

	    List<Jogador> jogadores = clubeMandante.getJogadores(); // Ou clubeVisitante, dependendo do contexto
	    int numJogadores = jogadores.size();

	    for (Jogador jogador : jogadores) {
	        double probabilidadeAcerto = calcularProbabilidadeAcerto(jogador);
	        int passesJogador = distribuirAcoes(totalPasses, probabilidadeAcerto, numJogadores);
	        passesCertos += passesJogador;

	        // Atualizar estatísticas do jogador
	        jogador.getEstatisticas().setPassesCertos(passesJogador);
	        jogador.getEstatisticas().setPassesErrados(totalPasses - passesJogador);
	    }

	    return passesCertos;
	}

	private double calcularProbabilidadeAcerto(Jogador jogador) {
	    double probabilidadeAcerto = 0.5; // Probabilidade base inicial

	    if (jogador instanceof Atacante) {
	        probabilidadeAcerto += jogador.getPasse() * 0.01; // Aumentar probabilidade com base na habilidade de passe do atacante
	    } else if (jogador instanceof MeioCampista) {
	        probabilidadeAcerto += jogador.getPasse() * 0.01; // Aumentar probabilidade com base na habilidade de passe do meio-campista
	    } else if (jogador instanceof Goleiro) {
	        Goleiro goleiro = (Goleiro) jogador;
	        double reflexoGol = goleiro.getReflexoGol(); // Reflexo do goleiro

	        probabilidadeAcerto += reflexoGol * 0.01; // Aumentar probabilidade com base no reflexo do goleiro
	    }

	    return probabilidadeAcerto;
	}

	private int distribuirAcoes(int totalAcoes, double probabilidadeAcerto, int numJogadores) {
	    int acoes = 0;

	    for (int i = 0; i < totalAcoes; i++) {
	        if (random.nextDouble() < (probabilidadeAcerto / numJogadores)) {
	            acoes++;
	        }
	    }

	    return acoes;
	}


	private void simularDribles() {
	    int dribles = random.nextInt(50);
	    int driblesCertos = distribuirDribles(dribles);
	    estatisticas.setDribles(driblesCertos);
	    estatisticas.setDriblesErrados(dribles - driblesCertos);
	}

	private int distribuirDribles(int totalDribles) {
	    int driblesCertos = 0;

	    List<Jogador> jogadores = clubeMandante.getJogadores(); // Ou clubeVisitante, dependendo do contexto

	    for (Jogador jogador : jogadores) {
	        double probabilidadeSucesso = calcularProbabilidadeSucessoDrible(jogador);
	        int driblesJogador = distribuirAcoes(totalDribles, probabilidadeSucesso, jogadores.size());
	        driblesCertos += driblesJogador;

	        jogador.getEstatisticas().setDriblesCertos(driblesJogador);
	        jogador.getEstatisticas().setDriblesErrados(totalDribles - driblesJogador);
	    }

	    return driblesCertos;
	}

	private double calcularProbabilidadeSucessoDrible(Jogador jogador) {
	    double probabilidadeSucesso = 0.5; // Probabilidade base inicial

	    if (jogador instanceof Atacante) {
	        probabilidadeSucesso += jogador.getDrible() * 0.01; // Aumentar probabilidade com base na habilidade de drible do atacante
	    } else if (jogador instanceof MeioCampista) {
	        probabilidadeSucesso += jogador.getDrible() * 0.01; // Aumentar probabilidade com base na habilidade de drible do meio-campista
	    }

	    return probabilidadeSucesso;
	}


	private void simularDivididasEInterceptacoes() {
	    List<Jogador> jogadoresMandante = clubeMandante.getJogadores();
	    List<Jogador> jogadoresVisitante = clubeVisitante.getJogadores();

	    int divididas = random.nextInt(100);
	    int divididasCertasMandante = distribuirDivididas(divididas, jogadoresMandante);
	    int divididasCertasVisitante = distribuirDivididas(divididas, jogadoresVisitante);

	    int interceptacoes = random.nextInt(50);
	    int interceptacoesCertasMandante = distribuirInterceptacoes(interceptacoes, jogadoresMandante);
	    int interceptacoesCertasVisitante = distribuirInterceptacoes(interceptacoes, jogadoresVisitante);

	    estatisticasMandante.setDivididasCertas(divididasCertasMandante);
	    estatisticasMandante.setInterceptacoesCertas(interceptacoesCertasMandante);
	    estatisticasVisitante.setDivididasCertas(divididasCertasVisitante);
	    estatisticasVisitante.setInterceptacoesCertas(interceptacoesCertasVisitante);
	}

	private int distribuirDivididas(int totalDivididas, List<Jogador> jogadores) {
	    int divididasCertas = 0;

	    for (Jogador jogador : jogadores) {
	        double probabilidadeSucesso = calcularProbabilidadeSucessoDividida(jogador);
	        int divididasJogador = distribuirAcoes(totalDivididas, probabilidadeSucesso, jogadores.size());
	        divididasCertas += divididasJogador;

	        jogador.getEstatisticas().setDivididasCertas(divididasJogador);
	        jogador.getEstatisticas().setDivididasErradas(totalDivididas - divididasJogador);
	    }

	    return divididasCertas;
	}

	private double calcularProbabilidadeSucessoDividida(Jogador jogador) {
	    double probabilidadeSucesso = 0.5; 

	    if (jogador instanceof Defensor) {
	        probabilidadeSucesso += jogador.getHabilidade() * 0.01; // Aumentar probabilidade com base na habilidade do defensor
	    }

	    return probabilidadeSucesso;
	}

	private int distribuirInterceptacoes(int totalInterceptacoes, List<Jogador> jogadores) {
	    int interceptacoesCertas = 0;

	    for (Jogador jogador : jogadores) {
	        double probabilidadeSucesso = calcularProbabilidadeSucessoInterceptacao(jogador);
	        int interceptacoesJogador = distribuirAcoes(totalInterceptacoes, probabilidadeSucesso, jogadores.size());
	        interceptacoesCertas += interceptacoesJogador;

	        jogador.getEstatisticas().setInterceptacoesCertas(interceptacoesJogador);
	        jogador.getEstatisticas().setInterceptacoesErradas(totalInterceptacoes - interceptacoesJogador);
	    }

	    return interceptacoesCertas;
	}

	private double calcularProbabilidadeSucessoInterceptacao(Jogador jogador) {
	    double probabilidadeSucesso = 0.5; 

	    if (jogador instanceof Defensor) {
	        probabilidadeSucesso += jogador.getHabilidade() * 0.01; // Aumentar probabilidade com base na habilidade do defensor
	    }

	    return probabilidadeSucesso;
	}

	private void simularCartoesELesoes() {
	    List<Jogador> jogadoresMandante = clubeMandante.getJogadores();
	    List<Jogador> jogadoresVisitante = clubeVisitante.getJogadores();

	    int cartoesAmarelosMandante = distribuirCartoesAmarelos(jogadoresMandante);
	    int cartoesAmarelosVisitante = distribuirCartoesAmarelos(jogadoresVisitante);

	    int cartoesVermelhosMandante = distribuirCartoesVermelhos(jogadoresMandante);
	    int cartoesVermelhosVisitante = distribuirCartoesVermelhos(jogadoresVisitante);

	    int lesõesMandante = distribuirLesões(jogadoresMandante);
	    int lesõesVisitante = distribuirLesões(jogadoresVisitante);

	    estatisticasMandante.setCartoesAmarelos(cartoesAmarelosMandante);
	    estatisticasMandante.setCartoesVermelhos(cartoesVermelhosMandante);
	    estatisticasMandante.setLesoes(lesõesMandante);

	    estatisticasVisitante.setCartoesAmarelos(cartoesAmarelosVisitante);
	    estatisticasVisitante.setCartoesVermelhos(cartoesVermelhosVisitante);
	    estatisticasVisitante.setLesoes(lesõesVisitante);
	}

	private int distribuirCartoesAmarelos(List<Jogador> jogadores) {
	    int cartoesAmarelos = 0;

	    for (Jogador jogador : jogadores) {
	        double probabilidadeReceberCartao = calcularProbabilidadeReceberCartao(jogador);
	        if (random.nextDouble() < probabilidadeReceberCartao) {
	            cartoesAmarelos++;
	            jogador.getEstatisticas().adicionarCartaoAmarelo();
	        }
	    }

	    return cartoesAmarelos;
	}

	private double calcularProbabilidadeReceberCartao(Jogador jogador) {
	    double probabilidadeReceberCartao = 0.1; 

	    if (jogador instanceof Defensor) {
	        probabilidadeReceberCartao += jogador.getHabilidade() * 0.01; // Aumentar probabilidade com base na habilidade do defensor
	    }

	    return probabilidadeReceberCartao;
	}

	private int distribuirCartoesVermelhos(List<Jogador> jogadores) {
	    int cartoesVermelhos = 0;

	    for (Jogador jogador : jogadores) {
	        double probabilidadeReceberCartao = calcularProbabilidadeReceberCartao(jogador);
	        if (random.nextDouble() < probabilidadeReceberCartao) {
	            cartoesVermelhos++;
	            jogador.getEstatisticas().adicionarCartaoVermelho();
	        }
	    }

	    return cartoesVermelhos;
	}

	private int distribuirLesões(List<Jogador> jogadores) {
	    int lesões = 0;

	    for (Jogador jogador : jogadores) {
	        double probabilidadeLesão = calcularProbabilidadeLesão(jogador);
	        if (random.nextDouble() < probabilidadeLesão) {
	            lesões++;
	            jogador.getEstatisticas().adicionarLesão();
	        }
	    }

	    return lesões;
	}

	private double calcularProbabilidadeLesão(Jogador jogador) {
	    double probabilidadeLesão = 0.05; 

	    probabilidadeLesão += jogador.getFisico() * 0.01; // Aumentar probabilidade com base no atributo físico do jogador

	    return probabilidadeLesão;
	}


	private void atribuirNotas() {

	}

	private void atualizarCampanha() {

	}

	private void atualizarEstatisticasJogadores() {

	}

	private void imprimirResultado() {

	}
}
