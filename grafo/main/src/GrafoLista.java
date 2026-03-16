import java.util.ArrayList;
import java.util.List;

class GrafoLista {
    private List<List<Arco>> lista;
    private int numVertici;

    // Classe interna per rappresentare un arco
    static class Arco {
        int destinazione;
        int peso;

        Arco(int destinazione, int peso) {
            this.destinazione = destinazione;
            this.peso = peso;
        }
    }

    // Costruttore
    public GrafoLista(int numVertici) {
        this.numVertici = numVertici;
        lista = new ArrayList<>();
        for (int i = 0; i < numVertici; i++) {
            lista.add(new ArrayList<>());
        }
    }

    // Aggiungi arco orientato
    public void aggiungiArco(int sorgente, int destinazione, int peso) {
        lista.get(sorgente).add(new Arco(destinazione, peso));
    }

    // Stampa lista di adiacenza
    public void stampaLista() {
        System.out.println("Lista di adiacenza:");
        for (int i = 0; i < numVertici; i++) {
            System.out.print(i + ": ");
            for (Arco arco : lista.get(i)) {
                System.out.print("->(" + arco.destinazione + ", peso=" + arco.peso + ") ");
            }
            System.out.println();
        }
    }
}