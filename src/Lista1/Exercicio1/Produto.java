package Exercicio1;

public class Produto {

    String nome;
    double preco;
    int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque  );
    }

    public void adicionarEstoque(int quantidade){
        quantidadeEmEstoque += quantidade;
    }

    public void removerEstoque(int quantidade){
        quantidadeEmEstoque -= quantidade;
    }

}
