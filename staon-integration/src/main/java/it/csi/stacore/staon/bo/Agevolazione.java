package it.csi.stacore.staon.bo;

import java.util.Date;

import it.csi.stacore.staon.bo.id.IdAgevolazione;
import it.csi.stacore.staon.bo.id.IdDatiTecnici;
import it.csi.stacore.staon.bo.id.IdVeicolo;
import it.csi.stacore.staon.util.EqualsUtil;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class Agevolazione extends AbstractBO implements java.io.Serializable {

	// ~ Static fields/initializers
	// ===============================================

	/**
	 * DOCUMENT ME!
	 */
	static final long serialVersionUID = -1735101642400890571L; // Id
	private static final String INVALID_NUM_PROTOCOLLO_APERTURA = "numero_protocollo_apertura_incorretto";
	private static final String INVALID_NUM_PROTOCOLLO_CHIUSURA = "numero_protocollo_chiusura_incorretto";
	private static final String INVALID_TARGA = "targa_incorretta";
	private static final String INVALID_IDENTIFICATIVO_FISCALE_PROPRIETARIO = "codice_fiscale_incorretto";
	private static final String INVALID_TIPO_AGEVOLAZIONE = "tipo_agevolazione_incorretto";
	private static final String INVALID_NUMERO_PATENTE = "numero_patente_incorretto";

	/**
	 * DOCUMENT ME!
	 */
	public static final int NUM_PROTOCOLLO_APERTURA_LENGTH = 30;

	/**
	 * DOCUMENT ME!
	 */
	public static final int NUM_PROTOCOLLO_CHIUSURA_LENGTH = 30;

	/**
	 * DOCUMENT ME!
	 */
	public static final int TARGA_LENGTH = 18;

	/**
	 * DOCUMENT ME!
	 */
	public static final int IDENTIFICATIVO_FISCALE_PROPRIETARIO_LENGTH = 16;

	/**
	 * DOCUMENT ME!
	 */
	public static final int TIPO_AGEVOLAZIONE_LENGTH = 2;

	public static final int NUMERO_PATENTE_SPECIALE_LENGTH = 10;

	// ~ Instance fields
	// ==========================================================

	/**
	 * @uml.property name="id"
	 * @uml.associationEnd multiplicity="(1 1)"
	 */
	private final IdAgevolazione id;
	/**
	 * @uml.property name="idVeicolo"
	 * @uml.associationEnd multiplicity="(1 1)"
	 */
	private IdVeicolo idVeicolo = null;
	/**
	 * @uml.property name="tipoVeicolo"
	 * @uml.associationEnd multiplicity="(1 1)"
	 */
	private TipoVeicolo tipoVeicolo;
	/**
	 * @uml.property name="fonte"
	 * @uml.associationEnd multiplicity="(1 1)"
	 */
	private Fonte fonte = null;
	/**
	 * @uml.property name="tipoAgevolazione"
	 * @uml.associationEnd multiplicity="(1 1)"
	 */
	private TipoAgevolazione tipoAgevolazione;
	/**
	 * @uml.property name="dataInizio"
	 */
	private Date dataInizio;
	/**
	 * @uml.property name="numProtocolloApertura"
	 */
	private String numProtocolloApertura;
	/**
	 * @uml.property name="dataFine"
	 */
	private Date dataFine;
	/**
	 * @uml.property name="numProtocolloChiusura"
	 */
	private String numProtocolloChiusura;

	// Riferimento a Veicolo
	/**
	 * @uml.property name="tipoVeicoloOriginale"
	 */
	private final String tipoVeicoloOriginale;
	/**
	 * @uml.property name="targaOriginale"
	 */
	private final String targaOriginale;

	// Riferimento a Proprietario
	/**
	 * @uml.property name="identificativoFiscaleProprietarioOriginale"
	 */
	private final String identificativoFiscaleProprietarioOriginale;
	/**
	 * @uml.property name="tipoAgevolazioneOriginale"
	 */
	private final String tipoAgevolazioneOriginale;

	/**
	 * @uml.property name="dataAcquisizione"
	 */
	private final Date dataAcquisizione;

	private final String numeroPatente;

	private final Date dataScadenzaPatente;

	private boolean flagRicercaAg;

	private IdDatiTecnici idDatiTecnici;

	private Long idOperazioneLogica;

	private Long idOperazione;

	//Euro6 proroga scadenza
	private String prorogaEuro6;

	public String getProrogaEuro6() {
		return prorogaEuro6;
	}

	public void setProrogaEuro6(String prorogaEuro6) {
		this.prorogaEuro6 = prorogaEuro6;
	}
	//Marts fine



	// ~ Constructors
	// =============================================================


	/**
	 * Creates a new Agevolazione object.
	 *
	 * @param id
	 *            DOCUMENT ME!
	 * @param idVeicolo
	 *            DOCUMENT ME!
	 * @param tipoVeicolo
	 *            DOCUMENT ME!
	 * @param fonte
	 *            DOCUMENT ME!
	 * @param tipoAgevolazione
	 *            DOCUMENT ME!
	 * @param dataInizio
	 *            DOCUMENT ME!
	 * @param numProtocolloApertura
	 *            DOCUMENT ME!
	 * @param dataFine
	 *            DOCUMENT ME!
	 * @param numProtocolloChiusura
	 *            DOCUMENT ME!
	 * @param tipoVeicoloOriginale
	 *            DOCUMENT ME!
	 * @param targaOriginale
	 *            DOCUMENT ME!
	 * @param identificativoFiscaleProprietarioOriginale
	 *            DOCUMENT ME!
	 * @param tipoAgevolazioneOriginale
	 *            DOCUMENT ME!
	 * @param dataAcquisizione
	 */
	public Agevolazione(final IdAgevolazione id, final IdVeicolo idVeicolo,
			final TipoVeicolo tipoVeicolo, final Fonte fonte,
			final TipoAgevolazione tipoAgevolazione, final Date dataInizio,
			final String numProtocolloApertura, final Date dataFine,
			final String numProtocolloChiusura,
			final String tipoVeicoloOriginale, final String targaOriginale,
			final String identificativoFiscaleProprietarioOriginale,
			final String tipoAgevolazioneOriginale,
			final Date dataAcquisizione, final String numeroPatente,
			final Date dataScadenzaPatente,
			//Euro6 proroga scadenza
			final String prorogaEuro6) {
		this.id = id;
		this.idVeicolo = idVeicolo;
		this.tipoVeicolo = tipoVeicolo;
		this.fonte = fonte;
		this.tipoAgevolazione = tipoAgevolazione;
		this.dataInizio = dataInizio;
		this.dataAcquisizione = dataAcquisizione;
		this.numProtocolloApertura = verifyLength(numProtocolloApertura,
				NUM_PROTOCOLLO_APERTURA_LENGTH, INVALID_NUM_PROTOCOLLO_APERTURA);
		this.dataFine = dataFine;
		this.numProtocolloChiusura = verifyLength(numProtocolloChiusura,
				NUM_PROTOCOLLO_CHIUSURA_LENGTH, INVALID_NUM_PROTOCOLLO_CHIUSURA);
		this.tipoVeicoloOriginale = tipoVeicoloOriginale;
		this.targaOriginale = verifyLength(targaOriginale, TARGA_LENGTH,
				INVALID_TARGA);
		this.identificativoFiscaleProprietarioOriginale = verifyLength(
				identificativoFiscaleProprietarioOriginale,
				IDENTIFICATIVO_FISCALE_PROPRIETARIO_LENGTH,
				INVALID_IDENTIFICATIVO_FISCALE_PROPRIETARIO);
		this.tipoAgevolazioneOriginale = verifyLength(
				tipoAgevolazioneOriginale, TIPO_AGEVOLAZIONE_LENGTH,
				INVALID_TIPO_AGEVOLAZIONE);
		this.numeroPatente = verifyLength(
				numeroPatente, NUMERO_PATENTE_SPECIALE_LENGTH,
				INVALID_NUMERO_PATENTE);
		this.dataScadenzaPatente = dataScadenzaPatente;
		this.flagRicercaAg = false;
		//Euro6 proroga scadenza
		this.prorogaEuro6 = prorogaEuro6;
	}

	// ~ Methods
	// ==================================================================

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 * @uml.property name="dataFine"
	 */
	public Date getDataFine() {
		return dataFine;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 * @uml.property name="dataInizio"
	 */
	public Date getDataInizio() {
		return dataInizio;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 * @uml.property name="fonte"
	 */
	public Fonte getFonte() {
		return fonte;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 * @uml.property name="id"
	 */
	public IdAgevolazione getId() {
		return id;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 * @uml.property name="idVeicolo"
	 */
	public IdVeicolo getIdVeicolo() {
		return idVeicolo;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 * @uml.property name="tipoVeicolo"
	 */
	public TipoVeicolo getTipoVeicolo() {
		return tipoVeicolo;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 * @uml.property name="numProtocolloApertura"
	 */
	public String getNumProtocolloApertura() {
		return numProtocolloApertura;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 * @uml.property name="numProtocolloChiusura"
	 */
	public String getNumProtocolloChiusura() {
		return numProtocolloChiusura;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 * @uml.property name="tipoAgevolazione"
	 */
	public TipoAgevolazione getTipoAgevolazione() {
		return tipoAgevolazione;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 * @uml.property name="identificativoFiscaleProprietarioOriginale"
	 */
	public String getIdentificativoFiscaleProprietarioOriginale() {
		return identificativoFiscaleProprietarioOriginale;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 * @uml.property name="tipoVeicoloOriginale"
	 */
	public String getTipoVeicoloOriginale() {
		return tipoVeicoloOriginale;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 * @uml.property name="targaOriginale"
	 */
	public String getTargaOriginale() {
		return targaOriginale;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 * @uml.property name="tipoAgevolazioneOriginale"
	 */
	public String getTipoAgevolazioneOriginale() {
		return tipoAgevolazioneOriginale;
	}

	/**
	 * @return Returns the dataAcquisizione.
	 * @uml.property name="dataAcquisizione"
	 */
	public Date getDataAcquisizione() {
		return dataAcquisizione;
	}

	public String getNumeroPatente() {
		return numeroPatente;
	}

	public Date getDataScadenzaPatente() {
		return dataScadenzaPatente;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((dataAcquisizione == null) ? 0 : dataAcquisizione.hashCode());
		result = prime * result
				+ ((dataFine == null) ? 0 : dataFine.hashCode());
		result = prime * result
				+ ((dataInizio == null) ? 0 : dataInizio.hashCode());
		result = prime
				* result
				+ ((dataScadenzaPatente == null) ? 0 : dataScadenzaPatente
						.hashCode());
		result = prime * result + ((fonte == null) ? 0 : fonte.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((idVeicolo == null) ? 0 : idVeicolo.hashCode());
		result = prime
				* result
				+ ((identificativoFiscaleProprietarioOriginale == null) ? 0
						: identificativoFiscaleProprietarioOriginale.hashCode());
		result = prime
				* result
				+ ((numProtocolloApertura == null) ? 0 : numProtocolloApertura
						.hashCode());
		result = prime
				* result
				+ ((numProtocolloChiusura == null) ? 0 : numProtocolloChiusura
						.hashCode());
		result = prime * result
				+ ((numeroPatente == null) ? 0 : numeroPatente.hashCode());
		result = prime * result
				+ ((targaOriginale == null) ? 0 : targaOriginale.hashCode());
		result = prime
				* result
				+ ((tipoAgevolazione == null) ? 0 : tipoAgevolazione.hashCode());
		result = prime
				* result
				+ ((tipoAgevolazioneOriginale == null) ? 0
						: tipoAgevolazioneOriginale.hashCode());
		result = prime * result
				+ ((tipoVeicolo == null) ? 0 : tipoVeicolo.hashCode());
		result = prime
				* result
				+ ((tipoVeicoloOriginale == null) ? 0 : tipoVeicoloOriginale
						.hashCode());
		return result;
	}

	public boolean equals(Object object) {
		boolean equals = false;

		if ((object != null) && object instanceof Agevolazione) {
			Agevolazione altro = (Agevolazione) object;
			equals = EqualsUtil.objectEquals(getId(), altro.getId()) // IdAgevolazione
					&& EqualsUtil.objectEquals(getIdVeicolo(), altro
							.getIdVeicolo())
					&& EqualsUtil.objectEquals(getTipoVeicolo(), altro
							.getTipoVeicolo())
					&& EqualsUtil.objectEquals(getFonte(), altro.getFonte())
					&& EqualsUtil.objectEquals(getTipoAgevolazione(), altro
							.getTipoAgevolazione())
					&& EqualsUtil.objectEquals(getDataInizio(), altro
							.getDataInizio())
					&& EqualsUtil.objectEquals(getNumProtocolloApertura(),
							altro.getNumProtocolloApertura())
					&& EqualsUtil.objectEquals(getDataFine(), altro
							.getDataFine())
					&& EqualsUtil.objectEquals(getNumProtocolloChiusura(),
							altro.getNumProtocolloChiusura())
					&& EqualsUtil.objectEquals(getTipoVeicoloOriginale(), altro
							.getTipoVeicoloOriginale())
					&& EqualsUtil.objectEquals(getTargaOriginale(), altro
							.getTargaOriginale())
					&& EqualsUtil.objectEquals(
							getIdentificativoFiscaleProprietarioOriginale(),
							altro.getIdentificativoFiscaleProprietarioOriginale())
					&& EqualsUtil.objectEquals(getTipoAgevolazioneOriginale(),
							altro.getTipoAgevolazioneOriginale())
					&& EqualsUtil.objectEquals(getDataAcquisizione(), altro
							.getDataAcquisizione())
					&& EqualsUtil.objectEquals(getNumeroPatente(), altro
							.getNumeroPatente())
					&& EqualsUtil.objectEquals(getDataScadenzaPatente(), altro
							.getDataScadenzaPatente());
		}

		return equals;
	}

	public boolean isFlagRicercaAg() {
		return flagRicercaAg;
	}

	public void setFlagRicercaAg(boolean flagRicercaAg) {
		this.flagRicercaAg = flagRicercaAg;
	}

	public IdDatiTecnici getIdDatiTecnici() {
		return idDatiTecnici;
	}

	public void setIdDatiTecnici(IdDatiTecnici idDatiTecnici) {
		this.idDatiTecnici = idDatiTecnici;
	}

	public Long getIdOperazioneLogica() {
		return idOperazioneLogica;
	}

	public void setIdOperazioneLogica(Long idOperazioneLogica) {
		this.idOperazioneLogica = idOperazioneLogica;
	}

	public Long getIdOperazione() {
		return idOperazione;
	}

	public void setIdOperazione(Long idOperazione) {
		this.idOperazione = idOperazione;
	}

}
