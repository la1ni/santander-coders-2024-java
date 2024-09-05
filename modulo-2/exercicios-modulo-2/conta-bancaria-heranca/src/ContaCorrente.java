public class ContaCorrente extends ContaBancaria {
    public double saldo;

    public ContaCorrente(String agencia, String conta){
        super(agencia, conta);
    }

    public ContaCorrente(String agencia, String conta, double saldo){
        super(agencia, conta);
        if (saldo <0 ){
            this.saldo = 0;
        } else {this.saldo = saldo;}
    }
}
