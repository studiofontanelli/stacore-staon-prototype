package it.csi.stacore.staon.integration.dao.oracle.query.select;

import java.text.MessageFormat;

import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEPreparedStatement;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;
import it.csi.stacore.staon.integration.exception.InvalidSearchObjectException;


/**
 * viene restituito dalle procedure Oracle
 *
 */
public class SelectSequenceNextVal extends AbstractSelect {
  //~ Static fields/initializers ===============================================

  private static final String QUERY = "select {0}.nextVal value from dual";

  //~ Instance fields ==========================================================

  /**
	 * @uml.property  name="sequence"
	 */
  private String sequence = null;

  //~ Constructors =============================================================

  /**
   * Creates a new SelectSequenceNextVal object.
   *
   * @param sequence DOCUMENT ME!
   */
  public SelectSequenceNextVal(String sequence) {
    super();
    this.sequence = sequence;
  }

  //~ Methods ==================================================================

  /**
   * DOCUMENT ME!
   *
   * @param rs DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws java.sql.SQLException DOCUMENT ME!
   */
  public Object createBO(TAURDEResultSet rs) throws java.sql.SQLException {
    return rs.getLong("value");
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws it.csi.stacore.staon.exception.InvalidSearchObjectException
   *         DOCUMENT ME!
   * @throws InvalidSearchObjectException DOCUMENT ME!
   */
  public String getSQLStatement() throws InvalidSearchObjectException {
    if((sequence == null) || (sequence.length() == 0)) {
      throw new InvalidSearchObjectException("NEXTVAL: la sequence non pu� essere null");
    }

    MessageFormat format    = new MessageFormat(QUERY);
    Object[]      arguments = { sequence };

    return format.format(arguments);
  }

  /**
   * DOCUMENT ME!
   *
   * @param stmt DOCUMENT ME!
   *
   * @throws java.sql.SQLException DOCUMENT ME!
   */
  protected void setPreparedStatement(TAURDEPreparedStatement stmt)
                               throws java.sql.SQLException {
    // non faccio niente
  }
}
