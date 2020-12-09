package it.csi.stacore.staon.integration.dao.oracle.query.select.documentazionebonifiche;

import java.sql.SQLException;

import org.apache.commons.lang3.StringUtils;

import it.csi.stacore.staon.bo.ReportBonificheRequest;
import it.csi.stacore.staon.bo.documentazionebonifiche.Report;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEPreparedStatement;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;
import it.csi.stacore.staon.integration.dao.oracle.query.select.AbstractSelect;
import it.csi.stacore.staon.integration.exception.InvalidSearchObjectException;

public class SelectRicercaReportBonifiche extends AbstractSelect{

	private ReportBonificheRequest request;
	private boolean senza = false;

	public SelectRicercaReportBonifiche(ReportBonificheRequest request) {
		super();
		this.request = request;
		//this.senza = request.isSenza();
	}

	public Object createBO(TAURDEResultSet rs) throws SQLException {
		Report report = null;

		String sportello = null;
		if(rs.getString("CODMCTC")!=null && !rs.getString("CODMCTC").equals("")){
			sportello = rs.getString("CODMCTC");
		}
		else{
			sportello = rs.getString("SPORTELLO");
		}


//		if (senza)
//			report = new Report(rs.getString("ENTE"), rs.getString("CASSA"), rs.getString("SPORTELLO"), rs.getString("TIPO_BONIFICA"), rs.getInteger("GIUSTIFICATIVO"), new Integer(0));
//		else
//			report = new Report(rs.getString("ENTE"), rs.getString("CASSA"), rs.getString("SPORTELLO"), rs.getString("tipo_bonifica"),  new Integer(0), rs.getInteger("GIUSTIFICATIVO"));
//
		report = new Report(rs.getString("ENTE"),
				rs.getString("CASSA"),
				sportello,
				rs.getString("TIPO_BONIFICA"),
				rs.getInteger("BONIFICHE_SENZA"),
				rs.getInteger("BONIFICHE_CON"));


		//report.setAgenzia(rs.getString("CODMCTC"));
		report.setUtente(rs.getString("IDENTIFICATIVO_UTENTE"));
		report.setTotale(rs.getInteger("TOTALE"));

		return report;
	}

	public String getSQLStatement() throws InvalidSearchObjectException {
//		OracleQuery q = OracleQueryList.getInstance().getQuery(getClass().getName());
//		String query = q.getBody();
//		query += q.getFrom();
//		query += q.getWhere();


//		if(StringUtils.isNotBlank(request.getEnte()))
//			query += q.getParamWhere("ente");
//
//		if(StringUtils.isNotBlank(request.getSportello()))
//			query += q.getParamWhere("idSportello");
//
//		if(StringUtils.isNotBlank(request.getCassa()))
//			query += q.getParamWhere("idCassa");
//
//		if(senza)
//			query += q.getParamWhere("senza");
//		else
//			query += q.getParamWhere("con");
//
//		 query += q.getOrderBy();

		StringBuffer query = new StringBuffer();
		query.append("SELECT ENTE, SPORTELLO, CASSA, TIPO_BONIFICA, SUM (BONIFICHE_ALL) TOTALE, SUM (BONIFICHE_CON) BONIFICHE_CON,"
				+ "SUM (BONIFICHE_SENZA) BONIFICHE_SENZA,CODMCTC,IDENTIFICATIVO_UTENTE FROM ("
				+ "SELECT E.DESCRIZIONE AS ENTE,S.DESCRIZIONE AS SPORTELLO, C.DESCRIZIONE AS CASSA,"
				+ " T.DESCRIZIONE AS TIPO_BONIFICA,COUNT(distinct b.id_bonifica) AS BONIFICHE_ALL,"
				+ " 0 BONIFICHE_CON,0 BONIFICHE_SENZA,AG.CODMCTC, OL.IDENTIFICATIVO_UTENTE "
				+ "FROM TAU_T_BONIFICA B "
				+ "LEFT JOIN TAU_T_ALLEGATO_BONIFICA A ON A.ID_BONIFICA = B.ID_BONIFICA "
				+ "JOIN TAU_T_ENTE E ON B.ID_ENTE = E.ID_ENTE "
				+ "JOIN TAU_T_SPORTELLO S ON S.ID_SPORTELLO = B.ID_SPORTELLO "
				+ "JOIN TAU_T_CASSA C ON C.ID_CASSA = B.ID_CASSA "
				+ "JOIN TAU_D_TIPO_OPE_LOGICA T ON T.ID_TIPO_OPE_LOGICA = B.ID_TIPO_OPE_LOGICA "
				+ "LEFT OUTER JOIN GIN_T_AGENZIA AG ON AG.ID_SPORTELLO = S.ID_SPORTELLO "
				+ "JOIN TAU_T_OPERAZIONE O ON O.ID_OPERAZIONE = B.ID_OPERAZIONE "
				+ "JOIN TAU_T_OPERAZIONE_LOGICA OL ON OL.ID_OPE_LOGICA = O.ID_OPE_LOGICA "
				+ "WHERE TRUNC(B.DATA_OPERAZIONE) BETWEEN ? AND ? ");

		if(StringUtils.isNotBlank(request.getEnte()))
			query.append("AND B.ID_ENTE = ? ");

		if(StringUtils.isNotBlank(request.getSportello()))
			query.append("AND B.ID_SPORTELLO = ? ");

		if(StringUtils.isNotBlank(request.getCassa()))
			query.append("AND B.ID_CASSA = ? ");

		query.append("GROUP BY E.DESCRIZIONE, S.DESCRIZIONE, C.DESCRIZIONE, T.DESCRIZIONE, AG.CODMCTC, OL.IDENTIFICATIVO_UTENTE "
				+ "UNION ALL "
				+ "SELECT E.DESCRIZIONE AS ENTE,S.DESCRIZIONE AS SPORTELLO, C.DESCRIZIONE AS CASSA,"
				+ " T.DESCRIZIONE AS TIPO_BONIFICA,0 AS BONIFICHE_ALL,"
				+ " COUNT(distinct b.id_bonifica) BONIFICHE_CON,0 BONIFICHE_SENZA,AG.CODMCTC, OL.IDENTIFICATIVO_UTENTE "
				+ "FROM TAU_T_BONIFICA B "
				+ "LEFT JOIN TAU_T_ALLEGATO_BONIFICA A ON A.ID_BONIFICA = B.ID_BONIFICA "
				+ "JOIN TAU_T_ENTE E ON B.ID_ENTE = E.ID_ENTE "
				+ "JOIN TAU_T_SPORTELLO S ON S.ID_SPORTELLO = B.ID_SPORTELLO "
				+ "JOIN TAU_T_CASSA C ON C.ID_CASSA = B.ID_CASSA "
				+ "JOIN TAU_D_TIPO_OPE_LOGICA T ON T.ID_TIPO_OPE_LOGICA = B.ID_TIPO_OPE_LOGICA "
				+ "LEFT OUTER JOIN GIN_T_AGENZIA AG ON AG.ID_SPORTELLO = S.ID_SPORTELLO "
				+ "JOIN TAU_T_OPERAZIONE O ON O.ID_OPERAZIONE = B.ID_OPERAZIONE "
				+ "JOIN TAU_T_OPERAZIONE_LOGICA OL ON OL.ID_OPE_LOGICA = O.ID_OPE_LOGICA "
				+ "WHERE TRUNC(B.DATA_OPERAZIONE) BETWEEN ? AND ? ");

		if(StringUtils.isNotBlank(request.getEnte()))
			query.append("AND B.ID_ENTE = ? ");

		if(StringUtils.isNotBlank(request.getSportello()))
			query.append("AND B.ID_SPORTELLO = ? ");

		if(StringUtils.isNotBlank(request.getCassa()))
			query.append("AND B.ID_CASSA = ? ");

		query.append("AND A.ID_ALLEGATO_BONIFICA IS NOT NULL "
				+ "GROUP BY E.DESCRIZIONE, S.DESCRIZIONE, C.DESCRIZIONE, T.DESCRIZIONE, AG.CODMCTC, OL.IDENTIFICATIVO_UTENTE "
				+ "UNION ALL "
				+ "SELECT E.DESCRIZIONE AS ENTE,S.DESCRIZIONE AS SPORTELLO, C.DESCRIZIONE AS CASSA,"
				+ " T.DESCRIZIONE AS TIPO_BONIFICA,0 AS BONIFICHE_ALL,"
				+ " 0 BONIFICHE_CON, COUNT(distinct b.id_bonifica) BONIFICHE_SENZA,AG.CODMCTC, OL.IDENTIFICATIVO_UTENTE "
				+ "FROM TAU_T_BONIFICA B "
				+ "LEFT JOIN TAU_T_ALLEGATO_BONIFICA A ON A.ID_BONIFICA = B.ID_BONIFICA "
				+ "JOIN TAU_T_ENTE E ON B.ID_ENTE = E.ID_ENTE "
				+ "JOIN TAU_T_SPORTELLO S ON S.ID_SPORTELLO = B.ID_SPORTELLO "
				+ "JOIN TAU_T_CASSA C ON C.ID_CASSA = B.ID_CASSA "
				+ "JOIN TAU_D_TIPO_OPE_LOGICA T ON T.ID_TIPO_OPE_LOGICA = B.ID_TIPO_OPE_LOGICA "
				+ "LEFT OUTER JOIN GIN_T_AGENZIA AG ON AG.ID_SPORTELLO = S.ID_SPORTELLO "
				+ "JOIN TAU_T_OPERAZIONE O ON O.ID_OPERAZIONE = B.ID_OPERAZIONE "
				+ "JOIN TAU_T_OPERAZIONE_LOGICA OL ON OL.ID_OPE_LOGICA = O.ID_OPE_LOGICA "
				+ "WHERE TRUNC(B.DATA_OPERAZIONE) BETWEEN ? AND ? ");


		if(StringUtils.isNotBlank(request.getEnte()))
			query.append("AND B.ID_ENTE = ? ");

		if(StringUtils.isNotBlank(request.getSportello()))
			query.append("AND B.ID_SPORTELLO = ? ");

		if(StringUtils.isNotBlank(request.getCassa()))
			query.append("AND B.ID_CASSA = ? ");

		query.append("and A.ID_ALLEGATO_BONIFICA IS NULL "
				+ "GROUP BY E.DESCRIZIONE, S.DESCRIZIONE, C.DESCRIZIONE, T.DESCRIZIONE, AG.CODMCTC, OL.IDENTIFICATIVO_UTENTE )"
				+ "GROUP BY ENTE, SPORTELLO, CASSA, TIPO_BONIFICA, CODMCTC, IDENTIFICATIVO_UTENTE "
				+ "order by ENTE, SPORTELLO, CASSA, TIPO_BONIFICA ");

		return query.toString();

	}

	protected void setPreparedStatement(TAURDEPreparedStatement stmt) throws java.sql.SQLException {
		int iPos = 1;



		stmt.setDate(iPos++, request.getDataDa());
		stmt.setDate(iPos++, request.getDataA());

		if(StringUtils.isNotBlank(request.getEnte())){
			stmt.setLong(iPos++, Long.valueOf(request.getEnte()));
		}


	    if(StringUtils.isNotBlank(request.getSportello())){
	    	stmt.setLong(iPos++, Long.valueOf(request.getSportello()));
	    }


		if(StringUtils.isNotBlank(request.getCassa())){
			stmt.setLong(iPos++, Long.valueOf(request.getCassa()));
		}

		stmt.setDate(iPos++, request.getDataDa());
		stmt.setDate(iPos++, request.getDataA());

		if(StringUtils.isNotBlank(request.getEnte())){
			stmt.setLong(iPos++, Long.valueOf(request.getEnte()));
		}


	    if(StringUtils.isNotBlank(request.getSportello())){
	    	stmt.setLong(iPos++, Long.valueOf(request.getSportello()));
	    }


		if(StringUtils.isNotBlank(request.getCassa())){
			stmt.setLong(iPos++, Long.valueOf(request.getCassa()));
		}

		stmt.setDate(iPos++, request.getDataDa());
		stmt.setDate(iPos++, request.getDataA());

		if(StringUtils.isNotBlank(request.getEnte())){
			stmt.setLong(iPos++, Long.valueOf(request.getEnte()));
		}


	    if(StringUtils.isNotBlank(request.getSportello())){
	    	stmt.setLong(iPos++, Long.valueOf(request.getSportello()));
	    }


		if(StringUtils.isNotBlank(request.getCassa())){
			stmt.setLong(iPos++, Long.valueOf(request.getCassa()));
		}





	}

}
