package it.csi.stacore.staon.bo.id;

public class IdStatoLavorazione extends IdDecodifica implements java.io.Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -3378579606319754498L;


	public IdStatoLavorazione(long id) {
		super(id);
		// TODO Auto-generated constructor stub
	}


	public boolean equals(Object object) {
		boolean equals = false;

		if((object != null) && object instanceof IdStatoLavorazione) {
			IdStatoLavorazione altro = (IdStatoLavorazione) object;
			equals = (this.getId() == altro.getId());
		}

		return equals;
	}

}