/*
 * Created on 25-lug-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package it.csi.stacore.staon.integration.dao.oracle.query.select.utente;


import java.sql.SQLException;

import it.csi.stacore.staon.bo.utente.Cassa;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEPreparedStatement;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;
import it.csi.stacore.staon.integration.dao.oracle.query.select.AbstractSelect;
/**
 * @author fguglielmelli
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class SelectUtentiCasseDaSportello extends AbstractSelect {
	/**
	 * @uml.property  name="sportelloList"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="it.csi.stacore.staon.business.bo.utente.Sportello"
	 */
	private Long idSportello;

	/**
	 * Costruisce una select per recuperare tutte le casse collegate agli sportelli
	 * @param sportelloList Lista di sportelli ognuno dei quali ha l'idSportello valorizzato
	 */
	public SelectUtentiCasseDaSportello(Long idSportello) {
		this.idSportello = idSportello;
	}

	public Object createBO(TAURDEResultSet rs) throws SQLException {
		Cassa cassa=new Cassa(
				rs.getLong("ID_CASSA"),
				rs.getString("DENOMINAZIONE"),
				rs.getString("CODICE"),
				rs.getString("DESCRIZIONE"),
				idSportello
				);
		cassa.setIdUtente(rs.getString("IDENTIFICATIVO_UTENTE"));
		return cassa;
	}

//	public String getSQLStatement() throws InvalidSearchObjectException {
//		String query="SELECT ID_CASSA, DENOMINAZIONE, CODICE, DESCRIZIONE, ID_SPORTELLO " +
//				     "FROM TAU_T_CASSA ";
//		String orderBy=" ORDER BY ID_SPORTELLO ";
//
//		String inClause="";
//		for (Iterator iter = sportelloList.iterator(); iter.hasNext();) {
//			Sportello sportello = (Sportello) iter.next();
//
//			long idSportello = sportello.getId().getId();
//
//			if (inClause.length()==0)
//				inClause+=idSportello;
//			else
//				inClause+=", "+idSportello;
//		}
//		if (inClause.length()!=0)
//			query+="WHERE ID_SPORTELLO IN ("+inClause+")";
//
//		query+=orderBy;
//		return query;
//
//	}

	public void setPreparedStatement(TAURDEPreparedStatement stmt)
			throws SQLException {
		stmt.setLong(1, idSportello);
	}
}
