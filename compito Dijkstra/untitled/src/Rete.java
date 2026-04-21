import java.util.ArrayList;

public class Rete {

    private ArrayList<Router> routers;

    public Rete() {
        routers = new ArrayList<>();
    }

    // aggiunge router
    public void aggiungiRouter(Router r) {
        routers.add(r);
    }

    // rimuove router e tutti i collegamenti
    public void rimuoviRouter(Router r) {

        routers.remove(r);

        for (Router nodo : routers) {
            for (int i = 0; i < nodo.getVicini().size(); i++) {
                if (nodo.getVicini().get(i) == r) {
                    nodo.getVicini().remove(i);
                    nodo.getPesi().remove(i);
                    break;
                }
            }
        }
    }

    // collega due router (non orientato)
    public void collega(Router a, Router b, int peso) {
        a.aggiungiVicino(b, peso);
        b.aggiungiVicino(a, peso);
    }

    public ArrayList<Router> getRouters() {
        return routers;
    }
}