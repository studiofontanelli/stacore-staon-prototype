package it.csi.stacore.staon.bo.id;

public class IdChiusuraComunicaz extends IdDecodifica implements java.io.Serializable {

	public IdChiusuraComunicaz(long id){
		super(id);
		// TODO Auto-generated constructor stub
	}


	public boolean equals(Object object) {
		boolean equals = false;

		if((object != null) && object instanceof IdChiusuraComunicaz) {
			IdChiusuraComunicaz altro = (IdChiusuraComunicaz) object;
			equals = (this.getId() == altro.getId());
		}

		return equals;
	}

}