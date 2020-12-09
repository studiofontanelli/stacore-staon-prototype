package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.TipoComunicazContrib;
import it.csi.stacore.staon.bo.id.IdFonte;
import it.csi.stacore.staon.bo.id.IdTipoComunicazContrib;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectTipoComunicazContrib extends AbstractSelectDecodifica {
  //~ Constructors =============================================================

  /**
   * Creates a new SelectTipoComunicazContrib object.
   */
  public SelectTipoComunicazContrib() {
    super();
  }

  /**
   * Creates a new SelectTipoComunicazContrib object.
   *
   * @param codice DOCUMENT ME!
   */
  public SelectTipoComunicazContrib(String codice) {
    super(codice);
  }

  /**
   * Creates a new SelectTipoComunicazContrib object.
   *
   * @param id DOCUMENT ME!
   */
  public SelectTipoComunicazContrib(IdFonte id) {
    super(id);
  }

  //~ Methods ==================================================================

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSQLStatement() {
    return getSQLStatement("ID_TIPO_COMUNICAZ_CONTRIB", "TAU_D_TIPO_COMUNICAZ_CONTRIB");
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
    return new TipoComunicazContrib(
                     new IdTipoComunicazContrib(rs.getLong("id").longValue()),
                     rs.getString("codice"), rs.getString("descrizione")
                    );
  }
}
