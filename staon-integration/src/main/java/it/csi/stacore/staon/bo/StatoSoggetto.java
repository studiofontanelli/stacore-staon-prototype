/*
 * Created on 7-mar-2006
 */
package it.csi.stacore.staon.bo;

import java.io.Serializable;

/**
 * @author 71025
 */
public class StatoSoggetto implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4725582428779640148L;
	/**
		 * @uml.property  name="codiceStatoAnagrafico"
		 */
    private Long codiceStatoSoggetto;
    /**
		 * @uml.property  name="descStatoSoggetto"
		 */
    private String descStatoSoggetto;

    public StatoSoggetto(Long codiceStatoSoggetto, String descStatoSoggetto) {
        this.codiceStatoSoggetto = codiceStatoSoggetto;
        this.descStatoSoggetto = descStatoSoggetto;
    }
    /**
		 * @return  Returns the codiceStatoSoggetto.
		 * @uml.property  name="codiceStatoSoggetto"
		 */
    public Long getCodiceStatoSoggetto() {
        return codiceStatoSoggetto;
    }
    /**
		 * @param codiceStatoSoggetto  The codiceStatoSoggetto to set.
		 * @uml.property  name="codiceStatoSoggetto"
		 */
    public void setCodiceStatoSoggetto(Long codiceStatoSoggetto) {
        this.codiceStatoSoggetto = codiceStatoSoggetto;
    }
    /**
		 * @return  Returns the descStatoSoggetto.
		 * @uml.property  name="descStatoSoggetto"
		 */
    public String getDescStatoSoggetto() {
        return descStatoSoggetto;
    }
    /**
		 * @param descStatoSoggetto  The descStatoSoggetto to set.
		 * @uml.property  name="descStatoSoggetto"
		 */
    public void setDescStatoSoggetto(String descStatoSoggetto) {
        this.descStatoSoggetto = descStatoSoggetto;
    }
}
