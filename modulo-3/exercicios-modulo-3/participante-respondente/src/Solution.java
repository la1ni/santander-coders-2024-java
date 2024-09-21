import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    interface Participante{
        public String getNomeParticipante();
    }
    interface Respondente{}

    record Aluno(String nome) implements Participante, Respondente {

        @Override
        public String getNomeParticipante(){
            return this.nome();
        }
    }

    class Chat {
        public Participante escolheRespondente(List<Participante> participantes) {
            List<Participante> respondentes = new ArrayList<Participante>();
            for (Participante participante : participantes) {
                if (participante instanceof Respondente ){
                    respondentes.add(participante);
                }
            }
            Collections.shuffle(respondentes);
            return respondentes.getFirst();
        }
    }
}