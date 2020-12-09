package it.csi.stacore.staon.bo.avvisi.segnalazione;

import it.csi.stacore.staon.bo.Decodifica;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.util.EqualsUtil;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class TipoAvvisoSegnalazione extends Decodifica {

	/**
	 *
	 */
	private static final long serialVersionUID = -4182841938774510677L;
	public static final int ID_AVVISO_SCADENZA = 1;

	//~ Constructors =============================================================

	/**
	 * Creates a new Stato object.
	 *
	 * @param id DOCUMENT ME!
	 * @param codice DOCUMENT ME!
	 * @param descrizione DOCUMENT ME!
	 */
	public TipoAvvisoSegnalazione(IdDecodifica id, String descrizione) {
		super(id, descrizione);
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

		if ((object != null) && object instanceof TipoAvvisoSegnalazione) {
			TipoAvvisoSegnalazione altro = (TipoAvvisoSegnalazione) object;
			equals = EqualsUtil.objectEquals(getId(), altro.getId());
		}

		return equals;
	}
}
