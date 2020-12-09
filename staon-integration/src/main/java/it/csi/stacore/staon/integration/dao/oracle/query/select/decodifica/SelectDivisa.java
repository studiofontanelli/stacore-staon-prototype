package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.Divisa;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectDivisa extends AbstractSelectDecodifica {
  //~ Constructors =============================================================

  /**
   * Creates a new SelectDivisa object.
   */
  public SelectDivisa() {
    super();
  }

  /**
   * Creates a new SelectDivisa object.
   *
   * @param id DOCUMENT ME!
   */
  public SelectDivisa(IdDecodifica id) {
    super(id);
  }

  /**
   * Creates a new SelectDivisa object.
   *
   * @param codice DOCUMENT ME!
   */
  public SelectDivisa(String codice) {
    super(codice);
  }

  //~ Methods ==================================================================

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSQLStatement() {
    return getSQLStatement("ID_DIVISA", "TAU_D_DIVISA");
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
    return new Divisa(
                      new IdDecodifica(rs.getLong("id").longValue()),
                      rs.getString("codice"), rs.getString("descrizione")
                     );
  }
}
