package it.csi.stacore.staon.bo;

import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.util.EqualsUtil;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class TipoIntermediario extends Decodifica implements java.io.Serializable {
	//~ Constructors =============================================================

	/**
	 *
	 */
	private static final long serialVersionUID = 8015280093175110761L;
	public static TipoIntermediario AGENZIE_POLO_CSI = new TipoIntermediario(new IdDecodifica(8), "C6", "Agenzie Polo CSI (Piemonte)");

	/**
	 * Creates a new TipoIntermediario object.
	 *
	 * @param idDecodifica DOCUMENT ME!
	 * @param codice DOCUMENT ME!
	 * @param descrizione DOCUMENT ME!
	 */
	public TipoIntermediario(IdDecodifica idDecodifica, String codice, String descrizione) {
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
	public boolean equals(Object object) {
		boolean equals = false;

		if ((object != null) && object instanceof TipoIntermediario) {
			TipoIntermediario altro = (TipoIntermediario) object;
			equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
		}

		return equals;
	}
}
