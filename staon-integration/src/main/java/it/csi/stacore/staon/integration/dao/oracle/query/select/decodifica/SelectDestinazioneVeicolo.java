package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.DestinazioneVeicolo;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectDestinazioneVeicolo extends AbstractSelectDecodifica {
  //~ Constructors =============================================================

  /**
   * Creates a new SelectDestinazioneVeicolo object.
   */
  public SelectDestinazioneVeicolo() {
    super();
  }

  /**
   * Creates a new SelectDestinazioneVeicolo object.
   *
   * @param id DOCUMENT ME!
   */
  public SelectDestinazioneVeicolo(IdDecodifica id) {
    super(id);
  }

  /**
   * Creates a new SelectDestinazioneVeicolo object.
   *
   * @param codice DOCUMENT ME!
   */
  public SelectDestinazioneVeicolo(String codice) {
    super(codice);
  }

  //~ Methods ==================================================================

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSQLStatement() {
    return getSQLStatement(
                           "ID_DESTINAZIONE_VEICOLO",
                           "TAU_D_DESTINAZIONEVEICOLO"
                          );
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
    return new DestinazioneVeicolo(
                                   new IdDecodifica(rs.getLong("id").longValue()),
                                   rs.getString("codice"),
                                   rs.getString("descrizione")
                                  );
  }
}
