import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Brano {
    private String titolo;
    private String artista;
    private int anno;
    private int copieVendute;
    private static List<Brano> archivio = new ArrayList<>();

    public String getTitolo(){
        return titolo;
    }

    public void setTitolo(String t){
        if(t.length()==0) throw new IllegalArgumentException("il titolo non può essere vuoto");
        titolo = t;
    }

    public String getArtista(){
        return artista;
    }

    public void setArtista(String a){
        if (a.length()<2) throw new IllegalArgumentException("l'artista non può essere minore di due lettere");
        artista = a;
    }

    public int getAnno(){
        return anno;
    }

    public void setAnno(int a){
        if (a > LocalDate.now().getYear()) throw new IllegalArgumentException("l'anno non può essere nel futuro!");
        anno = a;
    }

    public int getCopieVendute(){
        return copieVendute;
    }

    public void setCopieVendute(int c){
        if(c < 0) throw new IllegalArgumentException("le copie vendute non possono essere negative");
        copieVendute = c;
    }

    public Classifica getRiconoscimento(){
        Classifica c = Classifica.NESSUNA;
        if(copieVendute <= 1000) c = Classifica.LEGNO;
        if(copieVendute > 100000 && copieVendute <= 250000) c = Classifica.ARGENTO;
        if(copieVendute > 250000 && copieVendute <= 500000) c = Classifica.ORO;
        if(copieVendute > 500000) c = Classifica.PLATINO;

        return c;
    }

    public int getEta(){
        return LocalDate.now().getYear() - anno;
    }

    public Brano(String t, String a, int an, int c){
        setTitolo(t);
        setArtista(a);
        setAnno(an);
        setCopieVendute(c);
    }

    public static Brano creaBrano(){
        Random r = new Random();
        String artisti[] = {"DjOne","BlueDragon", "BasicSound"};

        Brano b = new Brano("br"+r.nextInt(100), artisti[r.nextInt(artisti.length)],
                LocalDate.now().getYear(),0);

        return b;
    }

    public static void aggiungiBrano(Brano b){
        archivio.add(b);
    }

    public static void eliminaBrano(int indice){
        if(indice>= 0 && indice < archivio.size()){
            archivio.remove(indice);
        }else{
            throw new IllegalArgumentException("indice non valido");
        }
    }

    public static List<Brano> getArchivio(){
        return archivio;
    }

    public String toString(){
        return titolo + " - " + artista + " (" + anno + ") copie:" + copieVendute
                + " [" + getRiconoscimento() + "]";
    }

}
