package it.csi.stacore.staon.integration.dao.oracle.query.select.agevolazione;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.id.IdAgevolazione;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEPreparedStatement;
import it.csi.stacore.staon.integration.dao.oracle.util.OracleQuery;
import it.csi.stacore.staon.integration.dao.oracle.util.OracleQueryList;
import it.csi.stacore.staon.integration.exception.InvalidSearchObjectException;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectEcoincentivoGasById extends SelectEcoincentivoImpiantoGas {
  //~ Instance fields ==========================================================

  /**
	 * @uml.property  name="idAgevolazione"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
  private IdAgevolazione idAgevolazione;

  //~ Constructors =============================================================

  /**
   * Creates a new SelectAgevolazioneById object.
   *
   * @param idAgevolazione
   */
  public SelectEcoincentivoGasById(IdAgevolazione idAgevolazione) {
    super();
    this.idAgevolazione = idAgevolazione;
  }

  //~ Methods ==================================================================

  /**
   * ritorna la stringa SQL
   *
   * @return
   *
   * @throws InvalidSearchObjectException
   */
  public String getSQLStatement() throws InvalidSearchObjectException {
    if(idAgevolazione == null) {
      throw new InvalidSearchObjectException("SelectAgevolazioneById: idAgevolazione non pu� essere null");
    }

    OracleQuery q =
      OracleQueryList.getInstance().getQuery(getClass().getSuperclass().getName());
    String      query = q.getBody() + q.getFieldBody("progCorrezioneT");
    query += (q.getFrom() + q.getParamFrom("tabT"));
    query += q.getWhere();

    query += q.getParamWhere("idAgevolazione");

    return query;
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
    int iPos = 1;
    stmt.setLongId(iPos++, idAgevolazione);
  }
}
