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
public class SelectStatoAvvisoScadenza extends AbstractSelectDecodificaIdDescrizione {
  //~ Constructors =============================================================

  public SelectStatoAvvisoScadenza() {
    super();
  }

  public SelectStatoAvvisoScadenza(LongId id) {
    super(id);
  }

  //~ Methods ==================================================================

  /**
   * ritorna l'sql
   *
   * @return
   */
  public String getSQLStatement() {
    return getSQLStatement("ID_STATO_AVVISO", "DESC_AVVISO","TAU_D_STATO_AVVISO");
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
