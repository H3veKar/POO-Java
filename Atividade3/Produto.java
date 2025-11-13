public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco){
        this.setNome(nome);
        this.setPreco(preco);

    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
         this.preco = preco;
    }
    public int getEstoque(){
        return this.estoque;
    }
    public void setEstoque(int estoque){
        this.estoque = estoque;
    }
    public void adicionarEstoque(int quantidade){
        if(quantidade>0){

            this.setEstoque(getEstoque()+quantidade);
        }
    }


    void produtoStatus(){
        System.out.println("Nome do produto: " +getNome());
        System.out.println("Preco do produto: " + getPreco());
        System.out.println("Estoque atual: " + getEstoque());

    }
}
