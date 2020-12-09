package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;


import java.sql.SQLException;

import it.csi.stacore.staon.bo.UtenteUA;
import it.csi.stacore.staon.bo.id.IdUtenteUA;
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
public class SelectUtenteUA extends AbstractSelect {
	//~ Constructors =============================================================
	private String codiceAgenzia;

	/**
	 * Creates a new SelectFonteComunicazioneAttiva object.
	 */
	public SelectUtenteUA(String codiceAgenzia) {
		super();
		this.codiceAgenzia = codiceAgenzia;
	}



	//~ Methods ==================================================================

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public String getSQLStatement() throws InvalidSearchObjectException{
		return super.getSQLStatement();
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
		return new UtenteUA(
				new IdUtenteUA(rs.getLong("id_utente").longValue()),
				rs.getString("codice"), rs.getString("descrizione"));
	}



	protected void setPreparedStatement(TAURDEPreparedStatement stmt)
			throws SQLException {
		int iPos = 1;
		stmt.setString(iPos++, codiceAgenzia);

	}



	public String getCodiceAgenzia() {
		return codiceAgenzia;
	}

}

