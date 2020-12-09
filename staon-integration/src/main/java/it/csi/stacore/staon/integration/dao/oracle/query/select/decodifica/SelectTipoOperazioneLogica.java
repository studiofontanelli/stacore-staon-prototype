package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.TipoOperazioneLogica;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.bo.id.LongId;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectTipoOperazioneLogica extends AbstractSelectDecodifica {
  //~ Constructors =============================================================

  /**
   * Creates a new SelectTipoOperazioneLogica object.
   */
  public SelectTipoOperazioneLogica() {
    super();
  }

  /**
   * Creates a new SelectTipoOperazioneLogica object.
   *
   * @param codice DOCUMENT ME!
   */
  public SelectTipoOperazioneLogica(String codice) {
    super(codice);
  }

  /**
   * Creates a new SelectTipoOperazioneLogica object.
   *
   * @param id
   */
  public SelectTipoOperazioneLogica(LongId id) {
    super(id);
  }

  //~ Methods ==================================================================

  /**
   * ritorna l'sql
   *
   * @return
   */
  public String getSQLStatement() {
    return getSQLStatement("ID_TIPO_OPE_LOGICA", "TAU_D_TIPO_OPE_LOGICA");
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
    return new TipoOperazioneLogica(
                                    new IdDecodifica(rs.getLong("id").longValue()),
                                    rs.getString("codice"),
                                    rs.getString("descrizione")
                                   );
  }
}
