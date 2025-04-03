package Exercicio3;

public class Processador {
    //Velocidade processador privado ( só nessa classe {ou no objeto instanciado})
    private int velocidade;

    //COnstrutor para por a velocidade
    public Processador(int velocidade){
        this.velocidade = velocidade;
    }

    //Função para executar uma tarefa que sera passada no celular
    public void executarTarefa(String Tarefa){
        System.out.println("Tarefa: " + Tarefa);
    }
}
