public class DataEstesa extends DataFormattata {

    private static final String[] NOMI_MESI = {
            "gennaio", "febbraio", "marzo", "aprile", "maggio", "giugno",
            "luglio", "agosto", "settembre", "ottobre", "novembre", "dicembre"
    };

    public DataEstesa(int giorno, int mese, int anno) {
        super(giorno, mese, anno);
    }

    @Override
    public String stringaFormattata() {
        return String.format("%02d %s %04d",
                giorno, NOMI_MESI[mese - 1], anno);
    }
}
