public class MainAutomobile {
    public static void main(String[] args) {

        Automobile auto1 = new Automobile("Ford", "Fiesta", 2020, 15000);
        auto1.stampaDettagli();


        System.out.println("\nAggiornamento chilometraggio :");
        auto1.setChilometraggio(17000);
        auto1.stampaDettagli();




        int eta = auto1.calcolaEta();
        System.out.println("\nL'età dell'auto è: " + eta + " anni");
    }
}

