package it.csi.stacore.staon.bo.credito;

import it.csi.stacore.staon.bo.TipoVeicolo;
import it.csi.stacore.staon.bo.id.LongId;

/**
 * @author   70467
 */
public interface Compensato {

	public abstract LongId getIdCompensato();

	public abstract TipoErogazione getTipoErogazione();

	public abstract String getTargaCompensato();

	public abstract TipoVeicolo getTipoVeicoloCompensato();

	public abstract Integer getScadenzaCompensato();

	public abstract Integer getValiditaCompensato();
}
