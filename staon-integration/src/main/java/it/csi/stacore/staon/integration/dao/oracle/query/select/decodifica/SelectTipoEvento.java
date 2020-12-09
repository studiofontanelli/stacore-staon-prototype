package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.TipoEvento;
import it.csi.stacore.staon.bo.id.IdTipoEvento;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectTipoEvento extends AbstractSelectDecodifica {
  //~ Constructors =============================================================

  /**
   * Creates a new SelectTipoEvento object.
   */
  public SelectTipoEvento() {
    super();
  }

  /**
   * Creates a new SelectTipoEvento object.
   *
   * @param codice DOCUMENT ME!
   */
  public SelectTipoEvento(String codice) {
    super(codice);
  }

  /**
   * Creates a new SelectTipoEvento object.
   *
   * @param id DOCUMENT ME!
   */
  public SelectTipoEvento(IdTipoEvento id) {
    super(id);
  }

  //~ Methods ==================================================================

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSQLStatement() {
    return getSQLStatement("ID_TIPO_EVENTO", "TAU_D_TIPOEVENTO");
  }

  /**
   * DOCUMENT ME!
   *
   * @param rs DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws SQLException DOCUMENT ME!
   */
  public Object createBO(TAURDEResultSet rs) throws SQLException {
    return new TipoEvento(
                          new IdTipoEvento(rs.getLong("id").longValue()),
                          rs.getString("codice"), rs.getString("descrizione")
                         );
  }
}
