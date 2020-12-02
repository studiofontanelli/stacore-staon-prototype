/*
 * Created on 14-feb-2005
 *
 */
package it.csi.stacore.staon.etc;

/**
 * @author curtoni
 */
public interface Constants {
	public static final String APPLICATION_NAME = "staon";

	public static final String IRIDE_APPLICATION_NAME = "STA";
	
	public static final int VERIFICA_STATO_ACCERTAMENTO_CHIAMANTE_FERMO = 1;
	public static final int VERIFICA_STATO_ACCERTAMENTO_CHIAMANTE_RINOTIFICA = 2;
	public static final int VERIFICA_STATO_ACCERTAMENTO_CHIAMANTE_RINOTIFICA_BATCH = 3;
	public static final int VERIFICA_STATO_ACCERTAMENTO_CHIAMANTE_PRENOTA_RINOTIFICA = 4;
	
	public static final String UTENTE_OSSERVAZIONI = "STAPOC_OSS";
	public static final String UTENTE_MEMORIE_DIFENSIVE = "STAPOC_MEM";
	public static final Long ID_CASSA_OSSERVAZIONI = new Long(21);
	public static final Long ID_CASSA_MEMORIE_DIFENSIVE = new Long(22);
	
	public static final int ID_TIPO_COMUNICAZ_CONTRIB_MEM = 2;
	public static final int ID_TIPO_COMUNICAZ_CONTRIB_DTE = 5;
	public static final int ID_TIPO_COMUNICAZ_CONTRIB_RAT = 6;
	
	public static final int ID_PROPRIETARIO = 1;
	public static final int ID_LOCATARIO = 2;
	public static final int ID_USUFRUTTARIO = 3;
	public static final int ID_PATTO_RISERVATO_DOMINIO = 4;
	public static final String COD_PROPRIETARIO = "P";
	public static final String COD_LOCATARIO = "L";
	public static final String DESCRIZIONE_PROPRIETARIO = "Proprietario";
	public static final String DESCRIZIONE_LOCATARIO = "Locatario";
	
	public static final int ID_TIPO_MODALITA_INOLTRO_MASSIVO = 1;
	public static final int ID_TIPO_MODALITA_INOLTRO_MAIL = 2;
	public static final int STATO_COM_USCITA_PRENOTATA_MASSIVO = 1;
	public static final int STATO_COM_USCITA_INSERITA_TRACCIATO = 2;
	public static final int STATO_COM_USCITA_INVIATA = 3;
	public static final int STATO_COM_USCITA_ESCLUSA_MASSIVO = 4;
	public static final int STATO_COM_USCITA_SCARTATA = 5;
	public static final int STATO_COM_USCITA_INVIATA_MAIL = 6;
	
	//ERRORI SISTESI PAGAMENTO
	public static final String ERRORE_NESSUN_RECORD_TROVATO = "Nessun dato trovato";
	public static final String ERRORE_DB_CONNECT = "Errore connessione db";
	public static final String ERRORE_STATO_PAGAMENTO = "Errore recuperare lo stato del pagamento ";
	public static final String ERRORE_GENERARE_IUV = "Impossibile fornire un codice di pagamento. Contattare l�assistenza";
	public static final String ERRORE_PAG_NON_DOVUTO = "Pagamento non dovuto";
	public static final String ERRORE_STATO_SCONOSCIUTO  = "Stato sconosciuto";
	public static final String ERRORE_PAG_NON_DOVUTO_ACC = "L'accertamento risulta gi� pagato";
	public static final String ERRORE_PAG_NON_DOVUTO_ACC_STATO_1 = "L'accertamento non � pagabile perch� non confermato";
	public static final String ERRORE_PAG_NON_DOVUTO_ACC_STATO_3 = "L'accertamento non � pagabile perch� � stato chiuso";
	public static final String ERRORE_PAG_NON_DOVUTO_ACC_STATO_4 = "L'accertamento non � pagabile perch� iscritto a ruolo";
	public static final String ERRORE_PAG_NON_DOVUTO_ACC_STATO_5 = "L'accertamento non � pagabile perch� rateizzato";
	public static final String ERRORE_PAG_NON_DOVUTO_ACC_STATO_6 = "L'accertamento non � pagabile perch� sospeso";
	public static final String ERRORE_PAG_RATA_GIA_PRESENTE = "Per il piano selezionato ci sono rate gi� pagate oppure con un pagamento in corso";
	
}
