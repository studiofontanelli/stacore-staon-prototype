package it.csi.stacore.staon.integration.dao.oracle.query.select.documentazionebonifiche;

import java.sql.SQLException;

import org.apache.commons.lang3.StringUtils;

import it.csi.stacore.staon.bo.RicercaBonificheRequest;
import it.csi.stacore.staon.bo.id.IdBonifica;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEPreparedStatement;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;
import it.csi.stacore.staon.integration.dao.oracle.query.select.AbstractSelect;
import it.csi.stacore.staon.integration.dao.oracle.util.OracleQuery;
import it.csi.stacore.staon.integration.dao.oracle.util.OracleQueryList;
import it.csi.stacore.staon.integration.exception.InvalidSearchObjectException;

public class SelectIdBonifiche extends AbstractSelect {

	private RicercaBonificheRequest request;

	public SelectIdBonifiche(RicercaBonificheRequest request) {
		super();
		this.request = request;
	}

	public Object createBO(TAURDEResultSet rs) throws SQLException {

		return new IdBonifica(rs.getLong("ID_BONIFICA"));
	}

	public String getSQLStatement() throws InvalidSearchObjectException {
		OracleQuery q = OracleQueryList.getInstance().getQuery(getClass().getName());
		String query = q.getBody();
		query += q.getFrom();
		query += q.getWhere();

		if(StringUtils.isNotBlank(request.getEnte()))
			query += q.getParamWhere("ente");

		if(StringUtils.isNotBlank(request.getSportello()))
			query += q.getParamWhere("idSportello");

		if(StringUtils.isNotBlank(request.getCassa()))
			query += q.getParamWhere("idCassa");

		if(StringUtils.isNotBlank(request.getTarga()))
			query += q.getParamWhere("targa");

		if(StringUtils.isNotBlank(request.getTipoTarga()))
			query += q.getParamWhere("tipoTarga");

		if(StringUtils.isNotBlank(request.getTipoBonifica()))
			query += q.getParamWhere("tipoBonifica");

		if(request.getDataA() != null && request.getDataDa() != null)
			query += q.getParamWhere("data");

		if(request.isSensaGiustificativi())
			query += q.getParamWhere("senza");
//		else
//			query += q.getParamWhere("con");

		 query += q.getOrderBy();

		return query;

	}

	protected void setPreparedStatement(TAURDEPreparedStatement stmt) throws java.sql.SQLException {
		int iPos = 1;

		if(StringUtils.isNotBlank(request.getEnte()))
			stmt.setLong(iPos++, Long.valueOf(request.getEnte()));

	    if(StringUtils.isNotBlank(request.getSportello()))
	    	stmt.setLong(iPos++, Long.valueOf(request.getSportello()));

		if(StringUtils.isNotBlank(request.getCassa()))
			stmt.setLong(iPos++, Long.valueOf(request.getCassa()));

		if(StringUtils.isNotBlank(request.getTarga()))
			stmt.setString(iPos++, request.getTarga());

		if(StringUtils.isNotBlank(request.getTipoTarga()))
			stmt.setLong(iPos++, Long.valueOf(request.getTipoTarga()));

		if(StringUtils.isNotBlank(request.getTipoBonifica()))
			stmt.setLong(iPos++, Long.valueOf(request.getTipoBonifica()));

		if(request.getDataA() != null && request.getDataDa() != null) {
			stmt.setDate(iPos++, request.getDataDa());
			stmt.setDate(iPos++, request.getDataA());
		}

	}
}
