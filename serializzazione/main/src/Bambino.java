public class Bambino extends Persona{

    private String dataNascita;

    public Bambino (String nome, String cognome, int eta, String dataNascita){
        super(nome,cognome,eta);
        this.dataNascita=dataNascita;
    }

    public String getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }

    @Override
    public String toString() {
        return "Bambino{" +
                "nome='" + getNome() + '\'' +
                ", cognome='" + getCognome() + '\'' +
                ", eta=" + getEta() +
                ", data di nascita='" + dataNascita + '\'' +
                '}';
    }


}
