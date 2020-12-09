package it.csi.stacore.staon.bo.id.avvisi.scadenza;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class IdAvvisoScadenzaEnte implements java.io.Serializable {
	//~ Constructors =============================================================

	/**
	 * 
	 */
	private static final long serialVersionUID = 6683274080399959499L;
	/**
	 * @uml.property  name="id"
	 */
	private long id;

	public IdAvvisoScadenzaEnte(long id) {
		this.id = id;
	}

	//~ Methods ==================================================================

	/**
	 * @return  Returns the id.
	 * @uml.property  name="id"
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id  The id to set.
	 * @uml.property  name="id"
	 */
	public void setId(long id) {
		this.id = id;
	}

	public boolean equals(Object object) {
		boolean equals = false;

		if ((object != null) && object instanceof IdAvvisoScadenzaEnte) {
			IdAvvisoScadenzaEnte altro = (IdAvvisoScadenzaEnte) object;
			equals = (this.getId() == altro.getId());
		}

		return equals;
	}
}
