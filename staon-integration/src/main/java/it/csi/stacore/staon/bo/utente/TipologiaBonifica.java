package it.csi.stacore.staon.bo.utente;

import java.io.Serializable;

import it.csi.stacore.staon.bo.Decodifica;
import it.csi.stacore.staon.bo.id.IdDecodifica;

public class TipologiaBonifica extends Decodifica implements Serializable{

	private static final long serialVersionUID = -9124747226072316958L;

	public TipologiaBonifica(Long id,
	         String codice,
	         String descrizione) {

		super(new IdDecodifica(id.longValue()), codice, descrizione);
	}

	public boolean equals(Object obj) {

	    boolean result = false;

	    if (getId()!=null) {
		    if (obj instanceof Sportello) {
		    	TipologiaBonifica tipoBonifica = (TipologiaBonifica)obj;
		        if (getId().equals(tipoBonifica.getId())) result = true;
		    }
		}

	    return result;
	}


}
