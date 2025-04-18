package Lista3.Exercicio3;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class ProdutoPerecivel extends Produto {
    protected LocalDate dataValidade;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public ProdutoPerecivel(int codigo, double precoUnitario, String descricao, int quantidadeEstoque, String dataValidadeStr) {
        super(codigo, precoUnitario, descricao, quantidadeEstoque);
        this.dataValidade = LocalDate.parse(dataValidadeStr, formatter);
    }

    public int retirarEstoque(int quantidade) {
        Scanner lerDigitado = new Scanner(System.in);
        System.out.println("Para retirar um item digite a data de hoje no formato dd/MM/yyyy: ");
        String dataDeHojeStr = lerDigitado.nextLine();
        LocalDate dataDeHoje = LocalDate.parse(dataDeHojeStr, formatter);
        long diferencaDias = ChronoUnit.DAYS.between(dataDeHoje, dataValidade);
        lerDigitado.close();

        if (diferencaDias <= 30 || diferencaDias < 0) {
            System.out.println("O produto está a menos de 30 dias para vencer, retirando todo o estoque.");
            return super.retirarEstoque(super.getQuantidadeEstoque());
        } else {
            return super.retirarEstoque(quantidade);
        }
    }

    public boolean acrescentarEstoque(int quantidadeAdicionar) {
        if (super.getQuantidadeEstoque() == 0) {
            super.adicionarEstoque(quantidadeAdicionar);
            return true;
        } else {
            System.out.println("Não é possível adicionar estoque a um produto perecível que já tem estoque.");
            return false;
        }
    }

    public LocalDate getDataValidade(){
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade){
        this.dataValidade = dataValidade;
    }

}