package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.avvisi.segnalazione.MotivoSegnalazione;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.bo.id.LongId;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectMotivoSegnalazione extends AbstractSelectDecodificaIdDescrizione {
  //~ Constructors =============================================================

  public SelectMotivoSegnalazione() {
    super();
  }

  public SelectMotivoSegnalazione(LongId id) {
    super(id);
  }

  //~ Methods ==================================================================

  /**
   * ritorna l'sql
   *
   * @return
   */
  public String getSQLStatement() {
    return getSQLStatement("ID_MOTIVO_SEGNALAZIONE", "DESC_MOTIVO_SEGNALAZIONE","TAU_D_MOTIVO_SEGNALAZIONE");
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
    return new MotivoSegnalazione(
                           new IdDecodifica(rs.getLong("id").longValue()),
                           rs.getString("descrizione")
                          );
  }
}
