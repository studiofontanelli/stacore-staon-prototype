package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.RegolaCalcolo;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEPreparedStatement;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;
import it.csi.stacore.staon.integration.dao.oracle.query.select.AbstractSelect;
import it.csi.stacore.staon.integration.exception.InvalidSearchObjectException;

public class SelectRegoleCalcolo extends AbstractSelect {

	public SelectRegoleCalcolo() {
    super();
  }

  public Object createBO(TAURDEResultSet rs) throws SQLException {
  	return new RegolaCalcolo(new IdDecodifica(rs.getLong("ID_REGOLA").longValue()), rs.getString("COD_REGOLA"), rs.getString("DESC_REGOLA"));
  }

  public String getSQLStatement() throws InvalidSearchObjectException {
    return super.getSQLStatement();
  }

	protected void setPreparedStatement(TAURDEPreparedStatement stmt) throws SQLException {
	}
}
