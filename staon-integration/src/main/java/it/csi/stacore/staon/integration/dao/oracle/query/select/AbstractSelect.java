package it.csi.stacore.staon.integration.dao.oracle.query.select;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import it.csi.stacore.staon.integration.dao.oracle.query.AbstractQuery;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEPreparedStatement;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;
import it.csi.stacore.staon.integration.exception.InvalidSearchObjectException;
import it.csi.stacore.staon.util.PackageToAppName;
import it.csi.util.performance.StopWatch;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public abstract class AbstractSelect extends AbstractQuery {
	//~ Constructors =============================================================

	/**
	 * Creates a new AbstractSelect object.
	 */
	protected AbstractSelect() {
		super();
	}

	//~ Methods ==================================================================

	/**
	 * crea l'oggetto di business logic
	 *
	 * @param rs
	 *
	 * @return
	 *
	 * @throws SQLException
	 */
	public abstract Object createBO(TAURDEResultSet rs) throws SQLException;

	/**
	 * esegue la query
	 *
	 * @param conn
	 *
	 * @return
	 *
	 * @throws SQLException
	 * @throws InvalidSearchObjectException
	 */
	public Object execute(Connection conn) throws SQLException, InvalidSearchObjectException {
		StopWatch stopWatch = new StopWatch(PackageToAppName.getInstance().getAppNameFromPackage(getClass().getPackage().getName()));
		stopWatch.start();

		//getLogger().debug("[execute()] - query class: " + getClass().getName() + ", query: " + getSQLStatement());

		TAURDEPreparedStatement stmt = new TAURDEPreparedStatement(conn, getSQLStatement());

		try {
			setPreparedStatement(stmt);

			TAURDEResultSet rs = stmt.executeQuery();

			try {
				Object result = null;

				if (rs.next()) {
					result = createBO(rs);
				}

				return result;
			} finally {
				rs.close();
			}
		} finally {
			stmt.close();
			stopWatch.dumpElapsed(getClass().getName(), "execute()", "esecuzione query", "query = " + getClass().getName() + " "
					+ stmt.getSqlToString(getSQLStatement()));
		}
	}

	/**
	 * Ritorna una Collection di oggetti costruiti nel metodo createBO(ResultSet
	 * rs) Da usare nel caso in cui la query debba eseguire ricerche multiple.
	 *
	 * @param conn
	 *
	 * @return
	 *
	 * @throws SQLException
	 * @throws InvalidSearchObjectException
	 */
	public List executeMultipla(Connection conn) throws SQLException, InvalidSearchObjectException {
		StopWatch stopWatch = new StopWatch(PackageToAppName.getInstance().getAppNameFromPackage(getClass().getPackage().getName()));
		stopWatch.start();

		getLogger().debug("[executeMultipla()] - query class: " + getClass().getName() + ", query: " + getSQLStatement());

		TAURDEPreparedStatement stmt = new TAURDEPreparedStatement(conn, getSQLStatement());

		try {
			setPreparedStatement(stmt);

			TAURDEResultSet rs = stmt.executeQuery();

			try {
				List result = new ArrayList();

				while (rs.next()) {
					Object queryResult = createBO(rs);

					if (queryResult != null) {
						result.add(queryResult);
					}
				}

				if (getLogger().isDebugEnabled()) {
					getLogger().debug("[executeMultipla()] - query class: " + getClass().getName() + ", record estratti: " + result.size());
				}

				return result;
			} finally {
				rs.close();
			}
		} finally {
			stmt.close();
			stopWatch.dumpElapsed(getClass().getName(), "executeMultipla()", "esecuzione query", "query = " + getClass().getName() + " "
					+ stmt.getSqlToString(getSQLStatement()));
		}
	}

	protected static String createCondition(List lista, String column) {
		final String parameter = "?";
		final String comma     = ",";
		StringBuffer condition = new StringBuffer();
		if (lista != null && !lista.isEmpty()){
			condition.append("(" + column);
			if (lista.size() == 1){
				condition.append(" = ?)");
			} else {
				condition.append(" IN (?");
				for (int y = 1;y < lista.size();y++) {
					if (y%1000 == 0){
						condition.append(") OR " + column + " IN (?");
					} else {
						condition.append(comma).append(parameter);
					}
				}
				condition.append("))");
			}
		}

		return condition.toString();
	}

	public static void main(String[] args) {
		List lista = new ArrayList(0);
		Random r = new Random();
		for (int i = 0; i < 2; i++) {
			lista.add("" + r.nextInt());
		}
		System.out.println(createCondition(lista, "P.ID_PROPRIETARIO"));
	}

}
