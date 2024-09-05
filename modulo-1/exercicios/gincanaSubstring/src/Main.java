import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String[] input = {"as", "mas", "amor", "amoreco", "luz", "luza", "pas", "avestruz", "lamparina", "lampa"};
        System.out.println((Arrays.toString(substringStr(input))));
    }

    public static String[] substringStr(String[] input) {
        String palavraAnalisada;
        String[] substringsEncontradas = new String[0];
        String[] arrayAuxiliar;
        boolean continuar = true;

        for (int i = 0; i < input.length; i++) {
            palavraAnalisada = input[i];
            for (int c = 0; c < input.length; c++) {
                if (i != c) {

                    if (input[c].contains(palavraAnalisada)) {

                        if (substringsEncontradas.length < 1){
                            substringsEncontradas = new String[1];
                            substringsEncontradas[0] = palavraAnalisada;

                        } else {
                            for (String substringEncontrada : substringsEncontradas) {
                                if (Objects.equals(substringEncontrada, palavraAnalisada)) {
                                    continuar = false;
                                    break;
                                }
                            }
                            // montando o array auxiliar para guardar as strings já encontradas até o momento, inclusive a nova
                            if (continuar) {
                                arrayAuxiliar = new String[substringsEncontradas.length+1];

                                for (int a = 0; a < substringsEncontradas.length; a++) {
                                    arrayAuxiliar[a] = substringsEncontradas[a];
                                    arrayAuxiliar[arrayAuxiliar.length-1] = palavraAnalisada;
                                }

                                substringsEncontradas = new String[substringsEncontradas.length + 1];

                                for (int b = 0; b < substringsEncontradas.length; b++) {
                                    substringsEncontradas[b] = arrayAuxiliar[b];
                                    }
                                }
                            continuar = true;
                        }
                    }
                }
            }
        }
        return substringsEncontradas;
    }
}
