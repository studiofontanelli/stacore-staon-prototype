package it.csi.stacore.staon.bo.avvisi.segnalazione;

import it.csi.stacore.staon.bo.id.LongId;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class IdSottoCausaleSegnalazione extends LongId implements java.io.Serializable {
	//~ Constructors =============================================================

	/**
	 *
	 */
	private static final long serialVersionUID = -5265105848445422637L;

	public IdSottoCausaleSegnalazione(long id) {
		super(id);
	}

	//~ Methods ==================================================================

	public boolean equals(Object object) {
		boolean equals = false;

		if ((object != null) && object instanceof IdSottoCausaleSegnalazione) {
			IdSottoCausaleSegnalazione altro = (IdSottoCausaleSegnalazione) object;
			equals = (this.getId() == altro.getId());
		}

		return equals;
	}
}
