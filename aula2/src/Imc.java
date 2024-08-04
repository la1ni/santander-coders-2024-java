
public enum Imc {
    MUITO_ABAIXO_DO_PESO (0, 17, "muito abaixo do peso"),
    ABAIXO_DO_PESO(17.1, 18.49, "abaixo do peso"),
    PESO_NORMAL(18.5,24.99, "com peso normal"),
    ACIMA_DO_PESO(25,29.99, "acima do peso"),
    OBESIDADE_I(30,34.99, "de obesidade I"),
    OBESIDADE_II(35,39.99, "de obesidade II"),
    OBESIDADE_III(40, "de obesidade III"),
    ;

    private final double minimo;
    private double maximo;
    private final String faixa;

    Imc(double minimo, double maximo, String faixa) {
        this.minimo = minimo;
        this.maximo = maximo;
        this.faixa = faixa;
    }

    Imc(double minimo, String faixa) {
        this.minimo = minimo;
        this.faixa = faixa;
    }


    public double getmaximo(){
        return maximo;
    }

    public String getfaixa(){
        return faixa;
    }
    
    public double getminimo(){
        return minimo;
    }
}
