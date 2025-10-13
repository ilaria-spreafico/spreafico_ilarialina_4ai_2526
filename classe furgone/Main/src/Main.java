import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Inserisci la capienza del furgone: ");
        int capienza = Integer.parseInt(br.readLine());
        Furgone f = new Furgone(capienza);

        boolean continua = true;
        while (continua) {
            System.out.println("\n--- MENU FURGONE ---");
            System.out.println("1- Carica piccolo (1 unità)");
            System.out.println("2- Carica medio (2 unità)");
            System.out.println("3- Carica grande (3 unità)");
            System.out.println("4- Mostra stato");
            System.out.println("5- Scarica tutto");
            System.out.println("6- Esci");

            int scelta = Integer.parseInt(br.readLine());

            switch (scelta) {
                case 1:
                    if (f.getSpazioRimanente() >= 1) {
                        f.caricaPiccolo();
                        System.out.println("Scatolone piccolo caricato!");
                    } else {
                        System.out.println(" Furgone pieno! Non puoi aggiungere altri scatoloni.");
                    }
                    break;
                case 2:
                    if (f.getSpazioRimanente() >= 2) {
                        f.caricaMedio();
                        System.out.println("Scatolone medio caricato!");
                    } else {
                        System.out.println(" Furgone pieno! Non puoi aggiungere altri scatoloni.");
                    }
                    break;
                case 3:
                    if (f.getSpazioRimanente() >= 3) {
                        f.caricaGrande();
                        System.out.println("Scatolone grande caricato!");
                    } else {
                        System.out.println(" Furgone pieno! Non puoi aggiungere altri scatoloni.");
                    }
                    break;
                case 4:
                    System.out.println(f);
                    break;
                case 5:
                    f.scaricaTutto();
                    System.out.println("Furgone completamente scaricato!");
                    break;
                case 6:
                    continua = false;
                    System.out.println("Uscita dal programma...");
                    break;
                default:
                    System.out.println("Scelta non valida!");
                    break;
            }
        }
    }
}

