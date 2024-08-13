//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double[] input = {2,2,3.1,4,4.1,4.1};
        System.out.println(elementosRepetidos(input));

    }

    public static boolean elementosRepetidos(double[] input) {
        double numero;
        for (int i = 0; i < input.length; i++){
            numero = input[i];
            int c = i+1;
            for (; c < input.length; c++){
                if (numero == input[c]){
                    return true;
                }

            }
        }
        return false;
    }
}