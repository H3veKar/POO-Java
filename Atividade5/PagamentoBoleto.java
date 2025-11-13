public class PagamentoBoleto implements IPagamento{
    private String codigoBarras;


    @Override
    public boolean processarPagamento(double valor) {
        return  valor < 1000.0;
    }
}
