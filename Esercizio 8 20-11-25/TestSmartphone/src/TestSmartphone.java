public class TestSmartphone {
    public static void main(String[] args) {


        Smartphone smartphone1 = new Smartphone();
        smartphone1.setMarca("Samsung");
        smartphone1.setModello("Galaxy S10");
        smartphone1.setPrezzoDiLancio(450);
        smartphone1.setNumPollici(6.1);
        smartphone1.setRam(8);
        smartphone1.setTouchScreen(true);


        Smartphone smartphone2 = new Smartphone();

        smartphone2.setMarca(IO.readln("Inserisci la marca: "));
        smartphone2.setModello(IO.readln("Inserisci il modello: "));

        double prezzo;
        do {
            prezzo = Double.parseDouble(IO.readln("Inserisci il prezzo di lancio (>=0): "));
        } while (prezzo < 0);
        smartphone2.setPrezzoDiLancio(prezzo);


        double pollici;
        do {
            pollici = Double.parseDouble(IO.readln("Inserisci il numero di pollici (>0): "));
        } while (pollici <= 0);
        smartphone2.setNumPollici(pollici);


        int ram;
        do {
            ram = Integer.parseInt(IO.readln("Inserisci la RAM in GB (>=1): "));
        } while (ram < 1);
        smartphone2.setRam(ram);


        String rispostaTouch = IO.readln("Il telefono è touch screen? (true/false): ").trim();
        smartphone2.setTouchScreen(rispostaTouch.equalsIgnoreCase("true"));


        System.out.println("\n=== Smartphone inseriti ===");
        System.out.println(smartphone1);
        System.out.println(smartphone2);

        
        System.out.println("\n=== Informazioni aggiuntive ===");
        System.out.println("Smartphone 1 -> Fascia: " +
                smartphone1.ottieniFasciaDiPrezzo() +
                ", Tipologia: " +
                smartphone1.ottieniTipologiaSmartphone());

        System.out.println("Smartphone 2 -> Fascia: " +
                smartphone2.ottieniFasciaDiPrezzo() +
                ", Tipologia: " +
                smartphone2.ottieniTipologiaSmartphone());
    }
}
