public class Griglia {

    private char[][] griglia;
    private final int N_CASELLE = 3;
    private  final char CASELLA_VUOTA = ' ';
    public  final char SIMBOLO_O = 'O';
    public  final char SIMBOLO_X = 'X';

    public Griglia() {
        griglia = new char[N_CASELLE][N_CASELLE];
        resetGriglia();
    }

    public void resetGriglia() {
        for (int i = 0; i < N_CASELLE; i++) {
            for (int j = 0; j < N_CASELLE; j++) {
                griglia[i][j] = CASELLA_VUOTA;
            }
        }
    }

    public void inserisciSimbolo(char simbolo, int r, int c) {
        r = r - 1;
        c = c - 1;

        if (simbolo != SIMBOLO_X && simbolo != SIMBOLO_O)
            throw new IllegalArgumentException("Simbolo non valido");
        if (r < 0 || r > N_CASELLE-1)
            throw new IllegalArgumentException("Riga fuori dal range");
        if (c < 0 || c > N_CASELLE-1)
            throw new IllegalArgumentException("Colonna fuori dal range");
        if (griglia[r][c] != CASELLA_VUOTA)
            throw new IllegalArgumentException("Casella gia occupata");
        griglia[r][c] = simbolo;
    }

    public char controllaVincita() {

        for (int r = 0; r < N_CASELLE; r++) {
            if (griglia[r][0] != CASELLA_VUOTA &&
                    griglia[r][0] == griglia[r][1] &&
                    griglia[r][1] == griglia[r][2])
                return griglia[r][0];
        }


        for (int c = 0; c < N_CASELLE; c++) {
            if (griglia[0][c] != CASELLA_VUOTA &&
                    griglia[0][c] == griglia[1][c] &&
                    griglia[1][c] == griglia[2][c])
                return griglia[0][c];
        }


        if (griglia[0][0] != CASELLA_VUOTA &&
                griglia[0][0] == griglia[1][1] &&
                griglia[1][1] == griglia[2][2])
            return griglia[0][0];

        if (griglia[0][2] != CASELLA_VUOTA &&
                griglia[0][2] == griglia[1][1] &&
                griglia[1][1] == griglia[2][0])
            return griglia[0][2];

        return 'N';
    }

    public boolean stallo(){
        for (int r = 0; r < N_CASELLE; r++) {
            for (int c = 0; c < N_CASELLE; c++) {
                if (griglia[r][c] == CASELLA_VUOTA) return false;
            }
        }
        return true;
    }

    public char getCasella(int r, int c) {
        return griglia[r][c];
    }
}
