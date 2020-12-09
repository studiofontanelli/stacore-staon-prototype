package it.csi.stacore.staon.bo.id;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class IdAgevolazione extends LongId implements java.io.Serializable {
  //~ Constructors =============================================================

  /**
	 * 
	 */
	private static final long serialVersionUID = 3843261564983931660L;

/**
   * Creates a new IdAgevolazione object.
   *
   * @param id DOCUMENT ME!
   */
  public IdAgevolazione(long id) {
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

    if((object != null) && object instanceof IdAgevolazione) {
      IdAgevolazione altro = (IdAgevolazione) object;
      equals = (this.getId() == altro.getId());
    }

    return equals;
  }
}
