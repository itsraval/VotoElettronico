import java.time.LocalDate;
import java.util.ArrayList;

public class SessioneVoto {
    private final LocalDate dataInizio;
    private final LocalDate dataFine;
    private int modVoto;
    private final int id;
    private int votanti = 0;

    /**
     * 0 Voto ordinale
     * 1 Voto categorico
     * 2 Voto categorico con preferenze
     * 3 Referendum
     */
    private int modVincitore;
    // 0 Maggioranza
    // 1 Maggioranza assoluta
    // 2 Referendum senza quorum
    // 3 Referendum con quorum

    private ArrayList<Candidato> listaCandidati;

    public SessioneVoto(LocalDate dataInizio, LocalDate dataFine, int modVoto, int modVincitore, int id){
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.modVoto = modVoto;
        this.modVincitore = modVincitore;
        this.id = id;
        this.listaCandidati = new ArrayList<Candidato>();
    }

    public Candidato estrazioneVincitore(){
        return null;
    }

    public void aggiungiCandidato(Candidato c){
        this.listaCandidati.add(c);
    }

    public LocalDate getDataInizio() {
        return dataInizio;
    }

    public LocalDate getDataFine() {
        return dataFine;
    }

    public int getModVoto() {
        return modVoto;
    }

    public int getModVincitore() {
        return modVincitore;
    }

    public int getId() {
        return id;
    }

    public int getVotanti() {
        return votanti;
    }

    public void addVoto(){
        this.votanti++;
    }

    public ArrayList<Candidato> getListaCandidati() {
        return listaCandidati;
    }

}
