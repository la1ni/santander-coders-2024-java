import java.time.LocalDate;
import java.util.Objects;

public class PagamentoCredito extends Pagamento {

    private String numeroCartao;
    private LocalDate dataValidade;
    private final double LIMITE = 1000;

    public PagamentoCredito(LocalDate data, String numeroCartao, LocalDate dataValidade, String senha) {
        super(data, senha);
        this.numeroCartao = numeroCartao;
        this.dataValidade = dataValidade;
    }

    @Override
    public boolean processarPagamento(String senhaParam, double valor) {
        if (Objects.equals(senhaParam, senha)) {
            if (valor <= LIMITE) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
