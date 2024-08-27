//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(primeiroCaractereUnico("amor"));
    }

    public static int primeiroCaractereUnico(String input) {
        char caractereAnalisado;
        for (int i = 0; i < input.length(); i++){
            caractereAnalisado = input.charAt(i);
            if (i == input.lastIndexOf(caractereAnalisado)) {
                return i;
            }
        }

        return -1;
    }
}