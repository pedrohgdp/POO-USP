package Exercicio3;

public class Tela {
    private int brilhoTela;

    public Tela(int brilhoTela){
        this.brilhoTela = brilhoTela;
    }

    private void lerToque(){
        System.out.printf("Lendo que está sendo tocado");
    }

    public void ligarTela(){
        System.out.println("Tela ligada!");
    }

    public void aumentarBrilho(){
        //Toque pode ser na barra de aumentar brilho
        lerToque();
        brilhoTela++;
    }

    public void desligarTela(){
        System.out.println("Tela desligada!");
    }

}
