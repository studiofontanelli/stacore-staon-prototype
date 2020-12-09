package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.TipoCalcolo;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.bo.id.LongId;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectTipoCalcolo extends AbstractSelectDecodifica {
  //~ Constructors =============================================================

  /**
   * Creates a new SelectTipoCalcolo object.
   */
  public SelectTipoCalcolo() {
    super();
  }

  /**
   * Creates a new SelectTipoCalcolo object.
   *
   * @param codice DOCUMENT ME!
   */
  public SelectTipoCalcolo(String codice) {
    super(codice);
  }

  /**
   * Creates a new SelectTipoCalcolo object.
   *
   * @param id
   */
  public SelectTipoCalcolo(LongId id) {
    super(id);
  }

  //~ Methods ==================================================================

  /**
   * ritorna l'sql
   *
   * @return
   */
  public String getSQLStatement() {
    return getSQLStatement("ID_TIPO_CALCOLO", "TAU_D_TIPO_CALCOLO");
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
    return new TipoCalcolo(
                           new IdDecodifica(rs.getLong("id").longValue()),
                           rs.getString("codice"), rs.getString("descrizione")
                          );
  }
}
