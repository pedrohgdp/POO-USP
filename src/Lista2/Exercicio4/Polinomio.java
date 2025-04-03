package Exercicio4;

public class Polinomio {
    //Variaveis
    private Termo[] termos;
    private int grauMaxPolinomio;

    //Construtor recebe o grau maximo daquele polinomio
    //Instancia o array termos com o tamanho do grau maximo
    public Polinomio(int grauMaxPolinomio) {
        this.grauMaxPolinomio = grauMaxPolinomio;
        termos = new Termo[grauMaxPolinomio + 1];
    }

    //Adiciona um novo termo do polinomio no array
    public void AddTermo(int coeficiente, int grau) {
        if (grau <= grauMaxPolinomio) {
            if (termos[grau] == null) {
                //Termo na posição do grau é uma instancia do objeto termo
                termos[grau] = new Termo(coeficiente, grau);
            } else {
                //se a posição onde do grau ja estiver com um termo, somamos seu coeficiente com o coeficiente novo
                termos[grau].coeficiente += coeficiente;
            }
        } else {
            System.out.println("Entrada invalida!");
        }
    }

    //MUDAR
    //Calcular total, calcula o total com o resultado de cada termo
    public void calcularTotal(int x) {
        int resultado = 0;
        for (int i = 0; i < termos.length; i++) {
            if (termos[i] != null) {
                resultado += termos[i].calcularTermo(x);
            }
        }
        System.out.println("O total da conta é: " + resultado);
    }

    //Mostra o polinomio na tela
    public void Mostra() {
        //Percorrendo de traz para frente para mostrar o maior indice primeiro
        for (int i = termos.length - 1; i >= 0; i--) {
            if (termos[i] != null) {
                System.out.print(termos[i].termoToString());
            }
        }
        System.out.println();
    }
}

