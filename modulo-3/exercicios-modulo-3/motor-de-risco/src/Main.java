public class Main {

    record Conta(String agencia, String conta, Double saldo) {}

    class ValidadorContaAgencia {
        public boolean validar(Conta conta){
            if (!(conta.agencia() == null) && (!(conta.conta() == null))){
                return true;
            } else {return false;}

        }

    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}