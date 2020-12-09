package it.csi.stacore.staon.bo;

import it.csi.stacore.staon.util.EqualsUtil;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class Importo extends AbstractBO implements java.io.Serializable {
  //~ Static fields/initializers ===============================================

  /**
   * DOCUMENT ME!
   */
  static final long serialVersionUID = -8096450839297193752L;

  //~ Instance fields ==========================================================

  /**
	 * @uml.property  name="tassa"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
  private Valuta tassa;
  /**
	 * @uml.property  name="sanzioni"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
  private Valuta sanzioni;
  /**
	 * @uml.property  name="interessi"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
  private Valuta interessi;
  /**
	 * @uml.property  name="totale"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
  private Valuta totale;

  //~ Constructors =============================================================

  /**
   * Creates a new Importo object.
   *
   * @param tassa DOCUMENT ME!
   * @param sanzioni DOCUMENT ME!
   * @param interessi DOCUMENT ME!
   * @param totale DOCUMENT ME!
   */
  public Importo(
                 final Valuta tassa, final Valuta sanzioni,
                 final Valuta interessi, final Valuta totale
                ) {
    this.tassa       = tassa;
    this.sanzioni    = sanzioni;
    this.interessi   = interessi;
    this.totale      = totale;
  }

  //~ Methods ==================================================================

  /**
	 * DOCUMENT ME!
	 * @return  DOCUMENT ME!
	 * @uml.property  name="tassa"
	 */
  public Valuta getTassa() {
    return tassa;
  }

  /**
	 * DOCUMENT ME!
	 * @return  DOCUMENT ME!
	 * @uml.property  name="sanzioni"
	 */
  public Valuta getSanzioni() {
    return sanzioni;
  }

  /**
	 * DOCUMENT ME!
	 * @return  DOCUMENT ME!
	 * @uml.property  name="interessi"
	 */
  public Valuta getInteressi() {
    return interessi;
  }

  /**
	 * DOCUMENT ME!
	 * @return  DOCUMENT ME!
	 * @uml.property  name="totale"
	 */
  public Valuta getTotale() {
    return totale;
  }

  /**
   * DOCUMENT ME!
   *
   * @param object DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean equals(Object object) {
    boolean equals = false;

    if((object != null) && object instanceof Importo) {
      Importo altro = (Importo) object;
      equals =
        EqualsUtil.objectEquals(getTassa(), altro.getTassa()) &&
        EqualsUtil.objectEquals(getSanzioni(), altro.getSanzioni()) &&
        EqualsUtil.objectEquals(getInteressi(), altro.getInteressi()) &&
        EqualsUtil.objectEquals(getTotale(), altro.getTotale());
    }

    return equals;
  }

}
