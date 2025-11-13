import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private LocalDate data;
    private Cliente cliente;
    private List<ItemPedido> itens = new ArrayList<>();
    private IPagamento metodoPagamento;

    public void exibirResumo() {
        System.out.println("Resumo do Pedido:");
        for (ItemPedido item : itens) {
            System.out.println("- " + item.getProduto().getNome()
                    + " | Quantidade: " + item.getQuantidade()
                    + " | Subtotal: R$ " + String.format("%.2f", item.getSubtotal()));
        }
        System.out.println("Total do pedido: R$ " + String.format("%.2f", calcularTotal()));
    }



    private StatusPedido statusPedido = StatusPedido.PENDENTE;

    public Pedido(Cliente cliente) {
        this.setCliente(cliente);
        this.data = LocalDate.now();
    }



    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public boolean processarPagamento() {
        double valor = calcularTotal();
        if (metodoPagamento != null) {
            boolean sucesso = metodoPagamento.processarPagamento(valor);

            if (sucesso) {
                statusPedido = StatusPedido.PROCESSANDO;
            } else {
                statusPedido = StatusPedido.PENDENTE;
            }
            return sucesso;
        }
        return false;
    }


    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public IPagamento getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(IPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void adicionarItem(Produto produto, int quantidade) {
        ItemPedido item = new ItemPedido(produto, quantidade);
        itens.add(item);
    }
}
