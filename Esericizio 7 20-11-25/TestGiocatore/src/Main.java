void main() {
    Giocatore totti=new Giocatore();
    totti.setNome("Francesco");
    totti.setGoalNazionale(9);
    totti.setCapitano(true);
    totti.setGoal(250);

    Giocatore Zanetti=new Giocatore(" Javier",true,20,5);

    Giocatore g3=new Giocatore();

    System.out.println("inserisci i dati del giocatore");
    g3.setNome(IO.readln("inserisci nome del giocatore: "));
    g3.setCapitano(Boolean.parseBoolean(IO.readln("inserisci se il giocatore è un capitano: ")));
    g3.setGoal(Integer.parseInt(IO.readln("inserisci il numero di goal del giocatore: ")));
    g3.setGoalNazionale(Integer.parseInt(IO.readln("inserisci il numero di goal fatti in nazionale dal giocatore; ")));

    System.out.println(totti);
    System.out.println(Zanetti);
    System.out.println(g3);

    int sommaGoal= totti.calcolaGoalTotali()+ Zanetti.calcolaGoalTotali()+g3.calcolaGoalTotali();
    System.out.println(sommaGoal);

}
