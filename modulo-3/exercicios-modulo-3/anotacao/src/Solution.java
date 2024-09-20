import java.io.Serializable;

public class Solution{}

record AnotacaoProfissional() implements AnotacaoSerializavel {};
record AnotacaoPessoal() implements AnotacaoSerializavel {};
record AnotacaoLazer() implements AnotacaoSerializavel {};
record AnotacaoDiversos() implements AnotacaoSerializavel {};

interface AnotacaoSerializavel extends Serializable {};

class AnotacaoArquivoGerenciador{

    public void salvarEmDisco(AnotacaoSerializavel anotacao){

    }


}