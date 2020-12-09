/*
 * Created on 21-gen-2005
 */
package it.csi.stacore.staon.integration.util;

import it.csi.stacore.staon.bo.Valuta;
import it.csi.stacore.staon.util.NumberUtil;


/**
 * DOCUMENT ME!
 *
 * @author apiccirilli
 */
public class ValutaUtil {
  //~ Methods ==================================================================

  /**
   * DOCUMENT ME!
   *
   * @param valuta DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public static String format(Valuta valuta) {
    return format(valuta, true);
  }

  /**
   * DOCUMENT ME!
   *
   * @param valuta DOCUMENT ME!
   * @param divisa DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public static String format(Valuta valuta, boolean divisa) {
    String result = null;

    if(
       (valuta != null) && (valuta.getImporto() != null) &&
           (valuta.getDivisa() != null)
      ) {
      result = NumberUtil.format(valuta.getImporto());

      if(divisa) {
        result += (" " + CheckObject.getDescrizione(valuta.getDivisa()));
      }
    }

    return result;
  }
}
