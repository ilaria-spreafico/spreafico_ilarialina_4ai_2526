import java.util.ArrayList;

public class Router {

    private String hostname;
    private String ip;
    private Stato stato;

    // lista vicini + pesi (per Dijkstra)
    private ArrayList<Router> vicini;
    private ArrayList<Integer> pesi;

    public enum Stato {
        ACCESO,
        SPENTO
    }

    public Router(String hostname, String ip, Stato stato) {
        setHostname(hostname);
        setIp(ip);
        this.stato = stato;

        vicini = new ArrayList<>();
        pesi = new ArrayList<>();
    }

    // aggiunge collegamento
    public void aggiungiVicino(Router r, int peso) {
        vicini.add(r);
        pesi.add(peso);
    }

    public ArrayList<Router> getVicini() {
        return vicini;
    }

    public ArrayList<Integer> getPesi() {
        return pesi;
    }

    // Getter
    public String getHostname() {
        return hostname;
    }

    public String getIp() {
        return ip;
    }

    public Stato getStato() {
        return stato;
    }

    // Setter
    public void setHostname(String hostname) {
        if (hostname == null || hostname.length() == 0) {
            throw new IllegalArgumentException("Hostname non valido");
        }
        this.hostname = hostname;
    }

    public void setIp(String ip) {
        if (ip == null) {
            throw new IllegalArgumentException("IP nullo");
        }

        String[] parti = ip.split("\\.");

        if (parti.length != 4) {
            throw new IllegalArgumentException("Formato IP non valido");
        }

        for (String p : parti) {
            try {
                int n = Integer.parseInt(p);
                if (n < 0 || n > 255) {
                    throw new IllegalArgumentException("Numero IP fuori range");
                }
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("IP non valido");
            }
        }

        this.ip = ip;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }
}