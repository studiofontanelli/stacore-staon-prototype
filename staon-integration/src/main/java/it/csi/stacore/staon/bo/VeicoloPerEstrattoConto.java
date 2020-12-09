package it.csi.stacore.staon.bo;

import java.io.Serializable;
import java.util.Date;

import it.csi.stacore.staon.bo.id.IdVeicolo;

public class VeicoloPerEstrattoConto implements Serializable {

	private static final long serialVersionUID = 1L;
	private final String targa;
	private final TipoVeicolo tipoVeicolo;
	private final Date dataInizio;
	private final Date dataFine;
	private final IdVeicolo idVeicolo;

	public VeicoloPerEstrattoConto(String targa, TipoVeicolo tipoVeicolo,
			Date dataInizio, Date dataFine, IdVeicolo idVeicolo) {
		this.targa = targa;
		this.tipoVeicolo = tipoVeicolo;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.idVeicolo = idVeicolo;
	}

	public String getTarga() {
		return targa;
	}

	public TipoVeicolo getTipoVeicolo() {
		return tipoVeicolo;
	}

	public Date getDataInizio() {
		return dataInizio;
	}

	public Date getDataFine() {
		return dataFine;
	}

	public IdVeicolo getIdVeicolo() {
		return idVeicolo;
	}

}