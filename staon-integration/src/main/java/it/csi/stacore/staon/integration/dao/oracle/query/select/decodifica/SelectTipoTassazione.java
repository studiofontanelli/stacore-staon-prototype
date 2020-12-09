package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.avvisi.accertamento.TipoTassazione;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.bo.id.LongId;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectTipoTassazione extends AbstractSelectDecodifica {
  //~ Constructors =============================================================

  public SelectTipoTassazione() {
    super();
  }

  public SelectTipoTassazione(LongId id) {
    super(id);
  }

  //~ Methods ==================================================================

  /**
   * ritorna l'sql
   *
   * @return
   */
  public String getSQLStatement() {
    return getSQLStatement("ID_TIPO_TASSAZIONE", "TAU_D_TIPO_TASSAZIONE");
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
    return new TipoTassazione(
                           new IdDecodifica(rs.getLong("id").longValue()),
                           rs.getString("codice"),
                           rs.getString("descrizione")
                          );
  }
}
