package it.csi.stacore.staon.bo;

import it.csi.stacore.staon.bo.id.IdDecodifica;

public class IdStatoComunicazione extends IdDecodifica implements java.io.Serializable {


	/**
	 *
	 */
	private static final long serialVersionUID = 267108546753443370L;


	public IdStatoComunicazione(long id) {
		super(id);
		// TODO Auto-generated constructor stub
	}


	public boolean equals(Object object) {
		boolean equals = false;

		if((object != null) && object instanceof IdStatoComunicazione) {
			IdStatoComunicazione altro = (IdStatoComunicazione) object;
			equals = (this.getId() == altro.getId());
		}

		return equals;
	}

}

