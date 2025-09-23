import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    static private String[]zaino=new String[5];
    static private int conta=0;

    static public void stampa(String[] a, int size) {
        System.out.println("-------contenuto dello zaino-----" + conta+ "oggetti");


        if (conta==0){
            System.out.println("al momento non ci sono oggetti nello zaino");
        }else{
            for (int i =0;i<conta;i++){
                System.out.println(i+ "-" + zaino[i]);
            }
        }
    }

    static public void aggiungi(String nome){
        if(conta<10){
            zaino[conta]=nome;
            conta++;
            System.out.println("Oggetto aggiunto aggiunto");
        }else{
            System.out.println("zaino pieno , non si può aggiungere più nulla");
        }
    }

    static public void elimina(int indice){
        if(indice >=0 && indice<conta){
            for(int i=indice; i<conta-1; i++){
                zaino[i]=zaino[i+1];
            }
            zaino[conta-1]=null;
            conta--;
            System.out.println("Oggetto eliminato ");
        }else{
            System.out.println("indice non valido");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        zaino[0]="quaderno";
        zaino[1]="penna";
        zaino[2]="Astuccio";
        zaino[3]="libro";
        conta=4;

        boolean continua=true;
        while(continua){
            System.out.print("Scegli un operazione: ");
            System.out.println("1- stampa");
            System.out.println("2- aggiungi");
            System.out.println("3- elimina");
            System.out.println("4- esci");
            int scelta=Integer.parseInt(br.readLine());

            if(scelta==1){
                stampa(zaino,conta);
            }
            if (scelta == 2) {
                System.out.println("Inserisci il nome del nuovo oggetto:");
                String nome = br.readLine();
                aggiungi(nome);
            }
            if (scelta == 3) {
                System.out.println("Inserisci l'indice dell'oggetto da eliminare:");
                int indice = Integer.parseInt(br.readLine());
                elimina(indice);
            }
            if (scelta == 4) {
                continua = false;
            }else{
                System.out.println("scelta non valida");
            }
        }

    }
}
