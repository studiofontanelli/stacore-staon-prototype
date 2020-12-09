/*
 * Created on 20-set-2006
 */
package it.csi.stacore.staon.bo.credito;

import it.csi.stacore.staon.bo.AbstractBO;
import it.csi.stacore.staon.bo.TipoVeicolo;
import it.csi.stacore.staon.bo.id.LongId;

/**
 * Classe che implementa Compensato al solo scopo di passare idCompensato e
 * tipoErogazione ai servizi che li richiedono.
 * Vedi ServizioCreditoBean.chiudiCredito
 */
public class CompensatoDummy extends AbstractBO implements Compensato {

	private static final long serialVersionUID = 5285648112205047425L;
	private final LongId idCompensato;
	private final TipoErogazione tipoErogazione;

	public CompensatoDummy(LongId idCompensato, TipoErogazione tipoErogazione) {
		this.idCompensato = idCompensato;
		this.tipoErogazione = tipoErogazione;
	}

	public LongId getIdCompensato() {
		return idCompensato;
	}

	public TipoErogazione getTipoErogazione() {
		return tipoErogazione;
	}

	public String getTargaCompensato() {
		return null;
	}

	public TipoVeicolo getTipoVeicoloCompensato() {
		return null;
	}

	public Integer getScadenzaCompensato() {
		return null;
	}

	public Integer getValiditaCompensato() {
		return null;
	}

}
