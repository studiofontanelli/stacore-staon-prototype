package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.StatoLavorazione;
import it.csi.stacore.staon.bo.id.IdStatoLavorazione;
import it.csi.stacore.staon.bo.id.IdTipoComunicazContrib;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEPreparedStatement;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;
import it.csi.stacore.staon.integration.dao.oracle.query.select.AbstractSelect;
import it.csi.stacore.staon.integration.exception.InvalidSearchObjectException;

public class SelectStatiLavorazioneByIdStatoAttuale extends AbstractSelect {


	private long idStatoLavorazioneAttuale;
	private long idTipoComunicazContrib;

	public SelectStatiLavorazioneByIdStatoAttuale(IdStatoLavorazione idStatoLavorazioneAttuale, IdTipoComunicazContrib idTipoComunicazContrib) {
		this.idStatoLavorazioneAttuale = idStatoLavorazioneAttuale.getId();
		this.idTipoComunicazContrib = idTipoComunicazContrib.getId();
	}

	public Object createBO(TAURDEResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		return new StatoLavorazione(
				new IdStatoLavorazione(rs.getLong("id_stato_lavorazione").longValue()),
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
		stmt.setLong(2, idStatoLavorazioneAttuale);
	}

}
