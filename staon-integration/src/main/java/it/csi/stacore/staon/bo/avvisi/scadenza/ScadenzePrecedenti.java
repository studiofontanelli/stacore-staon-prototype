/*
 * Created on 14-nov-2005
 */
package it.csi.stacore.staon.bo.avvisi.scadenza;

import java.io.Serializable;
import java.math.BigDecimal;

import it.csi.stacore.staon.bo.id.avvisi.scadenza.IdAvvisoScadenzaPersona;

/**
 * @author mdferrua
 */
public class ScadenzePrecedenti implements Serializable {

	static final long serialVersionUID = 889959897946401369L;

	/**
	 * @uml.property  name="idAvvisoScadenzaPersona"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private IdAvvisoScadenzaPersona idAvvisoScadenzaPersona = null;

	/**
	 * @uml.property  name="anno"
	 */
	private BigDecimal anno = null;

	/**
	 * @uml.property  name="statoAnno"
	 */
	private String statoAnno = null;

	/**
	 * @param idAvvisoScadenzaPersona
	 * @param anno
	 * @param statoAnno
	 */
	public ScadenzePrecedenti(IdAvvisoScadenzaPersona idAvvisoScadenzaPersona,
			BigDecimal anno, String statoAnno) {
		this.idAvvisoScadenzaPersona = idAvvisoScadenzaPersona;
		this.anno = anno;
		this.statoAnno = statoAnno;
	}

	/**
	 * @return  Returns the anno.
	 * @uml.property  name="anno"
	 */
	public BigDecimal getAnno() {
		return anno;
	}

	/**
	 * @param anno  The anno to set.
	 * @uml.property  name="anno"
	 */
	public void setAnno(BigDecimal anno) {
		this.anno = anno;
	}

	/**
	 * @return  Returns the idAvvisoScadenzaPersona.
	 * @uml.property  name="idAvvisoScadenzaPersona"
	 */
	public IdAvvisoScadenzaPersona getIdAvvisoScadenzaPersona() {
		return idAvvisoScadenzaPersona;
	}

	/**
	 * @param idAvvisoScadenzaPersona  The idAvvisoScadenzaPersona to set.
	 * @uml.property  name="idAvvisoScadenzaPersona"
	 */
	public void setIdAvvisoScadenzaPersona(
			IdAvvisoScadenzaPersona idAvvisoScadenzaPersona) {
		this.idAvvisoScadenzaPersona = idAvvisoScadenzaPersona;
	}

	/**
	 * @return  Returns the statoAnno.
	 * @uml.property  name="statoAnno"
	 */
	public String getStatoAnno() {
		return statoAnno;
	}

	/**
	 * @param statoAnno  The statoAnno to set.
	 * @uml.property  name="statoAnno"
	 */
	public void setStatoAnno(String statoAnno) {
		this.statoAnno = statoAnno;
	}
}
