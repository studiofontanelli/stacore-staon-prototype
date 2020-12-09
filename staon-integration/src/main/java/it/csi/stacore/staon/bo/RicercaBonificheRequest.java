package it.csi.stacore.staon.bo;

import java.io.Serializable;
import java.util.Date;

public class RicercaBonificheRequest implements Serializable{

	private static final long serialVersionUID = 5365837532995218970L;
	
	private boolean sensaGiustificativi;
	private String targa;
	private String tipoTarga;
	private String ente;
	private String sportello;
	private String cassa;
	private String tipoBonifica;
	private Date dataDa;
	private Date dataA;
	
	public RicercaBonificheRequest(boolean sensaGiustificativi, String targa, String tipoTarga, String ente,
			String sportello, String cassa, String tipoBonifica, Date dataDa, Date dataA) {
		super();
		this.sensaGiustificativi = sensaGiustificativi;
		this.targa = targa;
		this.tipoTarga = tipoTarga;
		this.ente = ente;
		this.sportello = sportello;
		this.cassa = cassa;
		this.tipoBonifica = tipoBonifica;
		this.dataDa = dataDa;
		this.dataA = dataA;
	}

	public boolean isSensaGiustificativi() {
		return sensaGiustificativi;
	}

	public void setSensaGiustificativi(boolean sensaGiustificativi) {
		this.sensaGiustificativi = sensaGiustificativi;
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

	public String getTipoBonifica() {
		return tipoBonifica;
	}

	public void setTipoBonifica(String tipoBonifica) {
		this.tipoBonifica = tipoBonifica;
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
}
