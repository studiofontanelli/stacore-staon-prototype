package it.csi.stacore.staon.bo;

/**
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 *
 * @author curtoni
 */
public class Comune implements java.io.Serializable {
	//~ Instance fields ==========================================================

	/**
	 *
	 */
	private static final long serialVersionUID = -6164904762682072846L;

	/**
	 * @uml.property  name="codiceIstat"
	 */
	private String codiceIstat;

	/**
	 * @uml.property  name="cap"
	 */
	private String cap;

	/**
	 * @uml.property  name="comune"
	 */
	private String comune;

	/**
	 * @uml.property  name="provincia"
	 */
	private String provincia;

	/**
	 * @uml.property  name="regione"
	 */
	private String regione;

	/**
	 * @uml.property  name="stato"
	 */
	private String stato;

	//~ Constructors =============================================================

	/**
	 * Creates a new Comune object.
	 *
	 * @param codiceIstat DOCUMENT ME!
	 * @param cap DOCUMENT ME!
	 * @param comune DOCUMENT ME!
	 * @param provincia DOCUMENT ME!
	 * @param regione DOCUMENT ME!
	 * @param stato DOCUMENT ME!
	 */
	public Comune(String codiceIstat, String cap, String comune, String provincia, String regione, String stato) {
		this.codiceIstat = codiceIstat;
		this.cap = cap;
		this.comune = comune;
		this.provincia = provincia;
		this.regione = regione;
		this.stato = stato;
	}

	//~ Methods ==================================================================

	/**
	 * DOCUMENT ME!
	 * @return  DOCUMENT ME!
	 * @uml.property  name="codiceIstat"
	 */
	public String getCodiceIstat() {
		return codiceIstat;
	}

	/**
	 * DOCUMENT ME!
	 * @return  DOCUMENT ME!
	 * @uml.property  name="cap"
	 */
	public String getCap() {
		return cap;
	}

	/**
	 * DOCUMENT ME!
	 * @return  DOCUMENT ME!
	 * @uml.property  name="comune"
	 */
	public String getComune() {
		return comune;
	}

	/**
	 * DOCUMENT ME!
	 * @return  DOCUMENT ME!
	 * @uml.property  name="provincia"
	 */
	public String getProvincia() {
		return provincia;
	}

	/**
	 * DOCUMENT ME!
	 * @return  DOCUMENT ME!
	 * @uml.property  name="regione"
	 */
	public String getRegione() {
		return regione;
	}

	/**
	 * DOCUMENT ME!
	 * @return  DOCUMENT ME!
	 * @uml.property  name="stato"
	 */
	public String getStato() {
		return stato;
	}
}
