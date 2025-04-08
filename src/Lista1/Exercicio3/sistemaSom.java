package Exercicio3;

public class sistemaSom {
    private int alturaSom;

    public sistemaSom(int volume){
        this.alturaSom = volume;
    }

    private void equalizar(){
        System.out.println("Equalizando");
    }

    public void aumentarVolume(){
        alturaSom++;
        System.out.println();
        equalizar();
    }
}
