
void main() {
    Smartphone smartphone1 = new Smartphone();

    IO.println(" Inserisci i dati per Smartphone 1:");

    smartphone1.setMarca(IO.readln("Marca: "));
    smartphone1.setModello(IO.readln("Modello: "));

    double prezzo;
    do {
        prezzo = Double.parseDouble(IO.readln("Prezzo di lancio (€): "));
        if (prezzo < 0) IO.println(" Il prezzo non può essere negativo");
    } while (prezzo < 0);
    smartphone1.setPrezzoDiLancio(prezzo);

    double pollici;
    do {
        pollici = Double.parseDouble(IO.readln("Numero pollici: "));
        if (pollici <= 0) IO.println(" Inserisci un valore valido");
    } while (pollici <= 0);
    smartphone1.setNumPollici(pollici);

    int ram;
    do {
        ram = Integer.parseInt(IO.readln("RAM (GB): "));
        if (ram <= 0) IO.println(" La RAM deve essere maggiore di 0.");
    } while (ram <= 0);
    smartphone1.setRam(ram);

    smartphone1.setTouchscreen(Boolean.parseBoolean(IO.readln("Touch screen? (true/false): ")));

    IO.println(" Smartphone 1 ");
    IO.println(smartphone1.toString());
    IO.println();


    IO.println(" Inserisci i dati per Smartphone 2 ");

    String marca2 = IO.readln("Marca: ");
    String modello2 = IO.readln("Modello: ");

    double prezzo2;
    do {
        prezzo2 = Double.parseDouble(IO.readln("Prezzo di lancio (€): "));
        if (prezzo2 < 0) IO.println(" Il prezzo non può essere negativo");
    } while (prezzo2 < 0);

    double pollici2;
    do {
        pollici2 = Double.parseDouble(IO.readln("Numero pollici: "));
        if (pollici2 <= 0) IO.println(" Inserisci un valore valido .");
    } while (pollici2 <= 0);

    int ram2;
    do {
        ram2 = Integer.parseInt(IO.readln("RAM (GB): "));
        if (ram2 <= 0) IO.println(" La RAM deve essere maggiore di 0.");
    } while (ram2 <= 0);

    boolean touch2 = Boolean.parseBoolean(IO.readln("Touch screen? (true/false): "));
    Smartphone smartphone2 = new Smartphone(marca2, modello2, prezzo2, pollici2, ram2, touch2);


    IO.println("Smartphone 2 ");
    IO.println(smartphone2.toString());
}

