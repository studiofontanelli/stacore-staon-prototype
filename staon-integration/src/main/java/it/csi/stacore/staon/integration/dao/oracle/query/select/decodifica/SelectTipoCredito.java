package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.TipoCredito;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


public class SelectTipoCredito extends AbstractSelectDecodifica {

	public SelectTipoCredito() {
    super();
  }

  public SelectTipoCredito(String codice) {
    super(codice);
  }

  public SelectTipoCredito(IdDecodifica id) {
    super(id);
  }

    public String getSQLStatement() {
    return getSQLStatement("ID_TIPO_CREDITO", "TAU_D_TIPO_CREDITO");
  }

  public Object createBO(TAURDEResultSet rs) throws SQLException {
    return new TipoCredito(
                           new IdDecodifica(rs.getLong("id").longValue()),
                           rs.getString("codice"), rs.getString("descrizione")
                          );
  }
}
