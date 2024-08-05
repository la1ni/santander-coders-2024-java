import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        scanner.close();
        System.out.printf("A soma de %d com seus antecessores é %d", numero, somarAntecessores(numero));
    }

    public static int somarAntecessores(int numero){
        int soma = 0;
        for (int i = numero; i >= 0; i--){
            soma += i;
        }
        return soma;
    }
}
