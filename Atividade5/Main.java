
public class Main {
    public static void main(String[] args) {
        //Produtos
        Produto teclado = new Produto("Teclado",150);
        Produto monitor = new Produto("Monitor",400);
        Produto microfone = new Produto("Microfone",300);
        Produto cadeira = new Produto("Cadeira",200);
        Produto mousepad = new Produto("Mousepad",50);
        Produto mouse =  new Produto("Mouse",100);

        //Clientes
        ClientePF cliente1 = new ClientePF("Joaquim", "123.456.789-00", "joao@email.com");
        ClientePJ cliente2 = new ClientePJ("Empresa x","00.000.000/0001-00", "empresax@gmail.com" );
        ClientePF cliente3 = new ClientePF("Elena", "293.321.123-00","elena@gmail.com");

     // Pedido 1 - cartão 150

        Pedido pedido1 = new Pedido(cliente1);
        pedido1.adicionarItem(mouse, 1);
        pedido1.adicionarItem(mousepad, 1);
        pedido1.setMetodoPagamento(new PagamentoCartaoCredito());

        pedido1.mostrarResumo();
        System.out.println("Pagamento com cartão (150): " + pedido1.processarPagamento());
        System.out.println("_______________________________________________________________");


// Pedido 2 - cartão 500


        Pedido pedido2 = new Pedido(cliente3);
        pedido2.adicionarItem(microfone, 1);
        pedido2.adicionarItem(cadeira, 1);
        pedido2.setMetodoPagamento(new PagamentoCartaoCredito());

        pedido2.mostrarResumo();
        System.out.println("Pagamento com cartão (500): " + pedido2.processarPagamento());
        System.out.println("_______________________________________________________________");

// Pedido 3 - boleto 800


        Pedido pedido3 = new Pedido(cliente1);
        pedido3.adicionarItem(monitor, 1);
        pedido3.adicionarItem(mousepad, 3);
        pedido3.adicionarItem(teclado, 1);
        pedido3.adicionarItem(mouse, 1);
        pedido3.setMetodoPagamento(new PagamentoBoleto());

        pedido3.mostrarResumo();
        System.out.println("Pagamento com boleto (800): " + pedido3.processarPagamento());
        System.out.println("_______________________________________________________________");

// Pedido 4 - boleto 1500


        Pedido pedido4 = new Pedido(cliente2);

        pedido4.adicionarItem(cadeira, 2);
        pedido4.adicionarItem(monitor, 2);

        pedido4.adicionarItem(microfone, 1);

        pedido4.setMetodoPagamento(new PagamentoBoleto());

        pedido4.mostrarResumo();
        System.out.println("Pagamento com boleto (1500): " + pedido4.processarPagamento());
        System.out.println("_______________________________________________________________");



    }
}
