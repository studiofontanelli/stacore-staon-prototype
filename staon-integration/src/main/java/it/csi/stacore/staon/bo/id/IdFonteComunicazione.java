package it.csi.stacore.staon.bo.id;

public class IdFonteComunicazione extends IdDecodifica implements java.io.Serializable {


	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2632346113019389772L;


	public IdFonteComunicazione(long id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	

	public boolean equals(Object object) {
		boolean equals = false;

		if((object != null) && object instanceof IdFonteComunicazione) {
			IdFonteComunicazione altro = (IdFonteComunicazione) object;
			equals = (this.getId() == altro.getId());
		}

		return equals;
	}

}
