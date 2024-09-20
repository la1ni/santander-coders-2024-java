import java.io.Serializable;
import java.util.List;

interface AnotacaoSerializavel extends Serializable {}

record AnotacaoProfissional() implements AnotacaoSerializavel {}
record AnotacaoPessoal() implements AnotacaoSerializavel {}
record AnotacaoLazer() implements AnotacaoSerializavel {}
record AnotacaoDiversos() implements AnotacaoSerializavel {}

class AnotacaoArquivoGerenciador{
    public void salvarTodasEmDisco(List<AnotacaoSerializavel> anotacaoSerializavels){
    }
}