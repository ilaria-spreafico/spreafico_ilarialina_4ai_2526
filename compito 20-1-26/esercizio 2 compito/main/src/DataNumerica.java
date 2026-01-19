public class DataNumerica extends DataFormattata {

    public DataNumerica(int giorno, int mese, int anno) {
        super(giorno, mese, anno);
    }

    @Override
    public String stringaFormattata() {
        return String.format("%02d/%02d/%04d", giorno, mese, anno);
    }
}
