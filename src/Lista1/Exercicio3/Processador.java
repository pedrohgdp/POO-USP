package Exercicio3;

public class Processador {
    //Ligado processador privado ( só nessa classe {ou no objeto instanciado})
    private boolean ligado;

    public Processador(){
        this.ligado = false;
    }

    private void limparRam(){
        System.out.printf("Limpando RAM");
    }

    public void ligar(){
        System.out.println("Processador ligado!");
        ligado = true;
    }

    public void desligar(){
        System.out.println("Delisgando processador!");
        limparRam();
        ligado = false;
    }

}
