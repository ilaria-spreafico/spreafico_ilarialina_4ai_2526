import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Tris tris = new Tris();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char giocatoreCorrente = 'X';
        boolean giocoFinito = false;

        System.out.println("=== TRIS ===");

        while (!giocoFinito) {
            tris.stampaGriglia();
            System.out.println("Turno del giocatore " + giocatoreCorrente);

            int riga=-1;
            int colonna =-1;

            while (riga < 0 || riga > 2) {
                System.out.print("Inserisci riga (0-2): ");
                try {
                    riga = Integer.parseInt(reader.readLine());
                } catch (Exception e) {
                    System.out.println("Input non valido, riprova.");
                    riga = -1;
                }
            }


            while (colonna < 0 || colonna > 2) {
                System.out.print("Inserisci colonna (0-2): ");
                try {
                    colonna = Integer.parseInt(reader.readLine());
                } catch (Exception e) {
                    System.out.println("Input non valido, riprova.");
                    colonna = -1;
                }
            }
            if (tris.inserisciMossa(riga, colonna, giocatoreCorrente)) {
                if (tris.controlloVittoria(giocatoreCorrente)) {
                    tris.stampaGriglia();
                    System.out.println(" Giocatore " + giocatoreCorrente + " ha vinto!");
                    giocoFinito = true;
                } else if (tris.grigliaPiena()) {
                    tris.stampaGriglia();
                    System.out.println(" Pareggio!");
                    giocoFinito = true;
                } else {
                    giocatoreCorrente = (giocatoreCorrente == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println(" Mossa non valida, riprova!");
            }
        }


    }
}
