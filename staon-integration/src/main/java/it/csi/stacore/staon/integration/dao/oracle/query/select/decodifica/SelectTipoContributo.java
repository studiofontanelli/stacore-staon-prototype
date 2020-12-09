package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.TipoContributo;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.bo.id.LongId;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectTipoContributo extends AbstractSelectDecodifica {
  //~ Constructors =============================================================

  /**
   * Creates a new SelectTipoContributo object.
   */
  public SelectTipoContributo() {
    super();
  }

  /**
   * Creates a new SelectTipoContributo object.
   *
   * @param codice DOCUMENT ME!
   */
  public SelectTipoContributo(String codice) {
    super(codice);
  }

  /**
   * Creates a new SelectTipoContributo object.
   *
   * @param id
   */
  public SelectTipoContributo(LongId id) {
    super(id);
  }

  //~ Methods ==================================================================

  /**
   * ritorna l'sql
   *
   * @return
   */
  public String getSQLStatement() {
    return getSQLStatement("ID_TIPO_CONTR", "TAU_D_TIPO_CONTRIBUTO");
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
    return new TipoContributo(
                              new IdDecodifica(rs.getLong("id").longValue()),
                              rs.getString("codice"),
                              rs.getString("descrizione")
                             );
  }
}
