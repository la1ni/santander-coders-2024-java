import java.util.Comparator;

public class Solution{}

record Aluno(String nome, Integer matricula){}

class ComparaAlunoMatricula implements Comparator<Aluno>{

    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Integer.compare(o1.matricula(), o2.matricula());
    }
}