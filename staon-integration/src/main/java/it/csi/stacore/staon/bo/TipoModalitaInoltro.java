package it.csi.stacore.staon.bo;

import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.util.EqualsUtil;

public class TipoModalitaInoltro extends Decodifica implements java.io.Serializable {


	/**
	 *
	 */
	private static final long serialVersionUID = 6644416588017129231L;

	public TipoModalitaInoltro(IdDecodifica idDecodifica, String codice, String descrizione) {
		super(idDecodifica, codice, descrizione);
	}

	public boolean equals(Object object) {
		boolean equals = false;

		if ((object != null) && object instanceof TipoModalitaInoltro) {
			TipoModalitaInoltro altro = (TipoModalitaInoltro) object;
			equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
		}

		return equals;
	}
}
