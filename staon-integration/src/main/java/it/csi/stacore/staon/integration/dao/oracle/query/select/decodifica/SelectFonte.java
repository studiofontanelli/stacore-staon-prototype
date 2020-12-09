package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.Fonte;
import it.csi.stacore.staon.bo.id.IdFonte;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectFonte extends AbstractSelectDecodifica {
  //~ Constructors =============================================================

  /**
   * Creates a new SelectFonte object.
   */
  public SelectFonte() {
    super();
  }

  /**
   * Creates a new SelectFonte object.
   *
   * @param codice DOCUMENT ME!
   */
  public SelectFonte(String codice) {
    super(codice);
  }

  /**
   * Creates a new SelectFonte object.
   *
   * @param id DOCUMENT ME!
   */
  public SelectFonte(IdFonte id) {
    super(id);
  }

  //~ Methods ==================================================================

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSQLStatement() {
    return getSQLStatement("ID_FONTE", "TAU_D_FONTE");
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
    return new Fonte(
                     new IdFonte(rs.getLong("id").longValue()),
                     rs.getString("codice"), rs.getString("descrizione")
                    );
  }
}
