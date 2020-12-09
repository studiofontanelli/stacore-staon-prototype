package it.csi.stacore.staon.bo;

import it.csi.stacore.staon.bo.id.IdUtenteUA;
import it.csi.stacore.staon.util.EqualsUtil;


public class UtenteUA extends Decodifica implements java.io.Serializable {

	private static final long serialVersionUID = 8915828440208930561L;


	public UtenteUA(IdUtenteUA idUtenteUA, String codice, String descrizione) {
		super(idUtenteUA, codice, descrizione);
	}


	public IdUtenteUA getIdUtenteUA() {
		return (IdUtenteUA) getId();
	}


	public boolean equals(Object object) {
		boolean equals = false;

		if((object != null) && object instanceof Fonte) {
			UtenteUA altro = (UtenteUA) object;
			equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
		}

		return equals;
	}


}