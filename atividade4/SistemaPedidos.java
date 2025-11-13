
public class SistemaPedidos {
    public static void main(String[] args) {
     ClientePF clientePF = new ClientePF("Joao Silvia", "@joao@gmail.com", "123.456.798-90");
     ClientePJ clientePJ = new ClientePJ("Empresa ABC", "contato@empresax.com", "12.345.678/0001-99");

     Produto teclado = new Produto("Fortrek Teclado", 79.10);
     Produto mousePad = new Produto("Mouse Pad Preto", 8.90);
     Produto mouse = new Produto("Mouse dell preto", 69.00);

     Pedido pedidoPF = new Pedido("11/08/2025", clientePF, 3);
     Pedido pedidoPJ = new Pedido("11/08/2025", clientePJ, 3);


     pedidoPF.adicionarItem(teclado, 1);
     pedidoPF.adicionarItem(mousePad, 2);
     pedidoPF.adicionarItem(mouse, 2);


     pedidoPJ.adicionarItem(teclado, 2);
     pedidoPJ.adicionarItem(mousePad, 1);
     pedidoPJ.adicionarItem(mouse, 1);

     pedidoPF.statusPedido();
     System.out.println("________________________________");
     pedidoPJ.statusPedido();


    }
}
