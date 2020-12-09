package it.csi.stacore.staon.bo.id.avvisi.scadenza;

import it.csi.stacore.staon.bo.id.LongId;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class IdAvvisoScadenzaPersona extends LongId implements java.io.Serializable {
	//~ Constructors =============================================================

	/**
	 *
	 */
	private static final long serialVersionUID = -5194835935732179010L;

	public IdAvvisoScadenzaPersona(long id) {
		super(id);
	}

	//~ Methods ==================================================================
	public boolean equals(Object object) {
		boolean equals = false;

		if ((object != null) && object instanceof IdAvvisoScadenzaPersona) {
			IdAvvisoScadenzaPersona altro = (IdAvvisoScadenzaPersona) object;
			equals = (this.getId() == altro.getId());
		}

		return equals;
	}
}
