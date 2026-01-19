public class ProvaData {

    public static void main(String[] args) {

        System.out.print("Quante date vuoi inserire? ");
        int n = Integer.parseInt(IO.readln());

        DataFormattata[] date = new DataFormattata[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nData " + (i + 1));

            System.out.print("Giorno: ");
            int g = Integer.parseInt(IO.readln());

            System.out.print("Mese: ");
            int m = Integer.parseInt(IO.readln());

            System.out.print("Anno: ");
            int a = Integer.parseInt(IO.readln());

            System.out.print("Formato (1 = numerico, 2 = esteso): ");
            int scelta = Integer.parseInt(IO.readln());

            if (scelta == 1) {
                date[i] = new DataNumerica(g, m, a);
            } else {
                date[i] = new DataEstesa(g, m, a);
            }
        }

        System.out.println("\nDate inserite:");
        for (int i = 0; i < n; i++) {
            System.out.println(date[i].stringaFormattata());
        }
    }
}
