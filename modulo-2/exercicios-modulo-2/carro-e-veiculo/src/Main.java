class Veiculo {
    public boolean estaLigado;

    public Veiculo(boolean ligado) {
        this.estaLigado = ligado;
    }
}


class Carro extends Veiculo {

    public String tipoDeCombustivel;


    public Carro(String combustivel, boolean estaLigadoParam) {
        super(estaLigadoParam);
        this.tipoDeCombustivel = combustivel;
    }

    public Carro(String combustivel) {
        super(false);
        this.tipoDeCombustivel = combustivel;
    }


    public String ligar() {
        if (estaLigado) {
            return ("carro já está ligado");
        } else {
            this.estaLigado = true;
            return "ligado";
        }
    }

    public String desligar() {
        if (!estaLigado) {
            return ("carro já está desligado");
        } else {
            this.estaLigado = false;
            return "desligado";
        }
    }
}


