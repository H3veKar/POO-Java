
public class SistemaPedidos {
    public static void main(String[] args) {

     Produto teclado = new Produto("Fortrek Teclado", 79.10);
     Produto mousePad = new Produto("Mouse Pad Preto", 8.90);
     Produto mouse = new Produto("Mouse dell preto", 69.00);

     ItemPedido itemTeclado = new ItemPedido(teclado,1 );
     ItemPedido itemMouse = new ItemPedido(mouse, 2);
     ItemPedido itemMousePad = new ItemPedido(mousePad, 2);

     ItemPedido[] itens = new ItemPedido[3];
     itens[0] = itemTeclado;
     itens[1] = itemMousePad;
     itens[2] = itemMouse;

     Pedido pedido = new Pedido("11/08/2025", itens);

     pedido.statusPedido();


    }
}
