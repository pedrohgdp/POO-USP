package Exercicio3;

public class celular {
    //Criamos as variaveis com os tipos da classe, mas não instaciamos elas
    private Processador processador;
    private Tela tela;
    private sistemaSom sistemaDeSom;
    private sistemaComunicacao sistemaDeComunicacao;

    //Esse construtor recebe as informações e instacia as classes, nesse construtor de fato as classes viram objetos
    //Esse objetos são meio que guardados nas variaveis que criamos, com os tipos das classes
    public celular(int velocidade, int nivelBrilho, int alturaSom, String ip){
        this.processador = new Processador(velocidade);
        this.tela = new Tela(nivelBrilho);
        this.sistemaDeSom = new sistemaSom(alturaSom);
        this.sistemaDeComunicacao = new sistemaComunicacao(ip);
    }

    //Funcao de mostrar detalhe do que esta funcionando no celular
    //Ela pega cada objeto que temos e executa cada metodo do objeto passando que queremos para cada metodo
    public void mostrarDetalhes(){
        processador.executarTarefa("Abrir youtube");
        tela.conteudoTela("Vídeo corre de phd");
        sistemaDeSom.tocandoMusica("Audio video corre de phd");
        sistemaDeComunicacao.mandaMSG("Fala, principe", "Matheuzinho");
    }
}
