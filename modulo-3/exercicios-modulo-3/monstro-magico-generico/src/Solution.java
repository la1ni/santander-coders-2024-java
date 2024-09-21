import java.util.List;
interface Inimigo{}
class Monstro implements Inimigo{}
class MonstroMagico extends Monstro{}
class MonstroMagicoFogo extends MonstroMagico{}
class MonstroMagicoRaio extends MonstroMagico{}

public class Solution{}

class MonstroMagicoRaioCriadora {
    public static void adicionaMonstro(List<? super MonstroMagico> inimigos) {
        // REALIZA CÁLCULOS
        MonstroMagicoRaio monstroMagicoRaio = new MonstroMagicoRaio();
        inimigos.add(monstroMagicoRaio);
    }
}