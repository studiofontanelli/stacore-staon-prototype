package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.TipoIntermediario;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.bo.id.LongId;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectTipoIntermediario extends AbstractSelectDecodifica {
  //~ Constructors =============================================================

  /**
   * Creates a new SelectTipoIntermediario object.
   */
  public SelectTipoIntermediario() {
    super();
  }

  /**
   * Creates a new SelectTipoIntermediario object.
   *
   * @param codice DOCUMENT ME!
   */
  public SelectTipoIntermediario(String codice) {
    super(codice);
  }

  /**
   * Creates a new SelectTipoIntermediario object.
   *
   * @param id
   */
  public SelectTipoIntermediario(LongId id) {
    super(id);
  }

  //~ Methods ==================================================================

  /**
   * ritorna l'sql
   *
   * @return
   */
  public String getSQLStatement() {
    return getSQLStatement("ID_TIPO_INTERMEDIARIO", "TAU_D_TIPO_INTERMEDIARIO");
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
    return new TipoIntermediario(
                                 new IdDecodifica(rs.getLong("id").longValue()),
                                 rs.getString("codice"),
                                 rs.getString("descrizione")
                                );
  }
}
