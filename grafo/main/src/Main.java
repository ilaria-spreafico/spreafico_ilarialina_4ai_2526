public class Main {
    public static void main(String[] args) {
        GrafoMatrice grafo = new GrafoMatrice(4);

        grafo.aggiungiArco(0, 1, 5);
        grafo.aggiungiArco(0, 2, 3);
        grafo.aggiungiArco(1, 3, 2);

        grafo.stampaMatrice();
        System.out.println("Esiste arco 0->1? " + grafo.esisteArco(0, 1));
    }
}