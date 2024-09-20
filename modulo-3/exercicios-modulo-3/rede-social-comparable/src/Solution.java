public class Solution{}

record RedeSocial(String nomeRedeSocial, Integer quantidadeSeguidores) {}


record Celebridade(String nome, RedeSocial redeSocial) implements Comparable<Celebridade> {
    @Override
    public int compareTo(Celebridade celebridade) {
        return this.redeSocial.quantidadeSeguidores().compareTo(celebridade.redeSocial.quantidadeSeguidores());
    }

}