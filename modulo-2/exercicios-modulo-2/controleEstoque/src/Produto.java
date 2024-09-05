

public class Produto {

    public String codigo;
    public double precoUnitario;
    public int quantidade;

    public Produto(String codigo, double precoUnitario, int quantidade) {
        this.codigo = codigo;
        this.precoUnitario = precoUnitario;
        if (quantidade >= 0){
            this.quantidade = quantidade;
        } else {this.quantidade = 0;}

    }
}

