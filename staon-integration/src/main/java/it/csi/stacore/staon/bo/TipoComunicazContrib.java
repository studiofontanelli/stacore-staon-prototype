package it.csi.stacore.staon.bo;

import it.csi.stacore.staon.bo.id.IdFonte;
import it.csi.stacore.staon.bo.id.IdTipoComunicazContrib;
import it.csi.stacore.staon.util.EqualsUtil;


public class TipoComunicazContrib extends Decodifica implements java.io.Serializable {



	/**
	 *
	 */
	private static final long serialVersionUID = -4341258271601522702L;

	public TipoComunicazContrib(IdTipoComunicazContrib idFonte, String codice, String descrizione) {
		super(idFonte, codice, descrizione);
	}

	//~ Methods ==================================================================

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public IdFonte getIdFonte() {
		return (IdFonte) getId();
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

		if((object != null) && object instanceof Fonte) {
			Fonte altro = (Fonte) object;
			equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
		}

		return equals;
	}


}