import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestorePersoneFile {
        public final static String NOME_FILE= "persone.txt";
        public final static String SEPARATORE=";";

        public static void salvaPersone(List<Persona> personeDaSalvare)throws IOException{

            //creo il buffer writer
            BufferedWriter bufferWriter= new BufferedWriter(new FileWriter(NOME_FILE));

            for(Persona p:personeDaSalvare){
                if(p.getClass().getSimpleName().equals("Bambino")){
                    Bambino b= (Bambino)p;
                    bufferWriter.write("Bambino;"+
                            b.getNome() + SEPARATORE + b.getCognome() + SEPARATORE + b.getEta() + SEPARATORE + b.getDataNascita() );

                }else{
                    bufferWriter.write("Persona;" +
                            p.getNome() + SEPARATORE +
                            p.getCognome() + SEPARATORE +
                            p.getEta());
                }
                bufferWriter.newLine();
            }
            bufferWriter.close();
        }

        public static List<Persona> caricaPersone() throws IOException{
                 //creo il BufferReader
            BufferedReader br= new BufferedReader(new FileReader(NOME_FILE));

            //creo la lista delle persone
            List<Persona> personeDaCaricare=new ArrayList<>();

            //creo la variabile per salvare la stringa completa
            String riga;

            //finchè la riga ha qualcosa dentro
            while((riga=br.readLine()) != null){
                //splitta la stringa
                String[] dati=riga.split(SEPARATORE);
                if(dati[0].equals("Persona")) {
                    String nome = dati[1];
                    String cognome = dati[2];
                    int eta = Integer.parseInt(dati[3]);

                    //carico tutto sulla lista che devo ritornare
                    personeDaCaricare.add(new Persona(nome, cognome, eta));
                }else if (dati[0].equals("Bambino")){
                    String nome=dati[1];
                    String cognome=dati[2];
                    int eta=Integer.parseInt(dati[3]);
                    String dataNascita=dati[4];

                    personeDaCaricare.add(new Bambino(nome,cognome,eta,dataNascita));
                }
            }
            //chiudo il BufferReader e faccio la return
            br.close();
            return personeDaCaricare;
        }
}
