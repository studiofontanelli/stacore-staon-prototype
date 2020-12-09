package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.IdStatoComunicazione;
import it.csi.stacore.staon.bo.StatoComunicazione;
import it.csi.stacore.staon.bo.id.IdFonte;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectStatoComunicazione extends AbstractSelectDecodifica {
  //~ Constructors =============================================================

  /**
   * Creates a new SelectStatoComunicazione object.
   */
  public SelectStatoComunicazione() {
    super();
  }

  /**
   * Creates a new SelectStatoComunicazione object.
   *
   * @param codice DOCUMENT ME!
   */
  public SelectStatoComunicazione(String codice) {
    super(codice);
  }

  /**
   * Creates a new SelectStatoComunicazione object.
   *
   * @param id DOCUMENT ME!
   */
  public SelectStatoComunicazione(IdFonte id) {
    super(id);
  }

  //~ Methods ==================================================================

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSQLStatement() {
    return getSQLStatement("ID_STATO_COMUNICAZIONE", "TAU_D_STATO_COMUNICAZIONE");
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
    return new StatoComunicazione(
                     new IdStatoComunicazione(rs.getLong("id").longValue()),
                     rs.getString("codice"), rs.getString("descrizione")
                    );
  }
}

