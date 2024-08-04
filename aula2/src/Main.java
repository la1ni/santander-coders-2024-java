import java.util.Scanner;
import static java.lang.Math.pow;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();
        scanner.close();

        calculaImc(peso, altura);

    }

    public static void calculaImc(Double peso, Double altura) {
        double valorImc = peso / pow(altura, 2);
        for (Imc imc : Imc.values()) {
            if ((valorImc > imc.getminimo() && valorImc < imc.getmaximo())) {
                System.out.printf("Seu imc é de %.2f e está na faixa %s", valorImc, imc.getfaixa());
            }
        }
        if (valorImc > Imc.OBESIDADE_III.getminimo()) {
            System.out.printf("Seu imc é de %.2f e está na faixa %s", valorImc, Imc.OBESIDADE_III.getfaixa());

        }
    }
}
