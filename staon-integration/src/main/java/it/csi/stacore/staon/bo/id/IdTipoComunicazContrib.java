package it.csi.stacore.staon.bo.id;

public class IdTipoComunicazContrib extends IdDecodifica implements java.io.Serializable {
	
	public static final long OSSERVAZIONE_AVVISO_SCADENZA      = 1;
	public static final long OSSERVAZIONE_AVVISO_ACCERTAMENTO  = 2;
	public static final long ESENZIONE_DISABILE                = 3;
	public static final long RESTITUZIONE                      = 4;
	public static final long DISCARICO_RIMBORSO_INGIUNZIONE    = 5;
	public static final long RATEIZAZIONE                      = 6;
	
	private static final long serialVersionUID = -1966281003651113344L;


	public IdTipoComunicazContrib(long id) {
		super(id);
		
	}


	public boolean equals(Object object) {
		boolean equals = false;

		if((object != null) && object instanceof IdTipoComunicazContrib) {
			IdTipoComunicazContrib altro = (IdTipoComunicazContrib) object;
			equals = (this.getId() == altro.getId());
		}

		return equals;
	}

}


