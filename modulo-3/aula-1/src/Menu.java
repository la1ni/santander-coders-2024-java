import java.util.List;

public class Menu extends MenuAbstrato {

    int opcao = 0;

    @Override
    public void selecionaOpcoes() {

        System.out.println(MenuAbstrato.geraMenuComOpcoes("CALCULA ÁREA", List.of("Quadrado", "Triangulo", "Retangulo", "Losango", "Sair")));

        int opcao = 0;

        while (opcao != 5) {
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Insira o valor do lado do quadrado: ");
                    Quadrado quadrado = new Quadrado(entrada.nextDouble());
                    System.out.println("A área desse quadrado é: " + quadrado.CalcularArea());
                    break;

                case 2:
                    System.out.println("Insira o valor do lado 1 do triangulo: ");
                    double lado1 = entrada.nextDouble();
                    System.out.println("Insira o valor do lado 2 do triangulo: ");
                    double lado2 = entrada.nextDouble();
                    System.out.println("Insira o valor do lado 3 do triangulo: ");
                    double lado3 = entrada.nextDouble();
                    Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
                    System.out.println("A área desse triângulo é: " + triangulo.CalcularArea());
                    break;

                case 3:
                    System.out.println("Insira o valor do lado 1 do retangulo: ");

                    System.out.println("Insira o valor do lado 2 do retangulo: ");

                case 4:
                    System.out.println("Insira o valor do lado do losango: ");
                case 5:
                    System.err.println("Saindo...");
                    break;
                default:
                    System.out.println("digite opção válida");
                    break;
            }

        }


    }


}
