package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.UsoVeicolo;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectTipoUsoVeicolo extends AbstractSelectDecodifica {
  //~ Constructors =============================================================

  /**
   * Creates a new SelectTipoUsoVeicolo object.
   */
  public SelectTipoUsoVeicolo() {
    super();
  }

  /**
   * Creates a new SelectTipoUsoVeicolo object.
   *
   * @param codice DOCUMENT ME!
   */
  public SelectTipoUsoVeicolo(String codice) {
    super(codice);
  }

  /**
   * Creates a new SelectTipoUsoVeicolo object.
   *
   * @param id DOCUMENT ME!
   */
  public SelectTipoUsoVeicolo(IdDecodifica id) {
    super(id);
  }

  //~ Methods ==================================================================

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSQLStatement() {
    return getSQLStatement("ID_TIPO_USO", "TAU_D_TIPOUSOVEICOLO");
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
    return new UsoVeicolo(
                          new IdDecodifica(rs.getLong("id").longValue()),
                          rs.getString("codice"), rs.getString("descrizione")
                         );
  }
}
