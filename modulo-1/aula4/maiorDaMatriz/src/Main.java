import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de linhas da matriz: ");
        int linhas = scanner.nextInt();
        System.out.println("Digite o número de colunas da matriz: ");
        int colunas = scanner.nextInt();
        geraMatriz(linhas, colunas);
        scanner.close();
    }

    public static void geraMatriz(int linhas, int colunas){
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[linhas][colunas];
        int maiorNumero = 0;
        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                System.out.printf("Digite o número na posição %dx%d: \n", i+1, j+1);
                int numeroDigitado = scanner.nextInt();
                matriz[i][j] = numeroDigitado;
                if (numeroDigitado > maiorNumero){ maiorNumero = numeroDigitado;}
            }
        }
        System.out.println(Arrays.deepToString(matriz));
        System.out.println("O maior número da matriz é " + maiorNumero);
        scanner.close();
    }


}