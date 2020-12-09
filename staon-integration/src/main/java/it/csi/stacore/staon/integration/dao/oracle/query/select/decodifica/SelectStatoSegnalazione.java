package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.avvisi.segnalazione.StatoSegnalazione;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.bo.id.LongId;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectStatoSegnalazione extends AbstractSelectDecodificaIdDescrizione {
  //~ Constructors =============================================================

  public SelectStatoSegnalazione() {
    super();
  }

  public SelectStatoSegnalazione(LongId id) {
    super(id);
  }

  //~ Methods ==================================================================

  /**
   * ritorna l'sql
   *
   * @return
   */
  public String getSQLStatement() {
    return getSQLStatement("ID_STATO_SEGNALAZIONE", "DESC_SEGNALAZIONE","TAU_D_STATO_SEGNALAZIONE");
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
    return new StatoSegnalazione(
                           new IdDecodifica(rs.getLong("id").longValue()),
                           rs.getString("descrizione")
                          );
  }
}
