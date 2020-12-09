package it.csi.stacore.staon.bo.consultazione;

/**
 * Classe StatoScadenza.<br>
 * Indica lo stato del bollo.<br>
 * Come attributi ci sono il codice e la descrizione<br>
 * <p>
 * Codici gestiti da tassa auto:<br>
 * <li>
 * <ul><b>P</b> Pagato</ul>
 * <ul><b>N</b> Non pagato</ul>
 * <ul><b>A</b> Accertato</ul>
 * </li>
 */
public class StatoScadenza implements java.io.Serializable {

	public static final StatoScadenza REGOLARE = new StatoScadenza(new Integer(1), "REGOL", "REGOLARE");
	public static final StatoScadenza IRREGOLARE = new StatoScadenza(new Integer(2), "IRREG", "IRREGOLARE");
	public static final StatoScadenza RATEIZZATO = new StatoScadenza(new Integer(3), "RATEI", "RATEIZZATO");
	public static final StatoScadenza INGIUNZIONE = new StatoScadenza(new Integer(4), "INGIU", "INGIUNZIONE");
	public static final StatoScadenza SOSPESO = new StatoScadenza(new Integer(5), "SOSP", "SOSPESO");

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 12323232323L;

	/** The codice. */
	private final String codice;

	/** The descrizione. */
	private final String descrizione;
	private final Integer id;

	/**
	 * Istanzia un nuovo tipo veicolo tassa auto.
	 *
	 * @param codice the codice
	 * @param descrizione the descrizione
	 */
	public StatoScadenza(Integer id, String codice, String descrizione) {
		this.id = id;
		this.codice = codice;
		this.descrizione = descrizione;
	}

	/**
	 * Gets the codice.
	 *
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}

	/**
	 * Gets the descrizione.
	 *
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

	public Integer getId() {
		return id;
	}

	public boolean isScadenzaRegolare() {
		return id.intValue() == 1;
	}

	public boolean isScadenzaIngiunzione() {
		return id.intValue() == 4;
	}
}
