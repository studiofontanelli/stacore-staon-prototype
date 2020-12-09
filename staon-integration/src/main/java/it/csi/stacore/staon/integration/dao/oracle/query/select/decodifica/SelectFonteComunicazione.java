package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.FonteComunicazione;
import it.csi.stacore.staon.bo.id.IdFonte;
import it.csi.stacore.staon.bo.id.IdFonteComunicazione;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectFonteComunicazione extends AbstractSelectDecodifica {
  //~ Constructors =============================================================

  /**
   * Creates a new SelectFonteComunicazione object.
   */
  public SelectFonteComunicazione() {
    super();
  }

  /**
   * Creates a new SelectFonteComunicazione object.
   *
   * @param codice DOCUMENT ME!
   */
  public SelectFonteComunicazione(String codice) {
    super(codice);
  }

  /**
   * Creates a new SelectFonteComunicazione object.
   *
   * @param id DOCUMENT ME!
   */
  public SelectFonteComunicazione(IdFonte id) {
    super(id);
  }

  //~ Methods ==================================================================

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSQLStatement() {
    return getSQLStatement("ID_FONTE_COMUNICAZIONE", "TAU_D_FONTE_COMUNICAZIONE");
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
    return new FonteComunicazione(
                     new IdFonteComunicazione(rs.getLong("id").longValue()),
                     rs.getString("codice"), rs.getString("descrizione")
                    );
  }
}
