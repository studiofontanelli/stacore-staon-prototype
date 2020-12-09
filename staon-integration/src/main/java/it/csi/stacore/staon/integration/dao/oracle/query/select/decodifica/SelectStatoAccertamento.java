package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.avvisi.scadenza.StatoAvvisoScadenza;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.bo.id.LongId;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectStatoAccertamento extends AbstractSelectDecodificaIdDescrizione {
  //~ Constructors =============================================================

  public SelectStatoAccertamento() {
    super();
  }

  public SelectStatoAccertamento(LongId id) {
    super(id);
  }

  //~ Methods ==================================================================

  /**
   * ritorna l'sql
   *
   * @return
   */
  public String getSQLStatement() {
    return getSQLStatement("ID_STATO_ACCERTAMENTO", "DESC_STATO_ACCERTAMENTO","TAU_D_STATO_ACCERTAMENTO");
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
    return new StatoAvvisoScadenza(
                           new IdDecodifica(rs.getLong("id").longValue()),
                           rs.getString("descrizione")
                          );
  }
}
