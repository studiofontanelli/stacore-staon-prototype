package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.Esplicativo;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.bo.id.LongId;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectEsplicativo extends AbstractSelectDecodifica {
  //~ Constructors =============================================================

  /**
   * Creates a new SelectEsplicativo object.
   */
  public SelectEsplicativo() {
    super();
  }

  /**
   * Creates a new SelectEsplicativo object.
   *
   * @param codice DOCUMENT ME!
   */
  public SelectEsplicativo(String codice) {
    super(codice);
  }

  /**
   * Creates a new SelectEsplicativo object.
   *
   * @param id
   */
  public SelectEsplicativo(LongId id) {
    super(id);
  }

  //~ Methods ==================================================================

  /**
   * ritorna l'sql
   *
   * @return
   */
  public String getSQLStatement() {
    return getSQLStatement("ID_ESPLICATIVO", "TAU_D_ESPLICATIVO");
  }

  /**
   * restituisce il BO
   *
   * @param rs
   *
   * @return
   *
   * @throws SQLException
   */
  public Object createBO(TAURDEResultSet rs) throws SQLException {
    return new Esplicativo(
                           new IdDecodifica(rs.getLong("id").longValue()),
                           rs.getString("codice"), rs.getString("descrizione")
                          );
  }
}
