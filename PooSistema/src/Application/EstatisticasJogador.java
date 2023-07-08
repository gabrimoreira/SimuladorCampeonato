
public class EstatisticasJogador {

	private int gols;
	private int assistencias;
	private int cartoesAmarelos;
	private int cartoesVermelhos;

	private boolean levouCartaoAmareloNaUltimaPartida; //partida instanciada vai atualizar pra sim ou nao
	//private double mediaDeCartoesAmarelosNasUltimas3Partidas; //se chegar em 1 ja suspende
	private boolean levouCartaoVermelhoNaUltimaPartida; //partida instanciada vai atualizar pra sim ou nao
	private int lesaoSofridaNaultimaPartida; //se o jogador sofrer lesao, atribuir de acordo com a gravidade dela um numero que sera quantos jogos vai perder
	private int numeroDeJogosSemPoderAtuar; // de acordo com gravidade de lesao ou suspensao sofrida, estabelece quantos jogos o jogador ficara com o seu apto a jogar em false, ir decrementando a cada rodada realizada.
	private int[] cartoesAmarelosUltimasTresPartidasComCartao = new int[3];

	public void atualizarCartoesUltimasTresPartidas() {
		if (levouCartaoAmareloNaUltimaPartida) {
			if (this.cartoesAmarelosUltimasTresPartidasComCartao[0] == 0) {
				cartoesAmarelosUltimasTresPartidasComCartao[0] = 1;
			} else if (cartoesAmarelosUltimasTresPartidasComCartao[1] == 0) {
				cartoesAmarelosUltimasTresPartidasComCartao[1] = 1;
			} else if (cartoesAmarelosUltimasTresPartidasComCartao[2] == 0) {
				cartoesAmarelosUltimasTresPartidasComCartao[2] = 1;
				suspenderPorCartaoAmarelo();
				cartoesAmarelosUltimasTresPartidasComCartao[0] = cartoesAmarelosUltimasTresPartidasComCartao[1] = cartoesAmarelosUltimasTresPartidasComCartao[2] = 0;
			}
		} else if (levouCartaoVermelhoNaUltimaPartida) {
			suspenderPorCartaoVermelho();
			cartoesAmarelosUltimasTresPartidasComCartao[0] = cartoesAmarelosUltimasTresPartidasComCartao[1] = cartoesAmarelosUltimasTresPartidasComCartao[2] = 0;
		}
	}

	public void suspenderPorCartaoAmarelo(){
		numeroDeJogosSemPoderAtuar = 1;
	}

	public void suspenderPorCartaoVermelho(){
		numeroDeJogosSemPoderAtuar = 1;
	}

	public void atualizarNumeroDeJogosSemPoderAtuar(){
		if (lesaoSofridaNaultimaPartida >= 1) {
			numeroDeJogosSemPoderAtuar = lesaoSofridaNaultimaPartida;
		} else if (numeroDeJogosSemPoderAtuar == 1 && levouCartaoAmareloNaUltimaPartida == false && levouCartaoVermelhoNaUltimaPartida == false) {
			numeroDeJogosSemPoderAtuar = 0;
		} else if (numeroDeJogosSemPoderAtuar > 1 && levouCartaoAmareloNaUltimaPartida == false && levouCartaoVermelhoNaUltimaPartida == false) {
			numeroDeJogosSemPoderAtuar--;
		}
	}
        
	public int getGols() {
		return gols;
	}
	public void setGols(int gols) {
		this.gols = gols;
	}
	public int getAssistencias() {
		return assistencias;
	}
	public void setAssistencias(int assistencias) {
		this.assistencias = assistencias;
	}
	public int getCartoesAmarelos() {
		return cartoesAmarelos;
	}
	public void setCartoesAmarelos(int cartoesAmarelos) {
		this.cartoesAmarelos = cartoesAmarelos;
	}
	public int getCartoesVermelhos() {
		return cartoesVermelhos;
	}
	public void setCartoesVermelhos(int cartoesVermelhos) {
		this.cartoesVermelhos = cartoesVermelhos;
	}
	public int getLesaoSofridaNaUltimaPartida() {
		return lesaoSofridaNaultimaPartida;
	}
	public void setLesaoSofridaNaUltimaPartida(int lesaoSofridaNaultimaPartida) {
		this.lesaoSofridaNaultimaPartida = lesaoSofridaNaultimaPartida;
	}
	public boolean isLevouCartaoAmareloNaUltimaPartida() {
		return levouCartaoAmareloNaUltimaPartida;
	}
	public void setLevouCartaoAmareloNaUltimaPartida(boolean levouCartaoAmareloNaUltimaPartida) {
		this.levouCartaoAmareloNaUltimaPartida = levouCartaoAmareloNaUltimaPartida;
	}
	public boolean isLevouCartaoVermelhoNaUltimaPartida() {
		return levouCartaoVermelhoNaUltimaPartida;
	}
	public void setLevouCartaoVermelhoNaUltimaPartida(boolean levouCartaoVermelhoNaUltimaPartida) {
		this.levouCartaoVermelhoNaUltimaPartida = levouCartaoVermelhoNaUltimaPartida;
	}
}
