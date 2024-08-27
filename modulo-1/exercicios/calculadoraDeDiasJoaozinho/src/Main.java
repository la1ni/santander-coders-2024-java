
// trocar Main por Solution no exercício
public class Main {
    public static int idadeEmDias( int[] input) {
        int anos = input[0];
        int meses = input[1];
        int dia = input[2];
        return ((anos * 365) + (meses * 30) + dia);
    }
}
