public class Pedido {
   private int numero;
   private String status,data;

   public Pedido( int numero, String status, String data){
      this.numero = numero;
      this.status = status;
      this.data = data;

   }
  public void statusPedido(){
      System.out.println("Numero do pedido: " + getNumero());
      System.out.println("Status do pedido: " + getStatus());
      System.out.println("Data do pedido: " + getData());
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
   public String getStatus(){
      return this.status;
   }

   public void setStatus(String status){
      this.status = status;
   }





}
