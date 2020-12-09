package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.ChiusuraComunicaz;
import it.csi.stacore.staon.bo.id.IdChiusuraComunicaz;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;

public class SelectChiusuraComunicazione extends AbstractSelectDecodifica {


	/**
	   * Creates a new SelectChiusuraComunicazione object.
	   */
	  public SelectChiusuraComunicazione() {
	    super();
	  }

	  /**
	   * Creates a new SelectChiusuraComunicazione object.
	   *
	   * @param codice DOCUMENT ME!
	   */
	  public SelectChiusuraComunicazione(String codice) {
	    super(codice);
	  }

	  /**
	   * Creates a new SelectChiusuraComunicazione object.
	   *
	   * @param id DOCUMENT ME!
	   */
	  public SelectChiusuraComunicazione(IdChiusuraComunicaz id) {
	    super(id);
	  }

	  //~ Methods ==================================================================

	  /**
	   * DOCUMENT ME!
	   *
	   * @return DOCUMENT ME!
	   */
	  public String getSQLStatement() {
	    return getSQLStatement("ID_CHIUSURA_COMUNICAZ", "TAU_D_CHIUSURA_COMUNICAZ");
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
	    return new ChiusuraComunicaz(
	                     new IdChiusuraComunicaz(rs.getLong("id").longValue()),
	                     rs.getString("codice"), rs.getString("descrizione")
	                    );
	  }
}
