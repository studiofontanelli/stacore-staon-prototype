package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.IdStatoComunicazione;
import it.csi.stacore.staon.bo.StatoComunicazione;
import it.csi.stacore.staon.bo.id.IdStatoLavorazione;
import it.csi.stacore.staon.bo.id.IdTipoComunicazContrib;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEPreparedStatement;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;
import it.csi.stacore.staon.integration.dao.oracle.query.select.AbstractSelect;
import it.csi.stacore.staon.integration.exception.InvalidSearchObjectException;

public class SelectStatoComunicazioneByStatoLav extends AbstractSelect {

	private long idStatoLavorazione;
	private long idStatoLavorazionePrecedente;
	private long idTipoComunicazContrib;

	public SelectStatoComunicazioneByStatoLav(IdStatoLavorazione idStatoLavorazione, IdStatoLavorazione idStatoLavPrecedente, IdTipoComunicazContrib idTipoComunicazContrib) {
		this.idStatoLavorazione = idStatoLavorazione.getId();
		this.idStatoLavorazionePrecedente = idStatoLavPrecedente.getId();
		this.idTipoComunicazContrib = idTipoComunicazContrib.getId();
	}

	public Object createBO(TAURDEResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		return new StatoComunicazione(
				new IdStatoComunicazione(rs.getLong("id_stato_comunicazione").longValue()),
				rs.getString("codice"), rs.getString("descrizione")
				);
	}

	public String getSQLStatement() throws InvalidSearchObjectException {
		return super.getSQLStatement();
	}

	protected void setPreparedStatement(TAURDEPreparedStatement stmt)
			throws SQLException {
		// TODO Auto-generated method stub
		stmt.setLong(1, idTipoComunicazContrib);
		stmt.setLong(2, idStatoLavorazionePrecedente);
		stmt.setLong(3, idStatoLavorazione);
	}
}
