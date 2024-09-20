import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution{}

record Usuario(String matricula, String nome) implements Comparable<Usuario> {
    @Override
    public int compareTo(Usuario usuario){

        int matriculaThis = Integer.parseInt(this.matricula);
        int usuarioMatr = Integer.parseInt(usuario.matricula);

        return Integer.compare(matriculaThis, usuarioMatr);
    }

    public static void main(String[] args) {
        Usuario u1 = new Usuario("1", "Doe");
        Usuario u2= new Usuario("2", "Doe");
        Usuario u3 = new Usuario("3", "Doe");

        List<Usuario> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        Collections.sort(users);

        System.out.println(users);



    }
}