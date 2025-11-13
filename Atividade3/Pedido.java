public class Pedido {
    private ItemPedido[] Itens;
    private int numero;
    private String  data;

    public Pedido( String data, ItemPedido[] Itens) {
        this.setData(data);
        this.Itens = Itens;


    }

    /*public Pedido(ItemPedido[] itemPedido) {
        this.Itens = itemPedido;

    }*/

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i <this.Itens.length; i++) {
           total = total + this.Itens[i].getSubTotal();
        }
        return  total;
    }


  public void statusPedido(){
      System.out.println("Itens do Carrinho ");
      for(int i = 0; i < this.Itens.length; i++){
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
