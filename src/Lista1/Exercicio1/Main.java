package Exercicio1;

public class Main {
    public static void main(String[] args) {
        Produto banana = new Produto("Banana", 1.50, 5);

        banana.exibirInformacoes();
        banana.adicionarEstoque(2);
        System.out.println("-----------------------------------");

        System.out.println("Depois de adicionar 2: ");
        banana.exibirInformacoes();
        banana.removerEstoque(2);

        System.out.println("------------------------------------");
        System.out.println("Depois de remover 2: ");
        banana.exibirInformacoes();
    }
}