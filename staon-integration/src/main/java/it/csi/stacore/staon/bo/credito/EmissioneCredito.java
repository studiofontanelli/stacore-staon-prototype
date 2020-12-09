package it.csi.stacore.staon.bo.credito;

import java.util.Date;

import it.csi.stacore.staon.bo.AbstractBO;
import it.csi.stacore.staon.bo.Contributo;
import it.csi.stacore.staon.bo.Divisa;
import it.csi.stacore.staon.bo.id.IdCredito;
import it.csi.stacore.staon.bo.id.IdEmissioneCredito;
import it.csi.stacore.staon.bo.id.LongId;

public class EmissioneCredito extends AbstractBO {

	private static final long serialVersionUID = -3598697634278926079L;

	private IdEmissioneCredito idEmissioneCredito;

	private IdCredito idCredito;

	private Contributo contributo;

	private Divisa divisa;

	private LongId idCompensato;

	private TipoErogazione tipoErogazione;

	private Date dataCancellazione;

	public EmissioneCredito(IdEmissioneCredito idEmissioneCredito, IdCredito idCredito, Contributo contributo, Divisa divisa, LongId idCompensato,
			TipoErogazione tipoErogazione, Date dataCancellazione) {
		super();

		this.idEmissioneCredito = idEmissioneCredito;
		this.idCredito = idCredito;
		this.contributo = contributo;
		this.divisa = divisa;
		this.idCompensato = idCompensato;
		this.tipoErogazione = tipoErogazione;
		this.dataCancellazione = dataCancellazione;
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

	public Divisa getDivisa() {
		return divisa;
	}

	public void setDivisa(Divisa divisa) {
		this.divisa = divisa;
	}

	public LongId getIdCompensato() {
		return idCompensato;
	}

	public void setIdCompensato(LongId idCompensato) {
		this.idCompensato = idCompensato;
	}

	public IdCredito getIdCredito() {
		return idCredito;
	}

	public void setIdCredito(IdCredito idCredito) {
		this.idCredito = idCredito;
	}

	public IdEmissioneCredito getIdEmissioneCredito() {
		return idEmissioneCredito;
	}

	public void setIdEmissioneCredito(IdEmissioneCredito idEmissioneCredito) {
		this.idEmissioneCredito = idEmissioneCredito;
	}

	public TipoErogazione getTipoErogazione() {
		return tipoErogazione;
	}

	public void setTipoErogazione(TipoErogazione tipoErogazione) {
		this.tipoErogazione = tipoErogazione;
	}

}
