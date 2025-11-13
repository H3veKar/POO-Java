public class ItemPedido {
    private Produto produto;
    private int quantidade;


    public ItemPedido(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }
    public double getSubTotal(){
        return this.produto.getPreco() * this.quantidade;

    }


    public int getQuantidade() {
        return this.quantidade;
    }
    public Produto getProduto(){
        return this.produto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
