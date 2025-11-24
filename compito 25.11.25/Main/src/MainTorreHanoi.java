import java.util.Scanner;

public class MainTorreHanoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numDischi = 4;


        Rastrelliera A = new Rastrelliera("A");
        Rastrelliera B = new Rastrelliera("B");
        Rastrelliera C = new Rastrelliera("C");

        Rastrelliera[] torri = {A, B, C};


        for (int i = numDischi; i >= 1; i--) {
            A.aggiungiDisco(new Disco(i));
        }


        while (C.getDischi().size() != numDischi) {
            System.out.println("\nStato delle torri:");
            for (Rastrelliera r : torri) {
                r.stampaDischi();
            }

            System.out.print("Sposta disco da torre (0=A,1=B,2=C): ");
            int from = sc.nextInt();
            System.out.print("a torre (0=A,1=B,2=C): ");
            int to = sc.nextInt();


            if (from < 0 || from > 2 || to < 0 || to > 2) {
                System.out.println("Torre inesistente! Riprova.");
                continue;
            }
            if (torri[from].getDischi().isEmpty()) {
                System.out.println("La torre scelta è vuota! Riprova.");
                continue;
            }

            Disco discoDaSpostare = torri[from].getDischi().peek();


            if (torri[to].getDischi().isEmpty() ||
                    discoDaSpostare.getDimensione() < torri[to].getDischi().peek().getDimensione()) {
                torri[from].rimuoviDisco();
                torri[to].aggiungiDisco(discoDaSpostare);
            } else {
                System.out.println("Mossa non valida, riprova!");
            }
        }

        System.out.println("\nHai vinto!");
        sc.close();
    }
}
