import java.util.Random;

public class Produto {

    static Random random = new Random();

    private static int idAtual = 0;
    private int id;
    private String nome;
    private double preco;
    private int quantidade;


    public Produto(String nome, double preco, int quantidade) {
        this.id = ++idAtual;
        this.nome = nome;
        setPreco(preco);
        setQuantidade(quantidade);

    }

    public void setId(int id) {
        System.err.println("Não é possível modificar o id do produto");
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            System.err.println("Digite um preço válido");
        } else {
            this.preco = preco;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            System.err.println("Digite uma quantidade válida");
        } else {
            this.quantidade = quantidade;
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
