package it.csi.stacore.staon.bo.documentazionebonifiche;

import it.csi.stacore.staon.bo.AbstractBO;

public class Report extends AbstractBO implements java.io.Serializable{

	private static final long serialVersionUID = 2169359031365568958L;

	private String ente;
	private String cassa;
	private String sportello;
	private String tipologiaBonifica;
	private Integer totale;
	private Integer senza;
	private Integer con;
	private String agenzia;
	private String utente;

	public Report(String ente, String cassa, String sportello, String tipologiaBonifica, Integer senza,
			Integer con) {
		super();
		this.ente = ente;
		this.cassa = cassa;
		this.sportello = sportello;
		this.tipologiaBonifica = tipologiaBonifica;
		this.senza = senza;
		this.con = con;
	}

	public String getEnte() {
		return ente;
	}

	public void setEnte(String ente) {
		this.ente = ente;
	}

	public String getCassa() {
		return cassa;
	}

	public void setCassa(String cassa) {
		this.cassa = cassa;
	}

	public String getSportello() {
		return sportello;
	}

	public void setSportello(String sportello) {
		this.sportello = sportello;
	}

	public String getTipologiaBonifica() {
		return tipologiaBonifica;
	}

	public void setTipologiaBonifica(String tipologiaBonifica) {
		this.tipologiaBonifica = tipologiaBonifica;
	}

	public Integer getTotale() {
		return totale;
	}

	public void setTotale(Integer totale) {
		this.totale = totale;
	}

	public Integer getSenza() {
		return senza;
	}

	public void setSenza(Integer senza) {
		this.senza = senza;
	}

	public Integer getCon() {
		return con;
	}

	public void setCon(Integer con) {
		this.con = con;
	}


	public String toString() {
		return "Report [ente=" + ente + ", cassa=" + cassa + ", sportello=" + sportello + ", tipologiaBonifica="
				+ tipologiaBonifica + ", totale=" + totale + ", senza=" + senza + ", con=" + con + "]";
	}

	public String getAgenzia() {
		return agenzia;
	}

	public void setAgenzia(String agenzia) {
		this.agenzia = agenzia;
	}

	public String getUtente() {
		return utente;
	}

	public void setUtente(String utente) {
		this.utente = utente;
	}

}
