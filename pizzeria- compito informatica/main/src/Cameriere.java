class Cameriere {
    private Pizzaiolo pizzaiolo;

    public Cameriere(Pizzaiolo pizzaiolo) {
        this.pizzaiolo = pizzaiolo;
    }

    public void prendiOrdini(Tavolo[] tavoli, int cameriereID) {
        boolean ordiniDisponibili = false;
        for (int i = 0; i < tavoli.length; i++) {
            if (tavoli[i].getStato() == StatoTavolo.OCCUPATO) {
                if ((cameriereID == 1 && i % 2 == 0) || (cameriereID == 2 && i % 2 != 0)) {
                    System.out.println("Cameriere " + cameriereID + " prende ordine tavolo " + tavoli[i].getNumero());
                    tavoli[i].setStato(StatoTavolo.ORDINATO);
                    pizzaiolo.aggiungiTavolo(tavoli[i]);
                    ordiniDisponibili = true;
                }
            }
        }
        if (!ordiniDisponibili) {
            System.out.println("Non ci sono ordini da prendere al momento.");
        }
    }
}
