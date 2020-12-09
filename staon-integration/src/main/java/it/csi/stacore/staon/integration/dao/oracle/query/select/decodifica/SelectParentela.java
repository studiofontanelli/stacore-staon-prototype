package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.Parentela;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


public class SelectParentela extends AbstractSelectDecodifica {

	//~ Constructors =============================================================

	/**
	 * Creates a new SelectParentela object.
	 */
	public SelectParentela() {
		super();
	}

	/**
	 * Creates a new SelectParentela object.
	 *
	 * @param codice DOCUMENT ME!
	 */
	public SelectParentela(String codice) {
		super(codice);
	}

	/**
	 * Creates a new SelectParentela object.
	 *
	 * @param id DOCUMENT ME!
	 */
	public SelectParentela(IdDecodifica id) {
		super(id);
	}

	//~ Methods ==================================================================

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public String getSQLStatement() {
		return getSQLStatement("ID_PARENTELA", "TAU_D_PARENTELA");
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param rs DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws SQLException DOCUMENT ME!
	 */
	public Object createBO(TAURDEResultSet rs) throws SQLException {
		return new Parentela(
				new IdDecodifica(rs.getLong("id").longValue()),
				rs.getString("codice"), rs.getString("descrizione")
				);
	}
}
