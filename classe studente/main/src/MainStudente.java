public class MainStudente {
    public static void main(String[] args) {
        Studente studente1 = new Studente("Luca", "Rossi", "MAT12345", 2022);

        studente1.aggiungiVoto(8);
        studente1.aggiungiVoto(5);
        studente1.aggiungiVoto(6);

        studente1.stampaDettagli();


        studente1.aggiungiVoto(35);
    }
}
