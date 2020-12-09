package it.csi.stacore.staon.bo;

import it.csi.stacore.staon.bo.id.IdFonteComunicazione;
import it.csi.stacore.staon.util.EqualsUtil;


public class FonteComunicazione extends Decodifica implements java.io.Serializable {



	/**
	 *
	 */
	private static final long serialVersionUID = 8915828440208930561L;


	public FonteComunicazione(IdFonteComunicazione idFonteComunicazione, String codice, String descrizione) {
		super(idFonteComunicazione, codice, descrizione);
	}


	public IdFonteComunicazione getIdFonteComunicazione() {
		return (IdFonteComunicazione) getId();
	}


	public boolean equals(Object object) {
		boolean equals = false;

		if((object != null) && object instanceof Fonte) {
			FonteComunicazione altro = (FonteComunicazione) object;
			equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
		}

		return equals;
	}



	/*public static Fonte getFonteRegione() {
		return new Fonte(new IdFonte(6), "Regione", CODICE_REG);
	}*/

}