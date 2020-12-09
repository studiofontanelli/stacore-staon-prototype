package it.csi.stacore.staon.bo.avvisi.segnalazione;

import it.csi.stacore.staon.bo.id.IdDecodifica;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class IdCausaleSegnalazione extends IdDecodifica implements java.io.Serializable {
  //~ Constructors =============================================================

  /**
	 *
	 */
	private static final long serialVersionUID = 4723203833795549398L;

/**
   * Creates a new IdStato object.
   *
   * @param id DOCUMENT ME!
   */
  public IdCausaleSegnalazione(long id) {
    super(id);
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

    if((object != null) && object instanceof IdCausaleSegnalazione) {
      IdCausaleSegnalazione altro = (IdCausaleSegnalazione) object;
      equals = (this.getId() == altro.getId());
    }

    return equals;
  }
}
