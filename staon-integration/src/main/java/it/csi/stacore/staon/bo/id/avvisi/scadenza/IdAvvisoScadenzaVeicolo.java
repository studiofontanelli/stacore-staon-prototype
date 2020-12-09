package it.csi.stacore.staon.bo.id.avvisi.scadenza;

import it.csi.stacore.staon.bo.id.LongId;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class IdAvvisoScadenzaVeicolo extends LongId implements java.io.Serializable {
	//~ Constructors =============================================================

	/**
	 *
	 */
	private static final long serialVersionUID = -3198458298852731968L;

	public IdAvvisoScadenzaVeicolo(long id) {
		super(id);
	}

	//~ Methods ==================================================================

	public boolean equals(Object object) {
		boolean equals = false;

		if ((object != null) && object instanceof IdAvvisoScadenzaVeicolo) {
			IdAvvisoScadenzaVeicolo altro = (IdAvvisoScadenzaVeicolo) object;
			equals = (this.getId() == altro.getId());
		}

		return equals;
	}
}
