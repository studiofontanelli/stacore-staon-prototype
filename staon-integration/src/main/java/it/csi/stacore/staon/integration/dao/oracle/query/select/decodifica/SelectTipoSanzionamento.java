package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.TipoSanzionamento;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.bo.id.LongId;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectTipoSanzionamento extends AbstractSelectDecodifica {
  //~ Constructors =============================================================

  /**
   * Creates a new SelectTipoSanzionamento object.
   */
  public SelectTipoSanzionamento() {
    super();
  }

  /**
   * Creates a new SelectTipoSanzionamento object.
   *
   * @param codice DOCUMENT ME!
   */
  public SelectTipoSanzionamento(String codice) {
    super(codice);
  }

  /**
   * Creates a new SelectTipoSanzionamento object.
   *
   * @param id
   */
  public SelectTipoSanzionamento(LongId id) {
    super(id);
  }

  //~ Methods ==================================================================

  /**
   * ritorna l'sql
   *
   * @return
   */
  public String getSQLStatement() {
    return getSQLStatement("ID_TIPO_SANZIONAMENTO", "TAU_D_TIPO_SANZIONAMENTO");
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
    return new TipoSanzionamento(
                                 new IdDecodifica(rs.getLong("id").longValue()),
                                 rs.getString("codice"),
                                 rs.getString("descrizione")
                                );
  }
}
