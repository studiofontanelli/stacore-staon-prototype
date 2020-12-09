package it.csi.stacore.staon.bo.id.avvisi.accertamento;

import it.csi.stacore.staon.bo.id.LongId;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class IdAvvisoAccertamentoEnte extends LongId implements java.io.Serializable {
	//~ Constructors =============================================================

	/**
	 *
	 */
	private static final long serialVersionUID = -2211720625815230671L;

	public IdAvvisoAccertamentoEnte(long id) {
		super(id);
	}

	//~ Methods ==================================================================

	public boolean equals(Object object) {
		boolean equals = false;

		if ((object != null) && object instanceof IdAvvisoAccertamentoEnte) {
			IdAvvisoAccertamentoEnte altro = (IdAvvisoAccertamentoEnte) object;
			equals = (this.getId() == altro.getId());
		}

		return equals;
	}
}
