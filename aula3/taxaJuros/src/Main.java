import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor que deseja investir em reais: ");
        double valor = scanner.nextDouble();
        System.out.println("Informe os juros em porcentagem: ");
        int porcentagem = scanner.nextInt();
        System.out.println("Informe o tempo em meses que o dinheiro ficará investido: ");
        int tempo = scanner.nextInt();
        scanner.close();

        calcularJuros(valor, porcentagem, tempo);
    }

    public static void calcularJuros(double valor, int porcentagem, int tempo) {
        for (int i = 0; i < tempo; i++) {
            double juro = valor * porcentagem/100;
            valor = valor + juro;
            System.out.printf("Mês %d: -> Juros: R$%.2f. Valor investido: R$%.2f.", i+1, juro, valor);
            System.out.println();
        }
    }
}