import java.util.ArrayList;
import java.util.List;

public class Studente {
    private String nome;
    private String cognome;
    private String matricola;
    private int annoIscrizione;
    private List<Integer> voti = new ArrayList<>();


    public Studente(String nome, String cognome, String matricola, int annoIscrizione) {
        setNome(nome);
        setCognome(cognome);
        this.matricola = matricola;
        this.annoIscrizione = annoIscrizione;
    }


    public void setNome(String n) {
        if (n.length() < 4) throw new IllegalArgumentException("Nome troppo corto");
        if (!n.matches("[a-zA-Z]+")) throw new IllegalArgumentException("Nome contiene caratteri non ammessi");
        nome = n;
    }

    public void setCognome(String c) {
        if (c.length() < 1) throw new IllegalArgumentException("Cognome troppo corto");
        if (!c.matches("[a-zA-Z]+")) throw new IllegalArgumentException("Cognome contiene caratteri non ammessi");
        cognome = c;
    }

    public void setMatricola(String m) {
        matricola = m;
    }

    public void setAnnoIscrizione(int a) {
        annoIscrizione = a;
    }

    public void stampaNome() {
        System.out.println("Nome: " + nome);
    }

    public void stampaCognome() {
        System.out.println("Cognome: " + cognome);
    }

    public void stampaMatricola() {
        System.out.println("Matricola: " + matricola);
    }

    public void stampaAnnoIscrizione() {
        System.out.println("Anno iscrizione: " + annoIscrizione);
    }


    public void aggiungiVoto(int voto) {
        if (voto < 0 || voto > 10)
            throw new IllegalArgumentException("Voto non valido (deve essere tra 0 e 10).");
        voti.add(voto);
    }


    public void stampaMedia() {
        if (voti.size()==0) {
            System.out.println("Media voti: 0.00");
            return;
        }
        int somma = 0;
        for (int voto : voti)
        {
            somma += voto;
        }
        double media = (double) somma / voti.size();
        System.out.printf("Media voti: %.2f\n", media);
    }


    public void stampaDettagli() {
        stampaNome();
        stampaCognome();
        stampaMatricola();
        stampaAnnoIscrizione();
        stampaMedia();
    }
}
