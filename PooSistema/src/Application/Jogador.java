package Application;

public class Jogador {
	private String nome;
	private String posicao;
	private int overall;
	private int idade;
	private double valor;
	private double salario;
	private boolean aptoAJogar;
	Habilidades habilidades;
	EstatisticasJogador estatisticas;

	//Pessoal da partida adicionem as funcoes pra alterar as estatisticas aí
	//Alterem o que precisar alterar no construtor em relacao as estatisticas tambem

	public Jogador(String nome, String posicao, int idade, int velocidade, int finalizacao, int passe, int drible, int defesa, int fisico, int posicionamentoGol, int reflexoGol, int saltoGol){
		this.setNome(nome);
		this.setPosicao(posicao);
		this.idade = idade;
		this.habilidades = new Habilidades();
		this.determinarHabilidades(velocidade, finalizacao, passe, drible, defesa, fisico, posicionamentoGol, reflexoGol, saltoGol);
		this.determinarOverall();
		this.definirValor();
		this.definirSalarioSemanal();
		this.aptoAJogar = true;
	}

	

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

	public void determinarOverall() {
		if (this.getPosicao().equals("Atacante")){
			this.overall = this.habilidades.getOverallAtacante();
		}
		if (this.getPosicao().equals("MeioCampista")){
			this.overall = this.habilidades.getOverallMeioCampista();
		}
		if (this.getPosicao().equals("Defensor")){
			this.overall = this.habilidades.getOverallDefensor();
		}
		if (this.getPosicao().equals("Goleiro")){
			this.overall = this.habilidades.getOverallGol();
		} 
	}

	public void definirValor(){
		double fatorPosicao = 000000001;
		int fatorOverall = 000000001;
		double fatorIdade = 00000001;

		if (this.getPosicao().equals("Atacante")){
			fatorPosicao = 10;
		}
		if (this.getPosicao().equals("MeioCampista")){
			fatorPosicao = 8;
		}
		if (this.getPosicao().equals("Defensor")){
			fatorPosicao = 6;
		}
		if (this.getPosicao().equals("Goleiro")){
			fatorPosicao = 5;
		}

		if(this.overall>=88){
			fatorOverall = 40; 
		}else if(this.overall<87&&this.overall>=86){
			fatorOverall = 35; 
		}else if(this.overall<86&&this.overall>=85){
			fatorOverall = 30; 
		}else if(this.overall<85&&this.overall>=84){
			fatorOverall = 25; 
		}else if(this.overall<84&&this.overall>=82){
			fatorOverall = 20; 
		}else if(this.overall<82&&this.overall>=80){
			fatorOverall = 15; 
		}else if(this.overall<80&&this.overall>=78){
			fatorOverall = 10; 
		}else if(this.overall<78&&this.overall>=75){
			fatorOverall = 7; 
		} else if (this.overall<75){
			fatorOverall = 5;
		}

		if(this.idade<=19){
			fatorIdade = 6; 
		}else if(this.idade>19&&this.idade<=22){
			fatorIdade = 5; 
		}else if(this.idade>22&&this.idade<=25){
			fatorIdade = 4; 
		}else if(this.idade>25&&this.idade<=28){
			fatorIdade = 3; 
		}else if(this.idade>28&&this.idade<=31){
			fatorIdade = 2; 
		}else if(this.idade>31&&this.idade<=34){
			fatorIdade = 1; 
		} else if (this.idade>=35){
			fatorIdade = 0.8;
		}

		this.valor = fatorPosicao*fatorIdade*fatorOverall*100000;

	}

	public void definirSalarioSemanal(){
		this.salario = this.valor/(40*(50 - this.idade));

	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
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
