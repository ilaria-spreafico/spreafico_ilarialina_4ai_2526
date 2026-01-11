import java.util.LinkedList;
import java.util.Queue;

public class Pizzaiolo {
    private Queue<Tavolo> ordini;

    public Pizzaiolo() {
        ordini = new LinkedList<>();
    }

    public void aggiungiTavolo(Tavolo t) {
        ordini.add(t);
    }

    public void preparaPizze() {
        Tavolo t = ordini.poll();
        if (t != null && t.getStato() == StatoTavolo.ORDINATO) {
            System.out.println("Pizzaiolo prepara ordine tavolo " + t.getNumero());
            t.setStato(StatoTavolo.SERVITO);
        } else if (t != null) {
            System.out.println("Tavolo " + t.getNumero() + " non è pronto per essere preparato.");
        } else {
            System.out.println("Nessun ordine da preparare.");
        }
    }
}
