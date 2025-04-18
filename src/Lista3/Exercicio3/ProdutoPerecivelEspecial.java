package Lista3.Exercicio3;

public class ProdutoPerecivelEspecial extends ProdutoPerecivel{

    public ProdutoPerecivelEspecial(int codigo, double precoUnitario, String descricao, int quantidadeEstoque, String dataValidadeStr) {
        super(codigo, precoUnitario, descricao, quantidadeEstoque, dataValidadeStr);
    }

    public String imprimirProduto() {
        return "Produto: " + getCodigo() + ", " + getDescricao() + ", " + "quantidade: " + getQuantidadeEstoque() + ", Data de validade: " + getDataValidade();
    }
}
