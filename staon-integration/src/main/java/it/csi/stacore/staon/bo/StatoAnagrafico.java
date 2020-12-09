/*
 * Created on 7-mar-2006
 */
package it.csi.stacore.staon.bo;

import java.io.Serializable;

/**
 * @author 71025
 */
public class StatoAnagrafico implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2775513150345915726L;
	/**
		 * @uml.property  name="codiceStatoAnagrafico"
		 */
    private Long codiceStatoAnagrafico;
    /**
		 * @uml.property  name="descStatoAnagrafico"
		 */
    private String descStatoAnagrafico;

    public StatoAnagrafico(Long codiceStatoAnagrafico, String descStatoAnagrafico) {
        this.codiceStatoAnagrafico = codiceStatoAnagrafico;
        this.descStatoAnagrafico = descStatoAnagrafico;
    }
    /**
		 * @return  Returns the codiceStatoAnagrafico.
		 * @uml.property  name="codiceStatoAnagrafico"
		 */
    public Long getCodiceStatoAnagrafico() {
        return codiceStatoAnagrafico;
    }
    /**
		 * @param codiceStatoAnagrafico  The codiceStatoAnagrafico to set.
		 * @uml.property  name="codiceStatoAnagrafico"
		 */
    public void setCodiceStatoAnagrafico(Long codiceStatoAnagrafico) {
        this.codiceStatoAnagrafico = codiceStatoAnagrafico;
    }
    /**
		 * @return  Returns the descStatoAnagrafico.
		 * @uml.property  name="descStatoAnagrafico"
		 */
    public String getDescStatoAnagrafico() {
        return descStatoAnagrafico;
    }
    /**
		 * @param descStatoAnagrafico  The descStatoAnagrafico to set.
		 * @uml.property  name="descStatoAnagrafico"
		 */
    public void setDescStatoAnagrafico(String descStatoAnagrafico) {
        this.descStatoAnagrafico = descStatoAnagrafico;
    }
}
