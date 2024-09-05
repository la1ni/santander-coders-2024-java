import java.time.LocalDate;

public abstract class Pagamento {

    public double valor;
    public LocalDate data;
    public String senha;


    public Pagamento(LocalDate data, String senha) {
        this.senha = senha;
        this.data = data;
    }


    public abstract boolean processarPagamento(String senha, double valor);

}
