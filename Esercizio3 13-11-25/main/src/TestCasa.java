
void main() {
    Casa casa1 = new Casa();
    casa1.setNome("Villa Rosa");
    casa1.setFibraOttica(true);
    casa1.setNumStanze(5);
    casa1.setMetriQuadrati(120.5);

    System.out.println("Nome:  " + casa1.getNome());
    System.out.println("Fibra ottica:  " + casa1.getFibraOttica());
    System.out.println("Numero stanze:  " + casa1.getNumStanze());
    System.out.println("Metri quadrati: " + casa1.getMetriQuadrati());


    //casa 2
    Casa casa2 = new Casa();

    IO.println("Inserisci i dati della Casa 2: ");
    casa2.setNome(IO.readln("inserisci il nome della casa 2: "));
    casa2.setFibraOttica(Boolean.parseBoolean(IO.readln(" fibra ottica casa 2:")));
    casa2.setNumStanze(Integer.parseInt(IO.readln("inserisci il numero di stanze della casa 2: ")));
    casa2.setMetriQuadrati(Double.parseDouble(IO.readln("inserisci metri quadrati della casa 2:")));

    IO.println("Nome casa 2; " + casa2.getNome());
    IO.println("Fibra ottica casa 2:  " + casa2.getFibraOttica());
    IO.println("Numero stanze casa 2: " + casa2.getNumStanze());
    IO.println("Metri quadrati casa 2: " + casa2.getMetriQuadrati());
}
