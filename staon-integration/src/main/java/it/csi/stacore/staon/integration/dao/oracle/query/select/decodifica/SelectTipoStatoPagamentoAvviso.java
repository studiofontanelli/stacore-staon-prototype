package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.TipoCredito;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


public class SelectTipoStatoPagamentoAvviso extends AbstractSelectDecodifica {

	public SelectTipoStatoPagamentoAvviso() {
    super();
  }

  public SelectTipoStatoPagamentoAvviso(String codice) {
    super(codice);
  }

  public SelectTipoStatoPagamentoAvviso(IdDecodifica id) {
    super(id);
  }

    public String getSQLStatement() {
    return getSQLStatement("ID_STATO_PAGAMENTO_AVVISO", "TAU_D_STATO_PAGAMENTO_AVVISO");
  }

  public Object createBO(TAURDEResultSet rs) throws SQLException {
    return new TipoCredito(
                           new IdDecodifica(rs.getLong("id").longValue()),
                           rs.getString("codice"), rs.getString("descrizione")
                          );
  }
}
