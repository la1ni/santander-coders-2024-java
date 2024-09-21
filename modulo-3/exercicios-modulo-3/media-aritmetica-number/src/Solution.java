import java.util.List;

public class Solution{}

class Calculadora {
    public static double calculaMedia(List<? extends Number> numeros) {
        double soma = 0.0;
        for (Number numero : numeros){
            soma += numero.doubleValue();
        }
        return soma/numeros.size();

    }
}