import java.util.ArrayList;
import java.util.List;

public class Tavolo {
    public static final int MAX_POSTI= 4;

    private int numero;
    private int commensali;
    private List<Pizza> ordine;
    private StatoTavolo stato;

    public Tavolo(int numero, int commensali) {
        this.numero = numero;
        this.commensali = commensali;
        this.ordine = new ArrayList<>();
        this.stato= StatoTavolo.OCCUPATO;
    }

    public void aggiungiPizza(Pizza p) {
        ordine.add(p);
    }

    public List<Pizza> getOrdine() {
        return ordine;
    }

    public int getNumero() {
        return numero;
    }

    public StatoTavolo getStato() {
        return stato;
    }

    public void setStato(StatoTavolo stato) {
        this.stato = stato;
    }


}
