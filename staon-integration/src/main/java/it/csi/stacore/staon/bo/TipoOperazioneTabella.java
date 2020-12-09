package it.csi.stacore.staon.bo;

import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.util.EqualsUtil;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class TipoOperazioneTabella extends Decodifica {
  //~ Constructors =============================================================

  /**
	 *
	 */
	private static final long serialVersionUID = -7423121101550423352L;

/**
   * DOCUMENT ME!
   *
   * @param id
   * @param codice
   * @param descrizione
   */
  public TipoOperazioneTabella(
                               IdDecodifica id, String codice,
                               String descrizione
                              ) {
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

    if((object != null) && object instanceof TipoOperazioneTabella) {
      TipoOperazioneTabella altro = (TipoOperazioneTabella) object;
      equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
    }

    return equals;
  }
}
