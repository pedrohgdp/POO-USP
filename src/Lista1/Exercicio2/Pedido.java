package Exercicio2;

public class Pedido{
    //Variaveis
    Item[] Itens;
    private int quantidadeAtual = 0;

    //Construtor para botar o tamanho do array
    public Pedido(int n_max_itens){
        this.Itens = new Item[n_max_itens];
    }

    //Adicionar Itens se a quantidadeAtual de itens for menor que o tamanho do arraay
    //Na posição 0 a gente adicona o Item e aumenta a quantidade total de itens
    public void adicionarItem(Item item){
        if(quantidadeAtual < Itens.length){
            Itens[quantidadeAtual] = item;
            quantidadeAtual++;
        }else{
            System.out.println("Não é possivel adicionar mais itens ao pedido.");
        }
    }

    //Calcular total calcula o total
    public double calcularTotalMax(){
        double total = 0;
        for(int i = 0; i < quantidadeAtual; i++){
            //Chamamos o metodo calcularTotalCadaItem da classe Item e adicionamos no total
            total += Itens[i].calcularTotalCadaItem();
        }
        return total;
    }

    //Exibimos os itens
    public void exibirPedido(){
        for(int i = 0; i < quantidadeAtual; i++){
            Itens[i].exibirItem();
        }
    }
}

