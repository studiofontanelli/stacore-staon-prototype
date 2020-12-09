package it.csi.stacore.staon.bo;

import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.util.EqualsUtil;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class TipoNotifica extends Decodifica {


	/**
	 *
	 */
	private static final long serialVersionUID = 4119705315110918238L;
	/*
	 * 1	Notifica NON BIG
	 */
	public static final int RACCOMANDATA = 1;
	/*
	 * 2	Notifica BIG
	 */
	public static final int ATTO_GIUDIZIARIO = 2;

	/**
	 * DOCUMENT ME!
	 *
	 * @param id
	 * @param codice
	 * @param descrizione
	 */
	public TipoNotifica(IdDecodifica id, String codice, String descrizione) {
		super(id, codice, descrizione);
	}

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

		if ((object != null) && object instanceof TipoNotifica) {
			TipoNotifica altro = (TipoNotifica) object;
			equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
		}

		return equals;
	}
}
