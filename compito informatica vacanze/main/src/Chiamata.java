
import java.time.LocalDateTime;

public class Chiamata {
    private String codiceBiglietto;
    private String cassaID;
    private LocalDateTime orario;


    public Chiamata(String codiceBiglietto, String cassaID, LocalDateTime orario) {
        this.codiceBiglietto = codiceBiglietto;
        this.cassaID = cassaID;
        this.orario = orario;
    }

    public String getCodiceBiglietto() {
        return codiceBiglietto;
    }
    public void setCodiceBiglietto(String codiceBiglietto) {
        this.codiceBiglietto = codiceBiglietto;
    }

    public LocalDateTime getOrario() {
        return orario;
    }
    public void setOrario(LocalDateTime orario) {
        this.orario = orario;
    }

    public String getCassaID() {
        return cassaID;
    }
    public void setCassaID(String cassaID) {
        this.cassaID = cassaID;
    }

    @Override
    public String toString() {
        return "Chiamata{" +
                "codiceBiglietto='" + codiceBiglietto + '\'' +
                ", cassaID='" + cassaID + '\'' +
                ", orario=" + orario +
                '}';
    }
}
