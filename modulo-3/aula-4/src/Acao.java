import java.math.BigDecimal;

public class Acao {

    private String nome;
    private BigDecimal valor;
    private Boolean ordinaria;

    public Boolean isOrdinaria() {
        return ordinaria;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
