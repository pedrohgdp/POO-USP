package Exercicio3;

public class sistemaComunicacao {
    private boolean conexao;

    //Construtor
    public sistemaComunicacao(){
        this.conexao = false;
    }

    private void conectar(){
        this.conexao = true;
    }

    public void mandarMsg(int numero){
        conectar();
        System.out.printf("Mandando 'oi!' para: " + numero);
        System.out.println();
    }
}
