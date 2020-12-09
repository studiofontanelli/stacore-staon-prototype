package it.csi.stacore.staon.bo.id;

import java.io.Serializable;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class IdContributo extends LongId implements Serializable {
  //~ Constructors =============================================================

  /**
	 * 
	 */
	private static final long serialVersionUID = -2252910276713239621L;

/**
   * DOCUMENT ME!
   *
   * @param id
   */
  public IdContributo(long id) {
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

    if((object != null) && object instanceof IdContributo) {
      IdContributo altro = (IdContributo) object;
      equals = (this.getId() == altro.getId());
    }

    return equals;
  }
}
