package Lista2.Exercicio1;

public class Termo {
    int coeficiente;
    int grau;

    public Termo(int a, int n){
        this.coeficiente = a;
        this.grau = n;
    }

    //Calcula o valor do termo para o x dado
    public int calcularTermo(int x){
        int pow = (int) Math.pow(x, grau);
        return coeficiente*pow;
    }

    //Retorna ele em string
    public String termoToString(){
        //Convertendo o coenficiente para string
        String coeficienteString = Integer.toString(coeficiente);
        if(grau == 1) {
            return coeficiente + "x" + " + ";
        }else if (grau == 0){
            return coeficienteString;
        }else{
            return coeficiente + "x^" + grau + " + ";
        }
    }
}
