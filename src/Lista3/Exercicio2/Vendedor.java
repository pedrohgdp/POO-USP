package Lista3.Exercicio2;

public class Vendedor extends Funcionario {

    private int vendas;
    private int percentualComissao;

    public Vendedor(String nome, double salarioBase, int vendas, int percentualComissao) {
        super(nome, salarioBase);
        this.vendas = vendas;
        this.percentualComissao = percentualComissao;
    }

    public double calcularSalario() {
        return super.calcularSalario() + (vendas * percentualComissao / 100.0);
    }

}