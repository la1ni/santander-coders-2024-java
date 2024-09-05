import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        PagamentoCredito pagamentoCredito = new PagamentoCredito(LocalDate.now(), "23344433", LocalDate.now(), "1234");

        System.out.println(pagamentoCredito.processarPagamento("12234", 800));





    }
}