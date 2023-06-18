package Application;

public abstract class Jogador {
	private String nome;
	private int overall;
	private int idade;
	private double valor;
	private double salario;
	private boolean aptoAJogar;
	Habilidades habilidades;
	EstatisticasJogador estatisticas;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getOverall() {
		return overall;
	}
	public void setOverall(int overall) {
		this.overall = overall;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public boolean isAptoAJogar() {
		return aptoAJogar;
	}
	public void setAptoAJogar(boolean aptoAJogar) {
		this.aptoAJogar = aptoAJogar;
	}
	public Habilidades getHabilidades() {
		return habilidades;
	}
	public void setHabilidades(Habilidades habilidades) {
		this.habilidades = habilidades;
	}
	public EstatisticasJogador getEstatisticasJogador() {
		return estatisticas;
	}
	public void setEstatisticasJogador(EstatisticasJogador estatisticas) {
		this.estatisticas = estatisticas;
	}
}
