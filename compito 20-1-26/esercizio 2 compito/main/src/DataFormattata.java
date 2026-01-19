public abstract class DataFormattata {
    protected int giorno;
    protected int mese;
    protected int anno;

    public DataFormattata(int giorno, int mese, int anno) {
        this.giorno = giorno;
        this.mese = mese;

        // Se l'anno è a due cifre → 2000+
        if (anno < 100) {
            this.anno = 2000 + anno;
        } else {
            this.anno = anno;
        }
    }

    public abstract String stringaFormattata();
}
