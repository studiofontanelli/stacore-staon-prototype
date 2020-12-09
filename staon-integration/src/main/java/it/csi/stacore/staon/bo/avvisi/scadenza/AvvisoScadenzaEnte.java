/*
 * Created on 14-nov-2005
 */
package it.csi.stacore.staon.bo.avvisi.scadenza;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import it.csi.stacore.staon.bo.id.avvisi.scadenza.IdAvvisoScadenzaEnte;
import it.csi.stacore.staon.util.EqualsUtil;

/**
 * @author mdferrua
 */
public class AvvisoScadenzaEnte implements Serializable {
	static final long serialVersionUID = 889959897946401369L;

	/**
	 * @uml.property  name="idAvvisoScadenzaEnte"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private IdAvvisoScadenzaEnte idAvvisoScadenzaEnte = null;

	/**
	 * @uml.property  name="annoRiferimento"
	 */
	private BigDecimal annoRiferimento = null;

	/**
	 * @uml.property  name="scadenza"
	 */
	private BigDecimal scadenza = null;

	/**
	 * @uml.property  name="idEnte"
	 */
	private BigDecimal idEnte = null;

	/**
	 * @uml.property  name="dataElaborazione"
	 */
	private Date dataElaborazione = null;

	/**
	 * @uml.property  name="dataInvio"
	 */
	private Date dataInvio = null;

	/**
	 * @uml.property  name="tipoAvvisoScadenza"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private TipoAvvisoScadenza tipoAvvisoScadenza = null;

	/**
	 * @uml.property  name="statoScadenza"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private StatoAvvisoScadenza statoScadenza = null;

	public AvvisoScadenzaEnte(IdAvvisoScadenzaEnte idAvvisoScadenzaEnte, Date dataInvio) {
		this(idAvvisoScadenzaEnte, null, null, null, null, dataInvio, null, null);
	}

	/**
	 * @param idAvvisoScadenzaEnte
	 * @param annoRiferimento
	 * @param scadenza
	 * @param idEnte
	 * @param dataElaborazione
	 * @param dataInvio
	 * @param tipoAvvisoScadenza
	 * @param statoScadenza
	 */
	public AvvisoScadenzaEnte(IdAvvisoScadenzaEnte idAvvisoScadenzaEnte,
			BigDecimal annoRiferimento, BigDecimal scadenza, BigDecimal idEnte,
			Date dataElaborazione, Date dataInvio,
			TipoAvvisoScadenza tipoAvvisoScadenza,
			StatoAvvisoScadenza statoScadenza) {
		this.idAvvisoScadenzaEnte = idAvvisoScadenzaEnte;
		this.annoRiferimento = annoRiferimento;
		this.scadenza = scadenza;
		this.idEnte = idEnte;
		this.dataElaborazione = dataElaborazione;
		this.dataInvio = dataInvio;
		this.tipoAvvisoScadenza = tipoAvvisoScadenza;
		this.statoScadenza = statoScadenza;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	/**
	 * @return  Returns the annoRiferimento.
	 * @uml.property  name="annoRiferimento"
	 */
	public BigDecimal getAnnoRiferimento() {
		return annoRiferimento;
	}

	/**
	 * @param annoRiferimento  The annoRiferimento to set.
	 * @uml.property  name="annoRiferimento"
	 */
	public void setAnnoRiferimento(BigDecimal annoRiferimento) {
		this.annoRiferimento = annoRiferimento;
	}

	/**
	 * @return  Returns the dataElaborazione.
	 * @uml.property  name="dataElaborazione"
	 */
	public Date getDataElaborazione() {
		return dataElaborazione;
	}

	/**
	 * @param dataElaborazione  The dataElaborazione to set.
	 * @uml.property  name="dataElaborazione"
	 */
	public void setDataElaborazione(Date dataElaborazione) {
		this.dataElaborazione = dataElaborazione;
	}

	/**
	 * @return  Returns the dataInvio.
	 * @uml.property  name="dataInvio"
	 */
	public Date getDataInvio() {
		return dataInvio;
	}

	/**
	 * @param dataInvio  The dataInvio to set.
	 * @uml.property  name="dataInvio"
	 */
	public void setDataInvio(Date dataInvio) {
		this.dataInvio = dataInvio;
	}

	/**
	 * @return  Returns the idAvvisoScadenzaEnte.
	 * @uml.property  name="idAvvisoScadenzaEnte"
	 */
	public IdAvvisoScadenzaEnte getIdAvvisoScadenzaEnte() {
		return idAvvisoScadenzaEnte;
	}

	/**
	 * @param idAvvisoScadenzaEnte  The idAvvisoScadenzaEnte to set.
	 * @uml.property  name="idAvvisoScadenzaEnte"
	 */
	public void setIdAvvisoScadenzaEnte(
			IdAvvisoScadenzaEnte idAvvisoScadenzaEnte) {
		this.idAvvisoScadenzaEnte = idAvvisoScadenzaEnte;
	}

	/**
	 * @return  Returns the idEnte.
	 * @uml.property  name="idEnte"
	 */
	public BigDecimal getIdEnte() {
		return idEnte;
	}

	/**
	 * @param idEnte  The idEnte to set.
	 * @uml.property  name="idEnte"
	 */
	public void setIdEnte(BigDecimal idEnte) {
		this.idEnte = idEnte;
	}

	/**
	 * @return  Returns the scadenza.
	 * @uml.property  name="scadenza"
	 */
	public BigDecimal getScadenza() {
		return scadenza;
	}

	/**
	 * @param scadenza  The scadenza to set.
	 * @uml.property  name="scadenza"
	 */
	public void setScadenza(BigDecimal scadenza) {
		this.scadenza = scadenza;
	}

	/**
	 * @return  Returns the statoScadenza.
	 * @uml.property  name="statoScadenza"
	 */
	public StatoAvvisoScadenza getStatoScadenza() {
		return statoScadenza;
	}

	/**
	 * @param statoScadenza  The statoScadenza to set.
	 * @uml.property  name="statoScadenza"
	 */
	public void setStatoScadenza(StatoAvvisoScadenza statoScadenza) {
		this.statoScadenza = statoScadenza;
	}

	/**
	 * @return  Returns the tipoAvvisoScadenza.
	 * @uml.property  name="tipoAvvisoScadenza"
	 */
	public TipoAvvisoScadenza getTipoAvvisoScadenza() {
		return tipoAvvisoScadenza;
	}

	/**
	 * @param tipoAvvisoScadenza  The tipoAvvisoScadenza to set.
	 * @uml.property  name="tipoAvvisoScadenza"
	 */
	public void setTipoAvvisoScadenza(TipoAvvisoScadenza tipoAvvisoScadenza) {
		this.tipoAvvisoScadenza = tipoAvvisoScadenza;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param object
	 *            DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public boolean equals(Object object) {
		boolean equals = false;

		if ((object != null) && object instanceof AvvisoScadenzaEnte) {
			AvvisoScadenzaEnte altro = (AvvisoScadenzaEnte) object;
			equals = EqualsUtil.objectEquals(getAnnoRiferimento(),altro.getAnnoRiferimento()) &&
			EqualsUtil.objectEquals(getDataElaborazione(),altro.getDataElaborazione()) &&
			EqualsUtil.objectEquals(getDataInvio(),altro.getDataInvio()) &&
			EqualsUtil.objectEquals(getIdAvvisoScadenzaEnte(),altro.getIdAvvisoScadenzaEnte()) &&
			EqualsUtil.objectEquals(getIdEnte(),altro.getIdEnte()) &&
			EqualsUtil.objectEquals(getScadenza(),altro.getScadenza()) &&
			EqualsUtil.objectEquals(getStatoScadenza(),altro.getStatoScadenza()) &&
			EqualsUtil.objectEquals(getTipoAvvisoScadenza(),altro.getTipoAvvisoScadenza());
		}

		return equals;
	}

}
