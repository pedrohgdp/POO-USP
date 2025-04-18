package Lista3.Exercicio2;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    public double calcularSalario() {
        return getSalarioBase() + 2000;
    }

}
