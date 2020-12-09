package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.EnteUA;
import it.csi.stacore.staon.bo.id.IdEnteUA;
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
public class SelectEnteUA extends AbstractSelect {
	//~ Constructors =============================================================

	private String codiceFiscale;

	/**
	 * Creates a new SelectFonteComunicazioneAttiva object.
	 */
	public SelectEnteUA(String codiceFiscale) {
		super();
		this.codiceFiscale = codiceFiscale;
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
		return new EnteUA(new IdEnteUA(rs.getLong("id_ente").longValue()),
				rs.getString("codice"), rs.getString("descrizione")	);
	}



	protected void setPreparedStatement(TAURDEPreparedStatement stmt)
			throws SQLException {

		int iPos = 1;
		stmt.setString(iPos++, codiceFiscale);

	}


	public String getCodiceFiscale() {
		return codiceFiscale;
	}

}

