package Application;

public class Habilidades {
	private int overallAtacante;
	private int overallMeioCampista;
	private int overallDefensor;
	private int overallGol;
	private int velocidade;
	private int finalizacao;
	private int passe;
	private int drible;
	private int fisico;
	private int defesa;
	private int reflexoGol;
	private int saltoGol;
	private int posicionamentoGol;

	public Habilidades(){

	}

	public void definirOverallAtacante(){
		float it = 190;
		int overallAtacanteDeLado = Math.round((60*this.finalizacao+20*this.fisico+40*this.velocidade+30*this.passe+42*this.drible+8*this.defesa)/it);
		int overallCentroAvante = Math.round((85*this.finalizacao+42*this.fisico+24*this.velocidade+17*this.passe+27*this.drible+5*this.defesa)/it);

		if(overallAtacanteDeLado>overallCentroAvante){
			this.overallAtacante = overallAtacanteDeLado;
		}else{
			this.overallAtacante = overallCentroAvante;
		}
	}

	public void definirOverallMeioCampista(){
		float it = 189;
		int overallMeiaAtacante = Math.round((33*this.finalizacao+17*this.fisico+33*this.velocidade+60*this.passe+47*this.drible+10*this.defesa)/it);
		int overallMeiaCentral = Math.round((25*this.finalizacao+25*this.fisico+15*this.velocidade+80*this.passe+30*this.drible+25*this.defesa)/it);
		int overallVolante = Math.round((10*this.finalizacao+45*this.fisico+15*this.velocidade+50*this.passe+20*this.drible+60*this.defesa)/it);

		if(overallMeiaAtacante>=overallMeiaCentral&&overallMeiaAtacante>=overallVolante){
			this.overallMeioCampista = overallMeiaAtacante;
		} else if(overallMeiaCentral>=overallMeiaAtacante&&overallMeiaCentral>=overallVolante){
			this.overallMeioCampista = overallMeiaCentral;
		} else if(overallVolante>=overallMeiaAtacante&&overallVolante>=overallMeiaCentral){
			this.overallMeioCampista = overallVolante;
		}

	}

	public void definirOverallDefensor(){
		float it = 190;
		int overallZagueiro = Math.round((5*this.finalizacao+73*this.fisico+12*this.velocidade+17*this.passe+8*this.drible+85*this.defesa)/it);
		int overallLateral = Math.round((10*this.finalizacao+30*this.fisico+35*this.velocidade+33*this.passe+32*this.drible+60*this.defesa)/it);

		if(overallZagueiro>overallLateral){
			this.overallDefensor = overallZagueiro;
		}else{
			this.overallDefensor = overallLateral;
		}

	}

	public void definirOverallGoleiro(){
		this.overallGol = Math.round((this.reflexoGol*12+this.saltoGol*10+this.posicionamentoGol*8)*10/295);

	}

	public int getDefesa() {
		return defesa;
	}public void setDefesa(int defesa) {
		this.defesa = defesa;
	}public int getDrible() {
		return drible;
	}public void setDrible(int drible) {
		this.drible = drible;
	}public int getFinalizacao() {
		return finalizacao;
	}public void setFinalizacao(int finalizacao) {
		this.finalizacao = finalizacao;
	}public int getFisico() {
		return fisico;
	}public void setFisico(int fisico) {
		this.fisico = fisico;
	}public int getOverallAtacante() {
		return overallAtacante;
	}public void setOverallAtacante(int overallAtacante) {
		this.overallAtacante = overallAtacante;
	}public int getOverallDefensor() {
		return overallDefensor;
	}public void setOverallDefensor(int overallDefensor) {
		this.overallDefensor = overallDefensor;
	}public int getOverallGol() {
		return overallGol;
	}public void setOverallGol(int overallGol) {
		this.overallGol = overallGol;
	}public int getOverallMeioCampista() {
		return overallMeioCampista;
	}public void setOverallMeioCampista(int overallMeioCampista) {
		this.overallMeioCampista = overallMeioCampista;
	}public int getPasse() {
		return passe;
	}public void setPasse(int passe) {
		this.passe = passe;
	}public int getPosicionamentoGol() {
		return posicionamentoGol;
	}public void setPosicionamentoGol(int posicionamentoGol) {
		this.posicionamentoGol = posicionamentoGol;
	}public int getReflexoGol() {
		return reflexoGol;
	}public void setReflexoGol(int reflexoGol) {
		this.reflexoGol = reflexoGol;
	}public int getSaltoGol() {
		return saltoGol;
	}public void setSaltoGol(int saltoGol) {
		this.saltoGol = saltoGol;
	}public int getVelocidade() {
		return velocidade;
	}public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
}
