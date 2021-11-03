import java.util.ArrayList;

public class Elettore {
    /*
    * L'elettore farà accesso tramite SPID quindi ogni
    * */

    private ArrayList<Integer> sessioniVotoPartecipate;
    // Ogni elettore deve avere una lista delle sessioni di voto alle quali ha partecipato


    public Candidato voto(SessioneVoto sv, Candidato c){
        this.sessioniVotoPartecipate.add(sv.getId());
        // il voto deve essere inviato
        sv.addVoto();
        return c;
    }

    public ArrayList<Integer> getSessioniVotoPartecipate() {
        return sessioniVotoPartecipate;
    }

    public Boolean votoReferendum(Boolean v){
        return v;
    }
}
