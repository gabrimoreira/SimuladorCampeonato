package Application;

public abstract class Jogador {
	protected String nome;
	protected int overall;
	protected int idade;
	protected double valor;
	protected double salario;
	protected boolean aptoAJogar;
	protected Habilidades habilidades;
	protected EstatisticasJogador estatisticas;

	//Pessoal da partida adicionem as funcoes pra alterar as estatisticas aí
	//Alterem o que precisar alterar no construtor em relacao as estatisticas tambem


	
	public void determinarHabilidades(int velocidade, int finalizacao, int passe, int drible, int defesa, int fisico, int posicionamentoGol, int reflexoGol, int saltoGol){
		this.habilidades.setFinalizacao(finalizacao);
		this.habilidades.setVelocidade(velocidade);
		this.habilidades.setDefesa(defesa);
		this.habilidades.setDrible(drible);
		this.habilidades.setFisico(fisico);
		this.habilidades.setPasse(passe);
		this.habilidades.setPosicionamentoGol(posicionamentoGol);
		this.habilidades.setSaltoGol(saltoGol);
		this.habilidades.setReflexoGol(reflexoGol);

		this.habilidades.definirOverallAtacante();
		this.habilidades.definirOverallMeioCampista();
		this.habilidades.definirOverallDefensor();
		this.habilidades.definirOverallGoleiro();

	}

	public abstract void determinarOverall();

	public abstract void definirValor();

	public void definirSalarioSemanal(){
		this.salario = this.valor/(40*(50 - this.idade));

	}

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
	public void setSalario(double salario){
		this.salario = salario;
	}
	public double getSalario(){
		return this.salario;
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
