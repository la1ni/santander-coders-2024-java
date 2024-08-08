import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        System.out.println(geraSequenciaFibonacci(13));
    }
    public static String geraSequenciaFibonacci(int input) {
        List<Integer> listaFibonacci = new ArrayList<>(Arrays.asList(0, 1));
        int numeroDaVez = 0;
        int i = 0;
        while (true) {
            numeroDaVez = listaFibonacci.get(i) + listaFibonacci.get(i + 1);
            if (numeroDaVez > input) {break;}
            listaFibonacci.add(numeroDaVez);
            i++;

        }
        return listaFibonacci.toString().replace("[", "").replace("]", "").replace("]", "");

    }
}