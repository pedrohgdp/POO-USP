package Lista3.Exercicio1.Exercicio2;

public class Item{
    //Variaveis dos itens
    String nome;
    double precoUnitario;
    int quantidade;

    //Construtor para poder por as coisas
    public Item(String nome, double precoUnitario, int quantidade){
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    //Calcular o valor total de cada itens
    public double calcularTotalCadaItem(){
        return quantidade * precoUnitario;
    }

    //Exibir info dos itens
    public void exibirItem() {
        System.out.println(quantidade + "x " + nome + " - R$ " + precoUnitario + " cada (Total: R$ " + calcularTotalCadaItem() + ")");
    }
}
