package it.csi.stacore.staon.bo;

import it.csi.stacore.staon.bo.id.IdAgenziaUA;
import it.csi.stacore.staon.util.EqualsUtil;


public class AgenziaUA extends Decodifica implements java.io.Serializable {


	private static final long serialVersionUID = 8915828440208930561L;

	public AgenziaUA(IdAgenziaUA idAgenziaUA, String codice, String descrizione) {
		super(idAgenziaUA, codice, descrizione);
	}

	public IdAgenziaUA getIdAgenziaUA() {
		return (IdAgenziaUA) getId();
	}


	public boolean equals(Object object) {
		boolean equals = false;

		if((object != null) && object instanceof Fonte) {
			AgenziaUA altro = (AgenziaUA) object;
			equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
		}

		return equals;
	}

}