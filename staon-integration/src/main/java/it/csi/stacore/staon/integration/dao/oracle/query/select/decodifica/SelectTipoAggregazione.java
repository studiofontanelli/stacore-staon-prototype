package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.bo.utente.TipoAggregazione;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectTipoAggregazione extends AbstractSelectDecodifica {

//	~ Constructors =============================================================

	  /**
	   * Creates a new SelectTipoAggregazione object.
	   */
	  public SelectTipoAggregazione() {
	    super();
	  }

	  /**
	   * Creates a new SelectTipoAggregazione object.
	   *
	   * @param codice DOCUMENT ME!
	   */
	  public SelectTipoAggregazione(String codice) {
	    super(codice);
	  }

	  /**
	   * Creates a new SelectTipoAggregazione object.
	   *
	   * @param id DOCUMENT ME!
	   */
	  public SelectTipoAggregazione(IdDecodifica id) {
	    super(id);
	  }

	  //~ Methods ==================================================================

	  /**
	   * DOCUMENT ME!
	   *
	   * @return DOCUMENT ME!
	   */
	  public String getSQLStatement() {
	    return getSQLStatement("ID_TIPO_AGGREGAZIONE", "TAU_D_TIPOAGGREGAZIONE");
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
	    return new TipoAggregazione(
	                           new IdDecodifica(rs.getLong("id").longValue()),
	                           rs.getString("codice"), rs.getString("descrizione")
	                          );
	  }

}
