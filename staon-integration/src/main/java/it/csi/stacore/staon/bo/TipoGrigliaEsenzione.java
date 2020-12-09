package it.csi.stacore.staon.bo;


public class TipoGrigliaEsenzione
{

    public static final String APPLICATION_CODE = "stapoc";
    public static final String CAPTCHA_SESSION_NAME = "current_captcha_value";
    public static final String COOCKIE_ENTRY_POINT = "COOCKIE_ENTRY_POINT";
    public static final String LOGIN_NO_AUTH = "/secure/HomePage.do";
    public static final String LOGIN_AUTH = "/base/authLogin.do";
    public static final int ID_TIPO_CANALE_SMS = 1;
    public static final int ID_TIPO_CANALE_MAIL = 2;
    public static final int ID_STATO_RICHIESTA_ATTESA = 1;
    public static final int ID_STATO_RICHIESTA_CONFERMA = 2;
    public static final int ID_STATO_RICHIESTA_REVOCA = 3;
    public static final String NOTA_INFORMATIVA = "I dati di natura personale acquisiti mediante il presente modello sono rilevati " +
"al solo fine di consentire l'istruttoria del procedimento cui il modello medesim" +
"o si riferisce, e verranno trattati con modalita' prevalentemente informatiche e" +
" con logiche rispondenti alle finalita' da perseguire, anche mediante la verific" +
"a dei dati esposti con altri dati in possesso della Regione, del Ministero dell'" +
"economia e delle finanze e di altri enti quali ad esempio, gli enti locali ed al" +
"tre pubbliche istituzioni . Titolare del trattamento dei dati e' la Regione Piem" +
"onte, direzione risorse finanziarie, settore politiche fiscali, e presso detta s" +
"truttura regionale e' possibile ottenere informazioni sui responsabili; sempre p" +
"resso tale struttura l'interessato potra' accedere ai propri dati per verificare" +
" l'utilizzo o, eventualmente, correggerli, aggiornarli nei limiti previsti dalla" +
" legge ed anche per cancellarli od opporsi al loro trattamento se in violazione " +
"della legge. La regione, in quanto soggetto pubblico, non deve acquisire il cons" +
"enso degli interessati per trattare i loro dati personali."
;
    public static final String EMAIL_VALIDATION_RULE = "([a-zA-Z0-9_\\-])([a-zA-Z0-9_\\-\\.]*)@(\\[((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-" +
"9][0-9]|[0-9])\\.){3}|((([a-zA-Z0-9\\-]+)\\.)+))([a-zA-Z]{2,}|(25[0-5]|2[0-4][0-" +
"9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\\])"
;
    public static final String TELEFONO_VALIDATION_RULE = "^(3\\d{8,10}$)";
    public static final int MAX_FILE_SIZE = 2000;
    public static final int MAX_FILE_SIZE_STABOF = 2000;
    public static final String osservazioneNoIntestatario = "1 - Non sono o non sono mai stato intestatario/intestataria del veicolo indicato";
    public static final String osservazioneVenditaVeicolo = "2 - Ho venduto il veicolo";
    public static final String osservazioneEsportazione = "3 - Il veicolo e' stato radiato per definitiva esportazione";
    public static final String osservazionePrivazione = "4 - Sono stato/stata privato/privata della disponibilita' del veicolo ";
    public static final String osservazioneEsenzioneDisabili = "5a - Il veicolo e' esente dal pagamento";
    public static final String osservazioneEsenzioneGpl = "5b - Il veicolo e' esente dal pagamento";
    public static final String osservazioneEsenzioneAltro = "5c - Il veicolo e' esente dal pagamento";
    public static final String osservazioneVenditaConcessionario = "6 - Ho venduto il veicolo ad un concessionario";
    public static final String osservazioneTrasferimento = "7 - Mi sono trasferito/trasferita in un'altra  Regione";
    public static final String osservazioneDemolizione = "8 - Il veicolo e' stato radiato per demolizione";
    public static final String osservazioneDatiTecnici = "9 - Dati tecnici non corretti";
    public static final String osservazioneAltro = "10 - Altro";
    public static final String infoGenerale = "I servizi senza registrazione che Bollo web mette a disposizione hanno l'obietti" +
"vo di rendere piu' rapida ed efficace la comunicazione tra il cittadino e Region" +
"e Piemonte in materia di tassa auto.<BR><BR>Per utilizzare le funzioni descritte" +
" di seguito, il cittadino non ha bisogno di effettuare operazioni di registrazio" +
"ne, ma e' pienamente responsabile delle comunicazioni inviate. "
;
    public static final String infoMemoBollo = "Il servizio consente di attivare la notifica automatica via email o via sms dell" +
"'avviso di scadenza della tassa automobilistica (bollo auto).\n\nIn prossimita' " +
"della scadenza, il contribuente verra' informato tramite una email e/o un sms de" +
"ll'importo dovuto e della data entro cui versarlo.\n\nNon ricevera' piu' l'avvis" +
"o cartaceo a casa.Per attivare il servizio occorre inserire i dati personali (no" +
"me, cognome e codice fiscale ), la targa del veicolo per il quale si intende ric" +
"evere l'avviso di scadenza (anche piu' di un veicolo per cittadino) e l'indirizz" +
"o email o il numero telefonico ai quali si desidera ricevere il promemoria. A qu" +
"esti stessi recapiti il sistema inviera' un codice necessario per completare l'a" +
"ttivazione.Il cittadino puo' in ogni momento modificare i riferimenti forniti o " +
"revocare il servizio.\n\nIn caso di perdita di possesso del veicolo, le comunica" +
"zioni ad esso collegate cesseranno automaticamente. Sara' cura del cittadino ins" +
"erire una nuova richiesta per l'eventuale nuovo veicolo."
;
    public static final String infoGos = "Il cittadino che rilevi un errore nei dati presenti sull'avviso di scadenza dell" +
"a tassa automobilistica oppure che ritenga di non dover ricevere tale avviso (ad" +
" esempio per vendita o demolizione del veicolo), puo' inviare segnalazione alla " +
"Regione Piemonte, utilizzando il servizio Osservazioni del contribuente.\n\nQues" +
"to servizio sostituisce l'invio postale del modulo cartaceo presente in preceden" +
"za sul retro dell'avviso di scadenza e prevede la compilazione e l'invio online " +
"del modulo.\n\nSi articola in 3 semplici passaggi:\n\npasso 1: individuazione de" +
"ll'avviso di scadenza sul quale si intende inserire l'osservazione e selezione d" +
"i una delle opzioni possibili\n\npasso 2 (opzionale): inserimento di eventuali a" +
"llegati in formato elettronico a dimostrazione di quanto dichiarato (ammessi fil" +
"e con dimensione non superiore a 2MB)\n\npasso 3: invio elettronico dell'osserva" +
"zione. Successivamente all'invio, si ricevera' il numero identificativo osservaz" +
"ione, che consentira' di verificare in tempo reale lo stato di \"lavorazione\" d" +
"ella pratica: ricevuta, in lavorazione, chiusa.\n\nSuccessivamente all'invio del" +
"l'osservazione, verra' restituito un codice identificativo che consentira' di ve" +
"rificare in seguito lo stato di \"lavorazione\" della pratica (ricevuta, in Lavo" +
"razione, chiusa).\n\nE' comunque possibile scaricare il modulo (disponibile anch" +
"e presso gli URP), compilarlo e inviarlo o consegnarlo direttamente ad un uffici" +
"o URP."
;
    public static final String infoPagBollo = "Il servizio consente all'automobilista...";
    public static final Integer ID_AGEVOLAZIONE_DISABILI = new Integer(3);
    public static final Integer ID_AGEVOLAZIONE_GPL_METANO = new Integer(31);
    public static final Integer ID_AGEVOLAZIONE_FURTO = new Integer(4);
    public static final Integer ID_AGEVOLAZIONE_PROVV_GIUDIZIARIO = new Integer(5);
    public static final String callerInvioEmailConTemplatePerRegistrazione = "RSCA";
    public static final String callerInvioSmsConTemplatePerRegistrazione = "RSCA";
    public static final String callerInvioEmailConTemplatePerRevoca = "RSCA";
    public static final String callerInvioSmsConTemplatePerRevoca = "RSCA";
    public static final String callerInvioEmailOsservazioneInviata = "GOSS";
    public static final String callerInvioSmsOsservazione = "GOSS";
    public static final String UTENTE_VEC = "VEC";
    public static final String FRUITORE_VEC = "VEC";
    public static final String STATO_PAGAMENTO_IRREGOLARE = "IRREGOLARE";
    public static final String STATO_PAGAMENTO_INGIUNZIONE = "INGIUNZIONE o ISCRIZIONE A RUOLO";
    public static final String STATO_PAGAMENTO_ACCERTAMENTO = "ACCERTAMENTO";
    public static final String STATO_PAGAMENTO_IN_SCADENZA = "IN SCADENZA";
    public static final String FROM_VISURE = "FROM_VISURE";
    public static final String PAGAMENTO_VISURE = "PAGAMENTO_VISURE";
    public static final String FROM_RISULTATI = "FROM_RISULTATI";
    public static final String ERRORE_CALCOLO_SITUAZIONE_CONTRIBUTIVA = "ERRORE_CALCOLO_SITUAZIONE_CONTRIBUTIVA";
    public static final String IMPOSSIBILE_PROSEGUIRE_RICERCA_VEICOLI_PROPRIETA = "Impossibile proseguire nella ricerca dei veicoli di proprieta";
    public static final String IMPOSSIBILE_PROSEGUIRE_CALCOLO_ESTRATTO_CONTO = "Impossibile proseguire con il calcolo estratto conto";
    public static final String IMPOSSIBILE_PROSEGUIRE_CALCOLO_SITUAZIONE_CONTRIBUTIVA = "Impossibile proseguire con il calcolo della situazione contributiva";
    public static final String IMPOSSIBILE_PROSEGUIRE_LOAD_PROGRESSBAR = "Impossibile proseguire con il caricamneto della progressbar";
    public static final String IMPOSSIBILE_PROSEGUIRE_LOAD_ESITO_PROGRESSBAR = "Impossibile proseguire con il caricamneto dell'esito della progressbar";
    public static final String IMPOSSIBILE_PROSEGUIRE_RICERCA_PAGAMENTI = "Impossibile proseguire nella ricerca dei pagamenti";
    public static final String IMPOSSIBILE_PROSEGUIRE_RICERCA_COMUNICAZIONI_UTENTE = "Impossibile proseguire nella ricerca delle comunicazioni utente";
    public static final String IMPOSSIBILE_PROSEGUIRE_RICERCA_COMUNICAZIONE_RATEIZZAZIONE = "Impossibile proseguire nella ricerca della comunicazione di rateizzazione";
    public static final String IMPOSSIBILE_PROSEGUIRE_RICERCA_COMUNICAZIONE_ESENZIONE = "Impossibile proseguire nella ricerca della comunicazione di esenzione";
    public static final String IMPOSSIBILE_PROSEGUIRE_RICERCA_COMUNICAZIONE_MEMORIE_DIFENSIVE = "Impossibile proseguire nella ricerca della comunicazione di osservazioni avvisi " +
"accertamento"
;
    public static final String IMPOSSIBILE_PROSEGUIRE_RICERCA_COMUNICAZIONE_RIMBORSO = "Impossibile proseguire nella ricerca della comunicazione di rimborso";
    public static final String IMPOSSIBILE_PROSEGUIRE_RICERCA_COMUNICAZIONE_OSSERVAZIONE = "Impossibile proseguire nella ricerca della comunicazione di osservazioni avvisi " +
"scadenza"
;
    public static final String KEY_DATI_PAGAMENTO = "DatiPagamento";
    public static final String VEICOLO_ESENTE = "Veicolo Esente";
    public static final String IMPOSSIBILE_PROSEGUIRE_CALCOLO_TASSA_AUTO = "Impossibile proseguire con il calcolo tassa auto";
    public static final String TXT_INFORMATIVA_CRITERI_CALCOLO = "- Nel caso la richiesta sia effettuata nel periodo previsto per il pagamento del" +
"la scadenza del veicolo specificato, non saranno indicati importi di sanzione e " +
"interessi.\n- Se la richiesta egrave; effettuata in data successiva al periodo p" +
"revisto per il pagamento, saranno indicati anche i relativi importi di sanzione " +
"e interessi.\n- Se la richiesta viene effettuata prima del periodo previsto per " +
"il pagamento, il servizio, facendo riferimento alla precedente scadenza, indiche" +
"ra&grave; le maggiorazioni dovute."
;
    public static final String FRUITORE_ESENZIONI_STASEND = "ESE";
    public static final String ESE_IND_EMAIL_MITTENTE = "ESE_IND_EMAIL_MITTENTE";
    public static final String FRUITORE_STADOC = "GESE";
    public static final String TIPO_DOCUMENTO_STADOC = "GESE_ALL";
    public static final String TIPO_DOCUMENTO_STADOC_ACTA = "GESE_MOD";
    public static final String ESENZIONI_FRUITORE = "ESE";
    public static final String ESENZIONI_EMAIL_MITTENTE = "dadefinire@csi.it";
    public static final String ESENZIONI_EMAIL_SUBJECT = "Conferma ricezione domanda di esenzione";
    public static final String ESENZIONI_TEMPLATE_EMAIL = "ESE_FO_EMAIL";
    public static final String ESENZIONI_TEMPLATE_SMS = "ESE_FO_SMS";
    public static final String COD_FONTE_COMUNICAZIONE_ONLINE = "FRONTOF";
    public static final String COD_STATO_COMUNICAZIONE_RICEVUTA = "RICEVUTA";
    public static final String COD_STATO_LAVORAZIONE_PROTOCOLLATA = "PROTOCOL";
    public static final String COD_TIPO_COMUNICAZIONE_OSS = "OSSER";
    public static final String COD_STATO_COMUNICAZIONE_ACCETTATA = "ACCETTATA";
    public static final String COD_STATO_LAVORAZIONE_CHIUSA_ACCETTATA = "CHIUSAACC";
    public static final String COD_TIPO_COMUNICAZIONE_ESENZIONE = "EPD";
    public static final String COD_TIPO_COMUNICAZIONE_MEMORIA_DIFENSIVA = "MEMOR";
    public static final String OSS_STADOC_COD_FRUITORE = "GOSS";
    public static final String OSS_STADOC_TIPO_DOCUMENTO = "GOSS_ALL";
    public static final String OSS_STADOC_TIPO_DOCUMENTO_ACTA = "GOSS_MOD";
    public static final int ID_GRIGLIA_OSS_RIGA1 = 0;
    public static final int ID_GRIGLIA_OSS_RIGA2 = 1;
    public static final int ID_GRIGLIA_OSS_RIGA3 = 3;
    public static final int ID_GRIGLIA_OSS_RIGA4 = 5;
    public static final int ID_GRIGLIA_OSS_RIGA5 = 7;
    public static final int ID_GRIGLIA_OSS_RIGA6 = 12;
    public static final int ID_GRIGLIA_OSS_RIGA7 = 15;
    public static final int ID_GRIGLIA_OSS_RIGA8 = 16;
    public static final int ID_GRIGLIA_OSS_RIGA9 = 17;
    public static final int ID_GRIGLIA_OSS_RIGA10 = 19;
    public static final int ID_GRIGLIA_OSS_RIGA11 = 20;
    public static final int ID_GRIGLIA_OSS_RIGA12 = 35;
    public static final int ID_GRIGLIA_OSS_DATA_VENDITA = 2;
    public static final int ID_GRIGLIA_OSS_DATA_ESPORTAZIONE = 4;
    public static final int ID_GRIGLIA_OSS_DATA_DEMOLIZIONE = 6;
    public static final int ID_GRIGLIA_OSS_DATA_PRIVAZIONE_DAL = 8;
    public static final int ID_GRIGLIA_OSS_DATA_PRIVAZIONE_AL = 9;
    public static final int ID_GRIGLIA_OSS_DATA_PROTOCOLLO = 13;
    public static final int ID_GRIGLIA_OSS_NRO_PROTOCOLLO = 50;
    public static final int ID_GRIGLIA_OSS_DATA_INST_GPL = 51;
    public static final int ID_GRIGLIA_OSS_ESENZ_ALTRO = 54;
    public static final int ID_GRIGLIA_OSS_DATA_VENDITA_CONCESSIONARIO = 52;
    public static final int ID_GRIGLIA_OSS_DATA_TRASFERIMENTO = 2;
    public static final int ID_GRIGLIA_OSS_CATEGORIA = 22;
    public static final int ID_GRIGLIA_OSS_TARGA = 23;
    public static final int ID_GRIGLIA_OSS_KW = 24;
    public static final int ID_GRIGLIA_OSS_CAT_EURO = 25;
    public static final int ID_GRIGLIA_OSS_EMISS_CO2 = 26;
    public static final int ID_GRIGLIA_OSS_ALIMENTAZIONE = 27;
    public static final int ID_GRIGLIA_OSS_IMP_GAS = 28;
    public static final int ID_GRIGLIA_OSS_PESO = 29;
    public static final int ID_GRIGLIA_OSS_NRO_ASSI = 30;
    public static final int ID_GRIGLIA_OSS_PORTATA = 31;
    public static final int ID_GRIGLIA_OSS_RIMORC = 32;
    public static final int ID_GRIGLIA_OSS_SOSP_PNEUMATICA = 33;
    public static final int ID_GRIGLIA_OSS_NRO_POSTI = 34;
    public static final int ID_GRIGLIA_OSS_ALTRO = 55;
    public static final int ID_GRIGLIA_COD_FISCALE = 38;
    public static final int ID_GRIGLIA_COGNOME = 39;
    public static final int ID_GRIGLIA_NOME = 40;
    public static final int ID_GRIGLIA_INDIRIZZO_RES = 41;
    public static final int ID_GRIGLIA_COMUNE_CAP_PROV = 42;
    public static final String folderAttivoINSERIMENTO_ESENZIONE = "INSERIMENTO_ESENZIONE";
    public static final String folderAttivoGESTIONE_ALLEGATI = "GESTIONE_ALLEGATI";
    public static final String folderAttivoRIEPILOGO_DATI = "RIEPILOGO_DATI";
    public static final String EMAIL_SUBJECT_ESE_INVIATA = "Conferma modifica indirizzo e-mail";
    public static final String EMAIL_TEMPLATE_ESE_INVIATA = "FO_MOD_EMAIL";
    public static final String UTENTE_STAPOC_ESENZIONI = "STAPOC_ESE";
    public static final int ID_GRIGLIA_ESE_NOME = 458;
    public static final int ID_GRIGLIA_ESE_COGNOME = 457;
    public static final int ID_GRIGLIA_ESE_CF = 459;
    public static final int ID_GRIGLIA_ESE_COMUNE_NASCITA = 460;
    public static final int ID_GRIGLIA_ESE_PROVINCIA_NASCITA = 461;
    public static final int ID_GRIGLIA_ESE_DATA_NASCITA = 462;
    public static final int ID_GRIGLIA_ESE_SESSO = 463;
    public static final int ID_GRIGLIA_ESE_COMUNE_DOMICILIO = 464;
    public static final int ID_GRIGLIA_ESE_PROVINCIA_DOMICILIO = 465;
    public static final int ID_GRIGLIA_ESE_CAP_DOMICILIO = 466;
    public static final int ID_GRIGLIA_ESE_INDIRIZZO_DOMICILIO = 468;
    public static final int ID_GRIGLIA_ESE_TELEFONO = 467;
    public static final int ID_GRIGLIA_ESE_EMAIL = 469;
    public static final int ID_GRIGLIA_ESE_OGGETTODOMANDA_A = 470;
    public static final int ID_GRIGLIA_ESE_TARGA_VEICOLO_RICHIESTA_ESE_A = 471;
    public static final int ID_GRIGLIA_ESE_DICHIARAZIONE_AA = 475;
    public static final int ID_GRIGLIA_ESE_DICHIARAZIONE_AB = 476;
    public static final int ID_GRIGLIA_ESE_DICHIARAZIONE_AC = 477;
    public static final int ID_GRIGLIA_ESE_DICHIARAZIONE_AD = 478;
    public static final int ID_GRIGLIA_ESE_OGGETTODOMANDA_B = 472;
    public static final int ID_GRIGLIA_ESE_TARGA_VEICOLO_RICHIESTA_ESE_B = 474;
    public static final int ID_GRIGLIA_ESE_TARGA_VEICOLO_CURRENT_ESE_B = 473;
    public static final int ID_GRIGLIA_ESE_DICHIARAZIONE_BA = 479;
    public static final int ID_GRIGLIA_ESE_DICHIARAZIONE_BB = 480;
    public static final int ID_GRIGLIA_ESE_DICHIARAZIONE_BC = 481;
    public static final int ID_GRIGLIA_ESE_RELAZIONE_PARENTELA = 482;
    public static final int ID_GRIGLIA_ESE_CF_FAMILIARE = 483;
    public static final int VALORE_GRIGLIA_SELEZIONATA = 1;
    public static final String UTENTE_STAPOC_OSSERVAZIONI = "STAPOC_OSS";
    public static final String DATE_FORMAT = "dd/MM/yyyy";
    public static final String PH_EMAIL_COGNOME = "COGNOME";
    public static final String PH_EMAIL_NOME = "NOME";
    public static final String PH_EMAIL_CODICE_FISCALE = "CODICE_FISCALE";
    public static final String PH_EMAIL_STATO_OSSERVAZIONE = "STATO_OSSERVAZIONE";
    public static final String PH_EMAIL_NUMERO_IDENTIFICATIVO = "NUMERO_IDENTIFICATIVO";
    public static final String PH_EMAIL_TARGA = "TARGA";
    public static final String PH_EMAIL_TIPO_VEICOLO = "TIPO_VEICOLO";
    public static final String PH_EMAIL_URL = "URL";
    public static final String PH_EMAIL_PROTOCOLLO_COMUNICAZIONE = "PROTOCOLLO_COMUNICAZIONE";
    public static final String PH_EMAIL_STATO_COMUNICAZIONE = "STATO_COMUNICAZIONE";
    public static final String PH_EMAIL_TIPO_COMUNICAZ_CONTRIB = "TIPO_COMUNICAZIONE_CONTRIB";
    public static final String EMAIL_SUBJECT_OSS_INVIATA = "ATTIVAZIONE Osservazione del contribuente su Avviso di scadenza tassa automobili" +
"stica."
;
    public static final String EMAIL_TEMPLATE_OSS_INVIATA = "GOSS_FO_EMAIL_INVIO";
    public static final String SMS_TEMPLATE_INFO_OSS = "GOSS_FO_SMS_INVIO";
    public static final String SMS_TEMPLATE_REVOCA_INFO_OSS = "GOSS_FO_SMS_REVOCA";
    public static final String EMAIL_SUBJECT_OSS_REVOCA = "REVOCA Osservazione del contribuente su Avviso di scadenza tassa automobilistica" +
"."
;
    public static final String EMAIL_TEMPLATE_OSS_REVOCA = "GOSS_FO_EMAIL_REVOCA";
    public static final String URL_BOLLO_WEB = "http://www.sistemapiemonte.it/cms/bolloweb";
    public static final String GOSS_IND_EMAIL_MITTENTE = "GOSS_IND_EMAIL_MITTENTE";
    public static final String NOTA_INFO_5 = "NOTA: Casi di privazione della disponibilita' del veicolo possono essere il furt" +
"o e il sequestro disposto dall'autorita' giudiziaria o di polizia."
;
    public static final String NOTA_INFO_6 = "ATTENZIONE: I dati devono riferirsi a un provvedimento della Regione Piemonte, d" +
"irezione risorse finanziarie, settore politiche fiscali (gia' settore tributi), " +
"e non ad altra documentazione (verbali, certificati sanitari, ecc.) non rilevant" +
"e ai fini fiscali."
;
    public static final String NOTA_INFO_9 = "ATTENZIONE: La procura a vendere, la dichiarazione di scarico di resposabilita'," +
" l'affidamento, la fattura o simili non sono idonei a provare il trasferimento d" +
"i proprieta' e non costituiscono valida giustificazione per il mancato pagamento" +
", occorrendo a tal fine un atto di compravendita registrato presso il pubblico r" +
"egistro automobilistico (voltura o minivoltura) o, in mancanza, quando l'acquire" +
"nte non abbia ottemperato all'obbligo di registrazione, un atto di data certa co" +
"me ad esempio l'autentica notarile, ovvero una sentenza del giudice di pace."
;
    public static final String RICERCA_OSS_5_2 = "Aggiornamento dati eseguito con successo.";
    public static final String RICERCA_OSS_5_3 = "Riferimento osservazione non presente negli archivi. Verificare la correttezza o" +
" selezionare con una diversa modalita' di ricerca."
;
    public static final String RICERCA_OSS_5_4 = "Nessuna osservazione rilevabile dai dati inseriti.  Verificare la correttezza e " +
"rieseguire la ricerca."
;
    public static final int RIFERIMENTO_LENGTH = 15;
    public static final String MESE_VALIDATION_RULE = "[1-9]|0[1-9]|1[012]";
    public static final String ANNO_VALIDATION_RULE = "(19|20)\\d\\d";
    public static final int MAX_LENGTH_NOTE = 4000;
    public static final String MSG_ERROR_ASSISTENZA = "Si e' verificato un problema tecnico. Contattare l'assistenza.";
    public static final String ANONIMO_PROVIDER = "ANONIMO_PROVIDER";
    public static final String AUTENTICATO_PROVIDER = "";
    public static final String AUTENTICATO_PA_PROVIDER = "";
    public static final Integer ID_TIPO_COMUNICAZIONE_OSSERVAZIONI = new Integer(1);
    public static final Integer ID_TIPO_COMUNICAZIONE_ESENZIONI = new Integer(3);
    public static final String ESE_PRIMA_RICHIESTA = "PRIMA RICHIESTA DI ESENZIONE";
    public static final String ESE_TRASFERIMENTO = "TRASFERIMENTO DI ESENZIONE";
    public static final String ESE_TIPO_A_AA = "&egrave; stato riconosciuto persona disabile grave ai sensi dell' art 3,comma 3," +
" della legge 104/1992 per ridotte o impedite capacit&agrave; motorie"
;
    public static final String ESE_TIPO_AA = "e' stato riconosciuto persona disabile grave ai sensi dell' art 3,comma 3, della" +
" legge 104/1992 per ridotte o impedite capacita' motorie"
;
    public static final String ESE_TIPO_A_AB = "&egrave; persona con disabilit&agrave; psichica o mentale con indennit&agrave; d" +
"i accompagnamento"
;
    public static final String ESE_TIPO_AB = "e' persona con disabilita' psichica o mentale con indennita' di accompagnamento";
    public static final String ESE_TIPO_A_AC = "&egrave; persona non vedente o ipovedente grave o sordomuta assoluta";
    public static final String ESE_TIPO_AC = "e'; persona non vedente o ipovedente grave o sordomuta assoluta";
    public static final String ESE_TIPO_A_AD = "&egrave; invalido con ridotte o impedite capacit&agrave; motorie e proprietario " +
"di un veicolo adattato in base alle prescrizioni della patente di guida"
;
    public static final String ESE_TIPO_AD = "e' invalido con ridotte o impedite capacita' motorie e proprietario di un veicol" +
"o adattato in base alle prescrizioni della patente di guida"
;
    public static final String ESE_TIPO_B_BA = "ha fiscalmente a carico un familiare persona disabile grave ai sensi dell' art 3" +
",comma 3, della legge 104/1992 per ridotte o impedite capacit&agrave; motorie"
;
    public static final String ESE_TIPO_BA = "ha fiscalmente a carico un familiare persona disabile grave ai sensi dell' art 3" +
",comma 3, della legge 104/1992 per ridotte o impedite capacita' motorie"
;
    public static final String ESE_TIPO_B_BB = "ha fiscalmente a carico un familiare persona con disabilit&agrave; psichica o me" +
"ntale con indennit&agrave; di accompagnamento"
;
    public static final String ESE_TIPO_BB = "ha fiscalmente a carico un familiare persona con disabilita' psichica o mentale " +
"con indennita' di accompagnamento"
;
    public static final String ESE_TIPO_B_BC = "ha fiscalmente a carico un familiare persona non vedente o ipovedente grave o so" +
"rdomuta assoluta"
;
    public static final String ESE_TIPO_BC = "ha fiscalmente a carico un familiare persona non vedente o ipovedente grave o so" +
"rdomuta assoluta"
;
    public static final String UTENTE_STAPOC_RIMBORSI = "STAPOC_RIM";
    public static final String CAP_VALIDATION_RULE = "[0-9]{5}";
    public static final String IBAN_VALIDATION_RULE = "[a-zA-Z]{2}[0-9]{2}[a-zA-Z0-9]{4}[0-9]{7}([a-zA-Z0-9]?){0,16}";
    public static final String RIMBORSI_TIPO_ACCESSO_WEB = "WEB";
    public static final String RIMBORSI_TIPO_ACCESSO_BACKOFFICE = "BACKOFFICE";
    public static final String RIMBORSI_PASSO_NUOVO_RIMBORSO = "PASSO_NUOVO_RIMBORSO";
    public static final String RIMBORSI_PASSO_DELEGA = "PASSO_DELEGA";
    public static final int RIMBORSI_PERSONA_FISICA = 1;
    public static final int RIMBORSI_PERSONA_GIURIDICA = 2;
    public static final String RIMBORSI_TESTO_INS_ALLEGATO1 = "<b>In caso di doppio pagamento bisogna allegare la scansione del pagamento errat" +
"o e la scansione del pagamento corretto.</b>"
;
    public static final String RIMBORSI_TESTO_INS_ALLEGATO2 = "<b>In caso di pagamento eccessivo bisogna allegare la scansione del versamento.<" +
"/b>"
;
    public static final String RIMBORSI_TESTO_INS_ALLEGATO3 = "<b>In caso di pagamento non dovuto bisogna allegare la scansione del versamento." +
"</b>"
;
    public static final String RIMBORSI_TESTO_INS_ALLEGATO4 = "<b>In caso di perdita di possesso bisogna allegare la scansione del versamento e" +
" la scansione del cdp dove risulta l'annotazione del furto o della rottamazione." +
"</b>"
;
    public static final String RIMBORSI_STADOC_COD_FRUITORE = "GRIM";
    public static final String RIMBORSI_STADOC_TIPO_DOCUMENTO = "GRIM_ALL";
    public static final String RIMBORSI_STADOC_TIPO_DOCUMENTO_ACTA = "GRIM_MOD";
    public static final String RIMBORSI_STASEND_COD_FRUITORE = "RIM";
    public static final String RIMBORSI_STASEND_TEMPLATE_MAIL = "RIM_FO_EMAIL";
    public static final String RIMBORSI_STASEND_TEMPLATE_SMS = "RIM_FO_SMS";
    public static final String RIMBORSI_STASEND_TITOLO_MAIL = "Registrazione della richiesta di restituzione";
    public static final String RIMBORSI_STASEND_TITOLO_SMS = "Titolo sms provvisorio";
    public static final int RIMBORSI_DELEGA_COD_CHECK1 = 1;
    public static final int RIMBORSI_DELEGA_COD_CHECK2 = 2;
    public static final int RIMBORSI_DELEGA_COD_CHECK3 = 3;
    public static final int RIMBORSI_DELEGA_COD_CHECK4 = 4;
    public static final int RIMBORSI_DELEGA_COD_CHECK5 = 5;
    public static final String RIMBORSI_DELEGA_DESC_CHECK1 = "Erede del/della contribuente";
    public static final String RIMBORSI_DELEGA_DESC_CHECK2 = "Curatore dell&#180;eredit&agrave; giacente o amministratore di eredit&agrave; de" +
"voluta sotto condizione sospensiva"
;
    public static final String RIMBORSI_DELEGA_DESC_CHECK3 = "Rappresentante di minore, inabilitato o interdetto";
    public static final String RIMBORSI_DELEGA_DESC_CHECK4 = "Curatore fallimentare, commissario giudiziale, custode o amministratore giudizia" +
"rio"
;
    public static final String RIMBORSI_DELEGA_DESC_CHECK5 = "Liquidatore";
    public static final String RIMBORSI_OGGETTO_DESC_CHECK1 = "Doppio pagamento";
    public static final String RIMBORSI_OGGETTO_DESC_CHECK2a = "Pagamento eccessivo relativo a targa errata %";
    public static final String RIMBORSI_OGGETTO_DESC_CHECK2b = "Pagamento eccessivo per errore materiale (dati tecnici utilizzati per calcolare " +
"il versamento errati)"
;
    public static final String RIMBORSI_OGGETTO_DESC_CHECK3 = "Pagamento non dovuto; motivo: %";
    public static final String RIMBORSI_OGGETTO_DESC_CHECK4a = "Chiedo la restituzione per il periodo, pari almeno ad un quadrimestre, nel quale" +
" non ho goduto il possesso del veicolo"
;
    public static final String RIMBORSI_OGGETTO_DESC_CHECK4b = "Chiedo la restituzione della differenza tra la tassa pagata e l&#180;importo gi&" +
"agrave; compensato sulla tassa dovuta per un altro veicolo"
;
    public static final int RIMBORSI_MODALITA_COD_CHECK1 = 1;
    public static final int RIMBORSI_MODALITA_COD_CHECK2 = 2;
    public static final String RIMBORSI_MODALITA_DESC_REST = "Restituzione dell&rsquo;importo a rimborso su conto corrente avente IBAN %";
    public static final String RIMBORSI_MODALITA_DESC_COMP_VEICOLO_MIO = "Compensazione dovuta a veicoli di mia propriet&agrave;";
    public static final String RIMBORSI_MODALITA_DESC_COMP_VEICOLO_ALTRUI = "Compensazione dovuta a veicoli di propriet&agrave; di altro soggetto avente codi" +
"ce fiscale %"
;
    public static final String RIMBORSI_INFO_RESTITUZIONE = "In alternativa al rimborso si pu&ograve; chiedere la restituzione mediante compe" +
"nsazione delle somme indebitamente pagate con riduzione, alla prima scadenza uti" +
"le, della tassa dovuta per veicoli di propriet&agrave; del richiedente o di prop" +
"riet&agrave; di altro soggetto, residente in un Comune della Regione, indicato d" +
"allo stesso richiedente. Se si desidera utilizzare questa opportunit&agrave; alt" +
"ernativa non si deve compilare questo modello, ma il modello CTA &ndash; domanda" +
" di restituzione della tassa automobilistica (compensazione). "
;
    public static final String RIMBORSI_INFO_COMPENSAZIONE = "Se entro il termine di 90 giorni decorrente dalla data di presentazione della do" +
"manda, non interviene comunicazione da parte della Regione, la domanda s&rsquo;i" +
"ntende accolta e il credito pu&ograve; essere fatto valere dal richiedente, o da" +
"l soggetto sopra indicato, all&rsquo;atto del pagamento, di fronte ad un interme" +
"diario della riscossione autorizzato e collegato in via telematica all&rsquo;arc" +
"hivio regionale*, che &egrave; tenuto a darvi applicazione dopo aver verificato " +
"che il credito trovi riscontro sul sistema informativo. Se la Regione, a seguito" +
" di ulteriori verifiche, riscontra un indebito riconoscimento di credito, invita" +
" il contribuente cui il credito &egrave; stato riconosciuto a pagare, a titolo d" +
"i integrazione, l&rsquo;importo indebitamente compensato senza applicazione dell" +
"a sanzione per insufficiente versamento e senza interessi, assegnando un congruo" +
" termine che non pu&ograve; essere in ogni caso inferiore a 30 giorni, fatti sal" +
"vi gli eventuali casi di attivit&agrave; fraudolenta.N.B.: Se dal sistema inform" +
"ativo risultano, per altri veicoli o periodi, situazioni debitorie, il credito p" +
"otr&agrave; essere applicato d&rsquo;ufficio alle medesime e non &egrave; comunq" +
"ue cedibile. * l&rsquo;elenco degli intermediari autorizzati e collegati &egrave" +
"; pubblicato sul sito della Regione www.regione.piemonte.it, area tematica tribu" +
"ti, pagina tassa automobilistica. "
;
    public static final String RIMBORSI_TESTO_COMPENSAZIONE = "Chiedo la restituzione mediante compensazione della somma indebitamente pagata c" +
"on riduzione, alla prima scadenza utile, della tassa dovuta per veicoli:"
;
    public static final String COD_TIPO_COMUNICAZIONE_RIMBORSO = "RIM";
    public static final int ID_TIPO_COMUNICAZIONE_RIMBORSO = 4;
    public static final int ID_GRIGLIA_RIM_CF_PF = 300;
    public static final int ID_GRIGLIA_RIM_COGNOME = 301;
    public static final int ID_GRIGLIA_RIM_NOME = 302;
    public static final int ID_GRIGLIA_RIM_COMUNE_NASCITA = 303;
    public static final int ID_GRIGLIA_RIM_PROV_NASCITA = 304;
    public static final int ID_GRIGLIA_RIM_DATA_NASCITA = 305;
    public static final int ID_GRIGLIA_RIM_SESSO = 306;
    public static final int ID_GRIGLIA_RIM_CF_PG = 307;
    public static final int ID_GRIGLIA_RIM_DENOMINAZIONE_PG = 308;
    public static final int ID_GRIGLIA_RIM_COMUNE_DOM = 309;
    public static final int ID_GRIGLIA_RIM_PROVINCIA_DOM = 310;
    public static final int ID_GRIGLIA_RIM_CAP_DOM = 311;
    public static final int ID_GRIGLIA_RIM_TELEFONO = 312;
    public static final int ID_GRIGLIA_RIM_INDIRIZZO_DOM = 313;
    public static final int ID_GRIGLIA_RIM_MAIL = 314;
    public static final int ID_GRIGLIA_RIM_OGG_CK_PAG_DOPPIO = 315;
    public static final int ID_GRIGLIA_RIM_OGG_CK_PAG_ECCESSIVO = 316;
    public static final int ID_GRIGLIA_RIM_OGG_CK_PAG_TARGA_ERRATA = 318;
    public static final int ID_GRIGLIA_RIM_OGG_TARGA_ERRATA = 319;
    public static final int ID_GRIGLIA_RIM_OGG_CK_PAG_ERRORE_MATERIALE = 317;
    public static final int ID_GRIGLIA_RIM_OGG_CK_PAG_NON_DOVUTO = 320;
    public static final int ID_GRIGLIA_RIM_OGG_MOTIVO_PAG_NON_DOVUTO = 321;
    public static final int ID_GRIGLIA_RIM_OGG_CK_PERDITA_POSSESSO = 322;
    public static final int ID_GRIGLIA_RIM_OGG_CK_PERDITA_POSSESSO_D1 = 323;
    public static final int ID_GRIGLIA_RIM_OGG_CK_PERDITA_POSSESSO_D2 = 324;
    public static final int ID_GRIGLIA_RIM_MOD_CK_COMPENSAZIONE = 325;
    public static final int ID_GRIGLIA_RIM_MOD_CK_COMP_PROPRIETARIO = 326;
    public static final int ID_GRIGLIA_RIM_MOD_CK_COMP_ALTRO = 327;
    public static final int ID_GRIGLIA_RIM_MOD_COMPENSAZIONE_CF = 328;
    public static final int ID_GRIGLIA_RIM_MOD_CK_RIMBORSO = 330;
    public static final int ID_GRIGLIA_RIM_MOD_RIMBORSO_IBAN = 331;
    public static final int ID_GRIGLIA_RIM_PAGAM_TIPO_VEICOLO = 333;
    public static final int ID_GRIGLIA_RIM_PAGAM_TARGA = 334;
    public static final int ID_GRIGLIA_RIM_PAGAM_SCADENZA = 335;
    public static final int ID_GRIGLIA_RIM_PAGAM_VALIDITA = 336;
    public static final int ID_GRIGLIA_RIM_PAGAM_DATA = 337;
    public static final int ID_GRIGLIA_RIM_PAGAM_IMPORTO = 338;
    public static final int ID_GRIGLIA_RIM_DATA_COMPILAZIONE = 339;
    public static final String UTENTE_ISTANZA_RIMBORSO_STARIMON = "STAPOC";
    public static final String RUOLO_AUTENTICATO_CITTADINO = "AUTENTICATO_CITTADINO";
    public static final String RUOLO_AUTENTICATO_PA = "AUTENTICATO_PA";
    public static final String RUOLO_NON_AUTENTICATO = "NON_AUTENTICATO";
    public static final Integer ID_TIPO_COMUNICAZIONE_MEMORIE_DIFENSIVE = new Integer(2);
    public static final int ID_GRIGLIA_MEM_A01 = 200;
    public static final int ID_GRIGLIA_MEM_A02 = 201;
    public static final int ID_GRIGLIA_MEM_A03 = 202;
    public static final int ID_GRIGLIA_MEM_A04 = 204;
    public static final int ID_GRIGLIA_MEM_A05 = 206;
    public static final int ID_GRIGLIA_MEM_A06 = 207;
    public static final int ID_GRIGLIA_MEM_B01 = 212;
    public static final int ID_GRIGLIA_MEM_B02 = 213;
    public static final int ID_GRIGLIA_MEM_B03 = 216;
    public static final int ID_GRIGLIA_MEM_B04 = 218;
    public static final int ID_GRIGLIA_MEM_B051 = 223;
    public static final int ID_GRIGLIA_MEM_B052 = 227;
    public static final int ID_GRIGLIA_MEM_B053 = 229;
    public static final int ID_GRIGLIA_MEM_B06 = 231;
    public static final int ID_GRIGLIA_MEM_B07 = 235;
    public static final int ID_GRIGLIA_MEM_B08 = 237;
    public static final int ID_GRIGLIA_MEM_B09 = 240;
    public static final int ID_GRIGLIA_MEM_B10 = 242;
    public static final int ID_GRIGLIA_MEM_C01 = 244;
    public static final int ID_GRIGLIA_MEM_C02 = 246;
    public static final int ID_GRIGLIA_MEM_C03 = 261;
    public static final int ID_GRIGLIA_MEM_A06_NOTE = 208;
    public static final int ID_GRIGLIA_MEM_A_DATA_VERS = 209;
    public static final int ID_GRIGLIA_MEM_A_NUM_QUIETANZA = 210;
    public static final int ID_GRIGLIA_MEM_A_UFFICIO_ACC = 211;
    public static final int ID_GRIGLIA_MEM_B02_DATA_VENDITA = 214;
    public static final int ID_GRIGLIA_MEM_B03_DATA_ESPORTAZIONE = 217;
    public static final int ID_GRIGLIA_MEM_B04_DATA_PRIVAZIONE_DAL = 219;
    public static final int ID_GRIGLIA_MEM_B04_DATA_PRIVAZIONE_AL = 220;
    public static final int ID_GRIGLIA_MEM_B051_DATA_PROTOCOLLO = 225;
    public static final int ID_GRIGLIA_MEM_B051_NRO_PROTOCOLLO = 224;
    public static final int ID_GRIGLIA_MEM_B052_DATA_INST_GPL = 228;
    public static final int ID_GRIGLIA_MEM_B053_ESENZ_ALTRO = 230;
    public static final int ID_GRIGLIA_MEM_B06_DATA_VENDITA_CONCESSIONARIO = 232;
    public static final int ID_GRIGLIA_MEM_B07_DATA_TRASFERIMENTO = 236;
    public static final int ID_GRIGLIA_MEM_B08_DATA_DEMOLIZIONE = 238;
    public static final int ID_GRIGLIA_MEM_B09_NOTE_PAG_ALTRO = 241;
    public static final int ID_GRIGLIA_MEM_B10_NOTE = 243;
    public static final int ID_GRIGLIA_MEM_C01_NOTE = 245;
    public static final int ID_GRIGLIA_MEM_C02_CATEGORIA = 248;
    public static final int ID_GRIGLIA_MEM_C02_TARGA = 249;
    public static final int ID_GRIGLIA_MEM_C02_KW = 250;
    public static final int ID_GRIGLIA_MEM_C02_CAT_EURO = 251;
    public static final int ID_GRIGLIA_MEM_C02_EMISS_CO2 = 252;
    public static final int ID_GRIGLIA_MEM_C02_ALIMENTAZIONE = 253;
    public static final int ID_GRIGLIA_MEM_C02_IMP_GAS = 254;
    public static final int ID_GRIGLIA_MEM_C02_PESO = 255;
    public static final int ID_GRIGLIA_MEM_C02_NRO_ASSI = 256;
    public static final int ID_GRIGLIA_MEM_C02_PORTATA = 257;
    public static final int ID_GRIGLIA_MEM_C02_RIMORC = 258;
    public static final int ID_GRIGLIA_MEM_C02_SOSP_PNEUMATICA = 259;
    public static final int ID_GRIGLIA_MEM_C02_NRO_POSTI = 260;
    public static final int ID_GRIGLIA_MEM_C03_NOTE = 262;
    public static final String MEM_STADOC_COD_FRUITORE = "GMDE";
    public static final String MEM_STADOC_TIPO_DOCUMENTO = "GMDE_ALL";
    public static final String MEM_STADOC_TIPO_DOCUMENTO_ACTA = "GMDE_MOD";
    public static final String MEM_A01 = "A01 - I pagamenti sono corretti";
    public static final String MEM_A02 = "A02 - Ho indicato la targa in modo errato";
    public static final String MEM_A03 = "A03 - Ho indicato una scadenza errata";
    public static final String MEM_A04 = "A04 - Il veicolo &egrave; stato ritargato";
    public static final String MEM_A05 = "A05 - Ho pagato a favore di altra Regione o Provincia autonoma";
    public static final String MEM_A06 = "A06 - Altro";
    public static final String MEM_B01 = "B01 - Non sono o non sono mai stato/stata intestatario/intestataria del veicolo " +
"indicato"
;
    public static final String MEM_B02 = "B02 - Ho venduto il veicolo in data ";
    public static final String MEM_B03 = "B03 - Il veicolo &egrave; stato radiato per definitiva esportazione in data ";
    public static final String MEM_B04 = "B04 - Sono stato&#47;stata privato&#47;privata della disponibilit&agrave; del ve" +
"icolo "
;
    public static final String MEM_B051 = "B05 - Ho ottenuto l&apos;esenzione prevista per le persone disabili con provvedi" +
"mento prot. n "
;
    public static final String MEM_B052 = "B05 - Ho installato l&apos;impianto GPL$@47;metano collaudato in data ";
    public static final String MEM_B053 = "B05 - Altro";
    public static final String MEM_B06 = "B06 - Ho venduto il veicolo a un concessionario in data ";
    public static final String MEM_B07 = "B07 - Mi sono traserito&#47;traserita in altra Regione in data ";
    public static final String MEM_B08 = "B08 - Il veicolo &egrave; stato radiato per demolizione in data ";
    public static final String MEM_B09 = "B09 - Il pagamento competeva ad altro soggetto perch&egrave; ";
    public static final String MEM_B10 = "B10 - Altro";
    public static final String MEM_C01 = "C01 - Avevo diritto alla riduzione perch&egrave; ";
    public static final String MEM_C02 = "C02 - I dati indicati non corrispondono a quelli risultanti dalla carta di circo" +
"lazione del veicolo "
;
    public static final String MEM_C03 = "C03 - Altro";
    public static final String UTENTE_STAPOC_MEMORIE = "STAPOC_MEM";
    public static final String UTENTE_STAPOC_DDS = "STAPOC_DDS";
    public static final String DDS_PERSONA_FISICA = "F";
    public static final String DDS_PERSONA_GIURIDICA = "G";
    public static final String DDS_LABEL_OGGETTO_DOMANDA = "1 - Chiedo il discarico amministrativo (annullamento)";
    public static final String DDS_LABEL_OGGETTO_RIMBORSO = "2 - Avendo gi\340 provveduto al pagamento, chiedo il rimborso";
    public static final String DDS_LABEL_OGGETTO_MOTIVO1 = "Pagamento eseguito (allegare fotocopia del versamento)";
    public static final String DDS_LABEL_OGGETTO_MOTIVO2 = "Mancanza del presupposto";
    public static final String DDS_LABEL_OGGETTO_MOTIVO3 = "Altro (specificare)";
    public static final String DDS_TIPO_DOMANDA_DISCARICO = "Domanda di discarico amministrativo";
    public static final String DDS_TIPO_DOMANDA_RIMBORSO = "Domanda di rimborso";
    public static final String DDS_TIPO_DOMANDA_MOTIVO1 = "Pagamento eseguito";
    public static final String DDS_TIPO_DOMANDA_MOTIVO2 = "Mancanza del presupposto";
    public static final String DDS_CODICE_TRIBUTO_TOTALE = "totale";
    public static final String DDS_CODICE_TRIBUTO_TASSA = "1B66";
    public static final String DDS_CODICE_TRIBUTO_INTERESSI = "1B67";
    public static final String DDS_CODICE_TRIBUTO_SANZIONI = "1B68";
	public static final String DDS_CODICE_TRIBUTO_ALTRE_SPESE = "1D35";
    public static final String DDS_STADOC_COD_FRUITORE = "GDDS";
    public static final String DDS_STADOC_TIPO_DOCUMENTO = "GDDS_ALL";
    public static final String DDS_STADOC_TIPO_DOCUMENTO_ACTA = "GDDS_MOD";
    public static final String DDS_STASEND_COD_FRUITORE = "DDS";
    public static final String DDS_NOTA_INFORMATIVA = "I dati di natura personale acquisiti mediante il presente modello sono rilevati " +
"al solo fine di consentire l\u2019istruttoria della domanda cui il modello medes" +
"imo si riferisce, e verranno trattati con modalit\340 prevalentemente informatic" +
"he e con logiche rispondenti alle finalit\340 da perseguire, anche mediante la v" +
"erifica dei dati esposti con altri dati in possesso della Regione, del Ministero" +
" dell\u2019economia e delle finanze e di altri enti quali, ad esempio, gli enti " +
"locali ed altre pubbliche istituzioni. Titolare del trattamento dei dati \350 la" +
" Regione Piemonte, direzione risorse finanziarie, settore politiche fiscali, e p" +
"resso detta struttura regionale &egrave; possibile ottenere informazioni sui res" +
"ponsabili; sempre presso tale struttura l\u2019interessato potr&agrave; accedere" +
" ai propri dati per verificarne l\u2019utilizzo o, eventualmente, correggerli, a" +
"ggiornarli nei limiti previsti dalla legge ed anche per cancellarli od opporsi a" +
"l loro trattamento se trattati in violazione della legge. La Regione, in quanto " +
"soggetto pubblico, non deve acquisire il consenso degli interessati per trattare" +
" i loro dati personali."
;
    public static final String COD_TIPO_COMUNICAZIONE_DDS = "DTE";
    public static final Integer ID_TIPO_COMUNICAZIONE_DDS = new Integer(5);
    public static final int ID_GRIGLIA_DDS_CF_PF = 350;
    public static final int ID_GRIGLIA_DDS_COGNOME = 351;
    public static final int ID_GRIGLIA_DDS_NOME = 352;
    public static final int ID_GRIGLIA_DDS_COMUNE_NASCITA = 353;
    public static final int ID_GRIGLIA_DDS_PROV_NASCITA = 354;
    public static final int ID_GRIGLIA_DDS_DATA_NASCITA = 355;
    public static final int ID_GRIGLIA_DDS_SESSO = 356;
    public static final int ID_GRIGLIA_DDS_CF_PG = 357;
    public static final int ID_GRIGLIA_DDS_DENOMINAZIONE_PG = 358;
    public static final int ID_GRIGLIA_DDS_COMUNE_DOM = 359;
    public static final int ID_GRIGLIA_DDS_PROV_DOM = 360;
    public static final int ID_GRIGLIA_DDS_CAP_DOM = 361;
    public static final int ID_GRIGLIA_DDS_TEL_DOM = 362;
    public static final int ID_GRIGLIA_DDS_INDIRIZZO_DOM = 363;
    public static final int ID_GRIGLIA_DDS_MAIL = 364;
    public static final int ID_GRIGLIA_DDS_OGG_CK_DISCARICO = 366;
    public static final int ID_GRIGLIA_DDS_OGG_CK_TOT = 367;
    public static final int ID_GRIGLIA_DDS_OGG_CK_PARZ = 368;
    public static final int ID_GRIGLIA_DDS_OGG_CK_RIMBORSO = 369;
    public static final int ID_GRIGLIA_DDS_OGG_CK_MOTIVO1 = 371;
    public static final int ID_GRIGLIA_DDS_OGG_CK_MOTIVO2 = 372;
    public static final int ID_GRIGLIA_DDS_OGG_CK_MOTIVO3 = 373;
    public static final int ID_GRIGLIA_DDS_OGG_ALTRO_MOTIVO = 374;
    public static final int ID_GRIGLIA_DDS_CK_TIT_ING = 375;
    public static final int ID_GRIGLIA_DDS_CK_TIT_CART = 376;
    public static final int ID_GRIGLIA_DDS_TIT_DATA_NOTIFICA = 377;
    public static final int ID_GRIGLIA_DDS_TIT_NUMERO = 378;
    public static final int ID_GRIGLIA_DDS_TIT_TRIBUTI = 379;
    public static final int ID_GRIGLIA_DDS_TIT_IMPORTO = 380;
    public static final int ID_GRIGLIA_DDS_CK_TIT_FOTOCOPIA = 382;
    public static final int ID_GRIGLIA_DDS_COORD_BANC = 384;
    public static final int ID_GRIGLIA_DDS_DATA_COMPILAZIONE = 385;
    public static final String EMAIL_SUBJECT_RAT_INVIATA = "Conferma modifica indirizzo e-mail";
    public static final String EMAIL_TEMPLATE_RAT_INVIATA = "FO_MOD_EMAIL";
    public static final String SMS_TEMPLATE_RAT_INVIATA = "FO_MOD_SMS";
    public static final String FRUITORE_RATEIZZAZIONII_STASEND = "RAT";
    public static final String RAT_IND_EMAIL_MITTENTE = "RAT_IND_EMAIL_MITTENTE";
    public static final String PROTOCOLLO_VALIDATION_RULE = "[0-9]{1}[0]{1}[1-9]{1}[99]{2}[0]{1}[1-3]{1}$|[0-9]{1}[1]{1}[0-2]{1}[99]{2}[0]{1}" +
"[1-3]{1}$|[0-9]{1}[1]{1}[0-2]{1}annoCorrenteDecine[0-annoCorrenteUnita]{1}[0]{1}" +
"[1-3]{1}$|[0-9]{1}[0]{1}[1-9]{1}annoCorrenteDecine[0-annoCorrenteUnita]{1}[0]{1}" +
"[1-3]{1}$|[0-9]{1}[1]{1}[0-2]{1}[0-annoCorrenteDecinePrecedenti]{1}[0-9]{1}[0]{1" +
"}[1-3]{1}$|[0-9]{1}[0]{1}[1-9]{1}[0-annoCorrenteDecinePrecedenti]{1}[0-9]{1}[0]{" +
"1}[1-3]{1}$|[0-9]{1}[0]{1}[1-9]{1}[99]{2}[0]{1}[1-3]{1}[0]{1}$|[0-9]{1}[1]{1}[0-" +
"2]{1}[99]{2}[0]{1}[1-3]{1}[0]{1}$|[0-9]{1}[1]{1}[0-2]{1}annoCorrenteDecine[0-ann" +
"oCorrenteUnita]{1}[0]{1}[1-3]{1}[0]{1}$|[0-9]{1}[0]{1}[1-9]{1}annoCorrenteDecine" +
"[0-annoCorrenteUnita]{1}[0]{1}[1-3]{1}[0]{1}$|[0-9]{1}[1]{1}[0-2]{1}[0-annoCorre" +
"nteDecinePrecedenti]{1}[0-9]{1}[0]{1}[1-3]{1}[0]{1}$|[0-9]{1}[0]{1}[1-9]{1}[0-an" +
"noCorrenteDecinePrecedenti]{1}[0-9]{1}[0]{1}[1-3]{1}[0]{1}$"
;
    public static final String STRINGHE_VALIDATION_RULE = "[^%&!?@*/0-9]+$";
    public static final String INDIRIZZO_VALIDATION_RULE = "[^%&!?@*/]+$";
    public static final String NUMBER_VALIDATION_RULE = "[0-9]+$";
    public static final String CF_PIVA_MANCANTE = "Inserire l&rsquo;identificativo fiscale del soggetto che richiede la rateizzazio" +
"ne."
;
    public static final String DATA_COMPILAZIONE_MANCANTE = "Inserire la data compilazione della richiesta di rateizzazione relativa all&rsqu" +
"o;identificativo fiscale del soggetto."
;
    public static final String DATA_COMPILAZIONE_PRECEDENTE = "La data compilazione della richiesta di rateizzazione relativa all&rsquo;identif" +
"icativo fiscale specificato non pu\362 essere successiva alla data odierna."
;
    public static final String FONTE_COMUNICAZIONE_MANCANTE = "Inserire la fonte della comunicazione della richiesta di rateizzazione relativa " +
"all&rsquo;identificativo fiscale del soggetto."
;
    public static final String PROTOCOLLO_MANCANTE = "Inserire il numero di protocollo.";
    public static final String IMPORTO_MANCANTE = "Inserire importo.";
    public static final String FILE_MANCANTE = "Selezionare un file da allegare.";
    public static final String NESSUN_ALLEGATO_INSERITO = "Inserire almeno un allegato.";
    public static final String PROTOCOLLO_PRESENTE = "Il numero protocollo specificato &egrave; gi&agrave; presente nell&rsquo;elenco.";
    public static final String NESSUN_PROTOCOLLO_SELEZIONATO = "Selezionare almeno un avviso di accertamento.";
    public static final String SOGGETTO_INESISTENTE = "Il soggetto non &egrave; presente in archivio, verificare i dati inseriti.";
    public static final String RATEIZZAZIONE_MEMORIZZATA = "La richiesta di rateizzazione &egrave; stata memorizzata correttamente.";
    public static final String RATEIZZAZIONE_NON_MEMORIZZATA = "La richiesta di rateizzazione non &egrave; stata memorizzata correttamente.";
    public static final String TOO_MANY_RANGE = "Selezionare un numero di rate per l&rsquo;importo da pagare seguendo i range ind" +
"icati in tabella."
;
    public static final String DIFF_ECONOMICHE_OBBLIGATORIE = "Se si richiede un numero di rate superiore a quello previsto, deve essere spunta" +
"ta la dicitura relativa alle difficolt&agrave; economiche."
;
    public static final String NUMERO_RATE_OVER_MAX = "Il numero di rate supera il massimo consentito.";
    public static final String PROTOCOLLO_NON_RATEIZZABILE = "Il protocollo numero_protocollo inserito non &egrave; rateizzabile.";
    public static final String PROTOCOLLO_NON_PRESENTE = "Il protocollo inserito non &egrave; presente in archivio.";
    public static final String PROTOCOLLI_CF_DIFFERENTI_CONFERMA = "I numeri protocollo non risultano appartenere tutti all&rsquo;identificativo fis" +
"cale intestatario della domanda, si desidera proseguire ugualmente?"
;
    public static final String NESSUN_PROTOCOLLO_CONFERMA = "Non sono presenti avvisi di accertamento, si desidera proseguire ugualmente?";
    public static final String MANCANZA_DATI_CONFERMA = "Non sono stati inseriti tutti i dati obbligatori, si desidera proseguire ugualme" +
"nte?"
;
    public static final String RANGE_SBAGLIATO = "Il totale da rateizzare non \350 compreso nei limiti selezionati.";
    public static final String IMPORTO_INSUFFICIENTE = "Il totale da rateizzare non supera il minimo rateizzabile.";
    public static final String NUMERO_RATE_DA_SELEZIONARE = "Specificare il numero di rate desiderato.";
    public static final int MAX_RATE = 30;
    public static final int ID_PRATICA_RATEIZZABILE = 2;
    public static final String AVVERTENZE = "AVVERTENZE: Se si desidera la ripartizione del debito nel maggior numero di rate" +
" consentito dalla normativa in vigore non c&rsquo;&egrave; niente da compilare: " +
"il numero riportato alla colonna A in corrispondenza degli importi minimo e mass" +
"imo in cui &egrave; compreso il debito da rateizzare indica gi&agrave; il massim" +
"o numero di rate che &egrave; possibile ottenere; se invece si desidera ripartir" +
"e il debito in un numero di rate inferiore al massimo consentito, occorre indica" +
"re nella colonna B il numero di rate in cui si desidera ripartirlo. Deve indicar" +
"e alla colonna B il numero di rate in cui desidera ripartire il debito (che per " +
"legge non pu&ograve; essere in ogni caso superiore a 30) anche chi si trova in S" +
"ITUAZIONI PARTICOLARI ED ECCEZIONALI che non gli consentono di affrontare il deb" +
"ito nemmeno se rateizzato secondo i criteri generali stabiliti dalla Giunta regi" +
"onale e desidera far valutare la propria situazione per un&rsquo;eventuale ratei" +
"zzazione in deroga (solo in questo caso, barrare la casella al rigo qui sotto). " +
"La rateizzazione comporta l&rsquo;applicazione, sull&rsquo;intero importo a debi" +
"to, dell&rsquo;interesse semplice, calcolato nella stessa misure prevista per il" +
" ritardato pagamento del tributo accertato. "
;
    public static final String RICHIESTA_RATEIZZAZIONE = "Essendo in condizioni economiche che non consentono il pagamento in unica soluzi" +
"one, chiedo la ripartizione del debito di cui agli atti descritti al quadro 3, e" +
" qui allegati, come segue: "
;
    public static final String NOTA_ATTI = "NOTA: Si rammenta che la domanda di rateizzazione pu&ograve; essere presentata i" +
"n qualunque tempo, purch&eacute; prima che abbia avuto inizio il procedimento di" +
" riscossione coattiva. Per questo motivo, le ingiunzioni di pagamento non si rat" +
"eizzano &egrave; tuttavia facolt\340 del concessionario della riscossione (per l" +
"e tasse automobilistiche dovute fino all\u2019anno 2008 la G.E.C. S.p.A. ) di ri" +
"scuotere per acconti: in questo caso occorre rivolgersi direttamente al concessi" +
"onario. Per le cartelle di pagamento la ri chiesta deve essere presentata ad Equ" +
"italia S.p.A. , rivolgendosi direttamente alla medesima, e non deve essere utili" +
"zzato questo modulo. &bull; La sola presentazione della domanda sospende tempora" +
"neamente il termine di paga mento fino al momento in cui si riceve risposta scri" +
"tta da parte dell&rsquo;Amministrazione. "
;
    public static final String NOTA_INFORMATIVA_RAT = "NOTA INFORMATIVA SUL TRATTAMENTO DEI DATI PERSONALI: I dati di natura personale " +
"acquisiti mediante il presente modello sono rilevati al solo fine di consentire " +
"l'istruttoria del procedimento cui il modello medesimo si riferisce, e verranno " +
"trattati con modalita' prevalentemente informatiche e con logiche rispondenti al" +
"le finalita' da perseguire, anche mediante la verifica dei dati esposti con altr" +
"i dati in possesso della Regione, del Ministero dell'economia e delle finanze e " +
"di altri enti quali ad esempio, gli enti locali ed altre pubbliche istituzioni. " +
"&bull; Titolare del trattamento dei dati &egrave; la Regione Piemonte, direzione" +
" risorse finanziarie, settore politiche fiscali, e presso detta struttura region" +
"ale &egrave; possibile ottenere informazioni sui responsabili; sempre presso tal" +
"e struttura l&rsquo;interessato potr&agrave; accedere ai propri dati per verific" +
"arne l&rsquo;utilizzo o, eventualmente, correggerli, aggiornarli nei limiti prev" +
"isti dalla legge ed anche per cancellarli od opporsi al loro trattamento se trat" +
"tati in violazione della legge. &bull; La Regione, in quanto soggetto pubblico, " +
"non deve acquisire il consenso degli interessati per trattare i loro dati person" +
"ali."
;
    public static final int RATEIZZAZIONI_PERSONA_FISICA = 1;
    public static final int RATEIZZAZIONI_PERSONA_GIURIDICA = 2;
    public static final String OK = "OK";
    public static final String KO = "KO";
    public static final String NUOVA_RAT = "NUOVA_RATEIZZAZIONE";
    public static final Integer ID_TIPO_COMUNICAZIONE_RATEIZZAZIONI = new Integer(6);
    public static final String COD_TIPO_COMUNICAZIONE_RATEIZZAZIONE = "RAR";
    public static final String RATEIZZAZIONI_STADOC_COD_FRUITORE = "GRAT";
    public static final String RATEIZZAZIONI_STADOC_TIPO_DOCUMENTO = "GRAT_ALL";
    public static final String RATEIZZAZIONI_STADOC_TIPO_DOCUMENTO_ACTA = "GRAT_MOD";
    public static final String RATEIZZAZIONI_STASEND_COD_FRUITORE = "RATON";
    public static final String RATEIZZAZIONI_STASEND_TEMPLATE_MAIL = "RAT_FO_EMAIL";
    public static final String RATEIZZAZIONI_STASEND_TEMPLATE_SMS = "RAT_FO_SMS";
    public static final String RATEIZZAZIONI_STASEND_TITOLO_MAIL = "Registrazione della richiesta di rateizzazione";
    public static final String RATEIZZAZIONI_STASEND_TITOLO_SMS = "Titolo sms provvisorio";
    public static final String UTENTE_STAPOC_RAT = "STAPOC_RAT";
    public static final String RATEIZZAZIONI_STARATSRV_STATO_PIANO = "DAES";
    public static final long ID_STATO_COMUNICAZIONE_RICEVUTA = 1L;
    public static final long ID_STATO_COMUNICAZIONE_IN_LAVORAZIONE = 2L;
    public static final long ID_STATO_COMUNICAZIONE_ACCETTATA = 3L;
    public static final long ID_STATO_COMUNICAZIONE_RIFIUTATA = 4L;
    public static final int ID_GRIGLIA_RAT_CF_PF = 400;
    public static final int ID_GRIGLIA_RAT_COD_FISCALE = 401;
    public static final int ID_GRIGLIA_RAT_COGNOME = 401;
    public static final int ID_GRIGLIA_RAT_NOME = 402;
    public static final int ID_GRIGLIA_RAT_COMUNE_NASCITA = 403;
    public static final int ID_GRIGLIA_RAT_PROVINCIA_NASCITA = 404;
    public static final int ID_GRIGLIA_RAT_DATA_NASCITA = 405;
    public static final int ID_GRIGLIA_RAT_SESSO = 406;
    public static final int ID_GRIGLIA_RAT_CF_PG = 407;
    public static final int ID_GRIGLIA_RAT_DENOMINAZIONE = 408;
    public static final int ID_GRIGLIA_RAT_COMUNE_FISCALE = 409;
    public static final int ID_GRIGLIA_RAT_PROVINCIA_FISCALE = 410;
    public static final int ID_GRIGLIA_RAT_CAP = 411;
    public static final int ID_GRIGLIA_RAT_TELEFONO = 412;
    public static final int ID_GRIGLIA_RAT_MAIL = 413;
    public static final int ID_GRIGLIA_RAT_INDIRIZZO = 414;
    public static final int ID_GRIGLIA_RAT_OGG_CONDIZIONI_ECONOMICHE = 415;
    public static final int ID_GRIGLIA_RAT_FASCIA_UNO = 416;
    public static final int ID_GRIGLIA_RAT_FASCIA_DUE = 417;
    public static final int ID_GRIGLIA_RAT_FASCIA_TRE = 418;
    public static final int ID_GRIGLIA_RAT_FASCIA_QUATTRO = 419;
    public static final int ID_GRIGLIA_RAT_FASCIA_CINQUE = 420;
    public static final int ID_GRIGLIA_RAT_AVVERTENZE_NUMERO_RATE = 421;
    public static final int ID_GRIGLIA_RAT_DICHIARAZIONE = 422;
    public static final int ID_GRIGLIA_RAT_NOTA_LIMITE_DOMANDA = 423;
    public static final int ID_GRIGLIA_RAT_PROTOCOLLO = 424;
    public static final int ID_GRIGLIA_RAT_IMPORTO = 425;
    public static final int ID_GRIGLIA_RAT_TOTALE = 426;
    public static final int ID_GRIGLIA_RAT_DATA = 427;
    public static final int ID_GRIGLIA_RAT_FIRMA = 428;
    public static final int ID_GRIGLIA_RAT_TRATTAMENTO_DATI = 429;
    public static final String OGGETTO_DOMANDA = "Domanda di rateizzazione";
    public static final String DICHIARAZIONE_DOMANDA = "Dichiaro e provo di trovarmi in particolari difficolt&agrave; economiche, che ch" +
"iedo di valutare per un&rsquo;eventuale rateizzazione in deroga"
;
    public static final String RETURN_STABOF_HOME = "RETURN_STABOF_HOME";
    public static final String RETURN_STABOF_GESTIONE_EMAIL = "RETURN_STABOF_GESTIONE_EMAIL";
    public static final String TIPO_PAGAMENTO_AUTOVEICOLI = "TIPO_PAGAMENTO_AUTOVEICOLI";
    public static final String TIPO_PAGAMENTO_MOTOCICLI = "TIPO_PAGAMENTO_MOTOCICLI";
    public static final String TIPO_VEICOLO_AUTOVEICOLO = "A";
    public static final String TIPO_VEICOLO_MOTOVEICOLO = "M";
    public static final String TIPO_VEICOLO_RIMORCHIO = "R";
    public static final String TIPO_MOTOCICLO_CICLOMOTORE = "C";
    public static final String TIPO_MOTOCICLO_QUADRICICLO = "Q";
    public static final String TIPO_CALCOLO_PROPOSTA = "PRO";
    public static final String TIPO_CALCOLO_RICHIESTA = "RIC";
    public static final String CODICE_RIDUZIONE_NULLO_NN = "NN";
    public static final String CODICE_RIDUZIONE_NULLO_N = "N";
    public static final String CODICE_RIDUZIONE_NULLO_14 = "14";
    public static final String CODICE_RIDUZIONE_NULLO_0 = "0";
    public static final String CODICE_REGIONE = "13";
    public static final String CODICE_MITTENTE = "MITT_POL";
    public static final String CODICE_FRUITORE = "R";
    public static final String KEY_CONFERMA_DATI = "EsitoServiziRis_confermaDati";
    public static final String KEY_ESITO_CALCOLO_TASSA = "EsitoCalcoloTassa";
    public static final String KEY_ESITO_RICHIESTA_PAGAMENTO = "EsitoRichiestaPagamento";
    public static final String FROM_HOME = "FROM_HOME";
    public static final String GENERIC_ERROR_IMPOSSIBILE_PROSEGUIRE_PAGAMENTO = "Impossibile proseguire con il pagamento";
    public static final String GENERIC_ERROR_IMPOSSIBILE_PROSEGUIRE_CONSULTAZIONE = "Impossibile proseguire con la consultazione del pagamento";
    public static final String GENERIC_ERROR_IMPOSSIBILE_PROSEGUIRE_CONSULTAZIONE_SINTESI = "Impossibile proseguire con la consultazione della sintesi del pagamento";
    public static final String GENERIC_ERROR_REPERIMENTO = "Impossibile reperire i dati del pagamento";
    public static final String ERRORE_DURANTE_PAGAMENTO = "Si e' verificato un errore.\nNessun pagamento e' stato effettuato.\nSi prega di " +
"contattare l'assistenza."
;
    public static final String TRANSAZIONE_ANNULLATA = "Transazione annullata";
    public static final String GENERIC_ERROR_IMPOSSIBILE_RECUPERARE_RPT = "Si \350 verificato un errore. Impossibile Recuperare la ricevuta di pagamento te" +
"lematica"
;
    public static final String GENERIC_ERROR_IMPOSSIBILE_RECUPERARE_SINTESIPAGAMENTO = "Si \350 verificato un errore. Impossibile Recuperare la sintesi di pagamento";
    public static final String GENERIC_ERROR_IMPOSSIBILE_RECUPERARE_PSP = "Si \350 verificato un errore. Impossibile Recuperare l'elenco dei prestatori di " +
"servizio"
;
    public static final String GENERIC_ERROR_PROPRIETARIO_NON_TROVATO = "Impossibile proseguire con il pagamento. Proprietario non trovato";
    public static final String GENERIC_ERROR_RICEVUTA_NON_PRESENTE = "Ricevuta non presente";
    public static final String GENERIC_ERROR_PDF = "Impossibile creare il file pdf";
    public static final String GENERIC_ERROR_NESSUN_DATO_TROVATO = "Nessun dato Trovato";
    public static final String CODICE_SCADENZA_ARRETRATA = "A";
    public static final String CODICE_SCADENZA_RINNOVO = "R";
    public static final Long STATO_TRANSAZIONE_OK = new Long(9L);
    public static final Long STATO_TRANSAZIONE_CANC = new Long(10L);
    public static final Long STATO_TRANSAZIONE_KO = new Long(11L);
    public static final Long STATO_TRANSAZIONE_CON_RICEVUTA = new Long(4L);
    public static final Long STATO_TRANSAZIONE_SENZA_RICEVUTA = new Long(9L);
    public static final String TIPOLOGIA_PROPRIETARIO_PERSONA_FISICA = "PF";
    public static final String TIPOLOGIA_PAGATORE_PERSONA_FISICA = "F";
    public static final String TIPOLOGIA_PAGATORE_PERSONA_GIURIDICA = "G";
    public static final String STATO_PAGAMENTO_IN_ATTESA = "PAGAMENTO_IN_ATTESA";
    public static final String STATO_PAGAMENTO_VERIFICATO = "PAGAMENTO_VERIFICATO";

    public TipoGrigliaEsenzione()
    {
    }

}
