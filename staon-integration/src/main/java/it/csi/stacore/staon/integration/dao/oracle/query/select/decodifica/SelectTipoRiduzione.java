package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;
import java.util.Date;

import it.csi.stacore.staon.bo.TipoRiduzione;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectTipoRiduzione extends AbstractSelectDecodificaDatata {
  //~ Constructors =============================================================

  /**
   * Creates a new SelectTipoRiduzione object.
   */
  public SelectTipoRiduzione(Date data) {
    super(data);
  }

  /**
   * Creates a new SelectTipoRiduzione object.
   *
   * @param codice DOCUMENT ME!
   */
  public SelectTipoRiduzione(String codice, Date data) {
    super(codice, data);
  }

  /**
   * Creates a new SelectTipoRiduzione object.
   *
   * @param id DOCUMENT ME!
   */
  public SelectTipoRiduzione(IdDecodifica id, Date data) {
    super(id, data);
  }

  //~ Methods ==================================================================

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSQLStatement() {
    return getSQLStatement("ID_TIPO_RIDUZIONE", "TAU_D_TIPO_RIDUZIONE");
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
    return new TipoRiduzione(
				new IdDecodifica(rs.getLong("id").longValue()),
				rs.getString("codice"), rs.getString("descrizione"),
				rs.getDate("DT_INIZIO"), rs.getDate("DT_FINE"));
  }
}
