//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] input = {1, 1, 2, 2, 5, 2, 3, 3};
        System.out.println(numeroUnico(input));

    }

    public static int numeroUnico(int[] input) {
        int numeroAnalisdo;
        int numeroComparado;
        boolean igual = false;

        for (int i = 0; i < input.length; i++) {
            numeroAnalisdo = input[i];

            for (int c = 0; c < input.length; c++) {
                numeroComparado = input[c];

                if (numeroAnalisdo == numeroComparado && c != i) {
                    igual = true;
                    break;
                }
                igual = false;
            }
            if (!igual) return numeroAnalisdo;
            }
        return -1;
        }
    }
