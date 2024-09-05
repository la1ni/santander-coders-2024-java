import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BolsaValores {

    public List<Acao> filtraAcoesOrdinarias(List<Acao> acoes){
        List<Acao> ordinarias = new ArrayList<Acao>();

        return acoes.stream().filter(Acao::isOrdinaria).toList();

        /*for(Acao acao : acoes) {
            if(acao.isOrdinaria()) {
                ordinarias.add(acao);
            }
        }
        return ordinarias;*/
    }

    public BigDecimal calcularPrecoMedioAcoesOrdinarias(List<Acao> acoesOrdinarias) {

        return acoesOrdinarias.stream().map(Acao::getValor).reduce(BigDecimal.ZERO, BigDecimal::add).divide(BigDecimal.valueOf(acoesOrdinarias.stream().count()));

        /*for(Acao acao : acoesOrdinarias) {
            valorTotalOrdinarias.add(acao.getValor());
        }
        return valorTotalOrdinarias.divide(new BigDecimal(quantidadeOrdinarias));*/

    }

}

