package it.csi.stacore.staon.bo;

import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.util.EqualsUtil;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class TipoLettera extends Decodifica {
	// ~ Constructors
	// =============================================================

	/**
	 *
	 */
	private static final long serialVersionUID = 6098836102065622861L;
	public static final long ID_LETTERA_AVVISO_SCADENZA = 1;
	public static final long ID_LETTERA_ACCERTAMENTO = 2;
	public static final long ID_LETTERA_INVITO_PAGAMENTO = 3;
	public static final long ID_LETTERA_NULLA_DOVUTO = 4;
	public static final String CODICE_LETTERA_NULLA_DOVUTO = "LETTERANUL";
	public static final String CODICE_LETTERA_INVITO_PAGAMENTO = "INVITOPAG";
	public static final String CODICE_LETTERA_ACCERTAMENTO = "ACCERT";
	public static final String CODICE_LETTERA_AVVISO_SCADENZA = "AVVISOSCAD";

	/**
	 * DOCUMENT ME!
	 *
	 * @param id
	 * @param codice
	 * @param descrizione
	 */
	public TipoLettera(IdDecodifica id, String codice, String descrizione) {
		super(id, codice, descrizione);
	}

	// ~ Methods
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

		if ((object != null) && object instanceof TipoLettera) {
			TipoLettera altro = (TipoLettera) object;
			equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
		}

		return equals;
	}
}
