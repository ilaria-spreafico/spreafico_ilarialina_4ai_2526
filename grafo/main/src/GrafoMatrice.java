import java.util.Arrays;

class GrafoMatrice {
    private int[][] matrice;
    private int numVertici;

    // Costruttore
    public GrafoMatrice(int numVertici) {
        this.numVertici = numVertici;
        matrice = new int[numVertici][numVertici];
        for (int i = 0; i < numVertici; i++) {
            Arrays.fill(matrice[i], 0); // 0 = nessun arco
        }
    }

    // Aggiungi un arco (orientato) con peso
    public void aggiungiArco(int sorgente, int destinazione, int peso) {
        matrice[sorgente][destinazione] = peso;
    }

    // Stampa la matrice
    public void stampaMatrice() {
        System.out.println("Matrice di adiacenza:");
        for (int i = 0; i < numVertici; i++) {
            for (int j = 0; j < numVertici; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Controlla se esiste un arco
    public boolean esisteArco(int sorgente, int destinazione) {
        return matrice[sorgente][destinazione] != 0;
    }
}