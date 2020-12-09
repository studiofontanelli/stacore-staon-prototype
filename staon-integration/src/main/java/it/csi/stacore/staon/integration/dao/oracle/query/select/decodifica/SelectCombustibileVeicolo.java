package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEPreparedStatement;
import it.csi.stacore.staon.integration.dao.oracle.util.OracleQuery;
import it.csi.stacore.staon.integration.dao.oracle.util.OracleQueryList;
import it.csi.stacore.staon.integration.exception.InvalidSearchObjectException;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectCombustibileVeicolo extends SelectCombustibile {

	public SelectCombustibileVeicolo() {
		super();
	}

	public SelectCombustibileVeicolo(IdDecodifica id) {
		super(id);
	}

	public SelectCombustibileVeicolo(String codice) {
		super(codice);
	}

	public String getSQLStatement() throws InvalidSearchObjectException {
		OracleQuery q = OracleQueryList.getInstance().getQuery(
				getClass().getSuperclass().getName());
		String query = q.getBody() + q.getFrom() + q.getWhere();

		query += q.getParamWhere("veicolo");

		if (id != null)
			query += q.getParamWhere("byId");

		if (codice != null)
			query += q.getParamWhere("byCodice");

		getLogger().debug(
				"SelectCombustibileVeicolo - getSQLStatement QUERY: " + query);

		return query;
	}

	protected void setPreparedStatement(TAURDEPreparedStatement stmt)
			throws SQLException {
		if (id != null)
			stmt.setLongId(1, id);
		if (codice != null)
			stmt.setString(1, codice);
	}

}