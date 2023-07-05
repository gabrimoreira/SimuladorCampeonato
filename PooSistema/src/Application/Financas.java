package Application;

public class Financas {

    private double receita;

    public Financas(double receita){
        this.receita = receita;    
    }
    
    public boolean pagarValorContratacao(double balancoGeral){
        if(this.receita - balancoGeral >= 0)
        {
            this.receita = receita - balancoGeral;
            return true;
            //Aqui tem como jogar uma exception de saldo insuficiente;
        }
        else{
            return false;
        }
    }
    public void receberValorVenda(double balancoGeral){
        if(balancoGeral >= 0)
        {
            this.receita = receita + balancoGeral; 
        }
        else{
            //jogar uma exception de valor negativo
        }
    }
    public void pagarSalariosJogadores(Vector <Jogadores> elenco){
        //1. Somar de todos os jogadores do elenco seus salarios e desconta do orçament do clube tal quantia a cada semana(cada rodada realizada)
        //jogador.salario
    }
    public void pagarSalariosFuncionarios(double balancoGeral){
//1. De acordo com o tamanho do clube paga mais ou menos tambem a cada semana
    }
    public void pagarManutencaoDeEstadio(double balancoGeral){
//1. Acionado quando a proxima partida do clube sera como mandante
    }
    public void receberVendaDeIngressos(double balancoGeral){
//1. Acionado por cada partida instanciada, recebe mais quando o jogo é em casa, depende tambem da força do adversario e campanha do time
    }
    public void receberMarketing(double balancoGeral){
//1. pode ir aumentando se a campanha do clube estiver boa
    }
    public void receberInvestimentos(double balancoGeral){
// pensar depois se dá pra fazer algo aí
    }
}
