import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(retornarInteiroValido());
        }
        catch (InteiroValidoException inteiroValidoException){
            System.out.println("A String não representa um inteiro válido");
        }
    }

    public static String retornarInteiroValido () throws InteiroValidoException {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (!input.matches("\\d+")){
            throw new InteiroValidoException();
        }
        scanner.close();
        return input;
    }
}