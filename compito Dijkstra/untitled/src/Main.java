public class Main {
    public static void main(String[] args) {

        // crea router
        Router A = new Router("A", "192.168.0.1", Router.Stato.ACCESO);
        Router B = new Router("B", "192.168.0.2", Router.Stato.ACCESO);
        Router C = new Router("C", "192.168.0.3", Router.Stato.ACCESO);

        // crea rete (logica manuale senza classe Rete obbligatoria)
        A.aggiungiVicino(B, 5);
        B.aggiungiVicino(A, 5);

        B.aggiungiVicino(C, 2);
        C.aggiungiVicino(B, 2);

        A.aggiungiVicino(C, 10);
        C.aggiungiVicino(A, 10);

        // test stampa
        System.out.println("Vicini di A:");
        for (int i = 0; i < A.getVicini().size(); i++) {
            System.out.println(
                    A.getVicini().get(i).getHostname() +
                            " peso " +
                            A.getPesi().get(i)
            );
        }
    }
}