public class Pizza {
    private String nome;
    private double costo;

    public Pizza(String nome, double costo) {
        this.nome=nome;
        this.costo=costo;
    }

    public double getCosto() {
        return costo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                ", costo=" + costo +
                '}';
    }

}
