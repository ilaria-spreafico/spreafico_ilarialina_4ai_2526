public class Furgone {

    /**
     * Rappresenta un furgone utilizzato per il trasporto di scatoloni.
     * <p>
     * La classe gestisce l'occupazione interna del furgone, permette di caricare
     * scatoloni di dimensioni predefinite, svuotare completamente il carico,
     * calcolare lo spazio rimanente e stimare la spesa in base all’occupazione.
     * </p>
     *
     * <p>
     * Include controlli per evitare che la capacità massima venga superata.
     * </p>
     *
     * @author Alessio Amato
     * @version 1.0
     */

    public final int OCCUPAZIONE_SCATOLONE_PICCOLO = 1;
    public final int OCCUPAZIONE_SCATOLONE_MEDIO = 2;
    public final int OCCUPAZIONE_SCATOLONE_GRANDE = 3;
    public final float SPESA_PER_UNITA = 10.0f;

    private int dimensioneTotale;   // il numero massimo di unità che può contenere il furgone
    private int occupazioneCorrente;   // indica il numero di unità occupate in un determinato istante. All'inizio vale 0

    public Furgone(int dimensioneTotale){
        if (dimensioneTotale <= 0) {
            throw new IllegalArgumentException("La dimensione totale deve essere positiva.");
        }
        this.dimensioneTotale = dimensioneTotale;
        occupazioneCorrente = 0;
    }

    /**
     * Aggiunge un nuovo scatolone all'interno del contenitore, aumentando l'occupazione corrente.
     * <p>
     * Se l'aggiunta dello scatolone supera la capienza massima disponibile,
     * viene lanciata una {@link RuntimeException}.
     * </p>
     *
     * @param occupazioneScatolone la dimensione dello scatolone da aggiungere (in unità compatibili con {@code dimensioneTotale})
     * @throws RuntimeException se l'occupazione corrente più lo scatolone supera la dimensione totale consentita
     */
    private void caricaScatolone(int occupazioneScatolone){
        if (occupazioneCorrente + occupazioneScatolone > dimensioneTotale){
            throw new RuntimeException("Capienza massima raggiunta");
        }
        occupazioneCorrente+=occupazioneScatolone;
    }

    /**
     * Carica uno scatolone di dimensioni piccole nel contenitore.
     * <p>
     * Internamente, questo metodo chiama {@link #caricaScatolone(int)} passando
     * come parametro {@code OCCUPAZIONE_SCATOLONE_PICCOLO}.
     * </p>
     *
     * @throws RuntimeException se l'aggiunta dello scatolone piccolo supera la capienza massima disponibile
     */
    public void caricaScatolonePiccolo(){
        caricaScatolone(OCCUPAZIONE_SCATOLONE_PICCOLO);
    }

    /**
     * Carica uno scatolone di dimensioni medie nel contenitore.
     * <p>
     * Internamente, questo metodo chiama {@link #caricaScatolone(int)} passando
     * come parametro {@code OCCUPAZIONE_SCATOLONE_MEDIO}.
     * </p>
     *
     * @throws RuntimeException se l'aggiunta dello scatolone piccolo supera la capienza massima disponibile
     */
    public void caricaScatoloneMedio(){
        caricaScatolone(OCCUPAZIONE_SCATOLONE_MEDIO);

    }

    /**
     * Carica uno scatolone di dimensioni grande nel contenitore.
     * <p>
     * Internamente, questo metodo chiama {@link #caricaScatolone(int)} passando
     * come parametro {@code OCCUPAZIONE_SCATOLONE_GRANDE}.
     * </p>
     *
     * @throws RuntimeException se l'aggiunta dello scatolone piccolo supera la capienza massima disponibile
     */
    public void caricaScatoloneGrande(){
        caricaScatolone(OCCUPAZIONE_SCATOLONE_GRANDE);
    }

    /**
     * Svuota completamente il contenitore, azzerando l'occupazione corrente.
     * <p>
     * Questo metodo simula lo scarico del camion, riportando {@code occupazioneCorrente} a zero.
     * </p>
     */
    public void scaricaCamion(){
        occupazioneCorrente = 0;
    }

    /**
     * Restituisce lo spazio libero attualmente disponibile nel contenitore.
     * <p>
     * Calcola la differenza tra la dimensione totale del contenitore e la sua occupazione corrente.
     * </p>
     *
     * @return la quantità di spazio libero disponibile
     */
    public int getSpazioLibero(){
        return dimensioneTotale - occupazioneCorrente;
    }

    /**
     * Calcola e restituisce la spesa totale in base all'occupazione corrente del contenitore.
     * <p>
     * La spesa è determinata moltiplicando {@code occupazioneCorrente} per {@code SPESA_PER_UNITA}.
     * </p>
     *
     * @return la spesa totale calcolata come {@code occupazioneCorrente * SPESA_PER_UNITA}
     */
    public float getSpesa(){
        return occupazioneCorrente * SPESA_PER_UNITA;
    }
}
