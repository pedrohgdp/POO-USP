package Lista3.Exercicio3;

public class Main {
    public static void main(String[] args) {
        ProdutoPerecivel leite = new ProdutoPerecivel(01, 5.0, "Leite", 10, "25/04/2025");
        ProdutoPerecivelEspecial sorvete = new ProdutoPerecivelEspecial(55, 10.0, "Sorvete", 10, "25/05/2025");
        ProdutoNaoPerecivel arroz = new ProdutoNaoPerecivel(02, 10.0, "Arroz", 10, 10);

        Estoque estoque = new Estoque(4);

        estoque.cadastrarProduto(leite);
        estoque.cadastrarProduto(sorvete);
        estoque.cadastrarProduto(arroz);

        System.out.println(estoque.consultarProduto(55));

        System.out.println("-----------------------");

        estoque.precoTotalEstoque();

        System.out.println("-----------------------");

        estoque.imprimirProdutos();

        System.out.println("-----------------------");

        estoque.removerProduto(55);

        estoque.imprimirProdutos();

        System.out.println("-----------------------");

        ProdutoPerecivel coca = new ProdutoPerecivel(03, 10.0, "Coca", 10, "14/12/2025");

        estoque.cadastrarProduto(coca);

        estoque.imprimirProdutos();

        coca.adicionarEstoque(5);

        System.out.println("-----------------------");

        estoque.imprimirProdutos();

        System.out.println("-----------------------");
        leite.acrescentarEstoque(10);
        System.out.println("-----------------------");
        estoque.imprimirProdutos();

        System.out.println("-----------------------");
        System.out.println("Retirando estoque do leite");
        // É para remover todos por que esta a menos de 30 dias para vencer.
        leite.retirarEstoque(5);
        System.out.println("-----------------------");
        estoque.imprimirProdutos();
    }
}
