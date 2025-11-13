
public class SistemaPedidos {
    public static void main(String[] args) {

     Produto p1 =  new Produto();
     p1.nome = "Caderno";
     p1.preco = 25.0;
     p1.estoque = 150;
     p1.produtoStatus();

     Produto p2 =  new Produto();
     p2.nome = "Mochila";
     p2.preco = 70.0;
     p2.estoque = 75;
     p2.produtoStatus();

     Cliente c1 = new Cliente();
     c1.nome = "Alicia de souza";
     c1.email = "aliciadesouza12@gmail.com";
     c1.clienteStatus();


    }
}
