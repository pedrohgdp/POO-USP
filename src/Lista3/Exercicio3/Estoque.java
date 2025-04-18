package Lista3.Exercicio3;

public class Estoque {
    private Produto produtos[];

    public Estoque(int quantidadeProdutos) {
        this.produtos = new Produto[quantidadeProdutos];
    }

    public void cadastrarProduto(Produto produtoParam) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] == null) {
                produtos[i] = produtoParam;
                break;
            }
        }
    }

    public String consultarProduto(int codigo) {
        for (Produto produto : produtos) {
            if (produto != null && produto.getCodigo() == codigo)
                return produto.imprimirProduto();
        }
        return null;
    }

    public void removerProduto(int codigo) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null && produtos[i].getCodigo() == codigo) {
                produtos[i] = null;
                break;
            }
        }
    }

    public void precoTotalEstoque() {
        double sum = 0;
        for (Produto produto : produtos) {
            if (produto != null && produto.getQuantidadeEstoque() > 0) {
                sum += produto.getPrecoUnitario() * produto.getQuantidadeEstoque();
            }
        }
        System.out.println("A soma do estoque é de: " + sum);
    }

    public void imprimirProdutos() {
        for (Produto produto : produtos) {
            if (produto != null) {
                System.out.println(produto.imprimirProduto());
            }
        }
    }
}
