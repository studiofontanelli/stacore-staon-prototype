package it.csi.stacore.staon.bo.avvisi.scadenza;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import it.csi.stacore.staon.bo.id.avvisi.scadenza.IdAvvisoScadenzaPersona;
import it.csi.stacore.staon.util.EqualsUtil;

/**
 * DOCUMENT ME!
 *
 * @author mdferrua
 */
public class AvvisoScadenzaPersona implements Serializable {
	//~ Static fields/initializers
	// ===============================================

	static final long serialVersionUID = 889959897946401369L;

	//~ Instance fields
	// ==========================================================
	/**
	 * @uml.property  name="idAvvisoScadenzaPersona"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private IdAvvisoScadenzaPersona idAvvisoScadenzaPersona = null;

	/**
	 * @uml.property  name="avvisoScadenzaEnte"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private AvvisoScadenzaEnte avvisoScadenzaEnte = null;

	/**
	 * @uml.property  name="numeroProtocollo"
	 */
	private String numeroProtocollo = null;

	/**
	 * @uml.property  name="identificativoFiscale"
	 */
	private String identificativoFiscale = null;

	/**
	 * @uml.property  name="cognomeDenominazione"
	 */
	private String cognomeDenominazione = null;

	/**
	 * @uml.property  name="nome"
	 */
	private String nome = null;

	/**
	 * @uml.property  name="comuneNascita"
	 */
	private String comuneNascita = null;

	/**
	 * @uml.property  name="provinciaNascita"
	 */
	private String provinciaNascita = null;

	/**
	 * @uml.property  name="statoEsteroNascita"
	 */
	private String statoEsteroNascita = null;

	/**
	 * @uml.property  name="dataNascita"
	 */
	private Date dataNascita = null;

	/**
	 * @uml.property  name="sesso"
	 */
	private String sesso = null;

	/**
	 * @uml.property  name="indirizzoResidenza"
	 */
	private String indirizzoResidenza = null;

	/**
	 * @uml.property  name="capResidenza"
	 */
	private String capResidenza = null;

	/**
	 * @uml.property  name="comuneResidenza"
	 */
	private String comuneResidenza = null;

	/**
	 * @uml.property  name="provinciaResidenza"
	 */
	private String provinciaResidenza = null;

	/**
	 * @uml.property  name="scadenzePrecedenti"
	 */
	private Collection scadenzePrecedenti = null; //ScadenzePrecedenti

	//~ Constructors
	// =============================================================
	/**
	 * @param idAvvisoScadenzaPersona
	 * @param avvisoScadenzaEnte
	 * @param numeroProtocollo
	 * @param identificativoFiscale
	 * @param cognomeDenominazione
	 * @param nome
	 * @param comuneNascita
	 * @param provinciaNascita
	 * @param statoEsteroNascita
	 * @param dataNascita
	 * @param sesso
	 * @param indirizzoResidenza
	 * @param capResidenza
	 * @param comuneResidenza
	 * @param provinciaResidenza
	 * @param scadenzePrecedenti
	 */
	public AvvisoScadenzaPersona(
			IdAvvisoScadenzaPersona idAvvisoScadenzaPersona,
			AvvisoScadenzaEnte avvisoScadenzaEnte, String numeroProtocollo,
			String identificativoFiscale, String cognomeDenominazione,
			String nome, String comuneNascita, String provinciaNascita,
			String statoEsteroNascita, Date dataNascita, String sesso,
			String indirizzoResidenza, String capResidenza,
			String comuneResidenza, String provinciaResidenza,
			Collection scadenzePrecedenti) {
		this.idAvvisoScadenzaPersona = idAvvisoScadenzaPersona;
		this.avvisoScadenzaEnte = avvisoScadenzaEnte;
		this.numeroProtocollo = numeroProtocollo;
		this.identificativoFiscale = identificativoFiscale;
		this.cognomeDenominazione = cognomeDenominazione;
		this.nome = nome;
		this.comuneNascita = comuneNascita;
		this.provinciaNascita = provinciaNascita;
		this.statoEsteroNascita = statoEsteroNascita;
		this.dataNascita = dataNascita;
		this.sesso = sesso;
		this.indirizzoResidenza = indirizzoResidenza;
		this.capResidenza = capResidenza;
		this.comuneResidenza = comuneResidenza;
		this.provinciaResidenza = provinciaResidenza;
		this.scadenzePrecedenti = scadenzePrecedenti;
	}

	//~ Methods
	// ==================================================================
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

		if ((object != null) && object instanceof AvvisoScadenzaPersona) {
			AvvisoScadenzaPersona altro = (AvvisoScadenzaPersona) object;
			equals = EqualsUtil.objectEquals(getIdAvvisoScadenzaPersona(),altro.getIdAvvisoScadenzaPersona()) &&
			EqualsUtil.objectEquals(getAvvisoScadenzaEnte(),altro.getAvvisoScadenzaEnte()) &&
			EqualsUtil.objectEquals(getCapResidenza(),altro.getCapResidenza()) &&
			EqualsUtil.objectEquals(getCognomeDenominazione(),altro.getCognomeDenominazione()) &&
			EqualsUtil.objectEquals(getComuneNascita(),altro.getComuneNascita()) &&
			EqualsUtil.objectEquals(getComuneResidenza(),altro.getComuneResidenza()) &&
			EqualsUtil.objectEquals(getDataNascita(),altro.getDataNascita()) &&
			EqualsUtil.objectEquals(getIdentificativoFiscale(),altro.getIdentificativoFiscale()) &&
			EqualsUtil.objectEquals(getIndirizzoResidenza(),altro.getIndirizzoResidenza()) &&
			EqualsUtil.objectEquals(getNome(),altro.getNome()) &&
			EqualsUtil.objectEquals(getNumeroProtocollo(),altro.getNumeroProtocollo()) &&
			EqualsUtil.objectEquals(getProvinciaNascita(),altro.getProvinciaNascita()) &&
			EqualsUtil.objectEquals(getProvinciaResidenza(),altro.getProvinciaResidenza()) &&
			EqualsUtil.objectEquals(getScadenzePrecedenti(),altro.getScadenzePrecedenti()) &&
			EqualsUtil.objectEquals(getSesso(),altro.getSesso()) &&
			EqualsUtil.objectEquals(getStatoEsteroNascita(),altro.getStatoEsteroNascita());
		}

		return equals;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	/**
	 * @return  Returns the idAvvisoScadenzaPersona.
	 * @uml.property  name="idAvvisoScadenzaPersona"
	 */
	public IdAvvisoScadenzaPersona getIdAvvisoScadenzaPersona() {
		return idAvvisoScadenzaPersona;
	}

	/**
	 * @param idAvvisoScadenzaPersona  The idAvvisoScadenzaPersona to set.
	 * @uml.property  name="idAvvisoScadenzaPersona"
	 */
	public void setIdAvvisoScadenzaPersona(
			IdAvvisoScadenzaPersona idAvvisoScadenzaPersona) {
		this.idAvvisoScadenzaPersona = idAvvisoScadenzaPersona;
	}

	/**
	 * @return  Returns the avvisoScadenzaEnte.
	 * @uml.property  name="avvisoScadenzaEnte"
	 */
	public AvvisoScadenzaEnte getAvvisoScadenzaEnte() {
		return avvisoScadenzaEnte;
	}

	/**
	 * @param avvisoScadenzaEnte  The avvisoScadenzaEnte to set.
	 * @uml.property  name="avvisoScadenzaEnte"
	 */
	public void setAvvisoScadenzaEnte(AvvisoScadenzaEnte avvisoScadenzaEnte) {
		this.avvisoScadenzaEnte = avvisoScadenzaEnte;
	}

	/**
	 * @return  Returns the capResidenza.
	 * @uml.property  name="capResidenza"
	 */
	public String getCapResidenza() {
		return capResidenza;
	}

	/**
	 * @param capResidenza  The capResidenza to set.
	 * @uml.property  name="capResidenza"
	 */
	public void setCapResidenza(String capResidenza) {
		this.capResidenza = capResidenza;
	}

	/**
	 * @return  Returns the cognomeDenominazione.
	 * @uml.property  name="cognomeDenominazione"
	 */
	public String getCognomeDenominazione() {
		return cognomeDenominazione;
	}

	/**
	 * @param cognomeDenominazione  The cognomeDenominazione to set.
	 * @uml.property  name="cognomeDenominazione"
	 */
	public void setCognomeDenominazione(String cognomeDenominazione) {
		this.cognomeDenominazione = cognomeDenominazione;
	}

	/**
	 * @return  Returns the comuneNascita.
	 * @uml.property  name="comuneNascita"
	 */
	public String getComuneNascita() {
		return comuneNascita;
	}

	/**
	 * @param comuneNascita  The comuneNascita to set.
	 * @uml.property  name="comuneNascita"
	 */
	public void setComuneNascita(String comuneNascita) {
		this.comuneNascita = comuneNascita;
	}

	/**
	 * @return  Returns the comuneResidenza.
	 * @uml.property  name="comuneResidenza"
	 */
	public String getComuneResidenza() {
		return comuneResidenza;
	}

	/**
	 * @param comuneResidenza  The comuneResidenza to set.
	 * @uml.property  name="comuneResidenza"
	 */
	public void setComuneResidenza(String comuneResidenza) {
		this.comuneResidenza = comuneResidenza;
	}

	/**
	 * @return  Returns the dataNascita.
	 * @uml.property  name="dataNascita"
	 */
	public Date getDataNascita() {
		return dataNascita;
	}

	/**
	 * @param dataNascita  The dataNascita to set.
	 * @uml.property  name="dataNascita"
	 */
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
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
	 * @return  Returns the indirizzoResidenza.
	 * @uml.property  name="indirizzoResidenza"
	 */
	public String getIndirizzoResidenza() {
		return indirizzoResidenza;
	}

	/**
	 * @param indirizzoResidenza  The indirizzoResidenza to set.
	 * @uml.property  name="indirizzoResidenza"
	 */
	public void setIndirizzoResidenza(String indirizzoResidenza) {
		this.indirizzoResidenza = indirizzoResidenza;
	}

	/**
	 * @return  Returns the nome.
	 * @uml.property  name="nome"
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome  The nome to set.
	 * @uml.property  name="nome"
	 */
	public void setNome(String nome) {
		this.nome = nome;
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
	 * @return  Returns the provinciaNascita.
	 * @uml.property  name="provinciaNascita"
	 */
	public String getProvinciaNascita() {
		return provinciaNascita;
	}

	/**
	 * @param provinciaNascita  The provinciaNascita to set.
	 * @uml.property  name="provinciaNascita"
	 */
	public void setProvinciaNascita(String provinciaNascita) {
		this.provinciaNascita = provinciaNascita;
	}

	/**
	 * @return  Returns the provinciaResidenza.
	 * @uml.property  name="provinciaResidenza"
	 */
	public String getProvinciaResidenza() {
		return provinciaResidenza;
	}

	/**
	 * @param provinciaResidenza  The provinciaResidenza to set.
	 * @uml.property  name="provinciaResidenza"
	 */
	public void setProvinciaResidenza(String provinciaResidenza) {
		this.provinciaResidenza = provinciaResidenza;
	}

	/**
	 * @return  Returns the scadenzePrecedenti.
	 * @uml.property  name="scadenzePrecedenti"
	 */
	public Collection getScadenzePrecedenti() {
		return scadenzePrecedenti;
	}

	/**
	 * @param scadenzePrecedenti  The scadenzePrecedenti to set.
	 * @uml.property  name="scadenzePrecedenti"
	 */
	public void setScadenzePrecedenti(Collection scadenzePrecedenti) {
		this.scadenzePrecedenti = scadenzePrecedenti;
	}

	/**
	 * @return  Returns the sesso.
	 * @uml.property  name="sesso"
	 */
	public String getSesso() {
		return sesso;
	}

	/**
	 * @param sesso  The sesso to set.
	 * @uml.property  name="sesso"
	 */
	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	/**
	 * @return  Returns the statoEsteroNascita.
	 * @uml.property  name="statoEsteroNascita"
	 */
	public String getStatoEsteroNascita() {
		return statoEsteroNascita;
	}

	/**
	 * @param statoEsteroNascita  The statoEsteroNascita to set.
	 * @uml.property  name="statoEsteroNascita"
	 */
	public void setStatoEsteroNascita(String statoEsteroNascita) {
		this.statoEsteroNascita = statoEsteroNascita;
	}
}
