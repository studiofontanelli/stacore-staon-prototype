package it.csi.stacore.staon.integration.dao.oracle.query;

import java.sql.Connection;
import java.sql.SQLException;

import it.csi.stacore.staon.integration.exception.InvalidSearchObjectException;
import it.csi.stacore.staon.util.PackageToAppName;
import it.csi.util.performance.StopWatch;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public abstract class AbstractCallableQuery extends AbstractQuery {
  //~ Instance fields ==========================================================

  /**
	 * @uml.property  name="stmt"
	 * @uml.associationEnd
	 */
  private TAURDECallableStatement stmt;

  //~ Constructors =============================================================

  /**
   * Creates a new AbstractCallableQuery object.
   */
  public AbstractCallableQuery() {
    super();
  }

  //~ Methods ==================================================================

  /**
   * ridefinisce il metodo execute
   *
   * @param connection
   *
   * @throws SQLException
   * @throws InvalidSearchObjectException
   */
  public void execute(Connection connection)
               throws SQLException, InvalidSearchObjectException {
  	StopWatch stopWatch = new StopWatch(PackageToAppName.getInstance().getAppNameFromPackage(getClass().getPackage().getName()));
    stopWatch.start();

    String query = getSQLStatement();
    getLogger().debug("[execute()] - query: " + query);

    setCallableStmt(new TAURDECallableStatement(connection, query));

    try {
      setPreparedStatement(getCallableStmt());
      getCallableStmt().execute();
    } finally {
      stopWatch.dumpElapsed(
                            getClass().getName(), "execute()",
                            "esecuzione query",
                            "query = " + getClass().getName()
                           );
    }
  }

  /**
   * DOCUMENT ME!
   */
  public void close() {
    if(getCallableStmt() != null) {
      getCallableStmt().close();
    }
  }

  /**
   * DOCUMENT ME!
   *
   * @param stmt The stmt to set.
   */
  protected void setCallableStmt(TAURDECallableStatement stmt) {
    this.stmt = stmt;
  }

  /**
   * DOCUMENT ME!
   *
   * @return Returns the stmt.
   */
  protected TAURDECallableStatement getCallableStmt() {
    return stmt;
  }
}
