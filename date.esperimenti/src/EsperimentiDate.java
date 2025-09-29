import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class EsperimentiDate {
    public static void main(String[] args) {
        // Data di oggi
        LocalDate oggi = LocalDate.now();
        System.out.println("Oggi è: " + oggi);

        // Data specifica (es. compleanno)
        LocalDate compleanno = LocalDate.of(2008, 9, 17);
        System.out.println("Il mio compleanno è: " + compleanno);

        // Calcolo differenza tra due date
        Period differenza = Period.between(compleanno, oggi);
        System.out.println("Hai " + differenza.getYears() + " anni, "
                + differenza.getMonths() + " mesi e "
                + differenza.getDays() + " giorni");

        // Aggiungere o togliere giorni/mesi/anni
        LocalDate settimanaProssima = oggi.plusDays(7);
        LocalDate meseProssimo = oggi.plusMonths(1);
        System.out.println("Tra una settimana sarà: " + settimanaProssima);
        System.out.println("Tra un mese sarà: " + meseProssimo);

        // Formattare una data in modo leggibile
        DateTimeFormatter formatoItaliano = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Oggi formattato: " + oggi.format(formatoItaliano));

        // Lavorare anche con data + ora
        LocalDateTime adesso = LocalDateTime.now();
        System.out.println("Ora esatta: " + adesso);

        // Data e ora fra 100 giorni
        LocalDateTime futuro = adesso.plusDays(100);
        System.out.println("Tra 100 giorni sarà: " + futuro.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")));
    }
}
