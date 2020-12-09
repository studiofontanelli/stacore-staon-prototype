/*
 * Created on 23/set/09
 */
package it.csi.stacore.staon.bo.id.avvisi.accertamento;

import java.io.Serializable;
import java.util.Date;

import it.csi.stacore.staon.bo.EsitoCalcolo;

public class CalcolaAccertamentoMancantiParameter implements Serializable {
	private static final long serialVersionUID = 1L;

	private Date dataElaborazione;

	private EsitoCalcolo esitoCalcolo;

	public CalcolaAccertamentoMancantiParameter(Date dataElaborazione, EsitoCalcolo esitoCalcolo) {
		this.dataElaborazione = dataElaborazione;
		this.esitoCalcolo = esitoCalcolo;
	}

	public Date getDataElaborazione() {
		return dataElaborazione;
	}

	public void setDataElaborazione(Date dataElaborazione) {
		this.dataElaborazione = dataElaborazione;
	}

	public EsitoCalcolo getEsitoCalcolo() {
		return esitoCalcolo;
	}

	public void setEsitoCalcolo(EsitoCalcolo esitoCalcolo) {
		this.esitoCalcolo = esitoCalcolo;
	}
}