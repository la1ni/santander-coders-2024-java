import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {

    record Aluno(String matricula, String nome, Integer idade) implements Comparable<Aluno> {
        @Override
        public int compareTo(Aluno aluno) {
            return this.matricula().compareTo(aluno.matricula());
        }
    }

    static class OrdenaAlunosComparator implements Comparator<Aluno> {

        public OrdenaAlunosComparator() {
        }

        @Override
        public int compare(Aluno a1, Aluno a2) {
            int resultado = Integer.compare(a1.idade(), a2.idade());
            if (resultado == 1) {
                resultado = String.CASE_INSENSITIVE_ORDER.compare(a1.nome(), a2.nome());
            }
            return resultado;
        }
    }

    class Relatorio {
        public List<Aluno> ordenaAlunos(List<Aluno> alunos) {
            Collections.sort(alunos);
            return alunos;
        }

        public static void main(String[] args) {
            Aluno aluno1 = new Aluno("1", "Maria", 25);
            Aluno aluno2 = new Aluno("2", "Joao", 25);
            Aluno aluno3 = new Aluno("3", "Lucas", 25);
        }
    }
}