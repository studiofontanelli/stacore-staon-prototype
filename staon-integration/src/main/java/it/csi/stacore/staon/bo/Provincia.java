package it.csi.stacore.staon.bo;

import org.apache.commons.lang3.builder.HashCodeBuilder;

import it.csi.stacore.staon.bo.id.IdProvincia;
import it.csi.stacore.staon.util.EqualsUtil;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class Provincia extends Decodifica {
  //~ Constructors =============================================================

  /**
	 *
	 */
	private static final long serialVersionUID = -7946721537239557600L;

/**
   * Creates a new Regione object.
   *
   * @param id DOCUMENT ME!
   * @param codice DOCUMENT ME!
   * @param descrizione DOCUMENT ME!
   */
  public Provincia(IdProvincia id, String codice, String descrizione) {
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

    if((object != null) && object instanceof Provincia) {
      Provincia altro = (Provincia) object;
      equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
    }

    return equals;
  }

  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }

}
