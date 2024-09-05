import java.time.LocalDate;
import java.util.Objects;

public class PagamentoDebito extends Pagamento {

    private String numeroConta;
    private String banco;
    private double saldo;

    public PagamentoDebito(double valor, LocalDate data, String numeroConta, String banco, double saldo, String senha) {
        super(data, senha);
        this.numeroConta = numeroConta;
        this.banco = banco;
        this.saldo = saldo;
    }


    @Override
    public boolean processarPagamento(String senhaParam, double valor) {
        if (Objects.equals(senhaParam, senha)) {
            if (valor <= saldo) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

