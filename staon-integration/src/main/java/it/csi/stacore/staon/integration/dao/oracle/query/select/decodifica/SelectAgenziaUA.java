package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;


import java.sql.SQLException;

import it.csi.stacore.staon.bo.AgenziaUA;
import it.csi.stacore.staon.bo.id.IdAgenziaUA;
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
public class SelectAgenziaUA extends AbstractSelect {
	//~ Constructors =============================================================
	private String enteDescrizione;

	/**
	 * Creates a new SelectFonteComunicazioneAttiva object.
	 */
	public SelectAgenziaUA(String enteDescrizione) {
		super();
		this.enteDescrizione = enteDescrizione;
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
		return new AgenziaUA(
				new IdAgenziaUA(rs.getLong("id_agenzia").longValue()),
				rs.getString("codice"), rs.getString("descrizione"));
	}



	protected void setPreparedStatement(TAURDEPreparedStatement stmt)
			throws SQLException {
		int iPos = 1;
		stmt.setString(iPos++, enteDescrizione);

	}



	public String getEnteDescrizione() {
		return enteDescrizione;
	}

}

