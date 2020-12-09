/*
 * Created on 7-mar-2006
 */
package it.csi.stacore.staon.bo;

import java.io.Serializable;

/**
 * @author 71025
 */
public class FonteRiferimentoTAU implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
		 * @uml.property  name="codiceFonteRiferimento"
		 */
    private Long codiceFonteRiferimento;
    /**
		 * @uml.property  name="descFonteRiferimento"
		 */
    private String descFonteRiferimento;

    public FonteRiferimentoTAU(Long codiceFonteRiferimento, String descFonteRiferimento) {
        this.codiceFonteRiferimento = codiceFonteRiferimento;
        this.descFonteRiferimento = descFonteRiferimento;
    }
    /**
		 * @return  Returns the codiceFonteRiferimento.
		 * @uml.property  name="codiceFonteRiferimento"
		 */
    public Long getCodiceFonteRiferimento() {
        return codiceFonteRiferimento;
    }
    /**
		 * @param codiceFonteRiferimento  The codiceFonteRiferimento to set.
		 * @uml.property  name="codiceFonteRiferimento"
		 */
    public void setCodiceFonteRiferimento(Long codiceFonteRiferimento) {
        this.codiceFonteRiferimento = codiceFonteRiferimento;
    }
    /**
		 * @return  Returns the descFonteRiferimento.
		 * @uml.property  name="descFonteRiferimento"
		 */
    public String getDescFonteRiferimento() {
        return descFonteRiferimento;
    }
    /**
		 * @param descFonteRiferimento  The descFonteRiferimento to set.
		 * @uml.property  name="descFonteRiferimento"
		 */
    public void setDescFonteRiferimento(String descFonteRiferimento) {
        this.descFonteRiferimento = descFonteRiferimento;
    }
}
