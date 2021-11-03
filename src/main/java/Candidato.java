public class Candidato {
    private String nome;
    private String cognome;
    private String nickname;
    private String partito;
    private int numeroVoti;


    public Candidato(String nome, String cognome, String nickname, String partito){
        this.nome = nome;
        this.cognome = cognome;
        this.nickname = nickname;
        this.partito = partito;
        this.numeroVoti = 0;
    }

    public void incrementoVoto(){
        this.numeroVoti++;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPartito() {
        return partito;
    }

    public int getNumeroVoti() {
        return numeroVoti;
    }
}
