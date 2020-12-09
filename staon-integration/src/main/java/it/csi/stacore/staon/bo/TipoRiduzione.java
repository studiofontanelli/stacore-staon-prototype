package it.csi.stacore.staon.bo;

import java.util.Date;

import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.util.EqualsUtil;


public class TipoRiduzione extends DecodificaDatata implements java.io.Serializable {

  /**
	 * 
	 */
	private static final long serialVersionUID = -6331782746886564008L;
	private static final String AUTOVETTURE_SERVIZIO_PUBBLICO_DA_PIAZZA                      = "1";
	private static final String AUTOVEICOLI_GPL_ESCLUSIVO                                    = "2";
	private static final String AUTOVEICOLI_METANO_ESCLUSIVO                                 = "3";
	private static final String AUTOVEICOLI_MOTORE_ELETTRICO                                 = "4";
	private static final String AUTOVEICOLI_TRASPORTO_PESO_COMPLESSIVO_MINORE_12             = "5";
	private static final String AUTOVETTURE_NOLEGGIO_DA_RIMESSA                              = "6";
	private static final String AUTOVETTURE_SCUOLA_GUIDA                                     = "7";
	private static final String AUTOBUS_NOLEGGIO_DA_RIMESSA                                  = "8";
	private static final String AUTOBUS_SERVIZIO_PUBBLICO_DI_LINEA                           = "9";
	private static final String AUTOVEICOLI_TRASPORTO_PESO_COMPLESSIVO_MAGGIORE_12_SOSP_PNEU = "10";
	private static final String AUTOVEICOLI_DIESEL_SOVRATTASSA_RIDOTTA_50                    = "11";
	private static final String PAGAMENTO_CUMULATIVO_PER_RIMORCHI                            = "12";
	private static final String MOTOVEICOLO_SERVIZIO_PUBBLICO_DA_PIAZZA                      = "13";
	private static final String NESSUNA_RIDUZIONE_APPLICATA                                  = "NN";
 
	public TipoRiduzione(IdDecodifica idDecodifica, String codice,
			String descrizione, Date dataInizio, Date dataFine) {
		super(idDecodifica, codice, descrizione, dataInizio, dataFine);
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

    if((object != null) && object instanceof TipoRiduzione) {
      TipoRiduzione altro = (TipoRiduzione) object;
      equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
    }

    return equals;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean isAutovettureServizioPubblicoDaPiazza() {
    return this.getCodice().equals(AUTOVETTURE_SERVIZIO_PUBBLICO_DA_PIAZZA);
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean isAutoveicoliGplEsclusivo() {
    return this.getCodice().equals(AUTOVEICOLI_GPL_ESCLUSIVO);
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean isAutoveicoliMetanoEsclusivo() {
    return this.getCodice().equals(AUTOVEICOLI_METANO_ESCLUSIVO);
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean isAutoveicoliMotoreElettrico() {
    return this.getCodice().equals(AUTOVEICOLI_MOTORE_ELETTRICO);
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean isAutoveicoliTrasportoPesoComplessivoMinore12() {
    return this.getCodice().equals(AUTOVEICOLI_TRASPORTO_PESO_COMPLESSIVO_MINORE_12);
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean isAutovettureNoleggioDaRimessa() {
    return this.getCodice().equals(AUTOVETTURE_NOLEGGIO_DA_RIMESSA);
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean isAutovettureScuolaGuida() {
    return this.getCodice().equals(AUTOVETTURE_SCUOLA_GUIDA);
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean isAutobusNoleggioDaRimessa() {
    return this.getCodice().equals(AUTOBUS_NOLEGGIO_DA_RIMESSA);
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean isAutobusServizioPubblicoDiLinea() {
    return this.getCodice().equals(AUTOBUS_SERVIZIO_PUBBLICO_DI_LINEA);
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean isAutoveicoliTrasportoPesoComplessivoMaggiore12SospPneu() {
    return this.getCodice().equals(AUTOVEICOLI_TRASPORTO_PESO_COMPLESSIVO_MAGGIORE_12_SOSP_PNEU);
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean isAutoveicoliDieselSovratassaRidotta50() {
    return this.getCodice().equals(AUTOVEICOLI_DIESEL_SOVRATTASSA_RIDOTTA_50);
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean isPagamentoCumulativoPerRimorchi() {
    return this.getCodice().equals(PAGAMENTO_CUMULATIVO_PER_RIMORCHI);
  }
  
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean isMotoveicoloServizioPubblicoDaPiazza() {
    return this.getCodice().equals(MOTOVEICOLO_SERVIZIO_PUBBLICO_DA_PIAZZA);
  }
    
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean isNessunaRiduzioneApplicata() {
    return this.getCodice().equals(NESSUNA_RIDUZIONE_APPLICATA);
  }

}