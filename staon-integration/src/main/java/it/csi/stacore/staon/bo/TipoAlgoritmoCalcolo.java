package it.csi.stacore.staon.bo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.util.EqualsUtil;

public class TipoAlgoritmoCalcolo extends Decodifica implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 5511235388335610655L;

	public static final String CODICE_TCTTariffaFissa_1999 = "TF-1999";

	public static final String CODICE_TCTTariffaPerKW_1999 = "TAKW-1999";

	public static final String CODICE_TCTTariffaKWeSuperBollo_1999 = "TKSB-1999";

	public static final String CODICE_TCTTariffaPerPortata_1999 = "TAP-1999";

	public static final String CODICE_TCTTariffaPesoComplAssi_1999 = "TPCA-1999";

	public static final String CODICE_TCTTariffaAutoveicoliSpeciali_1999 = "TAS-1999";

	public static final String CODICE_TCTTariffaMotoveicoliKW_1999 = "TMKW-1999";

	public static final String CODICE_TCTTariffaMotoveicoliPortata_1999 = "TMP-1999";

	public static final String CODICE_TCTTariffaRimorchioPortata_1999 = "TRP-1999";

	public static final String CODICE_TCTTariffaFissaRimorchio_1999 = "TRF-1999";

	public static final String CODICE_TCTTariffaRimorchioTraspPersone_1999 = "TRTP-1999";

	public static final String CODICE_TCTTariffaPerKWEuro_2007 = "TAKWE-2007";

	public static final String CODICE_TCTTariffaMotoveicoliKWEuro_2007 = "TMKWE-2007";

	public static final String COD_CAT_EURO = "COD_CAT_EURO";

	public static final String ID_CAT_EURO = "ID_CAT_EURO";

	public static final String KW = "KW";

	public static final String MASSA_COMPLESSIVA = "MASSA_COMPLESSIVA";

	public static final String FLAG_ECODIESEL = "FLAG_ECODIESEL";

	public static final String PORTATA = "PORTATA";

	public static final String NUMERO_ASSI = "NUMERO_ASSI";

	public static final String FLAG_RIMORCHIABILITA = "FLAG_RIMORCHIABILITA";

	public static final String CILINDRATA = "CILINDRATA";

	public static final String NUMERO_POSTI = "NUMERO_POSTI";

	public static final String ID_DESTINAZIONE = "ID_DESTINAZIONE";
	public static final String ID_ALIMENTAZIONE = "ID_ALIMENTAZIONE";
	public static final String ID_USO = "ID_USO";

	public static final String ID_DATI_TECNICI = "ID_DATI_TECNICI";

	public static final String ID_CARROZERIA = "ID_CARROZERIA";

	public static final String FLAG_SOSPENSIONE_PNEU = "FLAG_SOSPENSIONE_PNEU";

	public static final String COD_DESTINAZIONE = "COD_DESTINAZIONE";
	public static final String COD_ALIMENTAZIONE = "COD_ALIMENTAZIONE";
	public static final String COD_USO = "COD_USO";
	public static final String COD_CARROZERIA = "COD_CARROZERIA";

	public static final String VEIC_EMISSIONE_CO2 = "VEIC_EMISSIONE_CO2";
	public static final String VEIC_DATA_COLLAUDO_GPL = "VEIC_DATA_COLLAUDO_GPL";
	public static final String VEIC_DATA_DISINSTAL_GPL = "VEIC_DATA_DISINSTAL_GPL";
	public static final String VEIC_DATA_IMMATRIC= "VEIC_DATA_IMMATRIC";
	public static final String VEIC_DATA_INSTAL_GPL = "VEIC_DATA_INSTAL_GPL";
	public static final String VEIC_ID_TIPO_COMBUSTIBILE_GAS = "VEIC_ID_TIPO_COMBUSTIBILE_GAS";



	private Map datiTecnici = new HashMap();

	public TipoAlgoritmoCalcolo(IdDecodifica idDecodifica, String codice, String descrizione) {
		super(idDecodifica, codice, descrizione);
	}

	public boolean equals(Object object) {
		boolean equals = false;

		if ((object != null) && object instanceof TipoCalcolo) {
			TipoCalcolo altro = (TipoCalcolo) object;
			equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
		}

		return equals;
	}

	public boolean isTCTTariffaFissa_1999() {
		return this.getCodice().equals(CODICE_TCTTariffaFissa_1999);
	}

	public boolean isTCTTariffaPerKW_1999() {
		return this.getCodice().equals(CODICE_TCTTariffaPerKW_1999);
	}

	public boolean isTCTTariffaKWeSuperBollo_1999() {
		return this.getCodice().equals(CODICE_TCTTariffaKWeSuperBollo_1999);
	}

	public boolean isTCTTariffaPerPortata_1999() {
		return this.getCodice().equals(CODICE_TCTTariffaPerPortata_1999);
	}

	public boolean isTCTTariffaPesoComplAssi_1999() {
		return this.getCodice().equals(CODICE_TCTTariffaPesoComplAssi_1999);
	}

	public boolean isTCTTariffaAutoveicoliSpeciali_1999() {
		return this.getCodice().equals(CODICE_TCTTariffaAutoveicoliSpeciali_1999);
	}

	public boolean isTCTTariffaMotoveicoliKW_1999() {
		return this.getCodice().equals(CODICE_TCTTariffaMotoveicoliKW_1999);
	}

	public boolean isTCTTariffaMotoveicoliPortata_1999() {
		return this.getCodice().equals(CODICE_TCTTariffaMotoveicoliPortata_1999);
	}

	public boolean isTCTTariffaRimorchioPortata_1999() {
		return this.getCodice().equals(CODICE_TCTTariffaRimorchioPortata_1999);
	}

	public boolean isTCTTariffaFissaRimorchio_1999() {
		return this.getCodice().equals(CODICE_TCTTariffaFissaRimorchio_1999);
	}

	public boolean isTCTTariffaRimorchioTraspPersone_1999() {
		return this.getCodice().equals(CODICE_TCTTariffaRimorchioTraspPersone_1999);
	}

	public boolean isTCTTariffaPerKWEuro_2007() {
		return this.getCodice().equals(CODICE_TCTTariffaPerKWEuro_2007);
	}

	public boolean isTCTTariffaMotoveicoliKWEuro_2007() {
		return this.getCodice().equals(CODICE_TCTTariffaMotoveicoliKWEuro_2007);
	}


	public static TipoAlgoritmoCalcolo getTCTTariffaFissa_1999() {
		return new TipoAlgoritmoCalcolo(new IdDecodifica(1), CODICE_TCTTariffaFissa_1999, "TARIFFA FISSA 1999");
	}

	public static TipoAlgoritmoCalcolo getTCTTariffaPerKW_1999() {
		return new TipoAlgoritmoCalcolo(new IdDecodifica(1), CODICE_TCTTariffaPerKW_1999, "TARIFFA PER KILOWAT 1999");
	}

	public static TipoAlgoritmoCalcolo getTCTTariffaKWeSuperBollo_1999() {
		return new TipoAlgoritmoCalcolo(new IdDecodifica(1), CODICE_TCTTariffaKWeSuperBollo_1999, "TARIFFA PER KILOWAT E SUPERBOLLO 1999");
	}

	public static TipoAlgoritmoCalcolo getTCTTariffaPerPortata_1999() {
		return new TipoAlgoritmoCalcolo(new IdDecodifica(1), CODICE_TCTTariffaPerPortata_1999, "TARIFFA PER PORTATA 1999");
	}

	public static TipoAlgoritmoCalcolo getTCTTariffaPesoComplAssi_1999() {
		return new TipoAlgoritmoCalcolo(new IdDecodifica(1), CODICE_TCTTariffaPesoComplAssi_1999, "TARIFFA PER PESO COMPLESSIVO E ASSI 1999");
	}

	public static TipoAlgoritmoCalcolo getTCTTariffaAutoveicoliSpeciali_1999() {
		return new TipoAlgoritmoCalcolo(new IdDecodifica(1), CODICE_TCTTariffaAutoveicoliSpeciali_1999, "TARIFFA AUTOVEICOLI SPECIALI 1999");
	}

	public static TipoAlgoritmoCalcolo getTCTTariffaMotoveicoliKW_1999() {
		return new TipoAlgoritmoCalcolo(new IdDecodifica(1), CODICE_TCTTariffaMotoveicoliKW_1999, "TARIFFA MOTOVEICOLI KW 1999");
	}

	public static TipoAlgoritmoCalcolo getTCTTariffaMotoveicoliPortata_1999() {
		return new TipoAlgoritmoCalcolo(new IdDecodifica(1), CODICE_TCTTariffaMotoveicoliPortata_1999, "TARIFFA MOTOVEICOLO PORTATA 1999");
	}

	public static TipoAlgoritmoCalcolo getTCTTariffaRimorchioPortata_1999() {
		return new TipoAlgoritmoCalcolo(new IdDecodifica(1), CODICE_TCTTariffaRimorchioPortata_1999, "TARIFFA RIMORCHIO PORTATA 1999");
	}

	public static TipoAlgoritmoCalcolo getTCTTariffaFissaRimorchio_1999() {
		return new TipoAlgoritmoCalcolo(new IdDecodifica(1), CODICE_TCTTariffaFissaRimorchio_1999, "TARIFFA FISSA RIMORCHIO 1999");
	}

	public static TipoAlgoritmoCalcolo getTCTTariffaRimorchioTraspPersone_1999() {
		return new TipoAlgoritmoCalcolo(new IdDecodifica(1), CODICE_TCTTariffaRimorchioTraspPersone_1999, "TARIFFA RIMORCHIO PERSONE 1999");
	}

	public static TipoAlgoritmoCalcolo getTCTTariffaPerKWEuro_2007() {
		return new TipoAlgoritmoCalcolo(new IdDecodifica(1), CODICE_TCTTariffaPerKWEuro_2007, "TARIFFA AUTOVEICOLI PER KILOWAT CLASSE EURO 2007");
	}

	public static TipoAlgoritmoCalcolo getTCTTariffaMotoveicoliKWEuro_2007() {
		return new TipoAlgoritmoCalcolo(new IdDecodifica(1), CODICE_TCTTariffaMotoveicoliKWEuro_2007,
				"TARIFFA MOTOVEICOLI PER KILOWAT CLASSE EURO 2007");
	}

	public void addDatoTecnico(String nome, Object valore) {
		datiTecnici.put(nome, valore);
	}

	public Map getDatiTecnici() {
		return datiTecnici;
	}
}

