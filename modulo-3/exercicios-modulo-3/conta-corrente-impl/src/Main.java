/*

O método double realizaDeposito(ContaCorrente contaCorrente, Double deposito) deverá aceitar apenas valores positivos para depósito.

O método double realizaSaque(ContaCorrente contaCorrente, Double saque) deverá retornar true, se o valor a ser sacado for menor ou igual ao saldo da Conta, ou false caso contrário.*/

interface OperacoesContaCorrente {
    double realizaDeposito(ContaCorrente contaCorrente, Double deposito);
    boolean realizaSaque(ContaCorrente contaCorrente, Double saque);
}

class OperacoesContaCorrenteImpl implements OperacoesContaCorrente {

    public OperacoesContaCorrenteImpl(ContaCorrente contaCorrente) {
    }
    public OperacoesContaCorrenteImpl() {
    }

    @Override
    public double realizaDeposito(ContaCorrente contaCorrente, Double deposito) {
        if (deposito <= 0) {
            return 0;
        } else { contaCorrente.setSaldo(contaCorrente.getSaldo() + deposito);
        return contaCorrente.getSaldo();}
    }

    @Override
    public boolean realizaSaque(ContaCorrente contaCorrente, Double saque) {
        if (saque <= contaCorrente.getSaldo()) { return true;}
        else return false;
        }
    }

class ContaCorrente {
    private String agencia;
    private String conta;
    private Double saldo;

    public ContaCorrente(String agencia, String conta, Double saldo) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}