package it.csi.stacore.staon.bo.avvisi.accertamento;

import java.util.Date;

import it.csi.stacore.staon.bo.DecodificaDatata;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.util.EqualsUtil;

public class CausaleSospensione extends DecodificaDatata {

	private static final long serialVersionUID = 2564073915930895773L;

	public CausaleSospensione(IdDecodifica id, String codice,
			String descrizione) {
		super(id, codice, descrizione, new Date(), new Date());
	}

	public CausaleSospensione(IdDecodifica id, String codice,
			String descrizione, Date dtInzio, Date dtFine) {
		super(id, codice, descrizione, dtInzio, dtFine);
	}

	public boolean equals(Object object) {
		boolean equals = false;

		if ((object != null) && object instanceof CausaleSospensione) {
			CausaleSospensione altro = (CausaleSospensione) object;
			equals = EqualsUtil.objectEquals(getId(), altro.getId());
		}

		return equals;
	}

}