public class Smartphone {

    private String marca;
    private String modello;
    private double prezzoDiLancio;
    private double numPollici;
    private int ram;
    private boolean touchScreen;


    public Smartphone() {
        this.marca = "";
        this.modello = "";
        this.prezzoDiLancio = 0.0;
        this.numPollici = 0.0;
        this.ram = 0;
        this.touchScreen = true; // valore predefinito
    }

    public Smartphone(String marca, String modello, double prezzoDiLancio,
                      double numPollici, int ram, boolean touchScreen) {
        this.marca = marca;
        this.modello = modello;
        this.prezzoDiLancio = prezzoDiLancio;
        this.numPollici = numPollici;
        this.ram = ram;
        this.touchScreen = touchScreen;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(marca.length() == 0) throw new IllegalArgumentException("non puo essere vuota");
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        if(modello.length() == 0) throw new IllegalArgumentException("non puo essere vuota");
        this.modello = modello;
    }

    public double getPrezzoDiLancio() {
        return prezzoDiLancio;
    }

    public void setPrezzoDiLancio(double prezzoDiLancio) {
        if (prezzoDiLancio < 0) throw new IllegalArgumentException("non puo essere vuota");
        this.prezzoDiLancio = prezzoDiLancio;
    }

    public double getNumPollici() {
        return numPollici;
    }

    public void setNumPollici(double numPollici) {
        if(numPollici < 0) throw new IllegalArgumentException("non puo essere vuota");
        this.numPollici = numPollici;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if(ram < 0) throw new IllegalArgumentException("non puo essere vuota");
        this.ram = ram;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
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


    @Override
    public String toString() {
        return "Smartphone [" +
                "marca=" + marca +
                ", modello=" + modello +
                ", prezzo=" + prezzoDiLancio +
                ", pollici=" + numPollici +
                ", RAM=" + ram +
                ", touchScreen=" + touchScreen +
                "]";
    }
}
