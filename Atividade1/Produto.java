public class Produto {
    String nome;
    double preco;
    int estoque;

    void produtoStatus(){
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Preco do produto: " + this.preco);
        System.out.println("Estoque atual: " + this.estoque);

    }
}
