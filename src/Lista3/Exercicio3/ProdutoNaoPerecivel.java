package Lista3.Exercicio3;

public class ProdutoNaoPerecivel extends Produto{
    private int tempoGarantia;

    public ProdutoNaoPerecivel(int codigo, double precoUnitario, String descricao, int quantidadeEstoque, int tempoGarantia) {
        super(codigo, precoUnitario, descricao, quantidadeEstoque);
        this.tempoGarantia = tempoGarantia;
    }

    public int getTempoGarantia() {
        return tempoGarantia;
    }
}
