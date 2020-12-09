package it.csi.stacore.staon.bo.avvisi.segnalazione;

import it.csi.stacore.staon.util.EqualsUtil;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SottoCausaleSegnalazione implements java.io.Serializable {

	static final long serialVersionUID = 889959897946401369L;

	/**
	 * @uml.property  name="idSottoCausaleSegnalazione"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private IdSottoCausaleSegnalazione idSottoCausaleSegnalazione = null;

	/**
	 * @uml.property  name="idCausaleSegnalazione"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private IdCausaleSegnalazione idCausaleSegnalazione = null;

	/**
	 * @uml.property  name="descrizione"
	 */
	private String descrizione = null;

	//~ Constructors
	// =============================================================

	public SottoCausaleSegnalazione(
			IdSottoCausaleSegnalazione idSottoCausaleSegnalazione,
			IdCausaleSegnalazione idCausaleSegnalazione, String descrizione) {
		this.idSottoCausaleSegnalazione = idSottoCausaleSegnalazione;
		this.idCausaleSegnalazione = idCausaleSegnalazione;
		this.descrizione = descrizione;
	}

	//~ Methods
	// ==================================================================

	/**
	 * @return  Returns the descrizione.
	 * @uml.property  name="descrizione"
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * @param descrizione  The descrizione to set.
	 * @uml.property  name="descrizione"
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	/**
	 * @return  Returns the idCausaleSegnalazione.
	 * @uml.property  name="idCausaleSegnalazione"
	 */
	public IdCausaleSegnalazione getIdCausaleSegnalazione() {
		return idCausaleSegnalazione;
	}

	/**
	 * @param idCausaleSegnalazione  The idCausaleSegnalazione to set.
	 * @uml.property  name="idCausaleSegnalazione"
	 */
	public void setIdCausaleSegnalazione(
			IdCausaleSegnalazione idCausaleSegnalazione) {
		this.idCausaleSegnalazione = idCausaleSegnalazione;
	}

	/**
	 * @return  Returns the idSottoCausaleSegnalazione.
	 * @uml.property  name="idSottoCausaleSegnalazione"
	 */
	public IdSottoCausaleSegnalazione getIdSottoCausaleSegnalazione() {
		return idSottoCausaleSegnalazione;
	}

	/**
	 * @param idSottoCausaleSegnalazione  The idSottoCausaleSegnalazione to set.
	 * @uml.property  name="idSottoCausaleSegnalazione"
	 */
	public void setIdSottoCausaleSegnalazione(
			IdSottoCausaleSegnalazione idSottoCausaleSegnalazione) {
		this.idSottoCausaleSegnalazione = idSottoCausaleSegnalazione;
	}

	public boolean equals(Object object) {
		boolean equals = false;

		if ((object != null) && object instanceof SottoCausaleSegnalazione) {
			SottoCausaleSegnalazione altro = (SottoCausaleSegnalazione) object;
			equals = EqualsUtil.objectEquals(getIdSottoCausaleSegnalazione(),
					altro.getIdSottoCausaleSegnalazione())
					&& EqualsUtil.objectEquals(getIdCausaleSegnalazione(),
							altro.getIdCausaleSegnalazione())
					&& EqualsUtil.objectEquals(getDescrizione(), altro
							.getDescrizione());
		}

		return equals;
	}
}
