package it.csi.stacore.staon.bo;

public class BonificaVO extends AbstractBO implements java.io.Serializable {



	private static final long serialVersionUID = -2395946550837753699L;

	private long idBonifica;
	private String idVeicolo;
	private String targa;
	private String tipoTarga;
	private String idOperazione;
	private String idOperazioneLogica;
	private String tipoOperazioneLogica;
	private String dataOperazione;
	private String ente;
	private String sportello;
	private String cassa;
	private String note;
	private String descTipoOperazione;






	public BonificaVO(long idBonifica) {
		super();
		this.idBonifica = idBonifica;
	}




	public BonificaVO(long idBonifica, String idVeicolo, String targa, String tipoTarga, String idOperazione,
			String idOperazioneLogica, String tipoOperazioneLogica, String dataOperazione, String ente,
			String sportello, String cassa, String note) {
		super();
		this.idBonifica = idBonifica;
		this.idVeicolo = idVeicolo;
		this.targa = targa;
		this.tipoTarga = tipoTarga;
		this.idOperazione = idOperazione;
		this.idOperazioneLogica = idOperazioneLogica;
		this.tipoOperazioneLogica = tipoOperazioneLogica;
		this.dataOperazione = dataOperazione;
		this.ente = ente;
		this.sportello = sportello;
		this.cassa = cassa;
		this.setNote(note);
	}




	public long getIdBonifica() {
		return idBonifica;
	}




	public void setIdBonifica(long idBonifica) {
		this.idBonifica = idBonifica;
	}




	public String getIdVeicolo() {
		return idVeicolo;
	}




	public void setIdVeicolo(String idVeicolo) {
		this.idVeicolo = idVeicolo;
	}




	public String getTarga() {
		return targa;
	}




	public void setTarga(String targa) {
		this.targa = targa;
	}




	public String getTipoTarga() {
		return tipoTarga;
	}




	public void setTipoTarga(String tipoTarga) {
		this.tipoTarga = tipoTarga;
	}




	public String getIdOperazione() {
		return idOperazione;
	}




	public void setIdOperazione(String idOperazione) {
		this.idOperazione = idOperazione;
	}




	public String getIdOperazioneLogica() {
		return idOperazioneLogica;
	}




	public void setIdOperazioneLogica(String idOperazioneLogica) {
		this.idOperazioneLogica = idOperazioneLogica;
	}




	public String getTipoOperazioneLogica() {
		return tipoOperazioneLogica;
	}




	public void setTipoOperazioneLogica(String tipoOperazioneLogica) {
		this.tipoOperazioneLogica = tipoOperazioneLogica;
	}




	public String getDataOperazione() {
		return dataOperazione;
	}




	public void setDataOperazione(String dataOperazione) {
		this.dataOperazione = dataOperazione;
	}




	public String getEnte() {
		return ente;
	}




	public void setEnte(String ente) {
		this.ente = ente;
	}




	public String getSportello() {
		return sportello;
	}




	public void setSportello(String sportello) {
		this.sportello = sportello;
	}




	public String getCassa() {
		return cassa;
	}




	public void setCassa(String cassa) {
		this.cassa = cassa;
	}




	public String getNote() {
		return note;
	}




	public void setNote(String note) {
		this.note = note;
	}




	public String getDescTipoOperazione() {
		return descTipoOperazione;
	}




	public void setDescTipoOperazione(String descTipoOperazione) {
		this.descTipoOperazione = descTipoOperazione;
	}







}
