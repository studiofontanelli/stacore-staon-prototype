/*
 * Created on 21/nov/08
 */
package it.csi.stacore.staon.bo;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class EsitoCalcoloSenzaRiduzione implements Serializable {

	private static final long serialVersionUID = -7302744961636549972L;

	private Importo importo;
	private Valuta  rimorchiabilita;
	private Integer numeroMensilitaRidotte;
	private Date dataEvento;

	public EsitoCalcoloSenzaRiduzione(Importo importo, Valuta rimorchiabilita, Integer numeroMensilitaRidotte, Date dataEvento) {
		this.importo = importo;
		this.rimorchiabilita = rimorchiabilita;
		this.numeroMensilitaRidotte = numeroMensilitaRidotte;
		this.dataEvento = dataEvento;
	}

	public Importo getImporto() {
		return importo;
	}

	public void setImporto(Importo importo) {
		this.importo = importo;
	}

	public Valuta getRimorchiabilita() {
		return rimorchiabilita;
	}

	public void setRimorchiabilita(Valuta rimorchiabilita) {
		this.rimorchiabilita = rimorchiabilita;
	}

	public Integer getNumeroMensilitaRidotte() {
		return numeroMensilitaRidotte;
	}

	public void setNumeroMensilitaRidotte(Integer numeroMensilitaRidotte) {
		this.numeroMensilitaRidotte = numeroMensilitaRidotte;
	}

	public Date getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}

	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
		.append("Importo", getImporto())
		.append("Rimorchiabilita",getRimorchiabilita())
		.append("NumeroMesiMensilitaRidotta", getNumeroMensilitaRidotte())
		.append("DataEvento", getDataEvento())
		.toString();
	}

}
