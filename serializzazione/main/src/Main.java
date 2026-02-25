import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Persona> persone = new ArrayList<>();

        persone.add(new Persona("Mario", "Rossi", 30));
        persone.add(new Persona("Aldo", "Verdi", 35));

        persone.add(new Bambino("Sergio", "Neri", 1, "30-01-2025"));
        persone.add(new Bambino("Piero", "Gialli", 2, "28-02-2023"));

        persone.add(new Persona("Carlo", "Arancioni", 24));

        try {
            GestorePersoneFile.salvaPersone(persone);
            System.out.println("Persone salvate correttamente su file.");
        } catch (IOException e) {
            System.out.println("Errore durante la scrittura su file!");
        }

        persone.clear();

        try {
            persone = GestorePersoneFile.caricaPersone();
            System.out.println("Persone caricate dal file:");
        } catch (IOException e) {
            System.out.println("Errore durante la lettura dal file!");
        }

        for (Persona p : persone) {
            System.out.println(p);
        }
    }
}