package it.csi.stacore.staon.bo;

import java.util.Date;

import it.csi.stacore.staon.bo.id.IdContributo;
import it.csi.stacore.staon.bo.id.IdVeicolo;
import it.csi.stacore.staon.util.EqualsUtil;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class Contributo extends AbstractScadenza implements java.io.Serializable {
	//~ Static fields/initializers ===============================================

	public static final String MOTIVAZIONE_RIMBORSO = "CONTRIBUTO PER RIMBORSO";

	public static final String MOTIVAZIONE_STORNO_RIMBORSO = "CONTRIBUTO PER STORNO RIMBORSO";

	public static final String MOTIVAZIONE_CREAZIONE_CREDITO = "CONTRIBUTO PER CREAZIONE CREDITO";

	public static final String MOTIVAZIONE_EROGAZIONE_CREDITO = "CONTRIBUTO PER EROGAZIONE CREDITO";

	public static final String MOTIVAZIONE_STORNO_CREDITO = "CONTRIBUTO PER STORNO CREDITO";

	public static final String MOTIVAZIONE_STORNO_PER_CHIUSURA_CREDITO = "CONTRIBUTO PER CHIUSURA CREDITO";

	public static final String MOTIVAZIONE_EROGAZIONE_BONUS = "CONTRIBUTO PER EROGAZIONE BONUS";

	public static final String MOTIVAZIONE_EROGAZIONE_CREDITO_POSITIVO_CALCOLO_COMPENSATO = "CONTRIBUTO POSITIVO PER EROGAZIONE CREDITO CALCOLO COMPENSATO";

	public static final String MOTIVAZIONE_EROGAZIONE_CREDITO_NEGATIVO_CALCOLO_COMPENSATO = "CONTRIBUTO NEGATIVO PER EROGAZIONE CREDITO CALCOLO COMPENSATO";

	public static final String MOTIVAZIONE_EROGAZIONE_CREDITO_SANZIONI_INTERESSI_NON_DOVUTE = "CONTRIBUTO POSITIVO PER SANZIONI ED INTERESSI NON DOVUTE";

	public static final String MOTIVAZIONE_EROGAZIONE_CREDITO_SANZIONI_NON_DOVUTE = "CONTRIBUTO POSITIVO PER SANZIONI NON DOVUTE";

	public static final String CODICE_CONTRIBUTO_TASSA_NON_DOVUTA = "1";

	public static final String CODICE_CONTRIBUTO_SANZIONI_ED_INTERESSI_NON_DOVUTI = "2";

	public static final String CODICE_CONTRIBUTO_SU_IMPORTO_POSITIVO = "3";

	public static final String CODICE_CONTRIBUTO_SU_IMPORTO_NEGATIVO = "4";

	public static final String CODICE_CONTRIBUTO_SANZIONI__NON_DOVUTE = "5";

	/**
	 * DOCUMENT ME!
	 */
	static final long serialVersionUID = -2139551184336486668L;

	private static final String INVALID_DIVISA_ORIGINALE = "divisa_originale_incorretta";

	private static final String INVALID_MOTIVAZIONE = "motivazione_incorretta";

	private static final String INVALID_NOTE = "note_incorretta";

	/**
	 * DOCUMENT ME!
	 */
	public static final int TARGA_LENGTH = 8;

	/**
	 * DOCUMENT ME!
	 */
	public static final int DIVISA_ORIGINALE_LENGTH = 5;

	/**
	 * DOCUMENT ME!
	 */
	public static final int MOTIVAZIONE_LENGTH = 250;

	/**
	 * DOCUMENT ME!
	 */
	public static final int NOTE_LENGTH = 250;

	//~ Instance fields ==========================================================

	/**
	 * @uml.property  name="id"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private IdContributo id;

	/**
	 * @uml.property  name="idVeicolo"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private IdVeicolo idVeicolo;

	/**
	 * @uml.property  name="tipoContributo"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private TipoContributo tipoContributo;

	/**
	 * @uml.property  name="importo"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Valuta importo;

	/**
	 * @uml.property  name="motivazione"
	 */
	private String motivazione;

	/**
	 * @uml.property  name="note"
	 */
	private String note;

	/**
	 * @uml.property  name="dataConcessione"
	 */
	private Date dataConcessione;

	private Date dataCancellazione;

	// riferimento ai dati originali
	//FIXME 8/3/05 RR sar� necessario???
	/**
	 * @uml.property  name="divisaOriginale"
	 */
	private String divisaOriginale;

	//~ Constructors =============================================================

	/**
	 * Creates a new Contributo object.
	 *
	 * @param id DOCUMENT ME!
	 * @param idVeicolo DOCUMENT ME!
	 * @param tipoContributo DOCUMENT ME!
	 * @param tipoVeicolo DOCUMENT ME!
	 * @param targa DOCUMENT ME!
	 * @param scadenza DOCUMENT ME!
	 * @param validita DOCUMENT ME!
	 * @param importo DOCUMENT ME!
	 * @param divisaOriginale DOCUMENT ME!
	 * @param motivazione DOCUMENT ME!
	 * @param note DOCUMENT ME!
	 * @param dataConcessione DOCUMENT ME!
	 */
	public Contributo(IdContributo id, IdVeicolo idVeicolo, TipoContributo tipoContributo, TipoVeicolo tipoVeicolo, String targa,
			Integer scadenza, Integer validita, Valuta importo, String divisaOriginale, String motivazione, String note, Date dataConcessione) {
		super(targa, tipoVeicolo, scadenza, validita);
		this.id = id;
		this.idVeicolo = idVeicolo;
		this.tipoContributo = tipoContributo;
		this.importo = importo;
		this.divisaOriginale = verifyLength(divisaOriginale, DIVISA_ORIGINALE_LENGTH, INVALID_DIVISA_ORIGINALE);
		this.motivazione = verifyLength(motivazione, MOTIVAZIONE_LENGTH, INVALID_MOTIVAZIONE);
		this.note = verifyLength(note, NOTE_LENGTH, INVALID_NOTE);
		this.dataConcessione = dataConcessione;
	}

	//~ Methods ==================================================================

	/**
	 * DOCUMENT ME!
	 * @return  DOCUMENT ME!
	 * @uml.property  name="id"
	 */
	public IdContributo getId() {
		return id;
	}

	/**
	 * DOCUMENT ME!
	 * @return  DOCUMENT ME!
	 * @uml.property  name="tipoContributo"
	 */
	public TipoContributo getTipoContributo() {
		return tipoContributo;
	}

	/**
	 * DOCUMENT ME!
	 * @return  DOCUMENT ME!
	 * @uml.property  name="importo"
	 */
	public Valuta getImporto() {
		return importo;
	}

	/**
	 * DOCUMENT ME!
	 * @return  DOCUMENT ME!
	 * @uml.property  name="divisaOriginale"
	 */
	public String getDivisaOriginale() {
		return divisaOriginale;
	}

	/**
	 * DOCUMENT ME!
	 * @return  DOCUMENT ME!
	 * @uml.property  name="motivazione"
	 */
	public String getMotivazione() {
		return motivazione;
	}

	/**
	 * DOCUMENT ME!
	 * @return  DOCUMENT ME!
	 * @uml.property  name="note"
	 */
	public String getNote() {
		return note;
	}

	/**
	 * DOCUMENT ME!
	 * @return  DOCUMENT ME!
	 * @uml.property  name="dataConcessione"
	 */
	public Date getDataConcessione() {
		return dataConcessione;
	}

	/**
	 * DOCUMENT ME!
	 * @return  DOCUMENT ME!
	 * @uml.property  name="idVeicolo"
	 */
	public IdVeicolo getIdVeicolo() {
		return idVeicolo;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param object DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public boolean equals(Object object) {
		boolean equals = false;

		if ((object != null) && object instanceof Contributo) {
			Contributo altro = (Contributo) object;
			equals = EqualsUtil.objectEquals(getId(), altro.getId()) && EqualsUtil.objectEquals(getIdVeicolo(), altro.getIdVeicolo())
					&& EqualsUtil.objectEquals(getTipoContributo(), altro.getTipoContributo())
					&& EqualsUtil.objectEquals(getTipoVeicolo(), altro.getTipoVeicolo()) && EqualsUtil.objectEquals(getTarga(), altro.getTarga())
					&& EqualsUtil.objectEquals(getScadenza(), altro.getScadenza()) && EqualsUtil.objectEquals(getValidita(), altro.getValidita())
					&& EqualsUtil.objectEquals(getImporto(), altro.getImporto())
					&& EqualsUtil.objectEquals(getDivisaOriginale(), altro.getDivisaOriginale())
					&& EqualsUtil.objectEquals(getMotivazione(), altro.getMotivazione()) && EqualsUtil.objectEquals(getNote(), altro.getNote())
					&& EqualsUtil.objectEquals(getDataConcessione(), altro.getDataConcessione());
		}

		return equals;
	}

	public Date getDataCancellazione() {
		return dataCancellazione;
	}

	public void setDataCancellazione(Date dataCancellazione) {
		this.dataCancellazione = dataCancellazione;
	}
}
