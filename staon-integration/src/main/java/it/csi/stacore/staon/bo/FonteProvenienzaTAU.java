/*
 * Created on 7-mar-2006
 */
package it.csi.stacore.staon.bo;

import java.io.Serializable;

/**
 * @author 71025
 */
public class FonteProvenienzaTAU implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
		 * @uml.property  name="codiceFonteProvenienza"
		 */
    private Long codiceFonteProvenienza;
    /**
		 * @uml.property  name="descFonteProvenienza"
		 */
    private String descFonteProvenienza;

    public FonteProvenienzaTAU(Long codiceFonteProvenienza, String descFonteProvenienza) {
        this.codiceFonteProvenienza = codiceFonteProvenienza;
        this.descFonteProvenienza = descFonteProvenienza;
    }
    /**
		 * @return  Returns the codiceFonteProvenienza.
		 * @uml.property  name="codiceFonteProvenienza"
		 */
    public Long getCodiceFonteProvenienza() {
        return codiceFonteProvenienza;
    }
    /**
		 * @param codiceFonteProvenienza  The codiceFonteProvenienza to set.
		 * @uml.property  name="codiceFonteProvenienza"
		 */
    public void setCodiceFonteProvenienza(Long codiceFonteProvenienza) {
        this.codiceFonteProvenienza = codiceFonteProvenienza;
    }
    /**
		 * @return  Returns the descFonteProvenienza.
		 * @uml.property  name="descFonteProvenienza"
		 */
    public String getDescFonteProvenienza() {
        return descFonteProvenienza;
    }
    /**
		 * @param descFonteProvenienza  The descFonteProvenienza to set.
		 * @uml.property  name="descFonteProvenienza"
		 */
    public void setDescFonteProvenienza(String descFonteProvenienza) {
        this.descFonteProvenienza = descFonteProvenienza;
    }
}
