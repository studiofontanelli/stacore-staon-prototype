package it.csi.stacore.staon.bo.avvisi.accertamento;

import it.csi.stacore.staon.bo.Decodifica;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.util.EqualsUtil;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class StatoTributo extends Decodifica {
  //~ Constructors =============================================================

  /**
	 *
	 */
	private static final long serialVersionUID = 8944110229490057080L;

/**
   * Creates a new Stato object.
   *
   * @param id DOCUMENT ME!
   * @param codice DOCUMENT ME!
   * @param descrizione DOCUMENT ME!
   */
  public StatoTributo(IdDecodifica id, String descrizione) {
    super(id, descrizione);
  }

  //~ Methods ==================================================================

  /**
   * DOCUMENT ME!
   *
   * @param object DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean equals(Object object) {
    boolean equals = false;

    if((object != null) && object instanceof StatoTributo) {
      StatoTributo altro = (StatoTributo) object;
      equals = EqualsUtil.objectEquals(getId(), altro.getId());
    }

    return equals;
  }
}
