import java.util.List;
import java.util.Objects;

public class NotaFiscal {
    public static List<Produto> produtos;

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(String codigo) {
        for (Produto produto : produtos) {
            if (Objects.equals(produto.codigo, codigo)){
                produtos.remove(produto);
            }
        }
    }

    public double calcularValorProduto(Produto produto){
        return produto.precoUnitario * produto.quantidade;
    }

    public double calcularValorNotaFiscal(){
        double valorFinal = 0;
        for (Produto produto : produtos){
            valorFinal += calcularValorProduto(produto);
        }
        return valorFinal;
    }
}
