package it.csi.stacore.staon.bo.id;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class IdRegione extends IdDecodifica implements java.io.Serializable {
  //~ Constructors =============================================================

  /**
	 * 
	 */
	private static final long serialVersionUID = -8897058177428047149L;

/**
   * Creates a new IdRegione object.
   *
   * @param id DOCUMENT ME!
   */
  public IdRegione(long id) {
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

    if((object != null) && object instanceof IdRegione) {
      IdRegione altro = (IdRegione) object;
      equals = (this.getId() == altro.getId());
    }

    return equals;
  }
}
