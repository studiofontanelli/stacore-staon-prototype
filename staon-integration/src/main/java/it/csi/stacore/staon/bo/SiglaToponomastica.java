package it.csi.stacore.staon.bo;

import org.apache.commons.lang3.builder.HashCodeBuilder;

import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.util.EqualsUtil;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SiglaToponomastica extends Decodifica {
  //~ Constructors =============================================================

  /**
	 *
	 */
	private static final long serialVersionUID = 2070453287841507676L;

/**
   * Creates a new SiglaToponomastica object.
   *
   * @param id DOCUMENT ME!
   * @param codice DOCUMENT ME!
   * @param descrizione DOCUMENT ME!
   */
  public SiglaToponomastica(IdDecodifica id, String codice, String descrizione) {
    super(id, codice, descrizione);
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

    if((object != null) && object instanceof SiglaToponomastica) {
      SiglaToponomastica altro = (SiglaToponomastica) object;
      equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
    }

    return equals;
  }

  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }

}
