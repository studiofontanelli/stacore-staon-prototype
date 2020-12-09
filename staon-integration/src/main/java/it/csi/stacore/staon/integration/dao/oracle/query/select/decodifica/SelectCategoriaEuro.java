package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.CategoriaEuro;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectCategoriaEuro extends AbstractSelectDecodifica {
  //~ Constructors =============================================================

  /**
   * Creates a new SelectTipoUsoVeicolo object.
   */
  public SelectCategoriaEuro() {
    super();
  }

  /**
   * Creates a new SelectTipoUsoVeicolo object.
   *
   * @param codice DOCUMENT ME!
   */
  public SelectCategoriaEuro(String codice) {
    super(codice);
  }

  /**
   * Creates a new SelectTipoUsoVeicolo object.
   *
   * @param id DOCUMENT ME!
   */
  public SelectCategoriaEuro(IdDecodifica id) {
    super(id);
  }

  //~ Methods ==================================================================

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSQLStatement() {
    return getSQLStatement("ID_CAT_EURO", "TAU_D_CATEGORIA_EURO");
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
    return new CategoriaEuro(
                          new IdDecodifica(rs.getLong("id").longValue()),
                          rs.getString("codice"), rs.getString("descrizione")
                         );
  }
}
