package it.csi.stacore.staon.bo;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


public class TipoItemScadenza implements Serializable {
	private static final long serialVersionUID = 3268646238741515413L;
	private String tipoItemScadenza;
	private Date dataInizioAgevolazione;
	private Date dataFineAgevolazione;
	public TipoItemScadenza(String tipoItemScadenza,
			Date dataInizioAgevolazione, Date dataFineAgevolazione) {
		super();
		this.tipoItemScadenza = tipoItemScadenza;
		this.dataInizioAgevolazione = dataInizioAgevolazione;
		this.dataFineAgevolazione = dataFineAgevolazione;
	}
	public String getTipoItemScadenza() {
		return tipoItemScadenza;
	}
	public Date getDataInizioAgevolazione() {
		return dataInizioAgevolazione;
	}
	public Date getDataFineAgevolazione() {
		return dataFineAgevolazione;
	}
	public static boolean isTipoSospensione(TipoItemScadenza tipoItemScadenza){
		if(tipoItemScadenza == null)
			return false;
		if("SOSP".equals(tipoItemScadenza.getTipoItemScadenza()))
			return true;
		return false;
	}
	public static boolean isTipoImmatricolazione(TipoItemScadenza tipoItemScadenza){
		if(tipoItemScadenza == null)
			return false;
		if("IMM".equals(tipoItemScadenza.getTipoItemScadenza()))
			return true;
		return false;
	}
	public String toString(){
		return new ToStringBuilder(this,
				ToStringStyle.MULTI_LINE_STYLE)
		.append("tipoItemScadenza            =", getTipoItemScadenza())
		.append("dataInizioAgevolazione      =", getDataInizioAgevolazione())
		.append("dataFineAgevolazione        =", getDataFineAgevolazione())
		.toString();
	}

}
