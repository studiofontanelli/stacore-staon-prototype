package it.csi.stacore.staon.bo;

import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.util.EqualsUtil;

public class RegolaCalcolo extends Decodifica implements java.io.Serializable {
	private static final long serialVersionUID = 8713029499689705094L;

	public RegolaCalcolo(IdDecodifica idDecodifica, String codice, String descrizione) {
		super(idDecodifica, codice, descrizione);
	}

	public IdDecodifica getIdRegola() {
		return getId();
	}

	public boolean equals(Object object) {
		boolean equals = false;

		if ((object != null) && object instanceof RegolaCalcolo) {
			RegolaCalcolo altro = (RegolaCalcolo) object;
			equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
		}

		return equals;
	}
}
