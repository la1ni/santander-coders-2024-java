import java.util.ArrayList;
import java.util.List;

public class Solution{}

record Aluno(String nome) implements Comparable<Aluno> {
    @Override
    public int compareTo(Aluno aluno) {
        return this.nome.compareTo(aluno.nome);
    }

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Aluno");
        Aluno a2 = new Aluno("Bluno");
        Aluno a3 = new Aluno("Cluno");

        List<Aluno> alunos = new ArrayList<Aluno>();
        System.out.println(a1.compareTo(a2));

    }
}