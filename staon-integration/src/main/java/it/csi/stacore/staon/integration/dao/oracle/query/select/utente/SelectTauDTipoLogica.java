package it.csi.stacore.staon.integration.dao.oracle.query.select.utente;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.utente.TipologiaBonifica;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEPreparedStatement;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;
import it.csi.stacore.staon.integration.dao.oracle.query.select.AbstractSelect;
import it.csi.stacore.staon.integration.exception.InvalidSearchObjectException;

public class SelectTauDTipoLogica extends AbstractSelect {

	public Object createBO(TAURDEResultSet rs) throws SQLException {

		return new TipologiaBonifica(rs.getLong("ID"),
							rs.getString("CODICE"),
							rs.getString("DESCRIZIONE"));
	}

	public String getSQLStatement() throws InvalidSearchObjectException {

		String query="SELECT ID_TIPO_OPE_LOGICA AS ID, CODICE, DESCRIZIONE FROM TAU_D_TIPO_OPE_LOGICA  ORDER BY DESCRIZIONE ";

		return query;
	}

	public void setPreparedStatement(TAURDEPreparedStatement stmt)
			throws SQLException {

	}
}
