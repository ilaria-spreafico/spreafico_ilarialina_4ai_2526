public class TriangoloRettangolo {

    private double cateto1;
    private double cateto2;

    public TriangoloRettangolo() {
        this.cateto1 = 0.0;
        this.cateto2 = 0.0;
    }

    public TriangoloRettangolo(double cateto1, double cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }


    public double getCateto1() {
        return cateto1;
    }

    public void setCateto1(double cateto1) {
        this.cateto1 = cateto1;
    }

    public double getCateto2() {
        return cateto2;
    }

    public void setCateto2(double cateto2) {
        this.cateto2 = cateto2;
    }


    public double calcolaIpotenusa() {
        return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    }

    public double calcolaArea() {
        return (cateto1 * cateto2) / 2;
    }


    public double calcolaPerimetro() {
        return cateto1 + cateto2 + calcolaIpotenusa();
    }

    @Override
    public String toString() {
        return "TriangoloRettangolo [" +
                "cateto1=" + cateto1 +
                ", cateto2=" + cateto2 +
                ", ipotenusa=" + calcolaIpotenusa() +
                ", area=" + calcolaArea() +
                ", perimetro=" + calcolaPerimetro() +
                "]";
    }
}
