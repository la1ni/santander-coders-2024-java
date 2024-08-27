//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(somaAlgarismos(123));
    }

    public static int somaAlgarismos(int input) {
        if (input>0) {
            String texto = String.valueOf(input);
            int soma = 0;
            for (int i = 0; i < texto.length(); i++) {
                int numero = Character.getNumericValue(texto.charAt(i));
                soma += numero;
            }
            return soma;
        }
        else return -1;
    }
}