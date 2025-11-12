
void main() {
    Penna penna1=new Penna();

    penna1.setMarca("bic");
    penna1.setCancellabile(true);
    penna1.setQuantitaInchiostro(24.4);
    penna1.setColore("nero");


    System.out.println("la marca della penna è " + penna1.getMarca());
    System.out.println( "cancellabile "+ penna1.getCancellabile());
    System.out.println( "la quantitò di inchiostro è "+ penna1.getQuantitaInchiostro());
    System.out.println("il colore della penna è " + penna1.getColore());


}
