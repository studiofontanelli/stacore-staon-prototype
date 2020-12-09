package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.TipoOperazioneBonificaIR;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.bo.id.LongId;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectTipoOperazioneBonIr extends AbstractSelectDecodifica {
  //~ Constructors =============================================================

  public SelectTipoOperazioneBonIr() {
    super();
  }

  public SelectTipoOperazioneBonIr(LongId id) {
    super(id);
  }

  //~ Methods ==================================================================

  /**
   * ritorna l'sql
   *
   * @return
   */
  public String getSQLStatement() {
    return getSQLStatement("ID_TIPO_OPERAZIONE_BON_IR","TAU_D_TIPO_OPERAZIONE_BON_IR");
  }

  /**
   * restituisce il BO
   *
   * @param rs
   *
   * @return
   *
   * @throws SQLException
   */
    public Object createBO(TAURDEResultSet rs) throws SQLException {
    	return new TipoOperazioneBonificaIR(new IdDecodifica(rs.getLong("id").longValue()),rs.getString("codice"), rs.getString("descrizione"));
	}

}
