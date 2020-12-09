package it.csi.stacore.staon.bo.credito;

import java.util.Date;
import java.util.List;

import it.csi.stacore.staon.bo.AbstractBO;
import it.csi.stacore.staon.bo.Contributo;
import it.csi.stacore.staon.bo.TipoCredito;
import it.csi.stacore.staon.bo.Valuta;
import it.csi.stacore.staon.bo.id.IdCredito;


public class Credito extends AbstractBO {

	private static final long serialVersionUID = -7333930508887800446L;
	private IdCredito idCredito;
	private Contributo contributo;
	private Valuta importo;
	private Date dataCreazione;
	private Valuta importoLiquidazione;
	private Date dataCancellazione;
	private TipoCredito tipoCredito;
	private Valuta importoResiduo;

	private List beneficiarioList;
	private List emissioneCreditoList;

	public Credito(IdCredito idCredito, Contributo contributo, Valuta importo, Date dataCreazione, Valuta importoDaLiquidare, Date dataCancellazione, TipoCredito tipoCredito, Valuta importoResiduo, List beneficiarioList, List emissioneCreditoList) {
		super();

		this.idCredito = idCredito;
		this.contributo = contributo;
		this.importo = importo;
		this.dataCreazione = dataCreazione;
		this.importoLiquidazione = importoDaLiquidare;
		this.dataCancellazione = dataCancellazione;
		this.tipoCredito = tipoCredito;
		this.importoResiduo = importoResiduo;
		this.beneficiarioList = beneficiarioList;
		this.emissioneCreditoList = emissioneCreditoList;
	}

	public List getBeneficiarioList() {
		return beneficiarioList;
	}

	public void setBeneficiarioList(List beneficiarioList) {
		this.beneficiarioList = beneficiarioList;
	}

	public Contributo getContributo() {
		return contributo;
	}

	public void setContributo(Contributo contributo) {
		this.contributo = contributo;
	}

	public Date getDataCancellazione() {
		return dataCancellazione;
	}

	public void setDataCancellazione(Date dataCancellazione) {
		this.dataCancellazione = dataCancellazione;
	}

	public Date getDataCreazione() {
		return dataCreazione;
	}

	public void setDataCreazione(Date dataCreazione) {
		this.dataCreazione = dataCreazione;
	}

	public List getEmissioneCreditoList() {
		return emissioneCreditoList;
	}

	public void setEmissioneCreditoList(List emissioneCreditoList) {
		this.emissioneCreditoList = emissioneCreditoList;
	}

	public IdCredito getIdCredito() {
		return idCredito;
	}

	public void setIdCredito(IdCredito idCredito) {
		this.idCredito = idCredito;
	}

	public Valuta getImportoLiquidazione() {
		return importoLiquidazione;
	}

	public void setImportoLiquidazione(Valuta importoDaLiquidare) {
		this.importoLiquidazione = importoDaLiquidare;
	}

	public Valuta getImportoResiduo() {
		return importoResiduo;
	}

	public void setImportoResiduo(Valuta importoResiduo) {
		this.importoResiduo = importoResiduo;
	}

	public TipoCredito getTipoCredito() {
		return tipoCredito;
	}

	public void setTipoCredito(TipoCredito tipoCredito) {
		this.tipoCredito = tipoCredito;
	}

	public Valuta getImporto() {
		return importo;
	}

	public void setImporto(Valuta importo) {
		this.importo = importo;
	}

}
