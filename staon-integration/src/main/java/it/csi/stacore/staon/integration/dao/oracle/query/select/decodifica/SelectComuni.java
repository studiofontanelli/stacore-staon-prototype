package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.Comune;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEPreparedStatement;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;
import it.csi.stacore.staon.integration.dao.oracle.query.select.AbstractSelect;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectComuni extends AbstractSelect {
  //~ Constructors =============================================================

  /**
	 * @uml.property  name="comuni"
	 */
  private String comuni = null;

  public SelectComuni(String comuni) {
    this.comuni = comuni;
  }

  //~ Methods ==================================================================

  /*
  public String getSQLStatement() {
    return getSQLStatement("ID_REGIONE", "TAU_D_REGIONE");
  }
  */

  protected void setPreparedStatement(TAURDEPreparedStatement stmt)
    throws SQLException {
    //AP; scommentare quando il db � agganciato
    //int iPos = 1;
    //stmt.setString(iPos++, comuni);
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

    /*
    //AP; scommentare quando il db � agganciato
    Comune comune = new Comune(rs.getString("codiceIstat"),
                      rs.getString("cap"),
                      rs.getString("comune"),
                      rs.getString("provincia"),
                      rs.getString("regione"),
                      rs.getString("stato"));
    */

    Comune comune = new Comune("codiceIstat",
                               "cap",
                               "comune",
                               "provincia",
                               "regione",
                               "stato");

    return comune;

  }



}
