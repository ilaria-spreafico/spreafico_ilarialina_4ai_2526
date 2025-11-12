public class Penna {
    private String marca;
    private boolean cancellabile;
    private double quantitaInchiostro;
    private String colore;

    public Penna() {
        marca="";
        cancellabile=false;
        quantitaInchiostro=0.0;
        colore="";
    }

    public String getMarca() {
        return marca;
    }

    public boolean getCancellabile() {
        return cancellabile;
    }

    public double getQuantitaInchiostro() {
        return quantitaInchiostro;
    }

    public String getColore() {
        return colore;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCancellabile(boolean cancellabile) {
        this.cancellabile = cancellabile;
    }

    public void setQuantitaInchiostro(double quantitaInchiostro) {
        this.quantitaInchiostro = quantitaInchiostro;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }
}
