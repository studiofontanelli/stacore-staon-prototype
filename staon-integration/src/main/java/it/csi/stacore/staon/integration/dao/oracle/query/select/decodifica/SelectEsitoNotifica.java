package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.EsitoNotifica;
import it.csi.stacore.staon.bo.id.IdEsitoNotifica;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEPreparedStatement;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;
import it.csi.stacore.staon.integration.dao.oracle.query.select.AbstractSelect;
import it.csi.stacore.staon.integration.exception.InvalidSearchObjectException;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectEsitoNotifica extends AbstractSelect {
	// ~ Constructors
	// =============================================================

	/**
	 * Creates a new SelectEsitoNotifica object.
	 */
	public SelectEsitoNotifica() {
		super();
	}


	protected void setPreparedStatement(TAURDEPreparedStatement stmt)
			throws SQLException {
	}

	// ~ Methods
	// ==================================================================

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public String getSQLStatement() throws InvalidSearchObjectException {
		return super.getSQLStatement();
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param rs
	 *            DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws SQLException
	 *             DOCUMENT ME!
	 */
	public Object createBO(TAURDEResultSet rs) throws SQLException {
		return new EsitoNotifica(new IdEsitoNotifica(rs.getLong(
				"ID_ESITO_NOTIFICA").longValue()),
				rs.getString("COD_ESITO_NOTIFICA"),
				rs.getString("DESCR_ESITO_NOTIFICA"));
	}
}
