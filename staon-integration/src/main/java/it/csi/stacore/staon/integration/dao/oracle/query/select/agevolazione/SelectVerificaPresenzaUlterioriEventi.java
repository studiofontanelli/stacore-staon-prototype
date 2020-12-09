package it.csi.stacore.staon.integration.dao.oracle.query.select.agevolazione;

import java.sql.SQLException;
import java.util.Date;

import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEPreparedStatement;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;
import it.csi.stacore.staon.integration.dao.oracle.query.select.AbstractSelect;
import it.csi.stacore.staon.integration.exception.InvalidSearchObjectException;

public class SelectVerificaPresenzaUlterioriEventi extends AbstractSelect {

	private final String targa;
	private final long idTipoVeicolo;
	private final Date ugup;
	private final Integer scadenza;

	public SelectVerificaPresenzaUlterioriEventi(String targa,
			long idTipoVeicolo, Date ugup, Integer scadenza) {
		super();
		this.targa = targa;
		this.idTipoVeicolo = idTipoVeicolo;
		this.ugup = ugup;
		this.scadenza = scadenza;
	}

	public String getSQLStatement() throws InvalidSearchObjectException {
		return super.getSQLStatement();
	}

	protected void setPreparedStatement(TAURDEPreparedStatement stmt)
			throws SQLException {
		int iPos = 1;
		stmt.setString(iPos++, targa);
		stmt.setLong(iPos++, idTipoVeicolo);
		stmt.setDate(iPos++, ugup);
		stmt.setInt(iPos++, scadenza);
		stmt.setString(iPos++, targa);
		stmt.setLong(iPos++, idTipoVeicolo);
		stmt.setDate(iPos++, ugup);
		stmt.setInt(iPos++, scadenza);
	}

	public Object createBO(TAURDEResultSet rs) throws SQLException {
		return Boolean.TRUE;
	}
}
