package it.csi.stacore.staon.integration.dao.oracle.query.select.documentazionebonifiche;

import java.sql.SQLException;

import org.apache.commons.lang3.StringUtils;

import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEPreparedStatement;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;
import it.csi.stacore.staon.integration.dao.oracle.query.select.AbstractSelect;

public class SelectNotaBonifica extends AbstractSelect {

	private Long idBonifica;

	public SelectNotaBonifica(Long idBonifica) {
		super();
		this.idBonifica = idBonifica;
	}

	public Object createBO(TAURDEResultSet rs) throws SQLException {

		return StringUtils.isNotBlank(rs.getString("NOTE")) ?  new String(rs.getString("NOTE")) : null;
	}

	 protected void setPreparedStatement(TAURDEPreparedStatement stmt)
             throws SQLException {

		 stmt.setLong(1, idBonifica);
	}
}
