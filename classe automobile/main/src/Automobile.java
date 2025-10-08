import java.time.Year;

public class Automobile {

    private String marca;
    private String modello;
    private int anno;
    private double chilometraggio;


    public Automobile(String marca, String modello, int anno, double chilometraggio) {
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
        if (chilometraggio >= 0) {
            this.chilometraggio = chilometraggio;
        } else {
            System.out.println("Errore: il chilometraggio non può essere negativo. Impostato a 0.");
            this.chilometraggio = 0;
        }
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

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public double getChilometraggio() {
        return chilometraggio;
    }


    public void setChilometraggio(double nuovoChilometraggio) {
        if (nuovoChilometraggio >= chilometraggio && nuovoChilometraggio >= 0) {
            this.chilometraggio = nuovoChilometraggio;
        }
         else {
            System.out.println("Errore: il nuovo chilometraggio non può essere inferiore a quello attuale.");
        }
    }


    public void stampaDettagli() {
        System.out.println("Marca: " + marca);
        System.out.println("Modello: " + modello);
        System.out.println("Anno: " + anno);
        System.out.println("Chilometraggio: " + chilometraggio + " km");
    }


    public int calcolaEta() {
        int annoCorrente = Year.now().getValue();
        return annoCorrente - anno;
    }
}

