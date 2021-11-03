import java.time.LocalDate;

public class Scrutatore {
    private int id;

    public SessioneVoto creaSessioneVoto(LocalDate dataInizio, LocalDate dataFine, int modVoto, int modVincitore, int id){
        return new SessioneVoto(dataInizio, dataFine, modVoto, modVincitore, id);
    }

    public Candidato scrutinio(SessioneVoto sv){
        return sv.estrazioneVincitore();
    }

}
