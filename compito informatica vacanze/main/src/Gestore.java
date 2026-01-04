import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Gestore {

    private Queue<String> CodaNormale = new LinkedList<>();
    private Queue<String> CodaPrioritaria = new LinkedList<>();

    private int progressivoN= 0;
    private int progressivoP = 0;
    private int contBiglN= 0; //contatore biglietti normali chiamati consecutivamente
    private LogChiamate log;

    public Gestore(LogChiamate log) {
        this.log=log;
    }

    public String generaBiglietto (String tipo) {
        String codice;

        if(tipo.equalsIgnoreCase("N")) {
            codice = "N"  + progressivoN++;
            CodaNormale.add(codice);
        }else {
            codice = "P"  + progressivoP++;
            CodaPrioritaria.add(codice);
        }
        return codice;
    }

    public String scodaBiglietto (String cassaID) {
        String chiamato=null;
        if((contBiglN >= 2 && !CodaPrioritaria.isEmpty() ) || CodaNormale.isEmpty()) {
            if(!CodaPrioritaria.isEmpty()){
                chiamato =CodaPrioritaria.poll();
                contBiglN=0;
            }
        }
        if (chiamato == null && !CodaNormale.isEmpty()) {
            chiamato=CodaNormale.poll();
            contBiglN++;
        }
        if(chiamato !=null) {
            log.aggiungiChiamata(new Chiamata(chiamato, cassaID,LocalDateTime.now()));
        }
        return chiamato;
    }

    public List<String> getBigliettiInAttesa(){

        List<String> lista=new LinkedList<>();
        lista.addAll(CodaNormale);
        lista.addAll(CodaPrioritaria);
        return lista;
    }
}
