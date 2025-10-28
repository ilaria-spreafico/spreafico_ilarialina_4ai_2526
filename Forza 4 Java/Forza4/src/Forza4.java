

public class Forza4 {
    private final int Righe = 7;
    private final int Colonne = 6;
    private final char Giocatore1 = 'X';
    private final char Giocatore2 = 'O';
    private final char CasellaVuota = '-';

    private char[][] griglia = new char[Righe][Colonne];

    public void inizializzaGriglia() {
        for (int r = 0; r < Righe; r++)
            for (int c = 0; c < Colonne; c++)
                griglia[r][c] = CasellaVuota;
    }

    public void stampaGriglia() {
        for (int r = 0; r < Righe; r++) {
            for (int c = 0; c < Colonne; c++) {
                System.out.print(griglia[r][c] + " ");
            }
            System.out.println();
        }
    }

    public int inserisciPedina(int colonna, char giocatore) {
        for (int r = Righe - 1; r >= 0; r--) {
            if (griglia[r][colonna] == CasellaVuota) {
                griglia[r][colonna] = giocatore;
                return r;
            }
        }
        return -1;
    }

    public boolean avviaTurno(int colonna, char giocatoreCorrente) {
        if (colonna < 0 || colonna >= Colonne || griglia[0][colonna] != CasellaVuota) {
            System.out.println("Mossa non valida. Riprova.");
            return false;
        }

        int riga = inserisciPedina(colonna, giocatoreCorrente);
        if (controllaVittoria(riga, colonna, giocatoreCorrente)) {
            stampaGriglia();
            System.out.println("Giocatore " + giocatoreCorrente + " ha vinto!");
            return true;
        } else if (grigliaPiena()) {
            stampaGriglia();
            System.out.println("Pareggio!");
            return true;
        }

        return false;
    }

    public boolean controllaVittoria(int riga, int colonna, char giocatore) {
        if (contaVerticale(riga, colonna, giocatore) >= 4) return true;
        if (contaOrizzontale(riga, colonna, giocatore) >= 4) return true;
        if (contaDiagonaleDestra(riga, colonna, giocatore) >= 4) return true;
        if (contaDiagonaleSinistra(riga, colonna, giocatore) >= 4) return true;
        return false;
    }



    public int contaVerticale(int riga, int colonna, char giocatore) {

        // Inizia il conteggio da 1, includendo la pedina appena inserita
        int conta = 1;
        // Controlla verso il basso
        for (int r = riga + 1; r < Righe && griglia[r][colonna] == giocatore; r++) {
            conta++; // Incrementa se trova la stessa pedina
        }
        // Controlla verso l'alto
        for (int r = riga - 1; r >= 0 && griglia[r][colonna] == giocatore; r--) {
            conta++; //
        }
        // Restituisce il numero totale di pedine consecutive trovate in verticale
        return conta;
    }



    public int contaOrizzontale(int riga, int colonna, char giocatore) {
        // Inizia il conteggio da 1, includendo la pedina appena inserita
        int conta = 1;
        // Controlla verso destra
        for (int c = colonna + 1; c < Colonne && griglia[riga][c] == giocatore; c++) {
            conta++; // Incrementa se trova la stessa pedina
        }
        // Controlla verso sinistra
        for (int c = colonna - 1; c >= 0 && griglia[riga][c] == giocatore; c--) {
            conta++; //
        }
        // Restituisce il numero totale di pedine consecutive trovate in orizzontale
        return conta;
    }


    public int contaDiagonaleDestra(int riga, int colonna, char giocatore) {
        // Inizia il conteggio da 1, includendo la pedina appena inserita
        int conta = 1;
        // Controlla verso il basso a destra
        for (int r = riga + 1, c = colonna + 1;
             r < Righe && c < Colonne && griglia[r][c] == giocatore; r++, c++) {
            conta++; // Incrementa se trova la stessa pedina
        }
        // Controlla verso l'alto a sinistra
        for (int r = riga - 1, c = colonna - 1; r >= 0 && c >= 0 && griglia[r][c] == giocatore; r--, c--) {
            conta++; // Incrementa se trova la stessa pedina
        }
        // Restituisce il numero totale di pedine consecutive trovate su questa diagonale
        return conta;
    }


    public int contaDiagonaleSinistra(int riga, int colonna, char giocatore) {
        // Inizia il conteggio da 1, includendo la pedina appena inserita
        int conta = 1;
        // Controlla verso il basso a sinistra
        for (int r = riga + 1, c = colonna - 1;
             r < Righe && c >= 0 && griglia[r][c] == giocatore;
             r++, c--) {
            conta++; // Incrementa se trova la stessa pedina
        }
        // Controlla verso l'alto a destra
        for (int r = riga - 1, c = colonna + 1;
             r >= 0 && c < Colonne && griglia[r][c] == giocatore;
             r--, c++) {
            conta++; // Incrementa se trova la stessa pedina
        }
        // Restituisce il numero totale di pedine consecutive trovate su questa diagonale
        return conta;
    }

    public boolean grigliaPiena() {
        for (int c = 0; c < Colonne; c++) {
            if (griglia[0][c] == CasellaVuota) return false;
        }
        return true;
    }


    public int getRighe() {
        return Righe;
    }

    public int getColonne() {
        return Colonne;
    }

    public char getGiocatore1() {
        return Giocatore1;
    }

    public char getGiocatore2() {
        return Giocatore2;
    }

    public char getCasellaVuota() {
        return CasellaVuota;
    }

    public char[][] getGriglia() {
        return griglia;
    }



}
