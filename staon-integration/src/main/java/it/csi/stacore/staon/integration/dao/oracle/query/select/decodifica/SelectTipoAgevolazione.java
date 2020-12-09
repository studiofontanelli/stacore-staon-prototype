package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.TipoAgevolazione;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEPreparedStatement;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;
import it.csi.stacore.staon.integration.dao.oracle.query.select.AbstractSelect;
import it.csi.stacore.staon.integration.dao.oracle.util.OracleQuery;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectTipoAgevolazione extends AbstractSelect{
  //~ Constructors =============================================================
	private String codice;

	private IdDecodifica id;

  /**
   * Creates a new SelectTipoAgevolazione object.
   */
  public SelectTipoAgevolazione() {
    super();
  }

  /**
   * Creates a new SelectTipoAgevolazione object.
   *
   * @param codice DOCUMENT ME!
   */
  public SelectTipoAgevolazione(String codice) {
//    super(codice);
	  this.codice = codice;
  }

  /**
   * Creates a new SelectTipoAgevolazione object.
   *
   * @param id DOCUMENT ME!
   */
  public SelectTipoAgevolazione(IdDecodifica id) {
//    super(id);
	  this.id = id;
  }

  //~ Methods ==================================================================

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSQLStatement() {
//    return getSQLStatement("ID_TIPO_AGEVOLAZIONE", "TAU_D_TIPO_AGEVOLAZIONE");
    OracleQuery q = getOracleQueryList().getQuery(getClass().getName());
    String query = q.getBody() + q.getFrom() + q.getWhere();
    if (codice !=null)
    	query += q.getParamWhere("whereCodice");
    if (id !=null)
    	query += q.getParamWhere("whereId");
    query += q.getOrderBy();

    return query;
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
    return new TipoAgevolazione(
                                new IdDecodifica(rs.getLong("id").longValue()),
                                rs.getString("codice"),
                                rs.getString("descrizione")
                               );
  }

	protected void setPreparedStatement(TAURDEPreparedStatement stmt) throws SQLException {
		int iPos = 1;

	    if(codice != null)
	    	stmt.setString(iPos++, codice);
	    if(id != null)
	    	stmt.setLongId(iPos++, id);
	}

}