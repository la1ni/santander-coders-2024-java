import java.lang.reflect.Array;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double[] lista = {5.0, 4.3, 8.0, 7.0};
        System.out.println(solucao(lista));
    }

    public static String solucao(double[] input){
        double mediaAproveitamento = (input[0] + input[1] * 2 + input[2] * 3 + input[3])/7;
        String conceito;
        return conceito = (mediaAproveitamento >= 9)? "A": (mediaAproveitamento >= 7.5)? "B" : (mediaAproveitamento >= 6.0)? "C" : "D";
    }
}
