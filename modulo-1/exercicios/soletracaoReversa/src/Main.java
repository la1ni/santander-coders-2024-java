import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(soletrandoInvertidoStr("amor")));
    }
    public static String[] soletrandoInvertidoStr(String input) {
        String[] invertida = new String[input.length()];
        int contadorPositivo = 0;
        for (int i = input.length()-1; i >= 0; i--){

            invertida[i] = String.valueOf(input.charAt(contadorPositivo));

            contadorPositivo++;

        }
        return invertida;
    }
}