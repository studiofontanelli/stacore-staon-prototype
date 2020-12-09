package it.csi.stacore.staon.bo.id;

public class IdEnteUA extends IdDecodifica implements java.io.Serializable {

	private static final long serialVersionUID = 2632346113019389772L;


	public IdEnteUA(long id) {
		super(id);
	}
	

	public boolean equals(Object object) {
		boolean equals = false;

		if((object != null) && object instanceof IdEnteUA) {
			IdEnteUA altro = (IdEnteUA) object;
			equals = (this.getId() == altro.getId());
		}

		return equals;
	}

}
