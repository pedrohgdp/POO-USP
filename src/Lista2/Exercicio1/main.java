package Lista2.Exercicio1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        System.out.print("Digite o grau maximo do polinomio: ");
        int grau = entradaUsuario.nextInt();
        Polinomio polinomio = new Polinomio(grau);

        for(int i = grau; i >= 0; i--){
            System.out.print("Digite o coeficiente do termo: ");
            int coeficienteDoTermo = entradaUsuario.nextInt();
            System.out.print("Digite o grau do termo: ");
            int grauDoTermo = entradaUsuario.nextInt();

            polinomio.AddTermo(coeficienteDoTermo, grauDoTermo);
        }

        System.out.print("O polinomio é: ");
        polinomio.Mostra();
        System.out.println("Digite o x que você quer calcular o polinomio: ");
        int x = entradaUsuario.nextInt();
        polinomio.calcularTotal(x);
    }
}
