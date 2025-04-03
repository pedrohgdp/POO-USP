package Exercicio3;

public class Main {
    public static void main(String[] args) {
        //Criamos um celular que o construtor recebe as info que passamos
        //E passa para o construtor de cada classe
        //Como uma arvode de distribuição de cosias
        celular celular = new celular(10, 5, 10, "244.242.255.-43");

        //Criamos um objeto celular com base na classe celular
        //E mostramos as informações na tela, nesse casso chamamos o metodo mostrar detalher que passa
        //Os detalhes que especificamos na classe celular
        celular.mostrarDetalhes();
    }
}
