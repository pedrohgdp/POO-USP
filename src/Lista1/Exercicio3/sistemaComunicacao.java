package Exercicio3;

public class sistemaComunicacao {
    //Ip da rede
    private String ip;
    //Construtor
    public sistemaComunicacao(String ip){
        this.ip = ip;
    }
    //Funcao para executar a execução da menssagem, recebe como parametro a menssagem e o contato a se mandar
    public void mandaMSG(String MSG, String contato){
        System.out.println("Mandando essa menssagem: " + MSG + " para o contato: " + contato);
    }
}
