package it.csi.stacore.staon.bo.id.avvisi.accertamento;

import it.csi.stacore.staon.bo.id.IdDecodifica;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class IdCausaleChiusura extends IdDecodifica implements java.io.Serializable {
  //~ Constructors =============================================================

  /**
	 *
	 */
	private static final long serialVersionUID = 8746606266487400682L;

/**
   * Creates a new IdStato object.
   *
   * @param id DOCUMENT ME!
   */
  public IdCausaleChiusura(long id) {
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

    if((object != null) && object instanceof IdCausaleChiusura) {
      IdCausaleChiusura altro = (IdCausaleChiusura) object;
      equals = (this.getId() == altro.getId());
    }

    return equals;
  }
}
