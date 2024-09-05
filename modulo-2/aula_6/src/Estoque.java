import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private final List<Produto> produtos;


    public Estoque() {
        this.produtos = new ArrayList<Produto>();
    }

    public void adicionarProduto(String nome, double preco, int quantidade) {
        Produto produto = new Produto(nome, preco, quantidade);
        produtos.add(produto);
    }

    public void removerProduto(int id) {
        if (produtos.size() > 0) {
        for (Produto produto : produtos) {
            if (id == produto.getId()) {
                produtos.remove(produto);
            } else {
                System.out.println("Produto não encontrado");
            }
        }
        }
    }

    public void exibirProduto(int id) {

        if (produtos != null) {
            for (Produto produto : produtos) {
                if (id == produto.getId()) System.out.println(produto);
            }
        } else {
            System.out.println("não existem produtos");
        }
    }

    @Override
    public String toString() {
        return "Estoque{" + "produtos=" + produtos + '}';
    }

}

