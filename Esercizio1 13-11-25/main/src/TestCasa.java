
void main() {
    Casa casa1=new Casa();

    casa1.setNome("villa");
    casa1.setFibraOttica(true);
    casa1.setNumStanze(2);
    casa1.setMetriQuadrati(115.3);


    System.out.println("il nome della casa è "+  casa1.getNome());
    System.out.println("Fibra ottica " + casa1.getFibraOttica());
    System.out.println("Numero di stanze " + casa1.getNumStanze());
    System.out.println("Metri Quadrati " + casa1.getMetriQuadrati());
}