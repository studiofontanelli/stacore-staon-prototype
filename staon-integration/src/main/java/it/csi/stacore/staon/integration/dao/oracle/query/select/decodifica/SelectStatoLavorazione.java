package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.StatoLavorazione;
import it.csi.stacore.staon.bo.id.IdFonte;
import it.csi.stacore.staon.bo.id.IdStatoLavorazione;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;

public class SelectStatoLavorazione extends AbstractSelectDecodifica {
	  //~ Constructors =============================================================

	  /**
	   * Creates a new SelectStatoLavorazione object.
	   */
	  public SelectStatoLavorazione() {
	    super();
	  }

	  /**
	   * Creates a new SelectStatoLavorazione object.
	   *
	   * @param codice DOCUMENT ME!
	   */
	  public SelectStatoLavorazione(String codice) {
	    super(codice);
	  }

	  /**
	   * Creates a new SelectStatoLavorazione object.
	   *
	   * @param id DOCUMENT ME!
	   */
	  public SelectStatoLavorazione(IdFonte id) {
	    super(id);
	  }

	  //~ Methods ==================================================================

	  /**
	   * DOCUMENT ME!
	   *
	   * @return DOCUMENT ME!
	   */
	  public String getSQLStatement() {
	    return getSQLStatement("ID_STATO_LAVORAZIONE", "TAU_D_STATO_LAVORAZIONE");
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
	    return new StatoLavorazione(
	                     new IdStatoLavorazione(rs.getLong("id").longValue()),
	                     rs.getString("codice"), rs.getString("descrizione")
	                    );
	  }
	}

