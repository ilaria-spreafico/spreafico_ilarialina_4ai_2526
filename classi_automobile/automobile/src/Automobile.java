public class Automobile {
    // ATTRIBUTI/VARIABILI

    // Attributi funzionali
    public String marca;
    public String modello;
    public String colore;

    // Attributi di stato (interni alla classe)
    public int velocita;
    public boolean accesa;
    public String direzione; // esempio: Avanti, Indietro, Sinistra, Destra

    // COSTRUTTORE
    public Automobile(String marcaDaImpostare, String modelloDaImpostare, String coloreDaImpostare) {
        marca = marcaDaImpostare;
        modello = modelloDaImpostare;
        colore = coloreDaImpostare;
        velocita = 0;   // parte ferma
        accesa = false; // inizialmente spenta
        direzione = "ferma";
    }

    // METODI/FUNZIONI
    public void accendi() {
        accesa = true;
    }

    public void spegni() {
        accesa = false;
        velocita = 0; // quando spenta si ferma
        direzione = "ferma";
    }

    public void accelera(int incremento) {
        if (accesa) {
            velocita += incremento;
        }
    }

    public void frena(int decremento) {
        if (accesa) {
            velocita -= decremento;
            if (velocita < 0) velocita = 0;
        }
    }

    public void arresta() {
        velocita = 0;
        direzione = "ferma";
    }

    // Nuove azioni
    public void vaiAvanti() {
        if (accesa) {
            direzione = "avanti";
        }
    }

    public void vaiIndietro() {
        if (accesa) {
            direzione = "indietro";
        }
    }

    public void giraDestra() {
        if (accesa) {
            direzione = "destra";
        }
    }

    public void giraSinistra() {
        if (accesa) {
            direzione = "sinistra";
        }
    }

    public void mostraInfo() {
        System.out.println("Automobile " + marca + " " + modello + " (" + colore + ")");
        System.out.println("Accesa: " + accesa);
        System.out.println("Velocità: " + velocita + " km/h");
        System.out.println("Direzione: " + direzione + "\n");
    }
}
