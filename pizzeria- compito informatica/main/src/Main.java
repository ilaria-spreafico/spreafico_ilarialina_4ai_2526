import java.util.Random;


public class Main {
    public static void main(String[] args) {


        Random rnd = new Random();

        // MENU PIZZE
        Pizza margherita = new Pizza("Margherita", 5.0);
        Pizza diavola = new Pizza("Diavola", 6.5);
        Pizza quattroFormaggi = new Pizza("4 Formaggi", 7.0);
        Pizza[] menu = {margherita, diavola, quattroFormaggi};

        // TAVOLI (tutti occupati)
        Tavolo[] tavoli = new Tavolo[10];
        for (int i = 0; i < 10; i++) {
            int commensali = rnd.nextInt(4) + 1;
            tavoli[i] = new Tavolo(i + 1, commensali);
            for (int j = 0; j < commensali; j++) {
                tavoli[i].aggiungiPizza(menu[rnd.nextInt(3)]);
            }
        }

        // PERSONALE
        Pizzaiolo pizzaiolo = new Pizzaiolo();
        Cameriere c1 = new Cameriere(pizzaiolo);
        Cameriere c2 = new Cameriere(pizzaiolo);
        Cassa cassa = new Cassa(tavoli);

        boolean continua = true;
        System.out.println("Benvenuto nella simulazione della pizzeria!");

        while (continua) {
            System.out.println("\n--- SCEGLI RUOLO ---");
            System.out.println("1 - Cameriere");
            System.out.println("2 - Pizzaiolo");
            System.out.println("3 - Cassiera");
            System.out.println("0 - Esci");
            System.out.println("scelta: ");

            int scelta = -1;
            try {
                scelta = Integer.parseInt(IO.readln());
            } catch (NumberFormatException e) {
                System.out.println("Input non valido! Devi inserire un numero.");
                continue;
            }


            switch (scelta) {
                case 1: // CAMERIERE
                    System.out.print("Sei cameriere 1 o 2? ");
                    int camID = -1;
                    try {
                        camID = Integer.parseInt(IO.readln());
                    } catch (NumberFormatException e) {
                        System.out.println("Input non valido!");
                        break;
                    }
                    if (camID == 1 || camID == 2) {
                        if (camID == 1)
                            c1.prendiOrdini(tavoli, 1);
                        else
                            c2.prendiOrdini(tavoli, 2);
                    } else {
                        System.out.println("Cameriere non valido.");
                    }
                    break;

                case 2: // PIZZAIOLO
                    pizzaiolo.preparaPizze();
                    break;

                case 3: // CASSIERA
                    System.out.println("Tavoli pronti per pagare:");
                    for (Tavolo t : tavoli) {
                        if (t.getStato() == StatoTavolo.SERVITO)
                            System.out.println("Tavolo " + t.getNumero());
                    }
                    System.out.print("Inserisci numero tavolo da pagare (1-10): ");
                    int n = -1;
                    try {
                        n = Integer.parseInt(IO.readln());
                    } catch (NumberFormatException e) {
                        System.out.println("Input non valido!");
                        break;
                    }
                    if (n >= 1 && n <= 10) {
                        cassa.getSpesa(tavoli[n - 1]);
                    } else {
                        System.out.println("Numero tavolo non valido.");
                    }
                    break;

                case 0:
                    continua = false;
                    break;

                default:
                    System.out.println("Scelta non valida. Inserisci un numero da 0 a 3.");
            }


            // Se tutti i tavoli hanno pagato termina
            if (cassa.tuttiPagati()) {
                System.out.println("\nTutti i tavoli hanno pagato. Servizio terminato. La pizzeria chiude.");
                continua = false;
            }
        }


        System.out.println("Simulazione terminata");
    }
}
