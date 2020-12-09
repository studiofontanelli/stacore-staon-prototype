package it.csi.stacore.staon.bo.id.avvisi.accertamento;

import it.csi.stacore.staon.bo.id.LongId;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class IdSottoCausaleChiusura extends LongId implements java.io.Serializable {
	//~ Constructors =============================================================

	/**
	 *
	 */
	private static final long serialVersionUID = -5091476340480907580L;

	public IdSottoCausaleChiusura(long id) {
		super(id);
	}

	//~ Methods ==================================================================

	public boolean equals(Object object) {
		boolean equals = false;

		if ((object != null) && object instanceof IdSottoCausaleChiusura) {
			IdSottoCausaleChiusura altro = (IdSottoCausaleChiusura) object;
			equals = (this.getId() == altro.getId());
		}

		return equals;
	}
}
