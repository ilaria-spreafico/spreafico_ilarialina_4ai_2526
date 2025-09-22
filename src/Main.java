import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

void main() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Inserisci una stringa ");
    String testo= br.readLine();


    String risultato= capitalize(testo);

    System.out.println(risultato);


}
public static String capitalize(String stringa) {
    String risultato="";
    boolean inizioParola=true;

    for(int i=0;i<stringa.length();i++){
        if(stringa.charAt(i)==' '){
            risultato=risultato+stringa.charAt(i);
            inizioParola=true;

        }else{
            if(inizioParola){
                risultato=risultato+Character.toUpperCase(stringa.charAt(i));
                inizioParola=false;
            }else{
                risultato=risultato+stringa.charAt(i);
            }
        }

    }
    return risultato;
}
