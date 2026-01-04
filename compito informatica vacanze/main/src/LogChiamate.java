import java.util.ArrayList;
import java.util.List;

public class LogChiamate {

    private List<Chiamata> chiamate = new ArrayList<>();

    public void aggiungiChiamata(Chiamata c) {
        chiamate.add(c);
    }

    public List<Chiamata> getChiamate() {
        return new ArrayList<>(chiamate);
    }
}
