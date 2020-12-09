package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;
import java.util.Date;

import it.csi.stacore.staon.bo.avvisi.accertamento.CausaleSospensione;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;

public class SelectCausaleSospensione extends AbstractSelectDecodificaDatata {

	public SelectCausaleSospensione(Date data) {
		super(data);
	}

	public SelectCausaleSospensione(String codice, Date data) {
		super(codice, data);
	}

	public SelectCausaleSospensione(IdDecodifica id, Date data) {
		super(id, data);
	}

	public String getSQLStatement() {
		return getSQLStatement("ID_CAUSALE_SOSPENSIONE",
				"TAU_D_CAUSALE_SOSPENSIONE");
	}

	public Object createBO(TAURDEResultSet rs) throws SQLException {
		return new CausaleSospensione(new IdDecodifica(rs.getLong("ID")
				.longValue()), rs.getString("CODICE"),
				rs.getString("DESCRIZIONE"), rs.getDate("DT_INIZIO"),
				rs.getDate("DT_FINE"));
	}

}