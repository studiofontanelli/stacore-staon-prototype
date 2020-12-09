package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.id.IdProvincia;
import it.csi.stacore.staon.bo.Provincia;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectProvince extends AbstractSelectDecodifica {
  //~ Constructors =============================================================

  /**
   * Creates a new SelectRegione object.
   */
  public SelectProvince() {
    super();
  }

  /**
   * Creates a new SelectRegione object.
   *
   * @param codice DOCUMENT ME!
   */
  public SelectProvince(String codice) {
    super(codice);
  }

  /**
   * Creates a new SelectRegione object.
   *
   * @param id DOCUMENT ME!
   */
  public SelectProvince(IdProvincia id) {
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
    return new Provincia(
                       new IdProvincia(rs.getLong("id").longValue()),
                       //rs.getString("codice"),
                       dummyMethod(rs.getString("codice")),
                       rs.getString("descrizione")
                      );
  }


  private String dummyMethod(String codice) {

    String result = "TO";
    if (codice == null || codice.equals(""))
        return result;

    result = codice;

    if (result.length() == 1)
        result = "T" + result;

    return result;

  }

}
