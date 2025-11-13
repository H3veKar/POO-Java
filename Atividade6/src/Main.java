public class Main {
    public static void main(String[] args) {

        // Produtos
        Produto teclado = new Produto("Teclado", 150);
        Produto monitor = new Produto("Monitor", 400);
        Produto microfone = new Produto("Microfone", 300);
        Produto cadeira = new Produto("Cadeira", 200);
        Produto mousepad = new Produto("Mousepad", 50);
        Produto mouse = new Produto("Mouse", 100);

        // Clientes
        ClientePF cliente1 = new ClientePF("Joaquim", "joao@email.com", "123.456.789-00");
        ClientePJ cliente2 = new ClientePJ("Empresa X", "empresax@gmail.com", "00.000.000/0001-00");
        ClientePF cliente3 = new ClientePF("Elena", "elena@gmail.com", "293.321.123-00");

        Pedido pedido1 = new Pedido(cliente1);
        pedido1.adicionarItem(mouse, 1);
        pedido1.adicionarItem(mousepad, 1);
        pedido1.setMetodoPagamento(new PagamentoCartaoCredito());

        pedido1.exibirResumo();
        System.out.println("Pagamento com cartão (150): " + pedido1.processarPagamento());
        System.out.println("_______________________________________________________________");


        Pedido pedido2 = new Pedido(cliente3);
        pedido2.adicionarItem(microfone, 1);
        pedido2.adicionarItem(cadeira, 1);
        pedido2.setMetodoPagamento(new PagamentoCartaoCredito());

        pedido2.exibirResumo();
        System.out.println("Pagamento com cartão (500): " + pedido2.processarPagamento());
        System.out.println("_______________________________________________________________");


        Pedido pedido3 = new Pedido(cliente1);
        pedido3.adicionarItem(monitor, 1);
        pedido3.adicionarItem(mousepad, 3);
        pedido3.adicionarItem(teclado, 1);
        pedido3.adicionarItem(mouse, 1);
        pedido3.setMetodoPagamento(new PagamentoBoleto());

        pedido3.exibirResumo();
        System.out.println("Pagamento com boleto (800): " + pedido3.processarPagamento());
        System.out.println("_______________________________________________________________");


        Pedido pedido4 = new Pedido(cliente2);
        pedido4.adicionarItem(cadeira, 2);
        pedido4.adicionarItem(monitor, 2);
        pedido4.adicionarItem(microfone, 1);
        pedido4.setMetodoPagamento(new PagamentoBoleto());

        pedido4.exibirResumo();
        System.out.println("Pagamento com boleto (1500): " + pedido4.processarPagamento());
        System.out.println("_______________________________________________________________");
    }
}
