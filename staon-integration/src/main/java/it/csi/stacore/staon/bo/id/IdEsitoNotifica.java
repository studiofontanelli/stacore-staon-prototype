package it.csi.stacore.staon.bo.id;

/**
 * DOCUMENT ME!
 * 
 * @author $author$
 * @version $Revision$
 */
public class IdEsitoNotifica extends IdDecodifica implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8417425571529209942L;

	// ~ Constructors
	// =============================================================

	/**
	 * Creates a new IdEsitoNotifica object.
	 * 
	 * @param id
	 *            DOCUMENT ME!
	 */
	public IdEsitoNotifica(long id) {
		super(id);
	}

	// ~ Methods
	// ==================================================================

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

		if ((object != null) && object instanceof IdEsitoNotifica) {
			IdEsitoNotifica altro = (IdEsitoNotifica) object;
			equals = (this.getId() == altro.getId());
		}

		return equals;
	}
}
