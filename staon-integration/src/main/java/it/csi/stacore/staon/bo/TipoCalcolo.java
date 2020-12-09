package it.csi.stacore.staon.bo;

import java.io.Serializable;

import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.util.EqualsUtil;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class TipoCalcolo extends Decodifica implements Serializable {
  //~ Static fields/initializers ===============================================

  /**
   * DOCUMENT ME!
   */
  static final long           serialVersionUID = -8240054548353557299L;
  private static final String CODICE_PROPOSTA      = "A";
  private static final String CODICE_RICHIESTA     = "B";
  private static final String CODICE_COMPENSAZIONE = "CMP";
  private static final String CODICE_DATI_TECNICI  = "C";
  private static final String CODICE_MANUALE       = "M";

  //~ Constructors =============================================================

  /**
   * Creates a new TipoCalcolo object.
   *
   * @param idDecodifica DOCUMENT ME!
   * @param codice DOCUMENT ME!
   * @param descrizione DOCUMENT ME!
   */
  public TipoCalcolo(
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

    if((object != null) && object instanceof TipoCalcolo) {
      TipoCalcolo altro = (TipoCalcolo) object;
      equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
    }

    return equals;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean isRichiesta() {
    return this.getCodice().equals(CODICE_RICHIESTA);
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean isProposta() {
    return this.getCodice().equals(CODICE_PROPOSTA);
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean isCompensazione() {
    return this.getCodice().equals(CODICE_COMPENSAZIONE);
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean isDatiTecnici() {
    return this.getCodice().equals(CODICE_DATI_TECNICI);
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean isManuale() {
    return this.getCodice().equals(CODICE_MANUALE);
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public static String getCodiceProposta() {
    return CODICE_PROPOSTA;
  }
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public static String getCodiceCompensazione() {
    return CODICE_COMPENSAZIONE;
  }
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public static String getCodiceRichiesta() {
    return CODICE_RICHIESTA;
  }
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public static String getCodiceDatiTecnici() {
    return CODICE_DATI_TECNICI;
  }
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public static String getCodiceManuale() {
    return CODICE_MANUALE;
  }
}
