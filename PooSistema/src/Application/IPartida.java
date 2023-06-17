package Application;

public interface IPartida {
	//Retorna o número de ações e quais são elas
	public int sortearAcoes(Clube clubeMandante, Clube clubeVisitante){}
	//Acoes é o retorno de sortearAcoes.
	public void atualizarEstatisticasJogador(Clube clubeMandante, Clube clubeVisitante,int acoes) {}
	
	public void atualizarEstatisticasPartida(Clube clubeMandante, Clube clubeVisitante,int acoes) {}
	
	public void atualizarEstatisticasClube(Clube clubeMandante, Clube clubeVisitante,int acoes) {}
}
