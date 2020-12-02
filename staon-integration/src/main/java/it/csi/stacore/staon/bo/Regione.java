package it.csi.stacore.staon.bo;

import org.apache.commons.lang3.builder.HashCodeBuilder;

import it.csi.stacore.staon.bo.id.IdRegione;
import it.csi.stacore.staon.util.EqualsUtil;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class Regione extends Decodifica {
	//~ Constructors =============================================================

	/**
	 *
	 */
	private static final long serialVersionUID = -490876393864346650L;

	/**
	 * Creates a new Regione object.
	 *
	 * @param id DOCUMENT ME!
	 * @param codice DOCUMENT ME!
	 * @param descrizione DOCUMENT ME!
	 */
	public Regione(IdRegione id, String codice, String descrizione) {
		super(id, codice, descrizione);
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

		if((object != null) && object instanceof Regione) {
			Regione altro = (Regione) object;
			equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
		}

		return equals;
	}

	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

}
