package Exercicio3;

public class Main {
    public static void main(String[] args) {
        //Criamos um celular que o construtor recebe as info que passamos
        //E passa para o construtor de cada classe
        //Como uma arvode de distribuição de cosias
        celular celular = new celular(3, 5);

        celular.ligarCelular();

        celular.aumentarBrilho();

        celular.aumentarSom();

        celular.mandarMenssagem(988463010);

        celular.delisgarCelular();
    }
}
