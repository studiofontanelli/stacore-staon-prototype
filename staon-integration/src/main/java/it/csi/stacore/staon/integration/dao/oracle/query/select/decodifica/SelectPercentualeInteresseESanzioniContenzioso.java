package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.avvisi.accertamento.PercentualeInteressiSanzioni;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEPreparedStatement;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;
import it.csi.stacore.staon.integration.dao.oracle.query.select.AbstractSelect;
import it.csi.stacore.staon.integration.exception.InvalidSearchObjectException;

/**
 * @author 71025
 */
public class SelectPercentualeInteresseESanzioniContenzioso extends AbstractSelect {

	public SelectPercentualeInteresseESanzioniContenzioso() {
		super();
	}

	public String getSQLStatement() throws InvalidSearchObjectException {
		return super.getSQLStatement();
	}

	public Object createBO(TAURDEResultSet rs) throws SQLException {
		PercentualeInteressiSanzioni obj = new PercentualeInteressiSanzioni(rs.getDate("D_INIZIO"), rs.getDate("D_FINE"), rs.getBigDecimal("INTERESSE"), rs.getBigDecimal("SANZIONI"));
		return obj;
	}

	protected void setPreparedStatement(TAURDEPreparedStatement stmt) throws SQLException {
	}
}
