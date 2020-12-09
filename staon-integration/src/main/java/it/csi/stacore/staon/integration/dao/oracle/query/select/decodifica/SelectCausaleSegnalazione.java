package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.avvisi.segnalazione.CausaleSegnalazione;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.bo.id.LongId;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectCausaleSegnalazione extends AbstractSelectDecodificaIdDescrizione {
  //~ Constructors =============================================================

  public SelectCausaleSegnalazione() {
    super();
  }

  public SelectCausaleSegnalazione(LongId id) {
    super(id);
  }

  //~ Methods ==================================================================

  /**
   * ritorna l'sql
   *
   * @return
   */
  public String getSQLStatement() {
    return getSQLStatement("ID_CAUSALE_SEGNALAZIONE", "DESCRIZIONE","TAU_D_CAUSALE_SEGNALAZIONE");
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
    return new CausaleSegnalazione(
                           new IdDecodifica(rs.getLong("id").longValue()),
                           rs.getString("descrizione")
                          );
  }
}
