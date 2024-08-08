import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(retornaFibonacci(10));
    }

    public static List<Integer> retornaFibonacci(int input) {

        List<Integer> listaFibonacci = new ArrayList<>(Arrays.asList(0, 1));

        int numeroDaVez = 0;
        int i = 0;
        while (numeroDaVez + 2 < input) {
            numeroDaVez = listaFibonacci.get(i) + listaFibonacci.get(i + 1);
            listaFibonacci.add(numeroDaVez);
            i++;

        }
        return listaFibonacci;

    }
}