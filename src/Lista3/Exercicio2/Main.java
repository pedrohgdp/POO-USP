package Lista3.Exercicio2;

public class Main {
    public static void main(String[] args) {
        Estagiario estagiario = new Estagiario("Estagiario", 500);
        Vendedor vendedor = new Vendedor("Vendedor", 1000, 10, 10);
        Gerente gerente = new Gerente("Gerente", 2000);

        System.out.println(estagiario.calcularSalario());
        System.out.println(vendedor.calcularSalario());
        System.out.println(gerente.calcularSalario());
    }
}
