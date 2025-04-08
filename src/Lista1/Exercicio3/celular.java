package Exercicio3;

public class celular {
    //Criamos as variaveis com os tipos da classe, mas não instaciamos elas
    private Processador processador;
    private Tela tela;
    private sistemaSom sistemaDeSom;
    private sistemaComunicacao sistemaDeComunicacao;

    //Esse construtor recebe as informações e instacia as classes, nesse construtor de fato as classes viram objetos
    //Esse objetos são meio que guardados nas variaveis que criamos, com os tipos das classes
    public celular(int nivelBrilho, int alturaSom){
        this.processador = new Processador();
        this.tela = new Tela(nivelBrilho);
        this.sistemaDeSom = new sistemaSom(alturaSom);
        this.sistemaDeComunicacao = new sistemaComunicacao();
    }

    public void ligarCelular(){
        processador.ligar();
        tela.ligarTela();
        System.out.println("Celular Ligado");
    }

    public void aumentarBrilho(){
        tela.aumentarBrilho();
    }

    public void aumentarSom(){
        sistemaDeSom.aumentarVolume();
    }

    public void mandarMenssagem(int numero){
        sistemaDeComunicacao.mandarMsg(numero);
    }

    public void delisgarCelular(){
        processador.desligar();
        System.out.println();
        tela.desligarTela();
        System.out.println();
        System.out.println("Celular desligado!");
    }
}
