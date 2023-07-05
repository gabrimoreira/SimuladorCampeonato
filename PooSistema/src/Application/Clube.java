package Application;

public class Clube {
    
    private String nome;
    private double overall;
    private double overallAtaque;
    private double overallDefesa;
    private double overallMeioCampo;
    private Vector <Jogador> elenco;
    private Financas financas;
    private Campanha campanha;

    public Clube(String nome, Vector <Jogador> elenco){
        this.nome = nome;
        this.elenco = elenco;
        financas = new Financas(DefinirReceitaInicial());
        campanha = new Campanha();
    }
    
    public Jogador[] definirEscalacoesPadrao(Vector<Jogador> elenco, int formacao){
        private Jogador[] EmCampo = new Jogador[11];
        Atacante ata = new Atacante();
        private Jogador[] Ataque = this.selecionarPosicao(ata);
        MeioCampista mei = new MeioCampista();
        private Jogador[] MeioCampo = this.selecionarPosicao(mei);
        Defensor def = new Defensor();
        private Jogador[] Zaga = this.selecionarPosicao(def);
        Goleiro gol = new Goleiro();
        private Jogador[] Goleiros = this.selecionarPosicao(gol);

        this.overallAtaque = 0;
        this.overallDefesa = 0;
        this.overallMeioCampo = 0;

        //this.DefinirEmCampo(EmCampo, Ataque, MeioCampo, Zaga, Goleiros, formacao);
        if(formacao == 1){
            //4-3-3
            //Esbalecimento de um algoritmo que calcularia o overall para essa formacao;
            for(int i = 0; i < 11; i++){
                if(i < 3){
                    EmCampo[i] = Ataque[i];
                    overallAtaque = overallAtaque + EmCampo[i].getOverallAtacante;
                }
                else if(i >= 3 && i < 6){
                    EmCampo[i] = MeioCampo[i-3];
                     overallMeioCampo = overallMeioCampo + EmCampo[i].getOverallMeioCampista;
                }
                else if(i >= 6 && i < 10){
                    EmCampo[i] = Zaga[i-6];
                    overallZaga = overallZaga + EmCampo[i].getOverallDefensor;
                }
                else{
                    EmCampo[i] = Goleiros[i-10];
                }
            }
            
         }
        else if(formacao == 2){
            //4-4-2
            for(int i = 0; i < 11; i++){
                if(i < 2){
                    EmCampo[i] = Ataque[i];
                    overallAtaque = overallAtaque + EmCampo[i].getOverallAtacante;
                }
                else if(i >= 2 && i < 6){
                    EmCampo[i] = MeioCampo[i-2];
                     overallMeioCampo = overallMeioCampo + EmCampo[i].getOverallMeioCampista;
                }
                else if(i >= 6 && i < 10){
                    EmCampo[i] = Zaga[i-6];
                    overallZaga = overallZaga + EmCampo[i].getOverallDefensor;
                }
                else{
                    EmCampo[i] = Goleiros[i-10];
                }
            }
        }
        else if(formacao == 3){
            //4-5-1
            for(int i = 0; i < 11; i++){
                if(i < 1){
                    EmCampo[i] = Ataque[i];
                    overallAtaque = overallAtaque + EmCampo[i].getOverallAtacante;
                }
                else if(i >= 1 && i < 6){
                    EmCampo[i] = MeioCampo[i-1];
                     overallMeioCampo = overallMeioCampo + EmCampo[i].getOverallMeioCampista;
                }
                else if(i >= 6 && i < 10){
                    EmCampo[i] = Zaga[i-6];
                    overallZaga = overallZaga + EmCampo[i].getOverallDefensor;
                }
                else{
                    EmCampo[i] = Goleiros[i-10];
                }
            }
        }
        else if(formacao == 4){
            //4-2-4
            for(int i = 0; i < 11; i++){
                if(i < 4){
                    EmCampo[i] = Ataque[i];
                    overallAtaque = overallAtaque + EmCampo[i].getOverallAtacante;
                }
                else if(i >= 4 && i < 6){
                    EmCampo[i] = MeioCampo[i-4];
                     overallMeioCampo = overallMeioCampo + EmCampo[i].getOverallMeioCampista;
                }
                else if(i >= 6 && i < 10){
                    EmCampo[i] = Zaga[i-6];
                    overallZaga = overallZaga + EmCampo[i].getOverallDefensor;
                }
                else{
                    EmCampo[i] = Goleiros[i-10];
                }
            }
        }
        else if(formacao == 5){
            //3-4-3
            for(int i = 0; i < 11; i++){
                if(i < 3){
                    EmCampo[i] = Ataque[i];
                    overallAtaque = overallAtaque + EmCampo[i].getOverallAtacante;
                }
                else if(i >= 3 && i < 7){
                    EmCampo[i] = MeioCampo[i-3];
                     overallMeioCampo = overallMeioCampo + EmCampo[i].getOverallMeioCampista;
                }
                else if(i >= 7 && i < 10){
                    EmCampo[i] = Zaga[i-7];
                    overallZaga = overallZaga + EmCampo[i].getOverallDefensor;
                }
                else{
                    EmCampo[i] = Goleiros[i-10];
                }
            }
        }
        else if(formacao == 6){
            //3-5-2
            for(int i = 0; i < 11; i++){
                if(i < 3){
                    EmCampo[i] = Ataque[i];
                    overallAtaque = overallAtaque + EmCampo[i].getOverallAtacante;
                }
                else if(i >= 3 && i < 8){
                    EmCampo[i] = MeioCampo[i-3];
                     overallMeioCampo = overallMeioCampo + EmCampo[i].getOverallMeioCampista;
                }
                else if(i >= 8 && i < 10){
                    EmCampo[i] = Zaga[i-8];
                    overallZaga = overallZaga + EmCampo[i].getOverallDefensor;
                }
                else{
                    EmCampo[i] = Goleiros[i-10];
                }
            }
        }
        else if(formacao == 7){
            //5-2-3
            for(int i = 0; i < 11; i++){
                if(i < 3){
                    EmCampo[i] = Ataque[i];
                    overallAtaque = overallAtaque + EmCampo[i].getOverallAtacante;
                }
                else if(i >= 3 && i < 5){
                    EmCampo[i] = MeioCampo[i-3];
                     overallMeioCampo = overallMeioCampo + EmCampo[i].getOverallMeioCampista;
                }
                else if(i >= 5 && i < 10){
                    EmCampo[i] = Zaga[i-5];
                    overallZaga = overallZaga + EmCampo[i].getOverallDefensor;
                }
                else{
                    EmCampo[i] = Goleiros[i-10];
                }
            }
        }
        else if(formacao == 7){
             //5-4-1
            for(int i = 0; i < 11; i++){
                if(i < 1){
                    EmCampo[i] = Ataque[i];
                    overallAtaque = overallAtaque + EmCampo[i].getOverallAtacante;
                }
                else if(i >= 1 && i < 5){
                    EmCampo[i] = MeioCampo[i-1];
                     overallMeioCampo = overallMeioCampo + EmCampo[i].getOverallMeioCampista;
                }
                else if(i >= 5 && i < 10){
                    EmCampo[i] = Zaga[i-5];
                    overallZaga = overallZaga + EmCampo[i].getOverallDefensor;
                }
                else{
                    EmCampo[i] = Goleiros[i-10];
                }
            }
        }
        else if(formacao == 8){{
            //5-3-2
            for(int i = 0; i < 11; i++){
                if(i < 2){
                    EmCampo[i] = Ataque[i];
                    overallAtaque = overallAtaque + EmCampo[i].getOverallAtacante;
                }
                else if(i >= 2 && i < 5){
                    EmCampo[i] = MeioCampo[i-2];
                     overallMeioCampo = overallMeioCampo + EmCampo[i].getOverallMeioCampista;
                }
                else if(i >= 5 && i < 10){
                    EmCampo[i] = Zaga[i-5];
                    overallZaga = overallZaga + EmCampo[i].getOverallDefensor;
                }
                else{
                    EmCampo[i] = Goleiros[i-10];
                }
            }
        }
        else{
            //tem que tratar erro caso nenhuma dessa opcoes entrem;
            //Jogar talvez uma exceção aqui e pedir para o usuário selecionar novamente;
        }

        overall = (overallZaga + overallAtaque + overallMeioCampo + Emcampo.[10].getOverallGoleiro) / 4;
    }
//1. De acordo com certas formações: 4-3-3, 4-4-2, 4-5-1, 4-2-4, 3-4-3, 3-5-2, 5-2-3, 5-4-1, 5-3-2,  
//definir automaticamente de acordo com as qualidades para defensor, meiocampista e atacante dos jogadores do elenco, quais seriam os jogadores, que estando disponíveis, jogariam em cada uma dessas escalações. 
//Essas escalações são as que aparecerão antes da partida para que o usuário escolha.

//2. Definir uma função para determinar como ficaria o overall de cada setor do campo em cada escalação, baseando-se no número de jogadores que tem naquele setor naquela escalação específica e na qualidade deles para jogar naquele setor. 
//Estes dados serão usados durante a partida, influenciando a determinação de certos eventos(é isso inclusive que fará diferença entre o usuário escolher uma formação ou outra. Mais detalhes na descrição da simulação da partida).

//3. Define o overall geral do time com base na escalação que possuir maior média dos overalls de cada setor do campo


    public void exibirElenco(Vector<Jogador> elenco){

//1. Mostrar em ordem de posição quais jogadores estão compondo o elenco atualmente. Basicamente printar o vetor do elenco na ordem de posição, tambem pode dar ao usuario a opcao de ver por ordem de overall ou alfabetica

//2. Mostrar opção de ver estatísticas e qualidades dos jogadores exibidos

    }
    
    public void contratar(Jogador JogadorX){

//1. Conferir se está no período de tranferências

//2. Implementar mecanismo para buscar o jogador desejado, pode ser por nome, qualidade, posição, time, etc

//3. Conferir se o clube já tentou uma proposta por aquele jogador e foi recusada.

//4. Fazer proposta pelo jogador. Conferir se o valor se encaixa no orçamento atual do clube.

//5. Na semana seguinte receber a resposta do outro clube se ele aceita vender. Fazer a probabilidade de aceitar com base na importancia daquele jogador para o time (exemplo: se aquele jogador for vendido, o overall do time cai em x%, quanto maior x, mais difícil do clube aceitar).

//6. Se for recusado, exibir mensagem correspondente. Se for aceito, exibir a mensagem e subtrair o jogador do vetor de elenco do time que vendeu e adicionar ao vetor do time que comprou. Fazer o mesmo com o valor da transferência e com o salário do jogador nas finanças.

    }

    public void vender(Jogador JogadorX){

//1. Todos os jogadores do elenco terão chances de receberem porpostas de outros clubes, mas o usuário poderá colocar alguns à venda, aumentando a chance de receberem propostas.

//2. Automaticamente as propostas serão feitas com base no quanto um outro time precisaria daquele jogador (exemplo: se comprar meio campista fulano, o overall do time aumenta x%) e se cabe no orçamento atual daquele clube, daí o clube do usuário receberá a proposta.

//3. Usuário recebe mensagem com a proposta e opção para aceitar ou rejeitar. Aceitando, faz-se processo parecido com o da contratação mas inverso. 
    }
    
    public double getGeral(){
        return overall;
    }
    public double getOverallAtaque(){
        return overallAtaque;
    }
    public double getOverallDefesa(){
        return overallDefesa;
    }
    public double getOverallMeioCampo(){
        return overallMeioCampo;
    }
    
    private Jogador[] selecionarPosicao(Jogador posicao){
        //fazerBusca dos jogadores aptos a jogar
        private Vector <Jogador> jogador = new Vector<>();
        Class<?> classePosicao = posicao.getClass();
        
        for (int i = 0; i < elenco.size(); i++) {
            Class<?> classeElenco = elenco(i).getClass();
            if(classeElenco.equals(classePosicao) && elenco(i).AptoJogar()){
                 jogador.add(elenco.get(i));
             }
            Jogador[] array = jogador.toArray(new Jogador[jogador.size()]);
            //Deveria ordenar em ordem descrescente o vetor de acordo com o overall agr
            this.ordenarQualidade(array, posicao);
            return array;
        }
    }

    private void ordenarQualidade(Jogador[] vetor, Jogador posicao){
        int tamanho = vetor.length;
        for (int i = 0; i < tamanho - 1; i++) {
            int indiceMenor = i;

            for (int j = i + 1; j < tamanho; j++) {
                if (vetor[j].habilidades.getOverallAtacante() > vetor[indiceMenor].habilidades.getOverallAtacante() && (posicao instanceof Atacante)) {
                    indiceMenor = j;
                }
                else if(vetor[j].habilidades.getOverallMeioCampista() > vetor[indiceMenor].habilidades.getOverallMeioCampista() && (posicao instanceof MeioCampista)){
                    indiceMenor = j;
                }
                else if(vetor[j].habilidades.getOverallDefensor() > vetor[indiceMenor].habilidades.getOverallDefensor() && (posicao instanceof Defensor)){
                    indiceMenor = j;
                }
                else if(vetor[j].habilidades.getOverallGoleiro() > vetor[indiceMenor].habilidades.getOverallGoleiro() && (posicao instanceof Goleiro)){
                    indiceMenor = j;
                }
                else{
                    //nao deveria entrar aqui
                }
            }
            
            int temp = vetor[indiceMenor];
            vetor[indiceMenor] = vetor[i];
            vetor[i] = temp;
        }
    
    }
    private double DefinirReceitaInicial(){
        double verba = 0;
        for (int i = 0; i < this.elenco.size(); i++) {
            verba = verba + elenco.get(i).getSalario();
        }
        verba = verba * 10;
        return verba;
    }
}
 
