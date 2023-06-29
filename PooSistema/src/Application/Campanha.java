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
	private Vector<Clubes> confrontosDiretos;
 // guarda o confronto direto com cada time adversario, caso o usuario queira consultar os resultados das partidas ou em caso de necessidade como criterio de desempate.
	public Campanha(){
		this.pontos = 0;
		this.numeroDeVitorias = 0;
		this.numeroDeEmpates = 0;
		this.numeroDeDerrotas = 0;
		this.saldo = 0;
		this.golsMarcados = 0;
		this.golsSofridos = 0;
		this.confrontosDiretos = new Vector<>(10);
		//implementar com string talvez
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = this.pontos + pontos;
	}
	public int getNumeroDeVitorias() {
		return numeroDeVitorias;
	}
	public void setNumeroDeVitorias(int numeroDeVitorias) {
		this.numeroDeVitorias = this.numeroDeVitorias + numeroDeVitorias;
	}
	public int getNumeroDeEmpates() {
		return numeroDeEmpates;
	}
	public void setNumeroDeEmpates(int numeroDeEmpates) {
		this.numeroDeEmpates = this.numeroDeEmpates + numeroDeEmpates;
	}
	public int getNumeroDeDerrotas() {
		return numeroDeDerrotas;
	}
	public void setNumeroDeDerrotas(int numeroDeDerrotas) {
		this.numeroDeDerrotas = this.numeroDeDerrotas + numeroDeDerrotas;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = this.getGolsMarcados() - this.getGolsSofridos();
		//Aqui é necessario atualizar a partir dos golsofridos/marcados;
	}
	public int getGolsMarcados() {
		return golsMarcados;
	}
	public void setGolsMarcados(int golsMarcados) {
		this.golsMarcados = this.golsMarcados + golsMarcados;
	}
	public int getGolsSofridos() {
		return golsSofridos;
	}
	public void setGolsSofridos(int golsSofridos) {
		this.golsSofridos = this.golsSofridos + golsSofridos;
	}
	public Clube[] getConfrontosDiretos() {
		return confrontosDiretos.toArray(new Clube[confrontosDiretos.size()]);
	}
	public void setConfrontosDiretos(Clube confrontosDiretos) {
		this.confrontosDiretos.add(confrontosDiretos);
	} 

    //mete os get e set aí
    
}
