class Cassa {
    private Tavolo[] tavoli;

    public Cassa(Tavolo[] tavoli) {
        this.tavoli = tavoli;
    }

    public double getSpesa(Tavolo t) {
        if (t.getStato() != StatoTavolo.SERVITO) {
            System.out.println("Il tavolo " + t.getNumero() + " non è pronto per pagare.");
            return 0;
        }

        double totale = 0;
        for (Pizza p : t.getOrdine()) {
            totale += p.getCosto();
        }

        t.setStato(StatoTavolo.PAGATO);
        System.out.println("Conto tavolo " + t.getNumero() + ": " + totale + "€");
        return totale;
    }


    public boolean tuttiPagati() {
        for (Tavolo t : tavoli) {
            if (t.getStato() != StatoTavolo.PAGATO) {
                return false;
            }
        }
        return true;
    }
}
