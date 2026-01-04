public class Cassa {
    private String identificativo;
    private static int progressivo = 0;

    public Cassa() {
        this.identificativo= "CASSA"  + progressivo++;
    }

    public String getIdentificativo() {
        return identificativo;
    }
}
