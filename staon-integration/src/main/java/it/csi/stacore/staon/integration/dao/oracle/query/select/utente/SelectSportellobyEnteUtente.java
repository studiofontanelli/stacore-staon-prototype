package it.csi.stacore.staon.integration.dao.oracle.query.select.utente;

import java.sql.SQLException;
import java.util.List;

import it.csi.stacore.staon.bo.utente.Ente;
import it.csi.stacore.staon.bo.utente.Sportello;
import it.csi.stacore.staon.bo.utente.Utente;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEPreparedStatement;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;
import it.csi.stacore.staon.integration.dao.oracle.query.select.AbstractSelect;
import it.csi.stacore.staon.integration.exception.InvalidSearchObjectException;

public class SelectSportellobyEnteUtente extends AbstractSelect {

	/**
	 * @uml.property name="sportelloList" multiplicity="(0 -1)"
	 */
	private List sportelloList;

	/**
	 * @uml.property name="ente"
	 * @uml.associationEnd multiplicity="(1 1)"
	 */
	private Ente ente;
	/**
	 * @uml.property name="utente"
	 * @uml.associationEnd multiplicity="(1 1)"
	 */
	private Utente utente;

	public SelectSportellobyEnteUtente(Ente ente, Utente utente) {
		this.ente = ente;
		this.utente = utente;
	}

	public Object createBO(TAURDEResultSet rs) throws SQLException {

		return new Sportello(rs.getLong("ID_SPORTELLO"), rs.getLong("ID_ENTE"),
				rs.getString("EMAIL"), rs.getString("INDIRIZZO"),
				rs.getString("CIVICO"), rs.getInteger("CAP"),
				rs.getString("COMUNE"), rs.getString("PROVINCIA"),
				rs.getString("CODICE"), rs.getString("DESCRIZIONE"));
	}

	public String getSQLStatement() throws InvalidSearchObjectException {



		StringBuffer str = new StringBuffer("SELECT ");
		str.append("ID_SPORTELLO, ");
		str.append("S.ID_ENTE, ");
		str.append("S.EMAIL,  ");
		str.append("S.INDIRIZZO, ");
		str.append("S.CIVICO, ");
		str.append("S.CAP, ");
		str.append("S.COMUNE,  ");
		str.append("S.PROVINCIA,  ");
		str.append("S.CODICE,  ");
		str.append("S.DESCRIZIONE ");
		str.append("FROM TAU_T_SPORTELLO S, ");
		str.append("TAU_T_UTENTE U ");
		str.append("WHERE S.ID_ENTE=U.ID_ENTE ");
		str.append("AND S.ID_ENTE = " + ente.getId().getId() + " ");
		str.append("AND U.IDENTIFICATIVO_UTENTE = '" + utente.getIdUtente()
				+ "'");
		//TODO
		// da Verificare

		return str.toString();
	}

	public void setPreparedStatement(TAURDEPreparedStatement stmt)
			throws SQLException {

	}
}
