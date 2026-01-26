public class Scacchiera {

    private Pedina[][] pedine;

    public Scacchiera() {
        pedine = new Pedina[8][8];
    }

    public void muovi(Pedina p, int nr, int nc) throws DamaException {
        int rOld = p.getRiga() - 1;
        int cOld = p.getColonna() - 1;
        int rNew = nr - 1;
        int cNew = nc - 1;

        if (pedine[rNew][cNew] != null)
            throw new DamaException("Casella occupata");

        int diffR = nr - p.getRiga();
        int diffC = nc - p.getColonna();

        // tentativo di mangiata
        if (Math.abs(diffR) == 2 && Math.abs(diffC) == 2) {
            mangia(p, rNew, cNew);
        }

        p.muovi(nr, nc);

        pedine[rOld][cOld] = null;
        pedine[rNew][cNew] = p;
    }

    public void aggiungi(Pedina p) throws DamaException {
        int r = p.getRiga() - 1;
        int c = p.getColonna() - 1;

        if (pedine[r][c] != null)
            throw new DamaException("Casella occupata");

        pedine[r][c] = p;
    }

    private void mangia(Pedina p, int rNew, int cNew) throws DamaException {
        int rOld = p.getRiga() - 1;
        int cOld = p.getColonna() - 1;

        int rCentro = (rOld + rNew) / 2;
        int cCentro = (cOld + cNew) / 2;

        Pedina mangiata = pedine[rCentro][cCentro];

        if (mangiata == null)
            throw new DamaException("Nessuna pedina da mangiare");

        if (mangiata.getColore() == p.getColore())
            throw new DamaException("Non puoi mangiare una tua pedina");

        pedine[rCentro][cCentro] = null;
    }

    public int conta(Pedina.Colore c) {
        int cont = 0;
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                if (pedine[i][j] != null && pedine[i][j].getColore() == c)
                    cont++;
        return cont;
    }

    public Pedina[][] getScacchiera() {
        return pedine;
    }
}
