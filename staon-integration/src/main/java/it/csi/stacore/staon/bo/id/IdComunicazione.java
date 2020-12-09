package it.csi.stacore.staon.bo.id;

import java.io.Serializable;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class IdComunicazione extends LongId implements Serializable {
  //~ Constructors =============================================================

  /**
	 * 
	 */
	private static final long serialVersionUID = 2946410361900334298L;

/**
   * DOCUMENT ME!
   *
   * @param id
   */
  public IdComunicazione(long id) {
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

    if((object != null) && object instanceof IdComunicazione) {
      IdComunicazione altro = (IdComunicazione) object;
      equals = (this.getId() == altro.getId());
    }

    return equals;
  }
}
