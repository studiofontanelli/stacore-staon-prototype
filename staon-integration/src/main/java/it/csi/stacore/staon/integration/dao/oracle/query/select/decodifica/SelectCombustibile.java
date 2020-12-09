package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.Combustibile;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEPreparedStatement;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;
import it.csi.stacore.staon.integration.dao.oracle.query.select.AbstractSelect;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectCombustibile extends AbstractSelect {

	protected IdDecodifica id;

	protected String codice;

	/**
	 * Creates a new SelectCombustibile object.
	 */
	public SelectCombustibile() {
		super();
	}

	public SelectCombustibile(IdDecodifica id) {
		super();
		this.id = id;
	}

	public SelectCombustibile(String codice) {
		super();
		this.codice = codice;
	}

	public Object createBO(TAURDEResultSet rs) throws SQLException {
		return new Combustibile(new IdDecodifica(rs.getLong("ID").longValue()),
				rs.getString("CODICE"), rs.getString("DESCRIZIONE"));
	}

	protected void setPreparedStatement(TAURDEPreparedStatement stmt)
			throws SQLException {
			}

}