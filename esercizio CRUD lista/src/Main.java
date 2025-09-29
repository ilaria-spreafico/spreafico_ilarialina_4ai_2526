import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{ ;
    static private ArrayList<String> zaino =new ArrayList<>();


    static public void stampa() {
        System.out.println("-------contenuto dello zaino-----" + zaino+ "oggetti");


        if (zaino.size()==0){
            System.out.println("al momento non ci sono oggetti nello zaino");
        }else{
            for (int i =0;i<zaino.size();i++){
                System.out.println(i+ "-" + zaino.get(i));
            }
        }
    }

    static public void aggiungi(String nome){
        if(zaino.size()<10){
            zaino.add(nome);
            System.out.println("Oggetto aggiunto aggiunto");
        }else{
            System.out.println("zaino pieno , non si può aggiungere più nulla");
        }
    }

    static public void elimina(int indice){
        if(indice >=0 && indice<zaino.size()){
            zaino.remove(indice);
            System.out.println("Oggetto eliminato ");
        }else{
            System.out.println("indice non valido");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        zaino.add("quaderno");
        zaino.add("penna");
        zaino.add("astuccio");
        zaino.add("libro");


        boolean continua=true;
        while(continua){
            System.out.print("Scegli un operazione: ");
            System.out.println("1- stampa");
            System.out.println("2- aggiungi");
            System.out.println("3- elimina");
            System.out.println("4- esci");
            int scelta=Integer.parseInt(br.readLine());

            switch (scelta) {
                case 1:
                    stampa();
                    break;
                case 2:
                    System.out.println("Inserisci il nome del nuovo oggetto:");
                    String nome = br.readLine();
                    aggiungi(nome);
                    break;
                case 3:
                    System.out.println("Inserisci l'indice dell'oggetto da eliminare:");
                    int indice = Integer.parseInt(br.readLine());
                    elimina(indice);
                    break;
                case 4:
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida");
            }
        }

    }
}