public class TestTriangoloRettangolo {
    public static void main(String[] args) {

        TriangoloRettangolo t1 = new TriangoloRettangolo();
        t1.setCateto1(3);
        t1.setCateto2(4);
        
        TriangoloRettangolo t2 = new TriangoloRettangolo(5, 12);

        boolean continua = true;

        while (continua) {

            System.out.println("\n===== MENU TRIANGOLI RETTANGOLI =====");
            System.out.println("1) Mostra informazioni dei triangoli");
            System.out.println("2) Mostra triangolo con area maggiore");
            System.out.println("3) Modifica valori del primo triangolo");
            System.out.println("4) Modifica valori del secondo triangolo");
            System.out.println("0) Esci");

            int scelta = Integer.parseInt(IO.readln("Scelta: ").trim());

            switch (scelta) {

                case 1:
                    System.out.println("\nTRIANGOLO 1:");
                    System.out.println(t1);

                    System.out.println("\nTRIANGOLO 2:");
                    System.out.println(t2);
                    break;

                case 2:
                    System.out.println("\n=== Confronto delle aree ===");
                    if (t1.calcolaArea() > t2.calcolaArea()) {
                        System.out.println("Il triangolo con area maggiore è: TRIANGOLO 1");
                        System.out.println(t1);
                    } else if (t2.calcolaArea() > t1.calcolaArea()) {
                        System.out.println("Il triangolo con area maggiore è: TRIANGOLO 2");
                        System.out.println(t2);
                    } else {
                        System.out.println("I due triangoli hanno la stessa area!");
                    }
                    break;

                case 3:
                    double nuovoC1_T1 = Double.parseDouble(IO.readln("Nuovo cateto1 per T1: ").trim());
                    double nuovoC2_T1 = Double.parseDouble(IO.readln("Nuovo cateto2 per T1: ").trim());
                    t1.setCateto1(nuovoC1_T1);
                    t1.setCateto2(nuovoC2_T1);
                    break;

                case 4:
                    double nuovoC1_T2 = Double.parseDouble(IO.readln("Nuovo cateto1 per T2: ").trim());
                    double nuovoC2_T2 = Double.parseDouble(IO.readln("Nuovo cateto2 per T2: ").trim());
                    t2.setCateto1(nuovoC1_T2);
                    t2.setCateto2(nuovoC2_T2);
                    break;

                case 0:
                    continua = false;
                    System.out.println("Programma terminato.");
                    break;

                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }
    }
}
