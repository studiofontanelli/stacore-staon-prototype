package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.TipoCompensazione;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.bo.id.LongId;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectTipoCompensazione extends AbstractSelectDecodifica {
  //~ Constructors =============================================================

  /**
   * Creates a new SelectTipoCompensazione object.
   */
  public SelectTipoCompensazione() {
    super();
  }

  /**
   * Creates a new SelectTipoCompensazione object.
   *
   * @param codice DOCUMENT ME!
   */
  public SelectTipoCompensazione(String codice) {
    super(codice);
  }

  /**
   * Creates a new SelectEsplicativo object.
   *
   * @param id
   */
  public SelectTipoCompensazione(LongId id) {
    super(id);
  }

  //~ Methods ==================================================================

  /**
   * ritorna l'sql
   *
   * @return
   */
  public String getSQLStatement() {
    return getSQLStatement("ID_TIPO_COMPENSAZIONE", "TAU_D_TIPO_COMPENSAZIONE");
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
    return new TipoCompensazione(
                                 new IdDecodifica(rs.getLong("id").longValue()),
                                 rs.getString("codice"),
                                 rs.getString("descrizione")
                                );
  }
}
