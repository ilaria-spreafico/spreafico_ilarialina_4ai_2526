import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Griglia g = new Griglia();

        char turno = g.SIMBOLO_X;
        int r, c;
        char vincitore = 'N';

        while (vincitore == 'N' && !g.stallo()) {

            
            System.out.println("  1 2 3");
            for (int i = 0; i < 3; i++) {
                System.out.print((i+1) + " ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(g.getCasella(i,j));
                    if (j < 2) System.out.print("|");
                }
                System.out.println();
            }


            System.out.println("Turno di " + turno);
            System.out.print("Riga: ");
            r = Integer.parseInt(input.readLine());
            System.out.print("Colonna: ");
            c = Integer.parseInt(input.readLine());

            try {
                g.inserisciSimbolo(turno,r,c);
                turno = (turno == g.SIMBOLO_X ? g.SIMBOLO_O : g.SIMBOLO_X);
            } catch (Exception e) {
                System.out.println("Errore: " + e.getMessage());
            }

            vincitore = g.controllaVincita();
        }


        System.out.println("=== GRIGLIA FINALE ===");
        System.out.println("  1 2 3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i+1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(g.getCasella(i,j));
                if (j < 2) System.out.print("|");
            }
            System.out.println();
        }

        if (vincitore != 'N') {
            System.out.println("Ha vinto: " + vincitore);
        } else {
            System.out.println("Stallo! Pareggio.");
        }
    }
}
