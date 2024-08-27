import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        encontraDiagonal(geraMatriz());
    }

    public static int[][] geraMatriz(){
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.printf("Digite o número na posição %dx%d: \n", i+1, j+1);
                int numeroDigitado = scanner.nextInt();
                matriz[i][j] = numeroDigitado;

            }
        }
        scanner.close();
        System.out.println(Arrays.deepToString(matriz));
        return matriz;
    }

    public static void encontraDiagonal(int[][] matriz){
        int v1 = matriz[0][0];
        int v2 = matriz [1][1];
        int v3 = matriz [2][2];
        System.out.printf("Os valores da diagonal principal são: %d, %d, %d e sua soma é igual a %d.", v1, v2, v3, v1+v2+v3);
    }
}