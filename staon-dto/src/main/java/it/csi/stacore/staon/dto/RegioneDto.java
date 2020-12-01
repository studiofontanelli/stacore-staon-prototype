package it.csi.stacore.staon.dto;

import java.io.Serializable;

public class RegioneDto implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 5415506064388125610L;


	private Long         id;
	private String       descrizione;
	private String       codice;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}


}
