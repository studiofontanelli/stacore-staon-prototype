package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.Date;

import it.csi.stacore.staon.bo.id.LongId;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEPreparedStatement;


public abstract class AbstractSelectDecodificaDatata extends
		AbstractSelectDecodifica {
	protected static final String COMMON_QUERY = "SELECT {0} id, CODICE, DESCRIZIONE, DT_INIZIO, DT_FINE FROM {1} ";

	private Date data;

	protected AbstractSelectDecodificaDatata(Date data) {
		super();
		this.data = data;
	}

	protected AbstractSelectDecodificaDatata(LongId id, Date data) {
		super(id);
		this.data = data;
	}

	protected AbstractSelectDecodificaDatata(String codice, Date data) {
		super(codice);
		this.data = data;
	}

	protected String getSQLStatement(String idName, String tableName) {
		String strRet = null;
		MessageFormat format = new MessageFormat(COMMON_QUERY);
		Object[] arguments = { idName, tableName };
		strRet = format.format(arguments);
		strRet += getWhereCondition(idName);
		if (data != null)
			strRet += getDateCondition(idName);
		strRet += ORDER_BY;

		return strRet;
	}

	private String getDateCondition(String idName) {
		String result = "";

		String prefix = "";
		if (getMode() != MODE_SELECT_ALL)
			prefix = " AND ";
		else
			prefix = " WHERE ";
		result += prefix + "(DT_INIZIO <= ? OR DT_INIZIO IS NULL) AND (DT_FINE >= ? OR DT_FINE IS NULL) ";

		return result;
	}

	protected void setPreparedStatement(TAURDEPreparedStatement stmt)
			throws SQLException {
		super.setPreparedStatement(stmt);
		int i = 1;
		if (getMode() != MODE_SELECT_ALL)
			i++;
		if (data != null) {
			stmt.setDate(i++, data);
			stmt.setDate(i++, data);
		}
	}

}