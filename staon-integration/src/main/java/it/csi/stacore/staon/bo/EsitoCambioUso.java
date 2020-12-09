package it.csi.stacore.staon.bo;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class EsitoCambioUso implements Serializable {
	private static final long serialVersionUID = 5030843702907744269L;

	private Importo importo;
	private Date ultimoGiornoUtilePagamentoVariazione;
	private EsitoCalcolo esitoCalcolo;
	private EsitoCalcolo esitoCalcoloConCambioUso;
	private int numeroGiorniPrimaVariazione;
	private int numeroGiorniDopoVariazione;
	private Valuta tassaSecondoPeriodoNonMaggiorata;

	public EsitoCambioUso(Importo importo) {
		super();
		this.importo = importo;
	}

	public Importo getImporto() {
		return importo;
	}

	public String toString(){
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
		.append("EsitoCambioUso::tassa" , getImporto().getTassa())
		.append("EsitoCambioUso::sanzioni" , getImporto().getSanzioni())
		.append("EsitoCambioUso::interessi" , getImporto().getInteressi())
		.append("ultimoGiornoUtilePagamentoVariazione" , ultimoGiornoUtilePagamentoVariazione)
		.append("numeroGiorniPrimaVariazione" , numeroGiorniPrimaVariazione)
		.append("numeroGiorniDopoVariazione" , numeroGiorniDopoVariazione)
		.append("tassaSecondoPeriodoNonMaggiorata" , tassaSecondoPeriodoNonMaggiorata)
		.toString();
	}

	public EsitoCalcolo getEsitoCalcolo() {
		return esitoCalcolo;
	}

	public void setEsitoCalcolo(EsitoCalcolo esitoCalcolo) {
		this.esitoCalcolo = esitoCalcolo;
	}

	public EsitoCalcolo getEsitoCalcoloConCambioUso() {
		return esitoCalcoloConCambioUso;
	}

	public void setEsitoCalcoloConCambioUso(EsitoCalcolo esitoCalcoloConCambioUso) {
		this.esitoCalcoloConCambioUso = esitoCalcoloConCambioUso;
	}

	public Date getUltimoGiornoUtilePagamentoVariazione() {
		return ultimoGiornoUtilePagamentoVariazione;
	}

	public void setUltimoGiornoUtilePagamentoVariazione(
			Date ultimoGiornoUtilePagamentoVariazione) {
		this.ultimoGiornoUtilePagamentoVariazione = ultimoGiornoUtilePagamentoVariazione;
	}

	public int getNumeroGiorniDopoVariazione() {
		return numeroGiorniDopoVariazione;
	}

	public void setNumeroGiorniDopoVariazione(int numeroGiorniDopoVariazione) {
		this.numeroGiorniDopoVariazione = numeroGiorniDopoVariazione;
	}

	public int getNumeroGiorniPrimaVariazione() {
		return numeroGiorniPrimaVariazione;
	}

	public void setNumeroGiorniPrimaVariazione(int numeroGiorniPrimaVariazione) {
		this.numeroGiorniPrimaVariazione = numeroGiorniPrimaVariazione;
	}

	public Valuta getTassaSecondoPeriodoNonMaggiorata() {
		return tassaSecondoPeriodoNonMaggiorata;
	}

	public void setTassaSecondoPeriodoNonMaggiorata(
			Valuta tassaSecondoPeriodoNonMaggiorata) {
		this.tassaSecondoPeriodoNonMaggiorata = tassaSecondoPeriodoNonMaggiorata;
	}
}
