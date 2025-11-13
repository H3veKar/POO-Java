public class ClientePJ  extends Cliente{
    private  String cnpj;

    public ClientePJ(String nome, String cnpj, String email) {
        super(nome, email);
        this.setCnpj(cnpj);
    }
    public String getCnpj() {
        return this.cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
