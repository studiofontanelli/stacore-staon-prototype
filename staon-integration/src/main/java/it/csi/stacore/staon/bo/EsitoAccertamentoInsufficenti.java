package it.csi.stacore.staon.bo;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class EsitoAccertamentoInsufficenti implements Serializable {

	private static final long serialVersionUID = 305065023355486493L;

	Importo versato;
	Importo tassaCalcolata;
	Date    dataPrimoPagamento;

	public EsitoAccertamentoInsufficenti(Importo versato, Importo tassaCalcolata, Date dataPrimoPagamento) {
		super();
		this.versato = versato;
		this.tassaCalcolata = tassaCalcolata;
		this.dataPrimoPagamento = dataPrimoPagamento;


	}
	public Date getDataPrimoPagamento() {
		return dataPrimoPagamento;
	}

	public Importo getTassaCalcolata() {
		return tassaCalcolata;
	}

	public Importo getVersato() {
		return versato;
	}

	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
		.append("EsitoAccertamentoInsufficenti::versato                         ", getVersato())
		.append("EsitoAccertamentoInsufficenti::tassa calcolata                 ", getTassaCalcolata())
		.append("EsitoAccertamentoInsufficenti::data primo pagamento            ", getDataPrimoPagamento())
		.toString();
	}
}
