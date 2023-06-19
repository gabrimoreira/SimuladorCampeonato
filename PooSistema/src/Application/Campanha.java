package Application;

public class Campanha {
    //atualizados a cada partida instanciada.
    private int pontos;
    private int numeroDeVitorias;
    private int numeroDeEmpates;
    private int numeroDeDerrotas;
    private int saldo;
    private int golsMarcados;
    private int golsSofridos;
    private <Vector>String confrontosDiretos;
 // guarda o confronto direto com cada time adversario, caso o usuario queira consultar os resultados das partidas ou em caso de necessidade como criterio de desempate.

	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public int getNumeroDeVitorias() {
		return numeroDeVitorias;
	}
	public void setNumeroDeVitorias(int numeroDeVitorias) {
		this.numeroDeVitorias = numeroDeVitorias;
	}
	public int getNumeroDeEmpates() {
		return numeroDeEmpates;
	}
	public void setNumeroDeEmpates(int numeroDeEmpates) {
		this.numeroDeEmpates = numeroDeEmpates;
	}
	public int getNumeroDeDerrotas() {
		return numeroDeDerrotas;
	}
	public void setNumeroDeDerrotas(int numeroDeDerrotas) {
		this.numeroDeDerrotas = numeroDeDerrotas;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public int getGolsMarcados() {
		return golsMarcados;
	}
	public void setGolsMarcados(int golsMarcados) {
		this.golsMarcados = golsMarcados;
	}
	public int getGolsSofridos() {
		return golsSofridos;
	}
	public void setGolsSofridos(int golsSofridos) {
		this.golsSofridos = golsSofridos;
	}
	public String getConfrontosDiretos() {
		return confrontosDiretos;
	}
	public void setConfrontosDiretos(String confrontosDiretos) {
		this.confrontosDiretos = confrontosDiretos;
	} 

    //mete os get e set aí
    
}
