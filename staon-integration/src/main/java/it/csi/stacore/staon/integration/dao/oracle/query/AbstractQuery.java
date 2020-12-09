package it.csi.stacore.staon.integration.dao.oracle.query;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.csi.stacore.staon.etc.Constants;
import it.csi.stacore.staon.integration.dao.oracle.util.OracleQuery;
import it.csi.stacore.staon.integration.dao.oracle.util.OracleQueryList;
import it.csi.stacore.staon.integration.exception.InvalidSearchObjectException;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public abstract class AbstractQuery {


	protected final static Logger LOG = LoggerFactory.getLogger(Constants.APPLICATION_NAME);

	//~ Methods ==================================================================

	public Logger getLogger() {
		return LOG;
	}

	//~ Constructors =============================================================

	/**
	 * Creates a new AbstractQuery object.
	 */
	protected AbstractQuery() {
	}

	//~ Methods ==================================================================

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws InvalidSearchObjectException DOCUMENT ME!
	 */
	public String getSQLStatement() throws InvalidSearchObjectException {
		OracleQuery q = getOracleQueryList().getQuery(getClass().getName());
		return q.getQuery();
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	protected OracleQueryList getOracleQueryList() {
		return OracleQueryList.getInstance();
	}

	/**
	 * Nell'implementazione di questo metodo deve essere impostato correttamente
	 * il PreparedStatement
	 *
	 * @param stmt
	 *
	 * @throws SQLException
	 */
	protected abstract void setPreparedStatement(TAURDEPreparedStatement stmt)
			throws SQLException;


}
