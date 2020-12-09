package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.SiglaToponomastica;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.bo.id.IdProvincia;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectSiglaToponomastica extends AbstractSelectDecodifica {
  //~ Constructors =============================================================

  /**
   * Creates a new SelectRegione object.
   */
  public SelectSiglaToponomastica() {
    super();
  }

  /**
   * Creates a new SelectRegione object.
   *
   * @param codice DOCUMENT ME!
   */
  public SelectSiglaToponomastica(String codice) {
    super(codice);
  }

  /**
   * Creates a new SelectRegione object.
   *
   * @param id DOCUMENT ME!
   */
  public SelectSiglaToponomastica(IdProvincia id) {
    super(id);
  }

  //~ Methods ==================================================================

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSQLStatement() {
    return getSQLStatement("ID_REGIONE", "TAU_D_REGIONE");
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

    getLogger().debug("ATTENZIONE:  funzione da implementare...");
    return new SiglaToponomastica(new IdDecodifica(1L), "Via", "Via");

    /*return new SiglaToponomastica(
                       new IdDecodifica(rs.getLong("id").longValue()),
                       //rs.getString("codice"),
                       dummyMethod(rs.getString("codice")),
                       rs.getString("descrizione")
                      );
    */

  }


}
