package it.csi.stacore.staon.bo;

import org.apache.commons.lang3.builder.HashCodeBuilder;

import it.csi.stacore.staon.bo.id.IdRegione;
import it.csi.stacore.staon.util.EqualsUtil;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class RegioneIcar extends Regione {
  //~ Constructors =============================================================

	private static final long serialVersionUID = -7909487486500790852L;

/**
   * Creates a new Regione object.
   *
   * @param id DOCUMENT ME!
   * @param codice DOCUMENT ME!
   * @param descrizione DOCUMENT ME!
   */
  public RegioneIcar(IdRegione id, String codice, String descrizione) {
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

    if((object != null) && object instanceof RegioneIcar) {
      RegioneIcar altro = (RegioneIcar) object;
      equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
    }

    return equals;
  }

  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }

}