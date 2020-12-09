package it.csi.stacore.staon.bo.id;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class IdProvincia extends IdDecodifica implements java.io.Serializable {
  //~ Constructors =============================================================

  /**
	 * 
	 */
	private static final long serialVersionUID = -1549964956865485231L;

/**
   * Creates a new IdRegione object.
   *
   * @param id DOCUMENT ME!
   */
  public IdProvincia(long id) {
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

    if((object != null) && object instanceof IdProvincia) {
      IdProvincia altro = (IdProvincia) object;
      equals = (this.getId() == altro.getId());
    }

    return equals;
  }
}
