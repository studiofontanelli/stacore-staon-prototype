package it.csi.stacore.staon.bo.avvisi.segnalazione;

import it.csi.stacore.staon.bo.Decodifica;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.util.EqualsUtil;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class CausaleSegnalazione extends Decodifica {
  //~ Constructors =============================================================

  /**
	 *
	 */
	private static final long serialVersionUID = 7102718918165148007L;

/**
   * Creates a new Stato object.
   *
   * @param id DOCUMENT ME!
   * @param codice DOCUMENT ME!
   * @param descrizione DOCUMENT ME!
   */
  public CausaleSegnalazione(IdDecodifica id, String descrizione) {
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

    if((object != null) && object instanceof CausaleSegnalazione) {
      CausaleSegnalazione altro = (CausaleSegnalazione) object;
      equals = EqualsUtil.objectEquals(getId(), altro.getId());
    }

    return equals;
  }
}
