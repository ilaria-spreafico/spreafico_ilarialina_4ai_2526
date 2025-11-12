
void main() {
    Giocatore totti = new Giocatore();
    totti.setNome("Francesco Totti");
    totti.setCapitano(true);
    totti.setGoal(250);
    totti.setGoalNazionale(9);

    System.out.println(totti.toString());

    Giocatore Zanetti = new Giocatore();
    System.out.println(Zanetti.toString());


    Giocatore DelPiero = new Giocatore();

    System.out.println("inserisci i valori per Del piero");
    DelPiero.setNome(IO.readln("inserisci nome del giocatore"));
    DelPiero.setCapitano(Boolean.parseBoolean(IO.readln("il giocatore Del Piero è capitano (true o false)?: ")));
    DelPiero.setGoal(Integer.parseInt(IO.readln("inserisci numero gol del giocatore: ")));
    DelPiero.setGoalNazionale(Integer.parseInt(IO.readln("inserisci numero goal con la nazionale del giocatore : ")));

    System.out.println("GIOCATORE 3 ");
    System.out.println(DelPiero.toString());
}
