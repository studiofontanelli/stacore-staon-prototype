package it.csi.stacore.staon.bo;

import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.util.EqualsUtil;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class TipoCompensazione extends Decodifica
  implements java.io.Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -2724042972358348241L;

	private static final String CODICE_TIPO_ROTTAMAZIONE = "1";
	private static final String CODICE_TIPO_FURTO = "2";
    private static final String CODICE_TIPO_ALTRO = "3";

  //~ Constructors =============================================================

  /**
   * Creates a new TipoCompensazione object.
   *
   * @param idDecodifica DOCUMENT ME!
   * @param codice DOCUMENT ME!
   * @param descrizione DOCUMENT ME!
   */
  public TipoCompensazione(
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

    if((object != null) && object instanceof TipoCompensazione) {
      TipoCompensazione altro = (TipoCompensazione) object;
      equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
    }

    return equals;
  }

  public boolean isTipoFurto(){
      return getCodice().equals(CODICE_TIPO_FURTO);
  }

  public boolean isTipoRottamazione(){
      return getCodice().equals(CODICE_TIPO_ROTTAMAZIONE);
  }

  public boolean isTipoAltro(){
      return getCodice().equals(CODICE_TIPO_ALTRO);
  }

  public static String getCodiceTipoFurto(){
      return  CODICE_TIPO_FURTO;
  }

  public static String getCodiceTipoRottamazione(){
      return  CODICE_TIPO_ROTTAMAZIONE;
  }

  public static String getCodiceTipoAltro(){
      return  CODICE_TIPO_ALTRO;
  }
}
