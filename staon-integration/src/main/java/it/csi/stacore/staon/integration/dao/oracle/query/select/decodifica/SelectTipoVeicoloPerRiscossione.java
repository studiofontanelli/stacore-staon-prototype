package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.TipoVeicolo;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEPreparedStatement;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;
import it.csi.stacore.staon.integration.dao.oracle.query.select.AbstractSelect;
import it.csi.stacore.staon.integration.exception.InvalidSearchObjectException;

public class SelectTipoVeicoloPerRiscossione extends AbstractSelect {

	public Object createBO(TAURDEResultSet rs) throws SQLException {
		return new TipoVeicolo(new IdDecodifica(rs.getLong("ID").longValue()),
				rs.getString("CODICE"), rs.getString("DESCRIZIONE"));
	}

	public void setPreparedStatement(TAURDEPreparedStatement stmt)
			throws SQLException {
	}

	public String getSQLStatement() throws InvalidSearchObjectException {
		return super.getSQLStatement();
	}

}