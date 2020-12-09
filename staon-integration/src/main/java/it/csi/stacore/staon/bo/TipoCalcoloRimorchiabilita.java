package it.csi.stacore.staon.bo;

import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.util.EqualsUtil;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class TipoCalcoloRimorchiabilita extends Decodifica
  implements java.io.Serializable {
  //~ Static fields/initializers ===============================================

  /**
	 *
	 */
	private static final long serialVersionUID = 7129080448579806220L;
private static final String CODICE_AUTOMOTRICE     = "RA";
  private static final String CODICE_AUTOMOTRICE_CEE = "RA-CEE";

  //~ Constructors =============================================================

  /**
   * Creates a new TipoCalcoloRimorchiabilita object.
   *
   * @param idDecodifica DOCUMENT ME!
   * @param codice DOCUMENT ME!
   * @param descrizione DOCUMENT ME!
   */
  public TipoCalcoloRimorchiabilita(
                                    IdDecodifica idDecodifica, String codice,
                                    String descrizione
                                   ) {
    super(idDecodifica, codice, descrizione);
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

    if((object != null) && object instanceof TipoCalcoloRimorchiabilita) {
      TipoCalcoloRimorchiabilita altro = (TipoCalcoloRimorchiabilita) object;
      equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
    }

    return equals;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean isAutomotrice() {
    return this.getCodice().equals(CODICE_AUTOMOTRICE);
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean isAutomotriceCEE() {
    return this.getCodice().equals(CODICE_AUTOMOTRICE_CEE);
  }
}
