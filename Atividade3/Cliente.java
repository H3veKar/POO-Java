public class Cliente {
    private String nome;
    private String email;

    void clienteStatus(){

        System.out.println("Nome do cliente: " +getNome());
        System.out.println("Email do cliente: " + getEmail());
    }
   public Cliente(String nome, String email){
       this.setNome(nome);
       this.setEmail(email);
   }

    public String getNome(){
        return this.nome;
    }
    public String getEmail(){
        return this.email;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
