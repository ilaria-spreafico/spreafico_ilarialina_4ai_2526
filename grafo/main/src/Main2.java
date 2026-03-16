public class Main2 {
    public static void main(String[] args) {
        GrafoLista grafo = new GrafoLista(4);

        grafo.aggiungiArco(0, 1, 5);
        grafo.aggiungiArco(0, 2, 3);
        grafo.aggiungiArco(1, 3, 2);

        grafo.stampaLista();
    }
}