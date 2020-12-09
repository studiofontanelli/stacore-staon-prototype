package it.csi.stacore.staon.bo;

import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.util.EqualsUtil;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class EsitoNotifica extends Decodifica {

	/**
	 *
	 */
	private static final long serialVersionUID = -9051965879249877659L;
	/*
	 * 1 C Consegna mani proprie
	 */
	public static final int ID_CONSEGNA_MANI_PROPRIE = 1;
	/*
	 * 2 N Compiuta Giacenza / Non Curato Ritiro
	 */
	public static final int ID_COMPIUTA_GIACENZA = 2;
	/*
	 * 3 R Rifiutato
	 */
	public static final int ID_RIFIUTATO = 3;
	/*
	 * 4 D Destinatario Sconosciuto
	 */
	public static final int ID_DESTINATARIO_SCONOSCIUTO = 4;
	/*
	 * 5 E Destinatario Irreperibile
	 */
	public static final int ID_DESTINATARIO_IRREPERIBILE = 5;
	/*
	 * 6 M Destinatario Deceduto
	 */
	public static final int ID_DESTINATARIO_DECEDUTO = 6;
	/*
	 * 7 T Destinatario Trasferito
	 */
	public static final int ID_DESTINATARIO_TRASFERITO = 7;
	/*
	 * 8 G Destinatario Errato
	 */
	public static final int ID_DESTINATARIO_ERRATO = 8;
	/*
	 * 9 I Destinatario Inesistente
	 */
	public static final int ID_DESTINATARIO_INESISTENTE = 9;
	/*
	 * 10 H Destinatario Insufficiente
	 */
	public static final int ID_DESTINATARIO_INSUFFICIENTE = 10;
	/*
	 * 11 L Destinatario Detenuto
	 */
	public static final int ID_DESTINATARIO_DETENUTO = 11;
	/*
	 * 12 F Notifica negativa generica
	 */
	public static final int ID_NOTIFICA_NEGATIVA_GENERICA = 12;
	/*
	 * 13 X Cartolina data non indicata chiaramente
	 */
	public static final int ID_CARTOLINA_DATA_NON_CHIARA = 13;
	/*
	 * 14 Z Cartolina non firmata
	 */
	public static final int ID_CARTOLINA_NON_FIRMATA = 14;
	/*
	 * 15 AC Consegna mani proprie per atti giudiziari
	 */
	public static final int ID_CONSEGNA_ATTI_GIUDIZIARI = 14;
	/*
	 * 16 AA Emesso CAD per atti giudiziari
	 */
	public static final int ID_EMESSO_CAD_ATTI_GIUDIZIARI = 16;
	/*
	 * 17 AB Destinatario persona giuridica per atti giudiziari
	 */
	public static final int ID_DESTINATARIO_PG_ATTI_GIUDIZIARI = 17;
	/*
	 * 18 AN Curatore fallimentare per atti giudiziari
	 */
	public static final int ID_CURATORE_FALLIMENTARE_ATTI_GIUDIZIARI = 18;
	/*
	 * 19 AO Domiciliatario per atti giudiziari
	 */
	public static final int ID_DOMICILIATARIO_ATTI_GIUDIZIARI = 19;
	/*
	 * 20 AJ Familiare convivente per atti giudiziari
	 */
	public static final int ID_FAMILIARE_CONVIVENTE_ATTI_GIUDIZIARI = 20;
	/*
	 * 21 AK Addetto alla casa per atti giudiziari
	 */
	public static final int ID_ADDETTO_CASA_ATTI_GIUDIZIARI = 21;
	/*
	 * 22 AP Al servizio del destinatario per atti giudiziari
	 */
	public static final int ID_SERVIZIO_DESTINATARIO_ATTI_GIUDIZIARI = 22;
	/*
	 * 23 AQ Portiere per atti giudiziari
	 */
	public static final int ID_PORTIERE_ATTI_GIUDIZIARI = 23;
	/*
	 * 24 AS Delegato dal direttore per atti giudiziari
	 */
	public static final int ID_DELEGATO_DAL_DIRETTORE_ATTI_GIUDIZIARI = 24;
	/*
	 * 25 AU Delegato dal comandante per atti giudiziari
	 */
	public static final int ID_DELEGATO_DAL_COMANDANTE_ATTI_GIUDIZIARI = 25;
	/*
	 * 26 AR Rifiutato per atti giudiziari
	 */
	public static final int ID_RIFIUTATO_PER_ATTI_GIUDIZIARI = 26;
	/*
	 * 27 AD Destinatario Sconosciuto per atti giudiziari
	 */
	public static final int ID_DESTINATARIO_SCONOSCIUTO_ATTI_GIUDIZIARI = 27;
	/*
	 * 28 AE Destinatario Irreperibile per atti giudiziari
	 */
	public static final int ID_DESTINATARIO_IRREPERIBILE_ATTI_GIUDIZIARI = 28;
	/*
	 * 29 AM Destinatario Deceduto per atti giudiziari
	 */
	public static final int ID_DESTINATARIO_DECEDUTO_ATTI_GIUDIZIARI = 29;
	/*
	 * 30 AT Destinatario Trasferito per atti giudiziari
	 */
	public static final int ID_DESTINATARIO_TRASFERITO_ATTI_GIUDIZIARI = 30;
	/*
	 * 31 AG Destinatario Errato per atti giudiziari
	 */
	public static final int ID_DESTINATARIO_ERRATO_ATTI_GIUDIZIARI = 31;
	/*
	 * 32 AI Destinatario Inesistente per atti giudiziari
	 */
	public static final int ID_DESTINATARIO_INESISTENTE_ATTI_GIUDIZIARI = 32;
	/*
	 * 33 AH Destinatario Insufficiente per atti giudiziari
	 */
	public static final int ID_DESTINATARIO_INSUFFICIENTE_ATTI_GIUDIZIARI = 33;
	/*
	 * 34 AL Destinatario Detenuto per atti giudiziari
	 */
	public static final int ID_DESTINATARIO_DETENUTO_ATTI_GIUDIZIARI = 34;
	/*
	 * 35 AN Compiuta Giacenza / Non Curato Ritiro per atti giudiziari
	 */
	public static final int ID_COMPIUTA_GIACENZA_NON_CURATO_RITIRO_ATTI_GIUDIZIARI = 35;

	/**
	 * DOCUMENT ME!
	 *
	 * @param id
	 * @param codice
	 * @param descrizione
	 */
	public EsitoNotifica(IdDecodifica id, String codice, String descrizione) {
		super(id, codice, descrizione);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param object
	 *            DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public boolean equals(Object object) {
		boolean equals = false;

		if ((object != null) && object instanceof EsitoNotifica) {
			EsitoNotifica altro = (EsitoNotifica) object;
			equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
		}

		return equals;
	}

}
