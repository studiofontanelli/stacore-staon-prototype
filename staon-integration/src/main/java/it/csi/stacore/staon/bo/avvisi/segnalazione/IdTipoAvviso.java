package it.csi.stacore.staon.bo.avvisi.segnalazione;

import it.csi.stacore.staon.bo.id.IdDecodifica;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class IdTipoAvviso extends IdDecodifica implements java.io.Serializable {
  //~ Constructors =============================================================

  /**
	 *
	 */
	private static final long serialVersionUID = -6670250012775043474L;

/**
   * Creates a new IdStato object.
   *
   * @param id DOCUMENT ME!
   */
  public IdTipoAvviso(long id) {
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

    if((object != null) && object instanceof IdTipoAvviso) {
      IdTipoAvviso altro = (IdTipoAvviso) object;
      equals = (this.getId() == altro.getId());
    }

    return equals;
  }
}
