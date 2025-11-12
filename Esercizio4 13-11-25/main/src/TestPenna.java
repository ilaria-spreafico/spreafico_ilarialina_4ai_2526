
void main() {
    Penna penna1 = new Penna();

    penna1.setMarca("bic");
    penna1.setCancellabile(true);
    penna1.setQuantitaInchiostro(23.5);
    penna1.setColore("rossa");


    System.out.println("Marca: " + penna1.getMarca());
    System.out.println("Cancellabile: " + penna1.getCancellabile());
    System.out.println("Quantità di inchiostro: " + penna1.getQuantitaInchiostro() + "%");
    System.out.println("Colore: " + penna1.getColore());

    Penna penna2 = new Penna();
    IO.println("Inserisci i dati della Penna 2:");

    penna2.setMarca(IO.readln("inserisci la marca della penna 2"));
    penna2.setCancellabile(Boolean.parseBoolean(IO.readln(" la penna 2 è cancellabile?: ")));
    penna2.setQuantitaInchiostro(Double.parseDouble(IO.readln(" inserisci la quantità di inchiostro della penna 2")));
    penna2.setColore(IO.readln("inserisci il colore della penna 2: "));
    
    IO.println(" Informazioni Penna 2: ");
    IO.println("Marca: " + penna2.getMarca());
    IO.println("Cancellabile: " + penna2.getCancellabile());
    IO.println("Quantità di inchiostro: " + penna2.getQuantitaInchiostro() + "%");
    IO.println("Colore: " + penna2.getColore());

}
