package it.csi.stacore.staon.integration.dao.oracle.query.select.agevolazione;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEPreparedStatement;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;
import it.csi.stacore.staon.integration.dao.oracle.query.select.AbstractSelect;
import it.csi.stacore.staon.integration.exception.InvalidSearchObjectException;

public class SelectVerificaPresenzaAgevolazioneVeicoliStorici extends AbstractSelect {

	private final String targa;
	private final long idTipoVeicolo;

	private final Date ugupVerifica;


	public SelectVerificaPresenzaAgevolazioneVeicoliStorici(String targa,
			long idTipoVeicolo, Date ugupVerifica) {
		super();
		this.targa = targa;
		this.idTipoVeicolo = idTipoVeicolo;

		this.ugupVerifica = ugupVerifica;


	}

	public String getSQLStatement() throws InvalidSearchObjectException {
		return super.getSQLStatement();
	}

	protected void setPreparedStatement(TAURDEPreparedStatement stmt)
			throws SQLException {
		int iPos = 1;
		//java.sql.Date sqlDate = new java.sql.Date(ugupVerifica.getTime());
		java.util.Calendar cal = Calendar.getInstance();
		cal.setTime(ugupVerifica);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);

		java.sql.Date sqlDate = new java.sql.Date(cal.getTime().getTime()); // your sql date
		String tmp = sqlDate.toString();

		stmt.setString(iPos++, targa);
		stmt.setLong(iPos++, idTipoVeicolo);
		//stmt.setDate(iPos++, sqlDate); // data inizio
		//stmt.setDate(iPos++, sqlDate); // data fine
		stmt.setString(iPos++, tmp); // data inizio
		stmt.setString(iPos++, tmp); // data fine1
		stmt.setString(iPos++, tmp); // data fine2


	}

	public Object createBO(TAURDEResultSet rs) throws SQLException {
		return Boolean.TRUE;
	}
}
