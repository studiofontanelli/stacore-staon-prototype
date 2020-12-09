package it.csi.stacore.staon.bo.id;

public class IdUtenteUA extends IdDecodifica implements java.io.Serializable {


	private static final long serialVersionUID = 2632346113019389772L;


	public IdUtenteUA(long id) {
		super(id);
	}
	

	public boolean equals(Object object) {
		boolean equals = false;

		if((object != null) && object instanceof IdUtenteUA) {
			IdUtenteUA altro = (IdUtenteUA) object;
			equals = (this.getId() == altro.getId());
		}

		return equals;
	}

}
