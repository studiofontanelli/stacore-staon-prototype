package it.csi.stacore.staon.bo;

import java.util.Date;

import it.csi.stacore.staon.bo.id.IdChiusuraComunicaz;
import it.csi.stacore.staon.bo.id.IdComunicazioneUtente;
import it.csi.stacore.staon.bo.id.IdStatoLavorazione;
import it.csi.stacore.staon.util.EqualsUtil;

public class StatoLavorazione extends Decodifica implements java.io.Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -319380677452715839L;

	private IdComunicazioneUtente idComunicazione = null;
	private Date dataStato = null;
	private Integer idUtenteAssegnante = null;
	private Integer idUtenteAssegnatario = null;
	private IdChiusuraComunicaz idChiusuraComunicazione = null;
	private String cfUtenteAssegnante = null;
	private String cognomeAssegnante = null;
	private String nomeAssegnante = null;
	private String cfUtenteAssegnatario = null;
	private String cognomeAssegnatario = null;
	private String nomeAssegnatario = null;


	public StatoLavorazione(IdStatoLavorazione idStatoLavorazione, String codice, String descrizione) {
		super(idStatoLavorazione, codice, descrizione);
	}

	public IdComunicazioneUtente getIdComunicazioneUtente() {
		return idComunicazione;
	}

	public void setIdComunicazioneUtente(IdComunicazioneUtente idComunicazione) {
		this.idComunicazione = idComunicazione;
	}


	public IdStatoLavorazione getIdStatoLavorazione() {
		return (IdStatoLavorazione) getId();
	}

	public Date getDataStato() {
		return dataStato;
	}


	public void setDataStato(Date dataStato) {
		this.dataStato = dataStato;
	}

	public Integer getIdUtenteAssegnante() {
		return idUtenteAssegnante;
	}


	public void setIdUtenteAssegnante(Integer idUtenteAssegnante) {
		this.idUtenteAssegnante = idUtenteAssegnante;
	}


	public Integer getIdUtenteAssegnatario() {
		return idUtenteAssegnatario;
	}


	public void setIdUtenteAssegnatario(Integer idUtenteAssegnatario) {
		this.idUtenteAssegnatario = idUtenteAssegnatario;
	}


	public IdChiusuraComunicaz getIdChiusuraComunicazione() {
		return idChiusuraComunicazione;
	}


	public void setIdChiusuraComunicazione(IdChiusuraComunicaz idChiusuraComunicazione) {
		this.idChiusuraComunicazione = idChiusuraComunicazione;
	}


	public String getCfUtenteAssegnatario() {
		return cfUtenteAssegnatario;
	}

	public void setCfUtenteAssegnatario(String cfUtenteAssegnatario) {
		this.cfUtenteAssegnatario = cfUtenteAssegnatario;
	}

	public String getCognomeAssegnatario() {
		return cognomeAssegnatario;
	}

	public void setCognomeAssegnatario(String cognomeAssegnatario) {
		this.cognomeAssegnatario = cognomeAssegnatario;
	}

	public String getNomeAssegnatario() {
		return nomeAssegnatario;
	}

	public void setNomeAssegnatario(String nomeAssegnatario) {
		this.nomeAssegnatario = nomeAssegnatario;
	}

	public String getCfUtenteAssegnante() {
		return cfUtenteAssegnante;
	}

	public void setCfUtenteAssegnante(String cfUtenteAssegnante) {
		this.cfUtenteAssegnante = cfUtenteAssegnante;
	}

	public String getCognomeAssegnante() {
		return cognomeAssegnante;
	}

	public void setCognomeAssegnante(String cognomeAssegnante) {
		this.cognomeAssegnante = cognomeAssegnante;
	}

	public String getNomeAssegnante() {
		return nomeAssegnante;
	}

	public void setNomeAssegnante(String nomeAssegnante) {
		this.nomeAssegnante = nomeAssegnante;
	}
	public boolean equals(Object object) {
		boolean equals = false;

		if((object != null) && object instanceof StatoLavorazione) {
			StatoLavorazione altro = (StatoLavorazione) object;
			equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
		}

		return equals;
	}

}