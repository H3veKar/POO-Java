public class Produto {
    protected String nome;
    protected double preco;
    protected int estoque;

    public Produto(String nome, double preco) {
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



}
