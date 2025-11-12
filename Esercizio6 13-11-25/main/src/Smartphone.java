public class Smartphone {
    private String marca;
    private String modello;
    private double prezzoDiLancio;
    private double numPollici;
    private int ram;
    private boolean touchscreen;



    public Smartphone() {
        marca = "";
        modello = "";
        prezzoDiLancio = 0.0;
        numPollici = 0.0;
        ram = 0;
        touchscreen = false;

    }

    public Smartphone(String marca, String modello,double prezzoDiLancio,double numPollici,int ram,boolean touchscreen) {
        this.marca = marca;
        this.modello = modello;
        this.prezzoDiLancio = prezzoDiLancio;
        this.numPollici = numPollici;
        this.ram = ram;
        this.touchscreen = touchscreen;

    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }
    public void setModello(String modello) {
        this.modello = modello;
    }

    public double getPrezzoDiLancio() {
        return prezzoDiLancio;
    }
    public void setPrezzoDiLancio(double prezzoDiLancio) {
        this.prezzoDiLancio = prezzoDiLancio;
    }

    public double getNumPollici() {
        return numPollici;
    }
    public void setNumPollici(double numPollici) {
        this.numPollici = numPollici;
    }

    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }

    public boolean getTouchscreen() {
        return touchscreen;
    }
    public void setTouchscreen(boolean touchscreen) {
        this.touchscreen = touchscreen;
    }

    public String ottieniFasciaDiPrezzo() {
        if (prezzoDiLancio > 500) {
            return "fascia ALTA";
        } else if (prezzoDiLancio >= 200) {
            return "fascia MEDIA";
        } else {
            return "fascia BASSA";
        }
    }

    public String ottieniTipologiaSmartphone() {
        if (numPollici < 5) {
            return "Mini";
        } else if (numPollici <= 7) {
            return "Normal";
        } else {
            return "Maxi";
        }
    }

    public String toString() {
        return "Marca: " + marca +
                "\nModello: " + modello +
                "\nPrezzo di lancio: " + prezzoDiLancio + "€" +
                "\nNumero pollici: " + numPollici +
                "\nRAM: " + ram + "GB" +
                "\nTouch screen: " + touchscreen +
                "\nFascia di prezzo: " + ottieniFasciaDiPrezzo() +
                "\nTipologia: " + ottieniTipologiaSmartphone();
    }

}
