package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.avvisi.accertamento.CausaleChiusura;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.bo.id.LongId;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectCausaleChiusura extends AbstractSelectDecodifica {
  //~ Constructors =============================================================

  public SelectCausaleChiusura() {
    super();
  }

  public SelectCausaleChiusura(LongId id) {
    super(id);
  }

  //~ Methods ==================================================================

  /**
   * ritorna l'sql
   *
   * @return
   */
  public String getSQLStatement() {
    return getSQLStatement("ID_CAUSALE_CHIUSURA", "TAU_D_CAUSALE_CHIUSURA");
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
    return new CausaleChiusura(
                           new IdDecodifica(rs.getLong("id").longValue()),rs.getString("codice"),
                           rs.getString("descrizione")
                          );
  }
}
