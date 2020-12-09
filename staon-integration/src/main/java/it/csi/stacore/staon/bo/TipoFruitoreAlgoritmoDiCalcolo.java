package it.csi.stacore.staon.bo;

import java.io.Serializable;

public class TipoFruitoreAlgoritmoDiCalcolo implements Serializable {
	
	private static final long serialVersionUID = -2018152413403126490L;
	
	public static String CODICE_CALCOLATRICE = "CAL";
	public static String CODICE_RISCOSSIONE = "RIS";
	public static String CODICE_RISCOSSIONE_NORID = "RIS_NORID";
	public static String CODICE_RIMBORSO = "RIM";
	public static String CODICE_AVVISI_ACCERTAMENTO = "AA";
	public static String CODICE_CHIUSURA_AVVISI_ACCERTAMENTO = "CAA";
	public static String CODICE_BONIFICA_RISCOSSORE = "BR";
	public static String CODICE_ESENZIONE_IMPIANTO_GAS = "EIG";
	public static String CODICE_CALCOLO_ULTIMO_GIORNO_UTILE = "CUGU";
	
	public static TipoFruitoreAlgoritmoDiCalcolo FRUITORE_CALCOLATRICE = new TipoFruitoreAlgoritmoDiCalcolo(CODICE_CALCOLATRICE,"Fruitore Calcolatrice");
	public static TipoFruitoreAlgoritmoDiCalcolo FRUITORE_RISCOSSIONE = new TipoFruitoreAlgoritmoDiCalcolo(CODICE_RISCOSSIONE,"Fruitore Riscossione");
	public static TipoFruitoreAlgoritmoDiCalcolo FRUITORE_RIMBORSO = new TipoFruitoreAlgoritmoDiCalcolo(CODICE_RIMBORSO,"Fruitore Rimborso");
	public static TipoFruitoreAlgoritmoDiCalcolo FRUITORE_AVVISI_ACCERTAMENTO = new TipoFruitoreAlgoritmoDiCalcolo(CODICE_AVVISI_ACCERTAMENTO,"Fruitore Avvisi Accertamento");
	public static TipoFruitoreAlgoritmoDiCalcolo FRUITORE_CHIUSURA_AVVISI_ACCERTAMENTO = new TipoFruitoreAlgoritmoDiCalcolo(CODICE_CHIUSURA_AVVISI_ACCERTAMENTO,"Fruitore Chiusura Avvisi Accertamento");
	public static TipoFruitoreAlgoritmoDiCalcolo FRUITORE_BONIFICA_RISCOSSORE = new TipoFruitoreAlgoritmoDiCalcolo(CODICE_BONIFICA_RISCOSSORE,"Bonifica Riscossore");
	public static TipoFruitoreAlgoritmoDiCalcolo FRUITORE_ESENZIONE_IMPIANTO_GAS = new TipoFruitoreAlgoritmoDiCalcolo(CODICE_ESENZIONE_IMPIANTO_GAS,"Esenzione Impianto Gas");
	public static TipoFruitoreAlgoritmoDiCalcolo FRUITORE_CALCOLO_ULTIMO_GIORNO_UTILE = new TipoFruitoreAlgoritmoDiCalcolo(CODICE_CALCOLO_ULTIMO_GIORNO_UTILE,"Fruitore Calcolo Ultimo Giorno Utile");
	
	private String codice;
	private String descrizione;
	
	public TipoFruitoreAlgoritmoDiCalcolo(String codice, String descrizione) {
		this.codice = codice;
		this.descrizione = descrizione;
	}

	public String getCodice() {
		return codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public static boolean isFruitoreCalcolatrice(TipoFruitoreAlgoritmoDiCalcolo tipoFruitore){
		return (tipoFruitore != null && CODICE_CALCOLATRICE.equals(tipoFruitore.getCodice()))?true:false;
	}
	public static boolean isFruitoreRiscossione(TipoFruitoreAlgoritmoDiCalcolo tipoFruitore){
		return (tipoFruitore != null && CODICE_RISCOSSIONE.equals(tipoFruitore.getCodice()))?true:false;
	}
	public static boolean isFruitoreRimborso(TipoFruitoreAlgoritmoDiCalcolo tipoFruitore){
		return (tipoFruitore != null && CODICE_RIMBORSO.equals(tipoFruitore.getCodice()))?true:false;
	}
	public static boolean isFruitoreAvvisiAccertamento(TipoFruitoreAlgoritmoDiCalcolo tipoFruitore){
		return (tipoFruitore != null && CODICE_AVVISI_ACCERTAMENTO.equals(tipoFruitore.getCodice()))?true:false;
	}
	public static boolean isFruitoreChiusuraAvvisiAccertamento(TipoFruitoreAlgoritmoDiCalcolo tipoFruitore){
		return (tipoFruitore != null && CODICE_CHIUSURA_AVVISI_ACCERTAMENTO.equals(tipoFruitore.getCodice()))?true:false;
	}
	public static boolean isFruitoreBonificaRiscossione(TipoFruitoreAlgoritmoDiCalcolo tipoFruitore){
		return (tipoFruitore != null && CODICE_BONIFICA_RISCOSSORE.equals(tipoFruitore.getCodice()))?true:false;
	}
	public static boolean isFruitoreEsenzioneImpiantoGas(TipoFruitoreAlgoritmoDiCalcolo tipoFruitore){
		return (tipoFruitore != null && CODICE_ESENZIONE_IMPIANTO_GAS.equals(tipoFruitore.getCodice()))?true:false;
	}
	public static boolean isFruitoreCalcoloUltimoGiornoUtile(TipoFruitoreAlgoritmoDiCalcolo tipoFruitore){
		return (tipoFruitore != null && CODICE_CALCOLO_ULTIMO_GIORNO_UTILE.equals(tipoFruitore.getCodice()))?true:false;
	}
}
