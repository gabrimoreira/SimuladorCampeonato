package Application;

public class EstatisticasJogador {

	private int gols;
	private int assistencias;
	private int cartoesAmarelos;
	private int cartoesVermelhos;
	private int defesasGol;
	private int desarmes;
	private double nota;

	private double mediaDasUltimasNotas; //para evoluir ou perder overall
	private boolean levouCartaoAmareloNaUltimaPartida; //partida instanciada vai atualizar pra sim ou nao
	private double mediaDeCartoesAmarelosNasUltimas2Partidas; //se chegar em 1 ja suspende
	private boolean levouCartaoVermelhoNaUltimaPartida; //partida instanciada vai atualizar pra sim ou nao
	private int lesaoSofridaNaultimaPartida; //se o jogador sofrer lesao, atribuir de acordo com a gravidade dela um numero que sera quantos jogos vai perder
	private <Vector> int numeroDeJogosSemPoderAtuar; // de acordo com gravidade de lesao ou suspensao sofrida, estabelece quantos jogos o jogador ficara com o seu apto a jogar em false, ir decrementando a cada rodada realizada.

	
	public void atualizarMediaDeCartoesAmarelosNasUltimas3Partidas(this.mediaDeCartoesAmarelosNasUltimas3Partidas, this.levouCartaoAmareloNaUltimaPartida){

	}
	public int suspenderPorCartaoAmarelo(this.mediaDeCartoesAmarelosNasUltimas3Partidas){

	}
	public int suspenderPorCartaoVermelho(this.levouCartaoVermelhoNaUltimaPartida){

	}
	public void atualizarNumeroDeJogosSemPoderAtuar(this.numeroDeJogosSemPoderAtuar, int resultadoDaFuncaoDeSuspenderPorCartaoAmarelo, int resultadoDaFuncaoDeSuspenderPorVermelho, int lesaoSofridaNaultimaPartida){

	}

	public void alterarOverall(this.mediaDasUltimasNotas){
//1. Definir funcao para melhorar habilidades se ele tiver as ultimas notas maiores que x ou piorar se estiverem menores que y.
	
//2. Promover as devidas alteracoes na classe de habilidades do jogador
	}

	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
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
	public int getDefesasGol() {
		return defesasGol;
	}
	public void setDefesasGol(int defesasGol) {
		this.defesasGol = defesasGol;
	}
	public int getDesarmes() {
		return desarmes;
	}
	public void setDesarmes(int desarmes) {
		this.desarmes = desarmes;
	}
	
}
