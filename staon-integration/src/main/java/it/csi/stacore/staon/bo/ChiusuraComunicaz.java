package it.csi.stacore.staon.bo;

import it.csi.stacore.staon.bo.id.IdChiusuraComunicaz;
import it.csi.stacore.staon.util.EqualsUtil;

public class ChiusuraComunicaz extends Decodifica {

	public ChiusuraComunicaz(IdChiusuraComunicaz idChiusuraComunicaz, String codice, String descrizione) {
		super(idChiusuraComunicaz, codice, descrizione);
	}

	/**
	 *
	 */
	private static final long serialVersionUID = -2785701858843455802L;

	public boolean equals(Object object) {
		 boolean equals = false;

	        if((object != null) && object instanceof Alimentazione)
	        {
	        	ChiusuraComunicaz altro = (ChiusuraComunicaz) object;
	            equals = EqualsUtil.objectEquals(getId(),
	                                             altro.getId()) &&
	                     EqualsUtil.objectEquals(getCodice(),
	                                             altro.getCodice()) &&
	                     EqualsUtil.objectEquals(getDescrizione(),
	                                             altro.getDescrizione());
	        }

	        return equals;
	}

}
