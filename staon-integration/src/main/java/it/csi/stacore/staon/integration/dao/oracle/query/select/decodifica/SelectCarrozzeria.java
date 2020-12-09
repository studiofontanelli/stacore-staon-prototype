package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.Carrozzeria;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectCarrozzeria extends AbstractSelectDecodifica {
  //~ Constructors =============================================================

  /**
   * Creates a new SelectCarrozzeria object.
   */
  public SelectCarrozzeria() {
    super();
  }

  /**
   * Creates a new SelectCarrozzeria object.
   *
   * @param codice DOCUMENT ME!
   */
  public SelectCarrozzeria(String codice) {
    super(codice);
  }

  /**
   * Creates a new SelectCarrozzeria object.
   *
   * @param id DOCUMENT ME!
   */
  public SelectCarrozzeria(IdDecodifica id) {
    super(id);
  }

  //~ Methods ==================================================================

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSQLStatement() {
    return getSQLStatement(
                           "ID_TIPO_CARROZZERIA", "TAU_D_TIPOCARROZZERIAVEICOLO"
                          ) + ", ID_TIPO_CARROZZERIA";
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
    return new Carrozzeria(
                           new IdDecodifica(rs.getLong("id").longValue()),
                           rs.getString("codice"), rs.getString("descrizione")
                          );
  }
}
