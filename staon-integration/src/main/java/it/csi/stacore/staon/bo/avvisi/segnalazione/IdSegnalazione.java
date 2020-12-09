package it.csi.stacore.staon.bo.avvisi.segnalazione;

import it.csi.stacore.staon.bo.id.LongId;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class IdSegnalazione extends LongId implements java.io.Serializable {
  //~ Constructors =============================================================

  /**
	 *
	 */
	private static final long serialVersionUID = 547563656710180608L;

/**
   * Creates a new IdSegnalazione object.
   *
   * @param id DOCUMENT ME!
   */
  public IdSegnalazione(long id) {
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

    if((object != null) && object instanceof IdSegnalazione) {
      IdSegnalazione altro = (IdSegnalazione) object;
      equals = (this.getId() == altro.getId());
    }

    return equals;
  }
}
