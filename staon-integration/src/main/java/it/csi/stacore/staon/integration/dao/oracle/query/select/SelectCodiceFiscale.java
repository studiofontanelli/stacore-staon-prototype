package it.csi.stacore.staon.integration.dao.oracle.query.select;

import java.sql.SQLException;
import java.sql.Types;

import it.csi.stacore.staon.bo.AnagraficaPersona;
import it.csi.stacore.staon.integration.dao.oracle.query.AbstractCallableQuery;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDECallableStatement;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEPreparedStatement;
import it.csi.stacore.staon.integration.exception.InvalidSearchObjectException;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectCodiceFiscale extends AbstractCallableQuery {
  //~ Instance fields ==========================================================

  /**
	 * @uml.property  name="persona"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
  private AnagraficaPersona persona;

  //~ Constructors =============================================================


  public SelectCodiceFiscale(AnagraficaPersona persona) {
    this.persona = persona;
  }

  //~ Methods ==================================================================

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws InvalidSearchObjectException DOCUMENT ME!
   */
  public String getSQLStatement() throws InvalidSearchObjectException {
    if(persona == null) {
      throw new InvalidSearchObjectException("SelectCodiceFiscale: persona non pu� essere null");
    }

    return super.getSQLStatement();
  }

  /**
   * DOCUMENT ME!
   *
   * @param stmt DOCUMENT ME!
   *
   * @throws SQLException DOCUMENT ME!
   */
  protected void setPreparedStatement(TAURDEPreparedStatement stmt) throws SQLException {

    TAURDECallableStatement cStmt = (TAURDECallableStatement) stmt;

    int iPos = 0;

    cStmt.setUpperCaseString(1, persona.getTipoPersona()); /*  IN   STRING */
    cStmt.setUpperCaseString(2, persona.getIdFiscale());   /*  IN   STRING */
    cStmt.setDate(3, persona.getDataNascita());   /*  IN   DATE   */
    cStmt.setUpperCaseString(4, persona.getSesso());       /*  IN   STRING */
    cStmt.setUpperCaseString(5, persona.getCognome());     /*  IN   STRING */
    cStmt.setUpperCaseString(6, persona.getNome());        /*  IN   STRING */
    cStmt.setUpperCaseString(7, persona.getComune());      /*  IN   STRING */
    cStmt.setUpperCaseString(8, persona.getProvincia());   /*  IN   STRING */

    registerOutIndex(9, cStmt);      /*  OUT   STRING */
    registerOutIndex(10, cStmt);     /*  OUT   STRING */

  }

  /**
   * setta il parametro di output relativo all'esito
   *
   * @param iPos
   * @param cStmt
   *
   * @throws SQLException
   */
  protected final void registerOutIndex(int iPos, TAURDECallableStatement cStmt)
    throws SQLException {

    cStmt.registerOutParameter(iPos, Types.VARCHAR);
  }

  public String[] getResultOperazione() {

    String[] result = new String[2];
    try {
        result[0] = getCallableStmt().getString(9);
        result[1] = getCallableStmt().getString(10);
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        getLogger().debug("errore nel get dei parametri di out della stored procedure...");
        e.printStackTrace();
    }

    return result;

  }



}
