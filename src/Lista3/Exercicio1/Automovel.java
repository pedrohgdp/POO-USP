package Lista3.Exercicio1;

public class Automovel extends Veiculo{

    public void listarVerificacoes(){
        super.listarVerificacoes();
        System.out.println(" do automovel");
        System.out.println();
    }

    public void ajustar(){
        super.ajustar();
        System.out.println(" o automovel");
        System.out.println();
    }

    public void limpar(){
        super.limpar();
        System.out.println(" o automovel");
        System.out.println();
    }

    public void trocarOleo(){
        System.out.println(" Trocando oleo do automovel");
        System.out.println();
    }


}
