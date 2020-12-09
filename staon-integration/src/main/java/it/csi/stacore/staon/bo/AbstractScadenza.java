package it.csi.stacore.staon.bo;

import it.csi.stacore.staon.util.EqualsUtil;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public abstract class AbstractScadenza extends AbstractBO implements
		java.io.Serializable, Comparable {
	// ~ Static fields/initializers
	// ===============================================

	private static final long serialVersionUID = 1L;

	private static final String INVALID_SCADENZA = "scadenza_incorretta";
	private static final String INVALID_VALIDITA = "validita_incorretta";

	/**
	 * DOCUMENT ME!
	 */
	public static final int SCADENZA_LENGTH = 6;

	/**
	 * DOCUMENT ME!
	 */
	public static final int VALIDITA_LENGTH = 2;

	// ~ Instance fields
	// ==========================================================

	/**
	 * @uml.property name="dataScadenza"
	 * @uml.associationEnd multiplicity="(1 1)"
	 */
	private DataScadenza dataScadenza;
	// private Integer scadenza; //es: 200412 (YYYYMM)
	/**
	 * @uml.property name="validita"
	 */
	private Integer validita; // es: 01 (MM)
	/**
	 * @uml.property name="targa"
	 */
	private String targa;
	/**
	 * @uml.property name="tipoVeicolo"
	 * @uml.associationEnd multiplicity="(1 1)"
	 */
	private TipoVeicolo tipoVeicolo;

	// ~ Constructors
	// =============================================================

	/**
	 * Creates a new AbstractScadenza object.
	 *
	 * @param targa
	 *            DOCUMENT ME!
	 * @param tipoVeicolo
	 *            DOCUMENT ME!
	 * @param scadenza
	 *            DOCUMENT ME!
	 * @param validita
	 *            DOCUMENT ME!
	 */
	public AbstractScadenza(String targa, TipoVeicolo tipoVeicolo,
			Integer scadenza, Integer validita) {
		this.validita = validita;
		// this.scadenza = scadenza;
		this.targa = targa;
		this.tipoVeicolo = tipoVeicolo;

		this.dataScadenza = new DataScadenza(scadenza);

		if (scadenza != null) {
			verifyLength(scadenza.toString(), SCADENZA_LENGTH, INVALID_SCADENZA);
		}

		if (validita != null) {
			verifyLength(validita.toString(), VALIDITA_LENGTH, INVALID_VALIDITA);
		}
	}

	// ~ Methods
	// ==================================================================

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 * @uml.property name="dataScadenza"
	 */
	public DataScadenza getDataScadenza() {
		return dataScadenza;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public Integer getScadenza() {
		return dataScadenza.toInteger();
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 * @uml.property name="validita"
	 */
	public Integer getValidita() {
		return validita;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public Integer getScadenzaAnno() {
		return dataScadenza.getAnno();
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public Mese getScadenzaMese() {
		return dataScadenza.getMese();
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public String getScadenzaMeseString() {
		return dataScadenza.getMese().getId().toString();
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param mm_yyyy
	 *            DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public static String getScadenzaInteger(String mm_yyyy) {
		if (mm_yyyy.length() == 7) {
			// restituisce la scadenza in formato yyyymm, dato il formato
			// mm/yyyy
			String meseString = mm_yyyy.toString().substring(0, 2);
			String annoString = mm_yyyy.toString().substring(3, 7);

			return annoString + meseString;
		}

		if (mm_yyyy.length() == 6) {
			return mm_yyyy;
		}

		return "";
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 * @uml.property name="targa"
	 */
	public String getTarga() {
		return targa;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 * @uml.property name="tipoVeicolo"
	 */
	public TipoVeicolo getTipoVeicolo() {
		return tipoVeicolo;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dataScadenza == null) ? 0 : dataScadenza.hashCode());
		result = prime * result + ((targa == null) ? 0 : targa.hashCode());
		result = prime * result
				+ ((tipoVeicolo == null) ? 0 : tipoVeicolo.hashCode());
		result = prime * result
				+ ((validita == null) ? 0 : validita.hashCode());
		return result;
	}

	public boolean equals(Object object) {
		boolean equals = false;

		if ((object != null) && object instanceof AbstractScadenza) {
			AbstractScadenza altro = (AbstractScadenza) object;
			equals = EqualsUtil
					.objectEquals(getScadenza(), altro.getScadenza())
					&& EqualsUtil.objectEquals(getValidita(),
							altro.getValidita())
					&& EqualsUtil.objectEquals(getTarga(), altro.getTarga())
					&& EqualsUtil.objectEquals(getTipoVeicolo(),
							altro.getTipoVeicolo());
		}

		return equals;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(Object o) {
		AbstractScadenza altraScadenza = (AbstractScadenza) o;

		if (altraScadenza == null)
			return -1;

		if (altraScadenza.targa != null) {
			int compareTarga = targa.compareTo(altraScadenza.targa);
			if (compareTarga != 0)
				return compareTarga;

			if (altraScadenza.tipoVeicolo != null) {
				int compareTipoVeicolo = tipoVeicolo
						.compareTo(altraScadenza.tipoVeicolo);
				if (compareTipoVeicolo != 0)
					return compareTipoVeicolo;

				if (altraScadenza.dataScadenza != null) {
					int compareDataScadenza = dataScadenza
							.compareTo(altraScadenza.dataScadenza);
					if (compareDataScadenza != 0)
						return compareDataScadenza;

					if (altraScadenza.validita != null) {
						int compareValidita = validita
								.compareTo(altraScadenza.validita);
						if (compareValidita != 0)
							return compareValidita;

						return 0;
					} else
						return -1;
				} else
					return -1;
			} else
				return -1;
		} else
			return -1;
	}
}
