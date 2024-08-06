//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        imprimeNumeros();
    }
    public static void imprimeNumeros(){
        for (int i = 0; i < 100; i++){
            if (i % 3 == 0 && i % 5 != 0){
                System.out.println("Fizz");
            } else if (i % 3 != 0 && i % 5 == 0){
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else System.out.println(i);
        }
    }
}