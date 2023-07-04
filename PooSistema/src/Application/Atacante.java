package Application;

public class Atacante extends Jogador {

    public Atacante(String nome, int idade, int velocidade, int finalizacao, int passe, int drible, int defesa, int fisico, int posicionamentoGol, int reflexoGol, int saltoGol){
		this.setNome(nome);
		this.idade = idade;
		this.habilidades = new Habilidades();
		this.determinarHabilidades(velocidade, finalizacao, passe, drible, defesa, fisico, posicionamentoGol, reflexoGol, saltoGol);
		this.determinarOverall();
		this.definirValor();
		this.definirSalarioSemanal();
		this.aptoAJogar = true;
	}

    public void determinarOverall() {
		this.overall = this.habilidades.getOverallAtacante();
		
	}

    public void definirValor(){
		double fatorPosicao = 10;
		int fatorOverall = 1;
		double fatorIdade = 1;


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

}
