import java.util.ArrayList;
import java.util.List;

class Usuario {
    private String senha;
    private List<String> senhasAnteriores = new ArrayList<>();

    public String alterarSenha(String novaSenha) {

        if (senhasAnteriores.size() == 1 || senhasAnteriores.size() == 2 || senhasAnteriores.size() == 3) {
            for (String senhaAnterior : senhasAnteriores) {
                if (senhaAnterior.equals(novaSenha)) {
                    return "Senha não pode ser igual as três últimas utilizadas";
                }
            }

        } else {
            for (int i = senhasAnteriores.size() - 1; (i > senhasAnteriores.size() - 3); i--) {
                if (senhasAnteriores.get(i).equals(novaSenha)) {
                    return "Senha não pode ser igual as três últimas utilizadas";
                }
            }

        }
        senhasAnteriores.add(novaSenha);
        return "Senha alterada com sucesso";
    }


    public Usuario(String senha) {
        this.senha = senha;
        senhasAnteriores.add(senha);
    }

    public static void main(String[] args) {
        Usuario usuario = new Usuario("1");
        System.out.println(usuario.alterarSenha("11"));
        System.out.println(usuario.alterarSenha("1"));
        System.out.println(usuario.alterarSenha("12"));
        System.out.println(usuario.alterarSenha("131"));
        System.out.println(usuario.alterarSenha("12"));

    }
}