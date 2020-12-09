package it.csi.stacore.staon.bo;

import it.csi.stacore.staon.bo.id.IdEnteUA;
import it.csi.stacore.staon.util.EqualsUtil;


public class EnteUA extends Decodifica implements java.io.Serializable {


	private static final long serialVersionUID = 8915828440208930561L;


	public EnteUA(IdEnteUA idEnteUA, String codice, String descrizione) {
		super(idEnteUA, codice, descrizione);
	}


	public IdEnteUA getIdEnteUA() {
		return (IdEnteUA) getId();
	}


	public boolean equals(Object object) {
		boolean equals = false;

		if((object != null) && object instanceof Fonte) {
			EnteUA altro = (EnteUA) object;
			equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
		}

		return equals;
	}

}