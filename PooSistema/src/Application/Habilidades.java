package Application;

public class Habilidades {
	private int overallGeral;
	private int overallAtacante;
	private int overallMeioCampista;
	private int overallDefensor;
	private int overallGol;
	private int velocidade;
	private int finalizacao;
	private int passe;
	private int fisico;
	private int defesa;
	private int reflexoGol;
	private int saltoGol;
	private int posicionamentoGol;

	public void definirOverallAtacante(int velocidade, int finalizacao, int passe, int fisico, int defesa){

//1.  (chute*75+drible*35+velocidade*34+físico*33+passe*18+defesa*5)/188 = Overall de atacante.

	}

	public void definirOverallMeioCampista(int velocidade, int finalizacao, int passe, int fisico, int defesa){

//1.  (passe*80+drible*30+defesa*25+chute*25+físico*25+velocidade*15)/188  = Overall de meio campista.

	}

	public void definirOverallDefensor(int velocidade, int finalizacao, int passe, int fisico, int defesa){

//1.  (defesa*85+físico*65+velocidade*20+passe*15+drible*10+chute*5)/188 = Overall de defensor.

	}

	public void definirOverallGoleiro(int reflexoGol, int saltoGol, int posicionamentoGol){

//1.  (reflexo*12+salto*10+posicionamento*8)/29 = Overall de goleiro.

	}

	public void determinaOverall() {
	
//1. Assumir como overall geral daquele jogador, o overall que ele assume em sua posição original.
	
	}
}
