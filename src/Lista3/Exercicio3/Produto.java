package Lista3.Exercicio3;

public class Produto {
    protected int codigo;
    protected double precoUnitario;
    protected String descricao;
    protected int quantidadeEstoque;

    public Produto(int codigo, double precoUnitario, String descricao, int quantidadeEstoque) {
        this.codigo = codigo;
        this.precoUnitario = precoUnitario;
        this.descricao = descricao;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void adicionarEstoque(int quantidadeAdicionar) {
        this.quantidadeEstoque += quantidadeAdicionar;
    }

    public int retirarEstoque(int quantidade) {
        if (quantidade < 0) {
            System.out.println("Quantidade a ser retirada não pode ser negativa");
            return 0;
        } else {
            int qtdRet = Math.min(this.quantidadeEstoque, quantidade);
            this.quantidadeEstoque -= qtdRet;
            return qtdRet;
        }
    }

    public String imprimirProduto() {
        return "Produto: " + this.codigo + ", " + this.descricao + ", custo de R$ " + this.precoUnitario + ", quantidade: " + this.quantidadeEstoque;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
}
