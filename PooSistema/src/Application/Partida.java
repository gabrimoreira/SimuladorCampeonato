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
		// chance de vitoria do time da casa
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

		List<Jogador> atacantesMandante = clubeMandante.getAtacantes();
		List<Jogador> atacantesVisitante = clubeVisitante.getAtacantes();

		// Distribuir os chutes certos entre os jogadores do time mandante
		for (Jogador atacante : atacantesMandante) {
		    double probabilidadeAcerto = calcularProbabilidadeAcerto(atacante);
		    int chutesJogador = distribuirChutes(chutesCertos, probabilidadeAcerto);
		    int golsJogador = distribuirGols(chutesJogador, probabilidadeAcerto);
		    int assistenciasJogador = chutesJogador - golsJogador;

		    atacante.getEstatisticas().setChutes(chutesJogador);
		    atacante.getEstatisticas().setGols(golsJogador);
		    atacante.getEstatisticas().setAssistencias(assistenciasJogador);
		}

		// Distribuir os chutes certos entre os jogadores do time visitante
		for (Jogador atacante : atacantesVisitante) {
		    double probabilidadeAcerto = calcularProbabilidadeAcerto(atacante);
		    int chutesJogador = distribuirChutes(chutesCertos, probabilidadeAcerto);
		    int golsJogador = distribuirGols(chutesJogador, probabilidadeAcerto);
		    int assistenciasJogador = chutesJogador - golsJogador;

		    //atacante.estatisticasJogador.setChutes(chutesJogador);
		    atacante.estatisticasJogador.setGols(golsJogador);
		    atacante.estatisticasJogador.setAssistencias(assistenciasJogador);
		}

		// Função para calcular a probabilidade de acerto de um jogador com base em sua posição e habilidade
		private double calcularProbabilidadeAcerto(Jogador jogador) {
		    String posicao = jogador.getPosicao(); // Posição do jogador
		    double habilidadeJogador = jogador.getHabilidade(); // Habilidade do jogador

		    double probabilidadeAcerto;

		    // Definir probabilidade de acerto com base na posição do jogador
		    if (posicao.equals("Atacante")) {
		        probabilidadeAcerto = 0.7;
		    } else if (posicao.equals("Meio-campista")) {
		        probabilidadeAcerto = 0.6;
		    } else {
		        probabilidadeAcerto = 0.5;
		    }

		    // Aumentar a probabilidade com base na habilidade do jogador
		    probabilidadeAcerto += habilidadeJogador * 0.1;

		    return probabilidadeAcerto;
		}

		// Função para distribuir os chutes entre os jogadores com base na probabilidade de acerto
		private int distribuirChutes(int totalChutes, double probabilidadeAcerto) {
		    int chutes = 0;
		    for (int i = 0; i < totalChutes; i++) {
		        if (random.nextDouble() < probabilidadeAcerto) {
		            chutes++;
		        }
		    }
		    return chutes;
		}

		// Função para distribuir os gols entre os chutes com base na probabilidade de acerto
		private int distribuirGols(int totalChutes, double probabilidadeAcerto) {
		    int gols = 0;
		    for (int i = 0; i < totalChutes; i++) {
		        if (random.nextDouble() < probabilidadeAcerto) {
		            gols++;
		        }
		    }
		    return gols;
		}

	}

	private void simularPosseBolaEPasses() {
		int passes = random.nextInt(1200);
		int passesCertos = random.nextInt((int) 0.7 * passes, passes);
		int passesErrados = passes - passesCertos;
		estatisticas.setPassesCertos(passesCertos);
		estatisticas.setPassesErrados(passesErrados);
	}

	private void simularDribles() {
	    int dribles = random.nextInt(50);
	    estatisticas.setDribles(dribles);
	}


	private void simularDivididasEInterceptacoes() {

	}

	private void simularCartoesELesoes() {

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
