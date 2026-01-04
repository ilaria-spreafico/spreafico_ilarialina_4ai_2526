import java.util.List;

public class Main {

    private Gestore gestore;
    private LogChiamate log;
    private Cassa[] casse;

    public Main() {
        log = new LogChiamate();
        gestore = new Gestore(log);

        System.out.print("Inserisci il numero di casse: ");
        int numeroCasse = leggiInteroPositivo();

        casse = new Cassa[numeroCasse];
        for (int i = 0; i < numeroCasse; i++) {
            casse[i] = new Cassa();
        }

        menuPrincipale();
    }

    private void menuPrincipale() {
        boolean continua = true;

        while (continua) {
            System.out.println("\n--- MENU PRINCIPALE ---");
            System.out.println("1) Cliente");
            System.out.println("2) Operatore di cassa");
            System.out.println("3) Ispettore");
            System.out.println("0) Esci");
            System.out.print("Scelta: ");

            int scelta = leggiIntero();

            switch (scelta) {
                case 1:
                    menuCliente();
                    break;
                case 2:
                    menuCassa();
                    break;
                case 3:
                    menuIspettore();
                    break;
                case 0:
                    continua = false;
                    System.out.println("Programma terminato.");
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        }
    }

    /* ---------------- MENU CLIENTE ---------------- */

    private void menuCliente() {
        System.out.println("\n--- CLIENTE ---");
        System.out.println("1) Biglietto normale");
        System.out.println("2) Biglietto prioritario");
        System.out.print("Scelta: ");

        int scelta = leggiIntero();

        if (scelta == 1) {
            String codice = gestore.generaBiglietto("N");
            System.out.println("Biglietto assegnato: " + codice);
        } else if (scelta == 2) {
            String codice = gestore.generaBiglietto("P");
            System.out.println("Biglietto assegnato: " + codice);
        } else {
            System.out.println("Scelta non valida.");
        }
    }

    /* ---------------- MENU CASSA ---------------- */

    private void menuCassa() {
        System.out.print("Seleziona numero cassa (0 - " + (casse.length - 1) + "): ");
        int numeroCassa = leggiIntero();

        if (numeroCassa < 0 || numeroCassa >= casse.length) {
            System.out.println("Cassa non valida.");
            return;
        }

        String idCassa = casse[numeroCassa].getIdentificativo();
        String biglietto=  gestore.scodaBiglietto(idCassa);


        if (biglietto == null) {
            System.out.println("Nessun cliente in attesa.");
        } else {
            System.out.println("Chiamato biglietto: " + biglietto);
        }
    }

    /* ---------------- MENU ISPETTORE ---------------- */

    private void menuIspettore() {
        System.out.println("\n--- ISPETTORE ---");
        System.out.println("1) Visualizza clienti in attesa");
        System.out.println("2) Visualizza storico chiamate");
        System.out.print("Scelta: ");

        int scelta = leggiIntero();

        if (scelta == 1) {
            List<String> inAttesa = gestore.getBigliettiInAttesa();
            if (inAttesa.isEmpty()) {
                System.out.println("Nessun cliente in attesa.");
            } else {
                System.out.println("Clienti in attesa:");
                for (String b : inAttesa) {
                    System.out.println(b);
                }
            }

        } else if (scelta == 2) {
            List<Chiamata> chiamate = log.getChiamate();
            if (chiamate.isEmpty()) {
                System.out.println("Nessuna chiamata effettuata.");
            } else {
                for (Chiamata c : chiamate) {
                    System.out.println(c);
                }
            }

        } else {
            System.out.println("Scelta non valida.");
        }
    }

    /* ---------------- METODI DI SUPPORTO ---------------- */

    private int leggiIntero() {
        while (true) {
            try {
                String input = IO.readln();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.print("Inserisci un numero valido: ");
            }
        }
    }

    private int leggiInteroPositivo() {
        while (true) {
            try {
                String input = IO.readln();
                int valore = Integer.parseInt(input);
                if (valore > 0) {
                    return valore;
                } else {
                    System.out.print("Inserisci un numero maggiore di 0: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Inserisci un numero valido: ");
            }
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
    }
}
