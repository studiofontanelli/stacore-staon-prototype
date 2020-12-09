package it.csi.stacore.staon.bo.id;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class IdTipoOperazioneLogica extends IdDecodifica {
  //~ Static fields/initializers ===============================================

  /**
	 * 
	 */
	private static final long serialVersionUID = -6311416297348678241L;

/**
   *    1	001	Fusione veicolo
   */
  public static final IdTipoOperazioneLogica FUSIONE_VEICOLI = new IdTipoOperazioneLogica(1L);

  /**
   *    2	002	Immatricolazione veicolo
   */
  public static final IdTipoOperazioneLogica IMMATRICOLA_VEICOLO = new IdTipoOperazioneLogica(2L);

  /**
   *    3	003	Aggiornamento dati tecnici
   */
  public static final IdTipoOperazioneLogica MODIFICA_VEICOLO = new IdTipoOperazioneLogica(3L);

  /**
   *    4	004	Passaggio di propriet� (regionale)
   */
  public static final IdTipoOperazioneLogica PASSAGGIO_DI_PROPRIETA_REGIONALE = new IdTipoOperazioneLogica(4L);

  /**
   *    5	005	Passaggio di propriet� IR (uscita)
   */
  public static final IdTipoOperazioneLogica PASSAGGIO_DI_PROPRIETA_IR_USCITA = new IdTipoOperazioneLogica(5L);

  /**
   *    6	006	Modifica pagamento
   */
  public static final IdTipoOperazioneLogica MODIFICA_PAGAMENTO = new IdTipoOperazioneLogica(6L);

  /**
   *    7	007	Cancellazione pagamento
   */
  public static final IdTipoOperazioneLogica CANCELLA_PAGAMENTO = new IdTipoOperazioneLogica(7L);

  /**
   *    8	008	Modifica agevolazione
   */
  public static final IdTipoOperazioneLogica MODIFICA_AGEVOLAZIONE = new IdTipoOperazioneLogica(8L);

  /**
   *    9	009	Cancellazione agevolazione
   */
  public static final IdTipoOperazioneLogica CANCELLA_AGEVOLAZIONE = new IdTipoOperazioneLogica(9L);

  /**
   *    10	010	Inserimento agevolazione
   */
  public static final IdTipoOperazioneLogica INSERISCI_AGEVOLAZIONE = new IdTipoOperazioneLogica(10L);

  /**
   *    11	011	Inserimento pagamento
   */
  public static final IdTipoOperazioneLogica INSERISCI_PAGAMENTO = new IdTipoOperazioneLogica(11L);

  /**
   *    12	012	Cancellazione posizione
   */
  public static final IdTipoOperazioneLogica CANCELLA_POSIZIONE = new IdTipoOperazioneLogica(12L);

  /**
   *    13	013	Aggiornamento dati tecnici (cancellazione)
   */
  public static final IdTipoOperazioneLogica CANCELLA_DATI_TECNICI = new IdTipoOperazioneLogica(13L);

  /**
   *    14	014	Cancellazione riduzione
   */
  public static final IdTipoOperazioneLogica CANCELLA_RIDUZIONE = new IdTipoOperazioneLogica(14L);

  /**
   *    15	015	Inserimento riduzione
   */
  public static final IdTipoOperazioneLogica INSERISCI_RIDUZIONE = new IdTipoOperazioneLogica(15L);

  /**
   *    16	016	Modifica riduzione
   */
  public static final IdTipoOperazioneLogica MODIFICA_RIDUZIONE = new IdTipoOperazioneLogica(16L);

  /**
   *    17	017	Cancella contributo
   */
  public static final IdTipoOperazioneLogica CANCELLA_CONTRIBUTO = new IdTipoOperazioneLogica(17L);

  /**
   *    18	018	Inserisci contributo
   */
  public static final IdTipoOperazioneLogica INSERISCI_CONTRIBUTO = new IdTipoOperazioneLogica(18L);

  /**
   *    19	019	Modifica contributo
   */
  public static final IdTipoOperazioneLogica MODIFICA_CONTRIBUTO = new IdTipoOperazioneLogica(19L);

  /**
   *   20	020	Cambio di residenza IR (uscita)
   */
  public static final IdTipoOperazioneLogica CAMBIO_DI_RESIDENZA_IR_USCITA = new IdTipoOperazioneLogica(20L);

  /**
   *   21	021	Cambio di residenza IR (ingresso)
   */
  public static final IdTipoOperazioneLogica CAMBIO_DI_RESIDENZA_IR_INGRESSO = new IdTipoOperazioneLogica(21L);

  /**
   *   22	022	Passaggio di propriet� IR (ingresso)
   */
  public static final IdTipoOperazioneLogica PASSAGGIO_DI_PROPRIETA_IR_INGRESSO = new IdTipoOperazioneLogica(22L);

  /**
   *   23	023	Radiazione
   */
  public static final IdTipoOperazioneLogica RADIAZIONE = new IdTipoOperazioneLogica(23L);

  /**
   *   24	024	Esportazione
   */
  public static final IdTipoOperazioneLogica ESPORTAZIONE = new IdTipoOperazioneLogica(24L);

  /**
   *   25	025	Cessione ad ignoti
   */
  public static final IdTipoOperazioneLogica CESSIONE_AD_IGNOTI = new IdTipoOperazioneLogica(25L);

  /**
   *   26	026	Importazione
   */
  public static final IdTipoOperazioneLogica IMPORTAZIONE = new IdTipoOperazioneLogica(26L);

  /**
   *  27	027	Modifica posizione
   */
  public static final IdTipoOperazioneLogica MODIFICA_POSIZIONE = new IdTipoOperazioneLogica(27L);


  public static final IdTipoOperazioneLogica INSERISCI_PROPRIETARIO = new IdTipoOperazioneLogica(29L);
  
  
  /**
   *    30	030	Stampa duplicato
   */
  public static final IdTipoOperazioneLogica STAMPA_DUPLICATO = new IdTipoOperazioneLogica(30L);  

  public static final IdTipoOperazioneLogica AGGIORNAMENTO_SMARTCARD = new IdTipoOperazioneLogica(31L);  
  
  public static final IdTipoOperazioneLogica INSERIMENTO_RICHIESTA_SMARTCARD = new IdTipoOperazioneLogica(32L);  

  /**
   *    Gestione impianto a gas
   */
  public static final IdTipoOperazioneLogica INSERISCI_INSTALLAZIONE_GAS = new IdTipoOperazioneLogica(33L);  
  
  public static final IdTipoOperazioneLogica MODIFICA_INSTALLAZIONE_GAS = new IdTipoOperazioneLogica(34L);  
  
  public static final IdTipoOperazioneLogica CANCELLA_INSTALLAZIONE_GAS = new IdTipoOperazioneLogica(35L);  
  
  public static final IdTipoOperazioneLogica INSERISCI_DISINSTALLAZIONE_GAS = new IdTipoOperazioneLogica(36L);  
  
  public static final IdTipoOperazioneLogica MODIFICA_DISINSTALLAZIONE_GAS = new IdTipoOperazioneLogica(37L);  
  
  public static final IdTipoOperazioneLogica CANCELLA_DISINSTALLAZIONE_GAS = new IdTipoOperazioneLogica(38L);

  public static final IdTipoOperazioneLogica ACCERTAMENTO_RATEIZZAZIONE_APERTURA = new IdTipoOperazioneLogica(39L);
  public static final IdTipoOperazioneLogica ACCERTAMENTO_RATEIZZAZIONE_CHIUSURA = new IdTipoOperazioneLogica(40L);
  public static final IdTipoOperazioneLogica ACCERTAMENTO_MEM_DIFENSIVA_INCOMPLETA = new IdTipoOperazioneLogica(41L);
  public static final IdTipoOperazioneLogica ACCERTAMENTO_CHIUSURA = new IdTipoOperazioneLogica(42L);
  public static final IdTipoOperazioneLogica ACCERTAMENTO_RIAPERTURA = new IdTipoOperazioneLogica(43L);
  public static final IdTipoOperazioneLogica ACCERTAMENTO_STORNO_CREDITO = new IdTipoOperazioneLogica(44L);
  public static final IdTipoOperazioneLogica ACCERTAMENTO_INOLTRO = new IdTipoOperazioneLogica(45L);
  public static final IdTipoOperazioneLogica ACCERTAMENTO_CANCELLAZIONE = new IdTipoOperazioneLogica(46L);
  public static final IdTipoOperazioneLogica ACCERTAMENTO_INSERIMENTO = new IdTipoOperazioneLogica(47L);  
  public static final IdTipoOperazioneLogica ACCERTAMENTO_MODIFICA_MASSIVA = new IdTipoOperazioneLogica(58L);
  
  //Gestione osservazioni e comunicazione
  public static final IdTipoOperazioneLogica INSERIMENTO_COMUNICAZIONE = new IdTipoOperazioneLogica(59L);
  public static final IdTipoOperazioneLogica MODIFICA_COMUNICAZIONE = new IdTipoOperazioneLogica(60L);
  public static final IdTipoOperazioneLogica AGGIORNA_STATO_LAVORAZIONE_COMUNICAZIONE = new IdTipoOperazioneLogica(69L);
  public static final IdTipoOperazioneLogica INVIO_NOTIFICA = new IdTipoOperazioneLogica(70L);
  public static final IdTipoOperazioneLogica MODIFICA_NOTE_COMUNICAZIONE = new IdTipoOperazioneLogica(71L);
  public static final IdTipoOperazioneLogica AGGIORNA_STATO_COMUNICAZIONE = new IdTipoOperazioneLogica(81L);
  public static final IdTipoOperazioneLogica INSERIMENTO_COMUNICAZIONE_USCITA = new IdTipoOperazioneLogica(74L);
  public static final IdTipoOperazioneLogica CANCELLAZIONE_COMUNICAZIONE_USCITA = new IdTipoOperazioneLogica(75L);
  public static final IdTipoOperazioneLogica CANCELLAZIONE_LETTERA = new IdTipoOperazioneLogica(76L);

  
  //Contenzioso Flotte
  public static final IdTipoOperazioneLogica INSERIMENTO_LETTERA = new IdTipoOperazioneLogica(62L);
  public static final IdTipoOperazioneLogica MODIFICA_LETTERA = new IdTipoOperazioneLogica(63L);
  public static final IdTipoOperazioneLogica INSERIMENTO_NOTIFICA = new IdTipoOperazioneLogica(64L);
  public static final IdTipoOperazioneLogica MODIFICA_NOTIFICA = new IdTipoOperazioneLogica(65L);
  public static final IdTipoOperazioneLogica INSERIMENTO_ELAB_MASSIVA = new IdTipoOperazioneLogica(66L);
  public static final IdTipoOperazioneLogica MODIFICA_ELAB_MASSIVA = new IdTipoOperazioneLogica(67L);
  public static final IdTipoOperazioneLogica PRATICA_CHIUSURA = new IdTipoOperazioneLogica(72L);
  public static final IdTipoOperazioneLogica CAMBIO_USO = new IdTipoOperazioneLogica(80L);
  
  //Gestione Provvediment
  public static final IdTipoOperazioneLogica INSERIMENTO_PROVVEDIMENTO = new IdTipoOperazioneLogica(78L);
  public static final IdTipoOperazioneLogica MODIFICA_PROVVEDIMENTO = new IdTipoOperazioneLogica(79L);
  
  public static final IdTipoOperazioneLogica INSERIMENTO_GIUSTIF_BONIFICA = new IdTipoOperazioneLogica(107L);

  
  /**
   *    999	999	OPERAZIONE TEST ORACLE
   */
  public static final IdTipoOperazioneLogica TEST = new IdTipoOperazioneLogica(999L);

  //~ Constructors =============================================================

  /**
   *
   * @param id
   */
  private IdTipoOperazioneLogica(long id) {
    super(id);
  }
}
