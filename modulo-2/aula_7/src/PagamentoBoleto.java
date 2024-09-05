import java.time.LocalDate;
import java.util.Random;

public class PagamentoBoleto extends Pagamento{

    private String numeroBoleto;
    private static Random gerador = new Random();

    public PagamentoBoleto(LocalDate data, String senha, String numeroBoleto) {
        super(data, senha);
        this.numeroBoleto = numeroBoleto;
    }


    @Override
    public boolean processarPagamento(String senha, double valor) {
        gerador.longs(0, 13);
        return true;
    }
}
