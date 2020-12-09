package it.csi.stacore.staon.bo;

import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.util.EqualsUtil;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class TipoSanzionamento extends Decodifica
  implements java.io.Serializable {
  /**
	 *
	 */
	private static final long serialVersionUID = 8828590372458003823L;
//~ Static fields/initializers ===============================================

  private static final String SANZIONAMENTO_NORMATIVA_IN_CORSO = "0";
  private static final String ACCERTAMENTO_IN_CORSO = "1";

  //~ Constructors =============================================================

  /**
   * Creates a new TipoSanzionamento object.
   *
   * @param idDecodifica DOCUMENT ME!
   * @param codice DOCUMENT ME!
   * @param descrizione DOCUMENT ME!
   */
  public TipoSanzionamento(
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

    if((object != null) && object instanceof TipoSanzionamento) {
      TipoSanzionamento altro = (TipoSanzionamento) object;
      equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
    }

    return equals;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean isSanzionamentoNormativaInCorso() {
    return this.getCodice().equals(SANZIONAMENTO_NORMATIVA_IN_CORSO);
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean isAccertamentoInCorso() {
    return this.getCodice().equals(ACCERTAMENTO_IN_CORSO);
  }
}
