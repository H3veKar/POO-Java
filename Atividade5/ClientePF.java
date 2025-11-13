public class ClientePF extends  Cliente{
    private String cpf;

    public ClientePF(String nome, String cpf, String email) {
        super(nome, email);
        this.setCpf(cpf);
    }

    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
