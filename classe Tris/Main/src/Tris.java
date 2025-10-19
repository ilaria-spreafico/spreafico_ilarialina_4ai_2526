public class Tris {
    private char[][] griglia;
    private static final int GRANDEZZA = 3; //indica il numero di caselle in altezza e larghezza

    public Tris() {
        griglia = new char[GRANDEZZA][GRANDEZZA];
        // Inizializza la griglia vuota
        for (int i = 0; i < GRANDEZZA; i++) {
            for (int j = 0; j < GRANDEZZA; j++) {
                griglia[i][j] = ' ';
            }
        }
    }

    public void stampaGriglia() {
        for (int i = 0; i < GRANDEZZA; i++) {
            for (int j = 0; j < GRANDEZZA; j++) {
                System.out.print("| " + griglia[i][j] + " ");
            }
            System.out.println("|");

            for (int k = 0; k < GRANDEZZA; k++)
            System.out.print("----");
            System.out.println("-");
        }
    }

    public boolean inserisciMossa(int riga, int colonna, char simbolo) {
        if (riga >= 0 && riga < GRANDEZZA && colonna >= 0 && colonna < GRANDEZZA && griglia[riga][colonna] == ' ') {
            griglia[riga][colonna] = simbolo;
            return true;
        }
        return false;
    }

    public boolean controlloVittoria(char simbolo) {
        // Controlla righe e colonne
        for (int i = 0; i < GRANDEZZA; i++) {
            if ((griglia[i][0] == simbolo && griglia[i][1] == simbolo && griglia[i][2] == simbolo) ||
                    (griglia[0][i] == simbolo && griglia[1][i] == simbolo && griglia[2][i] == simbolo)) {
                return true;
            }
        }
        // Controlla diagonali
        if ((griglia[0][0] == simbolo && griglia[1][1] == simbolo && griglia[2][2] == simbolo) ||
                (griglia[0][2] == simbolo && griglia[1][1] == simbolo && griglia[2][0] == simbolo)) {
            return true;
        }
        return false;
    }

    public boolean grigliaPiena() {
        for (int i = 0; i < GRANDEZZA; i++) {
            for (int j = 0; j < GRANDEZZA; j++) {
                if (griglia[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
