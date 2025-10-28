import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Forza4 gioco = new Forza4();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char giocatoreCorrente = gioco.getGiocatore1();
        boolean partitaFinita = false;

        gioco.inizializzaGriglia();

        while (!partitaFinita) {
            gioco.stampaGriglia();
            System.out.print("Giocatore " + giocatoreCorrente + ", scegli una colonna (1-6): ");

            try {
                int colonna = Integer.parseInt(br.readLine())-1;
                boolean esito = gioco.avviaTurno(colonna, giocatoreCorrente);

                if (esito) {
                    partitaFinita = true;
                } else {
                    if (giocatoreCorrente == gioco.getGiocatore1()) {
                        giocatoreCorrente = gioco.getGiocatore2();
                    } else {
                        giocatoreCorrente = gioco.getGiocatore1();
                    }
                }
            } catch (Exception e) {
                System.out.println("Input non valido. Riprova.");
            }
        }
    }
}
