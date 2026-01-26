public class Main {
    public static void main(String[] args) {

        try {
            Scacchiera s = new Scacchiera();

            Pedina b = new Pedina(2, 1, Pedina.Colore.BIANCO);
            Pedina n = new Pedina(3, 2, Pedina.Colore.NERO);

            s.aggiungi(b);
            s.aggiungi(n);


            s.muovi(b, 4, 3);

            System.out.println("Nere rimaste: " + s.conta(Pedina.Colore.NERO));
            System.out.println("Pedina bianca: " + b);
            System.out.println("Pedina nera: " + n);

        } catch (DamaException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}
