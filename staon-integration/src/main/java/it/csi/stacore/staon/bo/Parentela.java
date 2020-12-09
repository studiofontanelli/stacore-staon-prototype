package it.csi.stacore.staon.bo;

import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.util.EqualsUtil;

public class Parentela extends Decodifica implements java.io.Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = -4222129598299517464L;

	//~ Static fields/initializers ===============================================




	//~ Constructors =============================================================

	/**
	 * Creates a new Parentela object.
	 *
	 * @param idDecodifica DOCUMENT ME!
	 * @param codice DOCUMENT ME!
	 * @param descrizione DOCUMENT ME!
	 */
	public Parentela(
			IdDecodifica idDecodifica, String codice,
			String descrizione
			) {
		super(idDecodifica, codice, descrizione);
	}

	//~ Methods ==================================================================

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public IdDecodifica getIdParentela() {
		return getId();
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

		if((object != null) && object instanceof Parentela) {
			Parentela altro = (Parentela) object;
			equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
		}

		return equals;
	}

}
