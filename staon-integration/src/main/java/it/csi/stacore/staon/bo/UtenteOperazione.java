package it.csi.stacore.staon.bo;

import java.io.Serializable;

public class UtenteOperazione implements Serializable {

    private String nome;
    private String cognome;
    private String ente;
    private String ragionesociale;
    private String indirizzo;
    private String comune;

    public UtenteOperazione() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEnte() {
        return ente;
    }

    public void setEnte(String ente) {
        this.ente = ente;
    }

    public String getRagionesociale() {
        return ragionesociale;
    }

    public void setRagionesociale(String ragionesociale) {
        this.ragionesociale = ragionesociale;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getComune() {
        return comune;
    }

    public void setComune(String comune) {
        this.comune = comune;
    }
}
