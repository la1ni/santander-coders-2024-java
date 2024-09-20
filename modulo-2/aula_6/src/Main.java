//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        estoque.adicionarProduto("maçã", 3.33, 1);

        estoque.adicionarProduto("iogurte", 15.99, 1);

        estoque.removerProduto(2);

        estoque.removerProduto(1);

        System.out.println(estoque);


    }
}