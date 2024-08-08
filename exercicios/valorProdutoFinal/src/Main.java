//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double[] valores = {250.10, 1.0};
        System.out.println(valorProdutoFinal(valores));
        }
        public static double valorProdutoFinal(double[] input){
            double estado = input[1];
            double valorFinal;
            if (estado == 1) { valorFinal = input[0] * 1.07; }
            else if (estado == 2) { valorFinal = input[0] * 1.12; }
            else if (estado == 3) { valorFinal = input[0] * 1.15; }
            else { return -1;}
            String resultado = String.format("%.4f", valorFinal).replace(",", ".");
            return Double.parseDouble(resultado);
    }
}

/*Uma empresa vende o mesmo produto para 3 diferentes estados. Cada estado possui uma taxa diferente de imposto sobre o produto (MG 7%, SP 12%, RJ 15%).

Faça um programa que recebe o valor do produto e o estado de destino do produto e, então, calcule o preço final do produto acrescido do imposto baseado no estado em que ele será vendido.

Considere as seguintes restrições quanto a entrada e saída dos dados:

Os dados de entrada serão passados em um array de decimais [valor do produto, estado comercializado]
Para os dados do estado considerar 1.0 => MG, 2.0 => SP, 3.0 => RJ
Caso seja passado um estado desconhecido retornar -1.0.
Fazer um arredondamento de 4 casas no valor final do produto
Ex:
Entrada: [250.10, 1.0]
Saída: 267.6070*/