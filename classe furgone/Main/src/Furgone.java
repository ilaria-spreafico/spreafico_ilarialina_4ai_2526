public class Furgone {
    private final int capienzaTotale;
    private int spazioOccupato;


    public Furgone(int capienza) {
        if (capienza <= 0) {
            throw new IllegalArgumentException("La capienza deve essere positiva!");
        }
        this.capienzaTotale = capienza;
        this.spazioOccupato = 0;
    }


    public boolean caricaPiccolo() {
        return carica(1);
    }

    public boolean caricaMedio() {
        return carica(2);
    }

    public boolean caricaGrande() {
        return carica(3);
    }


    private boolean carica(int unita) {
        if (spazioOccupato + unita <= capienzaTotale) {
            spazioOccupato += unita;
            return true;
        } else {
            return false;
        }
    }


    public void scaricaTutto() {
        spazioOccupato = 0;
    }


    public int getSpazioRimanente() {
        return capienzaTotale - spazioOccupato;
    }

    
    public int calcolaCosto() {
        return spazioOccupato * 10;
    }

    @Override
    public String toString() {
        return "Furgone: " + spazioOccupato + "/" + capienzaTotale +
                " unità occupate | Spazio libero: " + getSpazioRimanente() +
                " | Costo: " + calcolaCosto() + " euro";
    }
}
