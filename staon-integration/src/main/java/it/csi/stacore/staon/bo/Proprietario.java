package it.csi.stacore.staon.bo;

import java.util.Date;

import org.apache.commons.lang3.builder.HashCodeBuilder;

import it.csi.stacore.staon.bo.id.IdProprietario;
import it.csi.stacore.staon.bo.tavoletrasversali.Indirizzo;

/**
 * @author  70702
 */
public abstract class Proprietario extends AbstractBO implements java.io.Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1194162979317595289L;

	public static final String TIPO_PERSONA_FISICA = "FISICA";

	public static final String TIPO_PERSONA_GIURIDICA = "GIURIDICA";

	/**
	 * @uml.property  name="id"
	 * @uml.associationEnd
	 */
	protected IdProprietario id;

	/**
	 * @uml.property  name="gmsIdSoggetto"
	 * @uml.associationEnd
	 */
	protected GmsIdSoggetto gmsIdSoggetto;

	/**
	 * @uml.property  name="indirizzoResidenza"
	 * @uml.associationEnd
	 */
	protected Indirizzo indirizzoResidenza;

	/**
	 * @uml.property  name="identificativoFiscale"
	 */
	protected String identificativoFiscale;

	/**
	 * @uml.property  name="fonteRiferimento"
	 */
	protected FonteRiferimentoTAU fonteRiferimento;

	/**
	 * @uml.property  name="codiceFiscaleCertificato"
	 */
	protected Boolean codiceFiscaleCertificato;

	/**
	 * @uml.property  name="statoAnagrafico"
	 * @uml.associationEnd
	 */
	protected StatoAnagrafico statoAnagrafico;

	protected StatoSoggetto statoSoggetto;

	/**
	 * @uml.property  name="fonteProvenienza"
	 */
	protected FonteProvenienzaTAU fonteProvenienza;

	/**
	 * @uml.property  name="dataValidita"
	 */
	protected Date dataValidita;

	/**
	 * @uml.property  name="indirizzoSpedizione"
	 * @uml.associationEnd
	 */
	protected Indirizzo indirizzoSpedizione;

	protected Indirizzo indirizzoDomicilioFiscale;

	private boolean isAnagraficaModificabile;

	private boolean isAnagraficaModificata;

	protected Long idTipoSoggettoPassivo;


	/**
	 * @uml.property  name="nomeCognomeDenominazione"
	 */
	public abstract String getNomeCognomeDenominazione();

	public abstract boolean isPersonaFisica();

	public abstract Indirizzo getIndirizzoResidenzaFacade();

	public abstract Indirizzo getIndirizzoSpedizioneFacade();

	/**
	 * @return  Returns the id.
	 * @uml.property  name="id"
	 */
	public IdProprietario getId() {
		return id;
	}

	public Long getIdTipoSoggettoPassivo() {
		return idTipoSoggettoPassivo;
	}

	/**
	 * @return  Returns the gmsIdSoggetto.
	 * @uml.property  name="gmsIdSoggetto"
	 */
	public GmsIdSoggetto getGmsIdSoggetto() {
		return gmsIdSoggetto;
	}

	/**
	 * @return  Returns the identificativoFiscale.
	 * @uml.property  name="identificativoFiscale"
	 */
	public String getIdentificativoFiscale() {
		return identificativoFiscale;
	}

	/**
	 * @return  Returns the indirizzoResidenza.
	 * @uml.property  name="indirizzoResidenza"
	 */
	public Indirizzo getIndirizzoResidenza() {
		return indirizzoResidenza;
	}

	/**
	 * @return  Returns the fonteRiferimento.
	 * @uml.property  name="fonteRiferimento"
	 */
	public FonteRiferimentoTAU getFonteRiferimento() {
		return fonteRiferimento;
	}

	/**
	 * @return  Returns the codiceFiscaleCertificato.
	 * @uml.property  name="codiceFiscaleCertificato"
	 */
	public Boolean getCodiceFiscaleCertificato() {
		return codiceFiscaleCertificato;
	}

	/**
	 * @return  Returns the dataValidita.
	 * @uml.property  name="dataValidita"
	 */
	public Date getDataValidita() {
		return dataValidita;
	}

	/**
	 * @return  Returns the statoAnagrafico.
	 * @uml.property  name="statoAnagrafico"
	 */
	public StatoAnagrafico getStatoAnagrafico() {
		return statoAnagrafico;
	}

	public StatoSoggetto getStatoSoggetto() {
		return statoSoggetto;
	}

	/**
	 * @return  Returns the fonteProvenienza.
	 * @uml.property  name="fonteProvenienza"
	 */
	public FonteProvenienzaTAU getFonteProvenienza() {
		return fonteProvenienza;
	}

	/**
	 * @return  Returns the indirizzoSpedizione.
	 * @uml.property  name="indirizzoSpedizione"
	 */
	public Indirizzo getIndirizzoSpedizione() {
		return indirizzoSpedizione;
	}

	/**
	 * @param indirizzoSpedizione  The indirizzoSpedizione to set.
	 * @uml.property  name="indirizzoSpedizione"
	 */
	public void setIndirizzoSpedizione(Indirizzo indirizzoSpedizione) {
		this.indirizzoSpedizione = indirizzoSpedizione;
	}

	/**
	 * @param indirizzoResidenza  The indirizzoResidenza to set.
	 * @uml.property  name="indirizzoResidenza"
	 */
	public void setIndirizzoResidenza(Indirizzo indirizzoResidenza) {
		this.indirizzoResidenza = indirizzoResidenza;
	}

	public Indirizzo getIndirizzoDomicilioFiscale() {
		return indirizzoDomicilioFiscale;
	}

	public void setIndirizzoDomicilioFiscale(Indirizzo indirizzoDomicilioFiscale) {
		this.indirizzoDomicilioFiscale = indirizzoDomicilioFiscale;
	}

	public void setGmsIdSoggetto(GmsIdSoggetto gmsIdSoggetto) {
		this.gmsIdSoggetto = gmsIdSoggetto;
	}

	public void setId(IdProprietario id) {
		this.id = id;
	}

	public void setStatoSoggetto(StatoSoggetto statoSoggetto) {
		this.statoSoggetto = statoSoggetto;
	}

	public void setIdTipoSoggettoPassivo(Long idTsp){
		this.idTipoSoggettoPassivo=idTsp;
	}

	public boolean isCodiceFiscaleCertificato() {
		return codiceFiscaleCertificato != null && codiceFiscaleCertificato.booleanValue();
	}


	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	public boolean isInnestatoSuGms() {
		return gmsIdSoggetto != null;
	}

	public boolean isAnagraficaModificabile() {
		return isAnagraficaModificabile;
	}

	public void setAnagraficaModificabile(boolean isAnagraficaModificabile) {
		this.isAnagraficaModificabile = isAnagraficaModificabile;
	}

	public boolean isAnagraficaModificata() {
		return isAnagraficaModificata;
	}

	public void setAnagraficaModificata(boolean isAnagraficaModificata) {
		this.isAnagraficaModificata = isAnagraficaModificata;
	}


}