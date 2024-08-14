import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(soletrandoStr("amor")));
    }


    public static String[] soletrandoStr(String input) {
        String[] soletrada = new String[input.length()];
        for (int i = 0; i < input.length(); i++) {

            soletrada[i] = String.valueOf(input.charAt(i));

        }

        return soletrada;
    }
}