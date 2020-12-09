package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.TipoCalcoloRimorchiabilita;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.bo.id.LongId;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectTipoCalcoloRimorchiabilita extends AbstractSelectDecodifica {
  //~ Constructors =============================================================

  /**
   * Creates a new SelectTipoCalcoloRimorchiabilita object.
   */
  public SelectTipoCalcoloRimorchiabilita() {
    super();
  }

  /**
   * Creates a new SelectTipoCalcoloRimorchiabilita object.
   *
   * @param codice DOCUMENT ME!
   */
  public SelectTipoCalcoloRimorchiabilita(String codice) {
    super(codice);
  }

  /**
   * Creates a new SelectTipoCalcoloRimorchiabilita object.
   *
   * @param id
   */
  public SelectTipoCalcoloRimorchiabilita(LongId id) {
    super(id);
  }

  //~ Methods ==================================================================

  /**
   * ritorna l'sql
   *
   * @return
   */
  public String getSQLStatement() {
    return getSQLStatement("ID_TIPO_CALC_RIMORCH", "TAU_D_TIPO_CALC_RIMORCH");
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
    return new TipoCalcoloRimorchiabilita(
                                          new IdDecodifica(rs.getLong("id")
                                                             .longValue()
                                                          ),
                                          rs.getString("codice"),
                                          rs.getString("descrizione")
                                         );
  }
}
