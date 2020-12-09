package it.csi.stacore.staon.bo.avvisi.segnalazione;

import it.csi.stacore.staon.bo.id.IdDecodifica;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class IdMotivoSegnalazione extends IdDecodifica implements java.io.Serializable {
  //~ Constructors =============================================================

  /**
	 *
	 */
	private static final long serialVersionUID = -8779199438475014260L;

/**
   * Creates a new IdStato object.
   *
   * @param id DOCUMENT ME!
   */
  public IdMotivoSegnalazione(long id) {
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

    if((object != null) && object instanceof IdMotivoSegnalazione) {
      IdMotivoSegnalazione altro = (IdMotivoSegnalazione) object;
      equals = (this.getId() == altro.getId());
    }

    return equals;
  }
}
