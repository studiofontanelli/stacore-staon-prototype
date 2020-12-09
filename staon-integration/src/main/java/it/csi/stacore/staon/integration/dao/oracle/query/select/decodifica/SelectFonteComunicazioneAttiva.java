package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.FonteComunicazione;
import it.csi.stacore.staon.bo.id.IdFonteComunicazione;
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
public class SelectFonteComunicazioneAttiva extends AbstractSelect {
	//~ Constructors =============================================================

	/**
	 * Creates a new SelectFonteComunicazioneAttiva object.
	 */
	public SelectFonteComunicazioneAttiva() {
		super();
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
		return new FonteComunicazione(
				new IdFonteComunicazione(rs.getLong("id_fonte_comunicazione").longValue()),
				rs.getString("codice"), rs.getString("descrizione")
				);
	}



	protected void setPreparedStatement(TAURDEPreparedStatement stmt)
			throws SQLException {
		// TODO Auto-generated method stub

	}

}

