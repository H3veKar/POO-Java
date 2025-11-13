
public class SistemaPedidos {
    public static void main(String[] args) {

     Produto p1 =  new Produto("Caderno", 25.0);
     p1.setEstoque(150);
     p1.produtoStatus();

     Produto p2 = new Produto("Mochila", 70.0);
     p2.setEstoque(75);
     p2.produtoStatus();

     Cliente c1 = new Cliente("Alicia de souza","aliciadesouza12@gmail.com");
     c1.clienteStatus();

     Pedido p = new Pedido(7, "Em andamento", "11/08/2025");
     p.statusPedido();


    }
}
