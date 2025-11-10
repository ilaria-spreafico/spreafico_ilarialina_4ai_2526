import java.util.Scanner;
import java.time.LocalDate;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int scelta;
        do {
            System.out.println("\n--- MENU CRUD BRANI ---");
            System.out.println("1) Crea brano");
            System.out.println("2) Visualizza brani");
            System.out.println("3) Modifica brano");
            System.out.println("4) Elimina brano");
            System.out.println("0) Esci");
            System.out.print("Scelta: ");
            scelta = leggiIntero();

            switch (scelta) {

                case 1: // CREATE
                    String titolo = leggiStringaNonVuota("Titolo");
                    String artista = leggiStringaMin2("Artista");
                    int anno = leggiAnno();
                    int copie = leggiNonNegativo("Copie vendute");

                    Brano.aggiungiBrano(new Brano(titolo, artista, anno, copie));
                    System.out.println("Brano aggiunto!");
                    break;

                case 2: // READ
                    if (Brano.getArchivio().isEmpty()) {
                        System.out.println("Nessun brano presente!");
                    } else {
                        for (int i = 0; i < Brano.getArchivio().size(); i++) {
                            System.out.println("[" + i + "] " + Brano.getArchivio().get(i));
                        }
                    }
                    break;

                case 3: // UPDATE
                    if (Brano.getArchivio().isEmpty()) {
                        System.out.println("Archivio vuoto!");
                        break;
                    }

                    int index = leggiIndiceValido();

                    Brano b = Brano.getArchivio().get(index);

                    b.setTitolo(leggiStringaNonVuota("Nuovo titolo"));
                    b.setArtista(leggiStringaMin2("Nuovo artista"));
                    b.setAnno(leggiAnno());
                    b.setCopieVendute(leggiNonNegativo("Nuove copie vendute"));

                    System.out.println("Brano aggiornato!");
                    break;

                case 4: // DELETE
                    if (Brano.getArchivio().isEmpty()) {
                        System.out.println("Archivio vuoto!");
                        break;
                    }

                    Brano.eliminaBrano(leggiIndiceValido());
                    System.out.println("Brano eliminato!");
                    break;

                case 0:
                    System.out.println("Chiusura...");
                    break;

                default:
                    System.out.println("Scelta non valida!");
            }

        } while (scelta != 0);

        sc.close();
    }

    // -------------------------------
    // METODI DI CONTROLLO
    // -------------------------------

    static int leggiIntero() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.print("Inserisci un numero valido: ");
            }
        }
    }

    static String leggiStringaNonVuota(String campo) {
        while (true) {
            System.out.print(campo + ": ");
            String s = sc.nextLine();
            if (!s.trim().isEmpty()) return s;
            System.out.println("Non può essere vuoto!");
        }
    }

    static String leggiStringaMin2(String campo) {
        while (true) {
            System.out.print(campo + ": ");
            String s = sc.nextLine();
            if (s.trim().length() >= 2) return s;
            System.out.println("Deve contenere almeno 2 caratteri!");
        }
    }

    static int leggiAnno() {
        int annoCorrente = LocalDate.now().getYear();
        while (true) {
            System.out.print("Anno: ");
            try {
                int a = Integer.parseInt(sc.nextLine());
                if (a <= annoCorrente) return a;
                System.out.println("L'anno non può essere nel futuro!");
            } catch (Exception e) {
                System.out.println("Inserisci un anno valido!");
            }
        }
    }

    static int leggiNonNegativo(String campo) {
        while (true) {
            System.out.print(campo + ": ");
            try {
                int n = Integer.parseInt(sc.nextLine());
                if (n >= 0) return n;
                System.out.println("Non può essere negativo!");
            } catch (Exception e) {
                System.out.println("Inserisci un numero valido!");
            }
        }
    }

    static int leggiIndiceValido() {
        while (true) {
            System.out.print("Indice: ");
            try {
                int i = Integer.parseInt(sc.nextLine());
                if (i >= 0 && i < Brano.getArchivio().size()) return i;
                System.out.println("Indice fuori range!");
            } catch (Exception e) {
                System.out.println("Inserisci un numero valido!");
            }
        }
    }
}
