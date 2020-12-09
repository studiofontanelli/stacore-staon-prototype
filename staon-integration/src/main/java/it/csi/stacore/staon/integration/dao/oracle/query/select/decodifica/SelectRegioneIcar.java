package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.RegioneIcar;
import it.csi.stacore.staon.bo.id.IdRegione;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectRegioneIcar extends AbstractSelectDecodifica {
  //~ Constructors =============================================================

  /**
   * Creates a new SelectRegione object.
   */
  public SelectRegioneIcar() {
    super();
  }

  /**
   * Creates a new SelectRegione object.
   *
   * @param codice DOCUMENT ME!
   */
  public SelectRegioneIcar(String codice) {
    super(codice);
  }

  /**
   * Creates a new SelectRegione object.
   *
   * @param id DOCUMENT ME!
   */
  public SelectRegioneIcar(IdRegione id) {
    super(id);
  }

  //~ Methods ==================================================================

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSQLStatement() {
    return getSQLStatement("ID_REGIONE", "TAU_D_REGIONE_ICAR");
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
    return new RegioneIcar(
                       new IdRegione(rs.getLong("id").longValue()),
                       rs.getString("codice"), rs.getString("descrizione")
                      );
  }
}
