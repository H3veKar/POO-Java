import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Pedido {
    private LocalDate data;
    private Cliente cliente;
    private List<ItemPedido> itens = new ArrayList<>();;
    private IPagamento metodoPagamento;

    public Pedido(Cliente cliente) {
        this.setCliente(cliente);

    }


   //extra
   public void mostrarResumo() {
       System.out.println("Cliente: " + cliente.getNome());
       System.out.println("Itens:");
       for (ItemPedido item : itens) {
           System.out.println("- " + item.getDescricao());
       }
       System.out.println("Total: R$ " + calcularTotal());

   }
    public double calcularTotal(){
        double total = 0.0;
        for(int i=0; i<itens.size();i++){
            ItemPedido item = itens.get(i);
            total += item.getSubtotal();
        }
        return total;
    }
    public boolean processarPagamento() {
        double valor = calcularTotal();
        if (metodoPagamento != null) {
            return metodoPagamento.processarPagamento(valor);
        }
        return false;
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
