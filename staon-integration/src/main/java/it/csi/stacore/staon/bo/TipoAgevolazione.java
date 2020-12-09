package it.csi.stacore.staon.bo;

import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.util.EqualsUtil;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class TipoAgevolazione extends Decodifica implements java.io.Serializable {
	//~ Static fields/initializers ===============================================

	/**
	 *
	 */
	private static final long serialVersionUID = -1805584569724608190L;

	private static final String SOSPENSIONE = "0";

	private static final String ESENZIONE_PRESIDENTE_DELLA_REPUBBLICA = "1";

	private static final String ESENZIONE_AUTOSCAFO_ADIBITO_A_PESCA = "2";

	private static final String ESENZIONE_VEICOLO_HANDICAP = "3";

	private static final String ESENZIONE_VEICOLO_STORICO = "4";

	private static final String PERDITA_POSSESSO_PER_FURTO = "5";

	private static final String PERDITA_POSSESSO_PROVVEDIMENTO_GIUDIZIARIO = "6";

	private static final String AUTOBUS_ALISCAFO_SERVIZIO_POSTALE = "7";

	private static final String AUTOCARRI_AUTOSCAFI_ESTINZIONE_INCENDI = "8";

	private static final String TRASPORTO_PERSONE_PER_CURE_MEDICHE = "9";

	private static final String SOSPENSIONE_PER_FALLIMENTO = "10";

	private static final String SOSPENSIONE_EREDITA_GIACENTE = "11";

	private static final String DEAMBULAZIONE_INVALIDI = "A";

	private static final String TEMPORANEA_ESPORTAZIONE = "B";

	private static final String AGENTI_DIPLOMATICI_CONSOLARI = "C";

	private static final String ESENZIONI_PER_ECOINCENTIVI = "D";

	private static final String VEICOLI_ONLUS = "E";

	private static final String LR_22_2007_ART_11_INSTALLAZIONE_IMPIANTO_GAS = "N";

	private static final String LR_23_2003_ART_5_LETT_A = "O";

	private static final String LR_23_2003_ART_5_LETT_B_PROTEZIONE_CIVILE = "P";

	private static final String LR_23_2003_ART_5_LETT_B_ESTINZIONE_INCENDI = "Q";

	private static final String LR_23_2003_ART_5_LETT_C = "R";

	private static final String LR_23_2003_ART_5_LETT_D_AUTOBUS_PUBBLICO_DI_LINEA = "S";

	private static final String LR_23_2003_ART_5_LETT_E_AMBULANZE_E_ASSIMILATI = "T";

	private static final String LR_23_2003_ART_5_LETT_F_RIFIUTI = "U";

	private static final String LR_23_2003_ART_5_LETT_G_ELETTRICI = "V";

	private static final String LR_23_2003_ART_5_LETT_G_GPL_E_METANO = "W";

	private static final String LR_23_2003_ART_5_LETT_H_ORGANIZZ_VOLUNTARIATO = "X";

	private static final String LR_23_2003_ART_5_LETT_H_COOPERATIVE_SOCIALI = "Y";

	private static final String LR_23_2003_ART_5_LETT_H_IPAB = "Z";

	private static final String PATENTE_SPECIALE = "M";

	private static final String B_POWER = "67";

	private static final String GPL_METANO_ELETTRICI_ESCLUSIVI = "68";

	private static final String IBRIDI = "71";
	private static final String ESENZIONE_ESTINZIONE_INCENDI  = "74";
	private static final String ESENZIONE_AUTOBUS_IN_SERVIZIO_DI_LINEA  = "75";
	private static final String ESENZIONE_AMBULANZE  = "76";
	private static final String ESENZIONE_ATTI_AL_CARICO_SCARICO  = "77";

	//~ Constructors =============================================================

	/**
	 * Creates a new TipoAgevolazione object.
	 *
	 * @param idDecodifica DOCUMENT ME!
	 * @param codice DOCUMENT ME!
	 * @param descrizione DOCUMENT ME!
	 */
	public TipoAgevolazione(IdDecodifica idDecodifica, String codice, String descrizione) {
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

		if ((object != null) && object instanceof TipoAgevolazione) {
			TipoAgevolazione altro = (TipoAgevolazione) object;
			equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
		}

		return equals;
	}

	public static TipoAgevolazione getTipoAgevolazioneImpiantoGas(){
		return new TipoAgevolazione(new IdDecodifica(31),
				LR_22_2007_ART_11_INSTALLAZIONE_IMPIANTO_GAS,
				"L.R. 22/2007 art 11 - installazione impianto GPL/Metano");
	}

	public static TipoAgevolazione getTipoAgevolazioneBPower(){
		return new TipoAgevolazione(new IdDecodifica(67),
				B_POWER,
				"Agevolazione per i veicoli elettrici ed alimentati a gas metano o GPL");
	}

	public static TipoAgevolazione getTipoAgevolazioneGplMetanoElettriciEsclusivi(){
		return new TipoAgevolazione(new IdDecodifica(Long.parseLong(GPL_METANO_ELETTRICI_ESCLUSIVI)),
				GPL_METANO_ELETTRICI_ESCLUSIVI,
				"Agevolazione per i veicoli GPL, METANO, ELETTRICI, esclusivi");
	}

	public static TipoAgevolazione getTipoAgevolazioneIbridi(){
		return new TipoAgevolazione(new IdDecodifica(Long.parseLong(IBRIDI)),IBRIDI,"Agevolazione per veicoli Ibridi");
	}

	public static TipoAgevolazione getTipoAgevolazioneEsenzioneEstinzioneIncendi(){
		return new TipoAgevolazione(new IdDecodifica(Long.parseLong(ESENZIONE_ESTINZIONE_INCENDI)),ESENZIONE_ESTINZIONE_INCENDI,"Esenzione Estinzione Incendi");
	}

	public static TipoAgevolazione getTipoAgevolazioneEsenzioneAutobusInservizioDilinea(){
		return new TipoAgevolazione(new IdDecodifica(Long.parseLong(ESENZIONE_AUTOBUS_IN_SERVIZIO_DI_LINEA)),ESENZIONE_AUTOBUS_IN_SERVIZIO_DI_LINEA,"Esenzione Autobus In servizio di linea");
	}

	public static TipoAgevolazione getTipoAgevolazioneEsenzioneAmbulanze(){
		return new TipoAgevolazione(new IdDecodifica(Long.parseLong(ESENZIONE_AMBULANZE)),ESENZIONE_AMBULANZE,"Esenzione Ambulanze");
	}

	public static TipoAgevolazione getTipoAgevolazioneEsenzioneAttiAlCaricoScarico(){
		return new TipoAgevolazione(new IdDecodifica(Long.parseLong(ESENZIONE_ATTI_AL_CARICO_SCARICO)),ESENZIONE_ATTI_AL_CARICO_SCARICO,"Esenzione atti al carico, scarico");
	}


	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public boolean isPrimoBolloDovuto() {
		boolean result = false;

		if (	this.getCodice().equals(B_POWER) ||
				this.getCodice().equals(GPL_METANO_ELETTRICI_ESCLUSIVI) ||
				this.getCodice().equals(LR_22_2007_ART_11_INSTALLAZIONE_IMPIANTO_GAS) ) {
			result = true;
		}

		return result;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public boolean isEsenzioneVeicoloStorico() {
		if (this.getCodice().equals(ESENZIONE_VEICOLO_STORICO)) {
			return true;
		}
		return false;
	}

	public boolean isAgevolazioneImpiantoGas() {
		if (this.getCodice().equals(LR_22_2007_ART_11_INSTALLAZIONE_IMPIANTO_GAS)) {
			return true;
		}
		return false;
	}

	public boolean isAgevolazioneSovrapponibile() {
		if (this.getCodice().equals(LR_22_2007_ART_11_INSTALLAZIONE_IMPIANTO_GAS)
				|| this.getCodice().equals(B_POWER)) {
			return true;
		}
		return false;
	}

	public boolean isAgevolazioneBPower() {
		if (this.getCodice().equals(B_POWER)) {
			return true;
		}
		return false;
	}


	public boolean isAgevolazioneIbridi() {
		if (this.getCodice().equals(IBRIDI)) {
			return true;
		}
		return false;
	}

	public boolean isAgevolazioneGplMetanoElettriciEsclusivi() {
		if (this.getCodice().equals(GPL_METANO_ELETTRICI_ESCLUSIVI)) {
			return true;
		}
		return false;
	}

	public boolean isAgevolazioneEsenzioneEstinzioneIncendi() {
		if (this.getCodice().equals(ESENZIONE_ESTINZIONE_INCENDI)) {
			return true;
		}
		return false;
	}

	public boolean isAgevolazioneEsenzioneEstinzioneAutobusInServizioDiLinea() {
		if (this.getCodice().equals(ESENZIONE_AUTOBUS_IN_SERVIZIO_DI_LINEA)) {
			return true;
		}
		return false;
	}

	public boolean isAgevolazioneEsenzioneEstinzioneAmbulanze() {
		if (this.getCodice().equals(ESENZIONE_AMBULANZE)) {
			return true;
		}
		return false;
	}

	public boolean isAgevolazioneEsenzioneEstinzioneAttiAlCaricoScarico() {
		if (this.getCodice().equals(ESENZIONE_ATTI_AL_CARICO_SCARICO)) {
			return true;
		}
		return false;
	}

	public boolean isAgevolazioneDiUfficio() {
		if (isAgevolazioneEsenzioneEstinzioneIncendi() || isAgevolazioneEsenzioneEstinzioneAutobusInServizioDiLinea() ||
				isAgevolazioneEsenzioneEstinzioneAmbulanze() || isAgevolazioneEsenzioneEstinzioneAttiAlCaricoScarico()) {
			return true;
		}
		return false;
	}

	public boolean isModificabile() {
		if (this.getCodice().equals(B_POWER)
				|| this.getCodice().equals(GPL_METANO_ELETTRICI_ESCLUSIVI)) {
			return false;
		}
		return true;
	}

	public boolean isAgevolazionePatenteSpeciale() {
		if (this.getCodice().equals(PATENTE_SPECIALE)) {
			return true;
		}
		return false;
	}

	public boolean isAgevolazioneSospensioneRivenditori() {
		if (this.getCodice().equals(SOSPENSIONE)) {
			return true;
		}
		return false;
	}

	public boolean isAgevolazioneDisabili() {
		if (this.getCodice().equals(ESENZIONE_VEICOLO_HANDICAP)) {
			return true;
		}
		return false;
	}

}