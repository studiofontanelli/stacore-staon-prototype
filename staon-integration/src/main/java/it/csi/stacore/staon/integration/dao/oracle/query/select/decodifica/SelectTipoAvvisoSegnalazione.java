package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.avvisi.segnalazione.TipoAvvisoSegnalazione;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.bo.id.LongId;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectTipoAvvisoSegnalazione extends AbstractSelectDecodificaIdDescrizione {
  //~ Constructors =============================================================

  public SelectTipoAvvisoSegnalazione() {
    super();
  }

  public SelectTipoAvvisoSegnalazione(LongId id) {
    super(id);
  }

  //~ Methods ==================================================================

  /**
   * ritorna l'sql
   *
   * @return
   */
  public String getSQLStatement() {
    return getSQLStatement("ID_TIPO_IRREG_ACCERTAMENTO", "DESC_TIPO_IRREG_ACCERTAMENTO", "TAU_D_TIPO_IRREG_ACCERTAMENTO");
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
    return new TipoAvvisoSegnalazione(
                           new IdDecodifica(rs.getLong("id").longValue()),
                           rs.getString("descrizione")
                          );
  }
}
