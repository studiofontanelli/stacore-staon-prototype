package it.csi.stacore.staon.bo;

import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.util.EqualsUtil;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class TipoOperazioneBonificaIR extends Decodifica implements java.io.Serializable {
  //~ Static fields/initializers ===============================================

  /**
  *
  */
  private static final long serialVersionUID = 1L;
  public static final String CODICE_ACQUISIZIONE_PAGAMENTO              = "01";
  public static final String CODICE_CESSIONE_PAGAMENTO                  = "02";
  public static final String CODICE_ACQUISIZIONE_VEICOLO                = "03";
  public static final String CODICE_CESSIONE_VEICOLO          			= "04";

  //~ Constructors =============================================================

  // Constructors
  public TipoOperazioneBonificaIR(IdDecodifica idDecodifica, String codice, String descrizione) {
    super(idDecodifica, codice, descrizione);
  }

  //~ Methods ==================================================================
// Getters
  public IdDecodifica getIdDecodifica() {
    return (IdDecodifica) getId();
  }

  // Equals
  public boolean equals(Object object) {
    boolean equals = false;

    if((object != null) && object instanceof TipoOperazioneBonificaIR) {
      TipoOperazioneBonificaIR altro = (TipoOperazioneBonificaIR) object;
      equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
    }

    return equals;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean isAcquisizionePagamento() {
    boolean result = false;
    if(getCodice().equals(CODICE_ACQUISIZIONE_PAGAMENTO)) {
      result = true;
    }
    return result;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean isCessionePagamento() {
    boolean result = false;
    if(getCodice().equals(CODICE_CESSIONE_PAGAMENTO)) {
      result = true;
    }
    return result;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean isAcquisizioneVeicolo() {
    boolean result = false;
    if(getCodice().equals(CODICE_ACQUISIZIONE_VEICOLO)) {
      result = true;
    }
    return result;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean isCessioneVeicolo() {
    boolean result = false;
    if(getCodice().equals(CODICE_CESSIONE_VEICOLO)) {
      result = true;
    }
    return result;
  }

}