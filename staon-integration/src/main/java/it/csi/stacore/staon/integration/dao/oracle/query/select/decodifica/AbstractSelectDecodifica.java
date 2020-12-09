package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;
import java.text.MessageFormat;

import it.csi.stacore.staon.bo.id.LongId;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEPreparedStatement;
import it.csi.stacore.staon.integration.dao.oracle.query.select.AbstractSelect;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public abstract class AbstractSelectDecodifica extends AbstractSelect {
  //~ Static fields/initializers ===============================================

  protected static final int    MODE_SELECT_ALL       = 0;
  protected static final int    MODE_SELECT_BY_CODICE = 1;
  protected static final int    MODE_SELECT_BY_ID     = 2;
  protected static final String COMMON_QUERY          =
    "SELECT {0} id, " + "CODICE, " + "DESCRIZIONE " + "FROM {1} ";
  protected static final String ORDER_BY        = "ORDER BY DESCRIZIONE ";
  protected static final String WHERE_BY_ID     = "WHERE {0} = ? ";
  protected static final String WHERE_BY_CODICE = "WHERE CODICE = ? ";

  //~ Instance fields ==========================================================

  /**
	 * @uml.property  name="mode"
	 */
  private final int mode;

  /**
	 * DOCUMENT ME!
	 * @uml.property  name="id"
	 * @uml.associationEnd
	 */
  final LongId id;

  /**
	 * DOCUMENT ME!
	 * @uml.property  name="codice"
	 */
  final String codice;

  //~ Constructors =============================================================

  /**
   * Creates a new AbstractSelectDecodifica object.
   */
  protected AbstractSelectDecodifica() {
    super();
    this.mode     = MODE_SELECT_ALL;
    this.id       = null;
    this.codice   = null;
  }

  /**
   * Creates a new AbstractSelectDecodifica object.
   *
   * @param id DOCUMENT ME!
   */
  protected AbstractSelectDecodifica(LongId id) {
    super();
    this.mode     = MODE_SELECT_BY_ID;
    this.id       = id;
    this.codice   = null;
  }

  /**
   * Creates a new AbstractSelectDecodifica object.
   *
   * @param codice DOCUMENT ME!
   */
  protected AbstractSelectDecodifica(String codice) {
    super();
    this.mode     = MODE_SELECT_BY_CODICE;
    this.id       = null;
    this.codice   = codice;
  }

  //~ Methods ==================================================================

  /**
   * DOCUMENT ME!
   *
   * @param idName DOCUMENT ME!
   * @param tableName DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  protected String getSQLStatement(String idName, String tableName) {
    String        strRet    = null;
    MessageFormat format    = new MessageFormat(COMMON_QUERY);
    Object[]      arguments = { idName, tableName };
    strRet = format.format(arguments);
    strRet += getWhereCondition(idName);
    strRet += ORDER_BY;

    return strRet;
  }

  protected String getWhereCondition(String idName) {
    String strRet = "";

    switch(mode){
      case MODE_SELECT_ALL:
        break;

      case MODE_SELECT_BY_ID:

        MessageFormat format    = new MessageFormat(WHERE_BY_ID);
        Object[]      arguments = { idName };
        strRet = format.format(arguments);

        break;

      case MODE_SELECT_BY_CODICE:
        strRet = WHERE_BY_CODICE;

        break;
    }

    return strRet;
  }

  /**
   * DOCUMENT ME!
   *
   * @param stmt DOCUMENT ME!
   *
   * @throws SQLException DOCUMENT ME!
   */
  protected void setPreparedStatement(TAURDEPreparedStatement stmt)
                               throws SQLException {
    switch(mode) {
      case MODE_SELECT_ALL:
        break;

      case MODE_SELECT_BY_ID:
        stmt.setLong(1, id.getId());

        break;

      case MODE_SELECT_BY_CODICE:
        stmt.setUpperCaseString(1, codice);

        break;
    }
  }

  protected int getMode(){
	return mode;
  }

}