package it.csi.stacore.staon.bo;

import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.util.EqualsUtil;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class TipoContributo extends Decodifica implements java.io.Serializable {

	private static final long serialVersionUID = -2489352664267694342L;

	public static final String TASSA_NON_DOVUTA = "1";

	public static final String INTERESSI_SANZIONI_NON_DOVUTA = "2";

	public static final String CONTRIBUTO_SU_IMPORTO_POSITIVO = "3";

	public static final String CONTRIBUTO_SU_IMPORTO_NEGATIVO = "4";

	public static final String SANZIONI_NON_DOVUTA = "5";

	//~ Constructors =============================================================

	/**
	 * Creates a new TipoContributo object.
	 *
	 * @param idDecodifica DOCUMENT ME!
	 * @param codice DOCUMENT ME!
	 * @param descrizione DOCUMENT ME!
	 */
	public TipoContributo(IdDecodifica idDecodifica, String codice, String descrizione) {
		super(idDecodifica, codice, descrizione);
	}

	//~ Methods ==================================================================

	/**
	 * DOCUMENT ME!
	 *
	 * @param object DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public boolean isTassaNonDovuta() {
		boolean result = false;
		if (getCodice().equals(TASSA_NON_DOVUTA)) {
			result = true;
		}
		return result;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param object DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public boolean isInteressiSanzioniNonDovuta() {
		boolean result = false;
		if (getCodice().equals(INTERESSI_SANZIONI_NON_DOVUTA)) {
			result = true;
		}
		return result;
	}


	// 2007-10-25 L.S. STACORE-61
	/**
	 * DOCUMENT ME!
	 *
	 * @param object DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public boolean isSanzioniNonDovuta() {
		boolean result = false;
		if (getCodice().equals(SANZIONI_NON_DOVUTA)) {
			result = true;
		}
		return result;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param object DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public boolean isContributoSuImportoPositivo() {
		boolean result = false;
		if (getCodice().equals(CONTRIBUTO_SU_IMPORTO_POSITIVO)) {
			result = true;
		}
		return result;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param object DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public boolean isContributoSuImportoNegativo() {
		boolean result = false;
		if (getCodice().equals(CONTRIBUTO_SU_IMPORTO_NEGATIVO)) {
			result = true;
		}
		return result;
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

		if ((object != null) && object instanceof TipoContributo) {
			TipoContributo altro = (TipoContributo) object;
			equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
		}

		return equals;
	}
}
