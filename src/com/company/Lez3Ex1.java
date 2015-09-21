package com.company;

import java.util.Objects;

/**
 * Created by Danilo on 21/09/2015.
 *
 */
public class Lez3Ex1 {
    public static void main(String[] args){
        Dipendente rossi = new Dipendente("Mario Rossi", 2000.0);
        rossi.setIndirizzo("Roma, via Rossini, 15");
        rossi.setTelefono("06 8989898");
        Dipendente verdi = new Dipendente("Ugo Verdi", 1850.0);
        verdi.setIndirizzo("Roma, via G. Verdi, 30");
        for (Dipendente d : new Dipendente[]{rossi, verdi}) {
            System.out.print("Dipendente: " + d.getNomeCognome());
            System.out.println("  codice: " + d.getCodice());
            System.out.println("    stipendio:  " + d.getStipendio());
            Dipendente.Contatti con = d.getContatti();
            System.out.println("    Indirizzo: " + con.getIndirizzo());
            System.out.println("    Telefono: " + con.getTelefono());
        }
    }

}
class Dipendente {

    public Dipendente(String nomeCognome, double stipendio, long codice) {
        this.nomeCognome = nomeCognome;
        this.stipendio = stipendio;
        this.codice = codice;
        codiceUsato(codice);          // Comunica che il codice � usato
        contatti = new Contatti();
        codice = nuovoCodice();           // Assegna un codice al nuovo dipendente
    }
    public Dipendente(String nomeCognome, double stipendio) {
        this(nomeCognome, stipendio, nuovoCodice());
    }
    public Dipendente(String nomeCognome) {
        this(nomeCognome, 0);
    }

    // Aggiorna la generazione dei codici tenendo conto che il dato codice � in uso
    private static void codiceUsato(long codice) {
        ultimoCodice = Math.max(ultimoCodice, codice);
    }

    /** @return il codice di questo dipendente */
    public long getCodice() { return codice; }

    private static long ultimoCodice;     // Ultimo codice usato

    private static long nuovoCodice() {   // Ritorna un nuovo codice
        ultimoCodice++;
        return ultimoCodice;
    }

    private final long codice;                  // Il codice del dipendente

    /** @return il nome e cognome di questo dipendente */
    public String getNomeCognome() { return nomeCognome; }

    /** @return lo stipendio di questo dipendente */
    public double getStipendio() { return stipendio; }

    private String nomeCognome;
    private double stipendio;
    private static Contatti contatti;

    /** @return i contatti di questo dipendente */
    public Contatti getContatti() { return contatti; }

    /** Imposta l'indirizzo di questo dipendente.
     * @param indirizzo  il nuovo indirizzo */
    public void setIndirizzo(String indirizzo) {
        Objects.requireNonNull(indirizzo, "Indirizzo non pu� essere null");
        contatti.indirizzo = indirizzo;
    }

    /** Imposta il recapito telefonico di questo dipendente.
     * @param telefono  il nuovo numero di telefono */
    public void setTelefono(String telefono) { contatti.telefono = telefono; }

    /** Imposta un nuovo stipendio per questo dipendente.
     * @param nuovoStipendio  l'importo del nuovo stipendio */
    public void setStipendio(double nuovoStipendio) {
        stipendio = nuovoStipendio;
    }

    /*** Mantiene i contatti di un dipendente come indirizzo, telefono, ecc.*/
    public static class Contatti {
        private Contatti() {
            indirizzo = "";
            telefono = "";
        }

        /**@return l'indirizzo del dipendente*/
        public String getIndirizzo() {
            return indirizzo;
        }
        /** Imposta l'indirizzo di questo dipendente.
         * @param indirizzo  il nuovo indirizzo
         * @throws NullPointerException  se indirizzo � null */

        /*** @return il recapito telefonico del dipendente*/
        public String getTelefono() {
            return telefono;
        }

        private String indirizzo;
        private String telefono;
    }
}
