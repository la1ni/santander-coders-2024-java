//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] input = {3,3,5};
        System.out.println(eUmTriangulo(input));
    }

    public static boolean eUmTriangulo(int[] input) {
        return input[1] + input[2] > input[0] && input[0] + input[1] > input[2] && input[0] + input[2] > input[1];
        }
    }

