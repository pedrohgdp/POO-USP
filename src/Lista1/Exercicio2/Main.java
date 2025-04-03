package Exercicio2;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(5);

        Item item1 = new Item("Cachorro", 107.50, 2);
        Item item2 = new Item("Gato", 91.00, 3);

        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        pedido.exibirPedido();

        System.out.println("Total do pedido: R$ " + pedido.calcularTotalMax());
    }
}
