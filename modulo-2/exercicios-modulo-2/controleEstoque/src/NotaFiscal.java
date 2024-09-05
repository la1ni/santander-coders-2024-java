import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NotaFiscal {
    public static List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        if (produto.quantidade <= 0){
            throw new RuntimeException();
        } else {
            produtos.add(produto);
        }
    }

    public void removerProduto(String codigo) {
        produtos.removeIf(produto -> Objects.equals(produto.codigo, codigo));
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
