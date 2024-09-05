public class ContaBancaria {
    public String agencia;
    public int conta;
    private double saldo;

    public ContaBancaria(String agencia, int conta, double saldo){
        this.agencia = agencia;
        this.conta = conta;
        setSaldo(saldo);
    }

    public ContaBancaria(){

    }

    public double getSaldo(){
        return this.saldo;
    }

    public String setSaldo(double saldo){
        if (saldo < 0){
            return ("Saldo insuficiente");
        } else {this.saldo = saldo;
            return ("Saldo atualizado");

        }
    }
}
