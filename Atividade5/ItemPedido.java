public class ItemPedido {
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.setProduto(produto);
        this.setQuantidade(quantidade);

    }
    //extra
    public String getDescricao() {
        return produto.getNome() +  quantidade  + " = R$ " + getSubtotal();
    }
    public double getSubtotal(){
        return produto.getPreco() * this.getQuantidade();
    }


    public Produto getProduto(){
        return this.produto;
    }
    public void setProduto(Produto produto){
        this.produto = produto;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }





}
