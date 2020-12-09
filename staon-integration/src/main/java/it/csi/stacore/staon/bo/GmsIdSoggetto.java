package it.csi.stacore.staon.bo;

import it.csi.stacore.staon.bo.id.LongId;


public class GmsIdSoggetto extends LongId implements java.io.Serializable {

  /**
	 *
	 */
	private static final long serialVersionUID = 1221464491976120562L;

/**
   * Creates a new GmsIdSoggetto object.
   *
   * @param id DOCUMENT ME!
   */
  public GmsIdSoggetto(long id) {
    super(id);
  }

  public boolean equals(Object object) {
    boolean equals = false;

    if((object != null) && object instanceof GmsIdSoggetto) {
      GmsIdSoggetto altro = (GmsIdSoggetto) object;
      equals = (this.getId() == altro.getId());
    }

    return equals;
  }
}
