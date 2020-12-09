/*
 * Created on 14-nov-2005
 */
package it.csi.stacore.staon.bo.avvisi.scadenza;

import java.io.Serializable;

import it.csi.stacore.staon.bo.TipoStatoPagamentoAvviso;
import it.csi.stacore.staon.bo.TipoVeicolo;

/**
 * @author mdferrua
 */
public class RicercaAvvisoScadenza implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 4835997695784784122L;

	/**
	 * @uml.property  name="identificativoFiscale"
	 */
	private String identificativoFiscale = null;

	/**
	 * @uml.property  name="numeroProtocollo"
	 */
	private String numeroProtocollo = null;

	/**
	 * @uml.property  name="targa"
	 */
	private String targa = null;

	/**
	 * @uml.property  name="tipoVeicolo"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private TipoVeicolo tipoVeicolo = null;

	private Integer scadenza;

	private TipoStatoPagamentoAvviso tipoStatoPagamentoAvviso;

	private StatoAvvisoScadenza statoAvvisoScadenza;


	/**
	 * @param identificativoFiscale
	 * @param numeroProtocollo
	 * @param targa
	 * @param tipoVeicolo
	 */


	public RicercaAvvisoScadenza(String identificativoFiscale,
			String numeroProtocollo, String targa, TipoVeicolo tipoVeicolo, Integer scadenza,
			TipoStatoPagamentoAvviso tipoStatoPagamentoAvviso, StatoAvvisoScadenza statoAvvisoScadenza) {
		this.identificativoFiscale = identificativoFiscale;
		this.numeroProtocollo = numeroProtocollo;
		this.targa = targa;
		this.tipoVeicolo = tipoVeicolo;
		this.scadenza = scadenza;
		this.tipoStatoPagamentoAvviso = tipoStatoPagamentoAvviso;
		this.statoAvvisoScadenza = statoAvvisoScadenza;
	}

	/**
	 * @return  Returns the identificativoFiscale.
	 * @uml.property  name="identificativoFiscale"
	 */
	public String getIdentificativoFiscale() {
		return identificativoFiscale;
	}

	/**
	 * @param identificativoFiscale  The identificativoFiscale to set.
	 * @uml.property  name="identificativoFiscale"
	 */
	public void setIdentificativoFiscale(String identificativoFiscale) {
		this.identificativoFiscale = identificativoFiscale;
	}

	/**
	 * @return  Returns the numeroProtocollo.
	 * @uml.property  name="numeroProtocollo"
	 */
	public String getNumeroProtocollo() {
		return numeroProtocollo;
	}

	/**
	 * @param numeroProtocollo  The numeroProtocollo to set.
	 * @uml.property  name="numeroProtocollo"
	 */
	public void setNumeroProtocollo(String numeroProtocollo) {
		this.numeroProtocollo = numeroProtocollo;
	}

	/**
	 * @return  Returns the targa.
	 * @uml.property  name="targa"
	 */
	public String getTarga() {
		return targa;
	}

	/**
	 * @param targa  The targa to set.
	 * @uml.property  name="targa"
	 */
	public void setTarga(String targa) {
		this.targa = targa;
	}

	/**
	 * @return  Returns the tipoVeicolo.
	 * @uml.property  name="tipoVeicolo"
	 */
	public TipoVeicolo getTipoVeicolo() {
		return tipoVeicolo;
	}

	/**
	 * @param tipoVeicolo  The tipoVeicolo to set.
	 * @uml.property  name="tipoVeicolo"
	 */
	public void setTipoVeicolo(TipoVeicolo tipoVeicolo) {
		this.tipoVeicolo = tipoVeicolo;
	}

	public Integer getScadenza() {
		return scadenza;
	}

	public void setScadenza(Integer scadenza) {
		this.scadenza = scadenza;
	}

	public TipoStatoPagamentoAvviso getTipoStatoPagamentoAvviso() {
		return tipoStatoPagamentoAvviso;
	}

	public void setTipoStatoPagamentoAvviso(
			TipoStatoPagamentoAvviso tipoStatoPagamentoAvviso) {
		this.tipoStatoPagamentoAvviso = tipoStatoPagamentoAvviso;
	}

	public StatoAvvisoScadenza getStatoAvvisoScadenza() {
		return statoAvvisoScadenza;
	}

	public void setStatoAvvisoScadenza(StatoAvvisoScadenza statoAvvisoScadenza) {
		this.statoAvvisoScadenza = statoAvvisoScadenza;
	}
}
