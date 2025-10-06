public class Main {
    public static void main(String[] args) {
        Automobile a1 = new Automobile("Fiat", "Panda", "Rosso");
        Automobile a2 = a1; // stesso riferimento
        a1 = new Automobile("Volkswagen", "Golf", "Blu"); // nuova istanza
        Automobile a3 = new Automobile("Tesla", "Model 3", "Bianco");

        // TEST AUTOMOBILE 1
        a1.accendi();
        a1.accelera(50);
        a1.vaiAvanti();
        a1.mostraInfo();

        // TEST AUTOMOBILE 2 (condivisa con a1 prima)
        a2.accendi();
        a2.accelera(30);
        a2.vaiIndietro();
        a2.mostraInfo();

        // TEST AUTOMOBILE 3
        a3.accendi();
        a3.accelera(100);
        a3.giraDestra();
        a3.frena(40);
        a3.mostraInfo();
    }
}
