public class Pedido {
    private ItemPedido[] Itens;
    private int numero;
    private String  data;
    private Cliente cliente;
    private int proximaPosicao = 0;

    public Pedido( String data,  Cliente cliente, int tamanhoMaxItens) {
        this.data = data;
        this.Itens = new ItemPedido[tamanhoMaxItens];
        this.cliente = cliente;


    }

    /*public Pedido(ItemPedido[] itemPedido) {
        this.Itens = itemPedido;

    }*/
    public void adicionarItem(Produto produto, int quantidade) {
        if(proximaPosicao < Itens.length) {  // verifica se ainda cabe mais itens
            ItemPedido item = new ItemPedido(produto, quantidade);
            Itens[proximaPosicao] = item;
            proximaPosicao++;
        } else {
            System.out.println("Carrinho cheio! Não é possível adicionar mais itens.");
        }
    }


    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i <this.Itens.length; i++) {
           total = total + this.Itens[i].getSubTotal();
        }
        return  total;
    }


  public void statusPedido(){
      System.out.println("CLiente: "+cliente.getNome());
      System.out.println("Email: "+cliente.getEmail());
      System.out.println("Itens do Carrinho ");
      for(int i = 0; i < proximaPosicao; i++){
          System.out.println("________________________________");
          System.out.println(i+1+"." +this.Itens[i].getProduto().getNome());
          System.out.println("Quantidade: "+this.Itens[i].getQuantidade());
          System.out.println("Valor: "+this.Itens[i].getProduto().getPreco());
          System.out.println("Subtotal: "+this.Itens[i].getSubTotal());
      }
      System.out.println("________________________________");
      System.out.printf("Valor total da compra:  R$ %.2f\n ",this.calcularTotal());
  }


   public int getNumero(){
      return this.numero;
   }
   public void setNumero(int numero){
      this.numero = numero;
   }
   public String getData(){
      return this.data;
   }
   public void setData(String data){
      this.data = data;
   }




}
