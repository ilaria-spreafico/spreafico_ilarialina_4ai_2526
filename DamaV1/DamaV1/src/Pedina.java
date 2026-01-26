public class Pedina {

    public enum Colore { BIANCO, NERO }
    public enum Tipo { DAMA, DAMONE }

    private Colore colore;
    private Tipo tipo;
    private int riga;
    private int colonna;

    public Pedina(int r, int c, Colore col) throws DamaException {
        this.colore = col;
        this.tipo = Tipo.DAMA;
        this.riga = 0;
        this.colonna = 0;
        muovi(r, c);
    }

    public Pedina(Pedina p) {
        this.colore = p.colore;
        this.tipo = p.tipo;
        this.riga = p.riga;
        this.colonna = p.colonna;
    }

    public Colore getColore() { return colore; }

    public void promuoviADamone() { tipo = Tipo.DAMONE; }

    public int getRiga() { return riga; }

    public int getColonna() { return colonna; }

    public void muovi(int nr, int nc) throws DamaException {
        if (nr < 1 || nr > 8 || nc < 1 || nc > 8)
            throw new DamaException("Posizione non valida");

        if (riga != 0 && colonna != 0) {
            int diffR = nr - riga;
            int diffC = Math.abs(nc - colonna);

            if (tipo == Tipo.DAMONE) {
                if (Math.abs(diffR) != diffC)
                    throw new DamaException("Movimento non valido per il Damone");
            } else {
                if (diffC != 1)
                    throw new DamaException("Movimento non valido per la Dama");

                if (colore == Colore.BIANCO && diffR != 1)
                    throw new DamaException("La Dama bianca può muovere solo avanti");

                if (colore == Colore.NERO && diffR != -1)
                    throw new DamaException("La Dama nera può muovere solo avanti");
            }
        }

        this.riga = nr;
        this.colonna = nc;
    }

    @Override
    public String toString() {
        return tipo + " " + colore + " [" + riga + "," + colonna + "]";
    }
}
