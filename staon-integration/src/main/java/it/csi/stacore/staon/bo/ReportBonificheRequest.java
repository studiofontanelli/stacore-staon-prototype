package it.csi.stacore.staon.bo;

import java.util.Date;

public class ReportBonificheRequest implements java.io.Serializable {
	
	private static final long serialVersionUID = 2316387837642925411L;

	private String ente;
	private String sportello;
	private String cassa;
	private Date dataDa;
	private Date dataA;
	private boolean senza;

	
	public ReportBonificheRequest(String ente, String sportello, String cassa, Date dataDa, Date dataA, boolean senza) {
		super();
		this.ente = ente;
		this.sportello = sportello;
		this.cassa = cassa;
		this.dataDa = dataDa;
		this.dataA = dataA;
		this.senza = senza;
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
	public Date getDataDa() {
		return dataDa;
	}
	public void setDataDa(Date dataDa) {
		this.dataDa = dataDa;
	}
	public Date getDataA() {
		return dataA;
	}
	public void setDataA(Date dataA) {
		this.dataA = dataA;
	}
	public boolean isSenza() {
		return senza;
	}
	public void setSenza(boolean senza) {
		this.senza = senza;
	}
	
}