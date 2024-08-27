public class Solution {
    public static double calcularMediaFinal(String matricula, double nota1, double nota2, double nota_trabalho) {
        return (nota1 + nota2 + nota_trabalho)/3;
    }
    public static String verificarPromocaoAluno(String matricula, double nota1, double nota2, double nota_trabalho) {
        double notaFinal = calcularMediaFinal( matricula, nota1, nota2, nota_trabalho);
        if (notaFinal >= 7) {
            return String.format("Aluno aprovado com média %.1f", notaFinal);
        } else return String.format("Aluno reprovado com média %.1f", notaFinal);
    }

    public static void main(String[] args) {
        System.out.println(verificarPromocaoAluno("21312312", 2, 8.9, 10));
    }
}
