public class Main {

    public static void main(String[] args) {

        IO.println("----- Torre di Hanoi -----");

        int numeroDischi = Integer.parseInt(IO.readln("Inserisci il numero di dischi: ")
        );

        // crea lista di dischi dal più grande al più piccolo
        java.util.List<Integer> dischi = new java.util.ArrayList<>();
        for (int i = numeroDischi; i >= 1; i--) {
            dischi.add(i);
        }

        Rastrelliera rastrelliera = new Rastrelliera(3, numeroDischi, dischi);

        while (!rastrelliera.vittoria()) {

            stampa(rastrelliera.getRastrelliera());

            int da = Integer.parseInt(IO.readln("Sposta un disco\nDa torre (1-3): ")
            );

            int a = Integer.parseInt(IO.readln("A torre (1-3): ")
            );

            // esegue la mossa, i messaggi di errore sono già gestiti in Rastrelliera
            rastrelliera.spostaDisco(da, a);
        }

        stampa(rastrelliera.getRastrelliera());
        IO.println("\n Vittoria! Hai completato la Torre di Hanoi ");
    }

    private static void stampa(int[][] r){
        IO.println("\n--- Stato torri --- ");
        for(int i = r.length - 1; i >= 0; i--){
            String linea = "";
            for(int j = 0; j < r[i].length; j++){
                linea += (r[i][j] == 0 ? " . " : " " + r[i][j] + " ");
            }
            IO.println(linea);
        }
        IO.println(" 1   2   3 "); // allineamento corretto dei numeri
    }
}
