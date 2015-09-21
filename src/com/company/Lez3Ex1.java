package com.company;

import java.util.Objects;

/**
 * Created by Danilo on 21/09/2015.
 *
 */
public class Lez3Ex1 {

}
class Dipendente {
    public Dipendente(String nomeCognome, double stipendio, long codice) {
        this.nomeCognome = nomeCognome;
        this.stipendio = stipendio;
        this.codice = codice;
        codiceUsato(codice);          // Comunica che il codice è usato
        contatti = new Contatti();
    }
    /** @return i contatti di questo dipendente */
    public Contatti getContatti() { return contatti; }

    /** Imposta l'indirizzo di questo dipendente.
     * @param indirizzo  il nuovo indirizzo */
    public void setIndirizzo(String indirizzo) { contatti.indirizzo = indirizzo; }

    /** Imposta il recapito telefonico di questo dipendente.
     * @param telefono  il nuovo numero di telefono */
    public void setTelefono(String telefono) { contatti.telefono = telefono; }

    /*** Mantiene i contatti di un dipendente come indirizzo, telefono, ecc.*/
    public static class Contatti {
        /**@return l'indirizzo del dipendente*/
        public String getIndirizzo() {
            return indirizzo;
        }
        /** Imposta l'indirizzo di questo dipendente.
         * @param indirizzo  il nuovo indirizzo
         * @throws NullPointerException  se indirizzo è null */
        public void setIndirizzo(String indirizzo) {
            Objects.requireNonNull(indirizzo, "Indirizzo non può essere null");
            contatti.indirizzo = indirizzo;
        }

        /*** @return il recapito telefonico del dipendente*/
        public String getTelefono() {
            return telefono;
        }


        private Contatti() {
            indirizzo = "";
            telefono = "";
        }

        private String indirizzo;
        private String telefono;
    }
    private Contatti contatti;

}
