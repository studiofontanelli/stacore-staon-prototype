/*
 * Created on 4-apr-2006
 */
package it.csi.stacore.staon.bo;

import it.csi.stacore.staon.bo.id.IdDecodifica;

/**
 * @author Andrea Curtoni
 */
public class AbilitazioneDecodifica extends AbstractBO {
	/**
	 *
	 */
	private static final long serialVersionUID = 6065856403615861251L;

	/**
	 * @uml.property  name="tipoAccesso"
	 */
	private String tipoAccesso;

	/**
	 * @uml.property  name="profilo"
	 */
	private String profilo;

	/**
	 * @uml.property  name="idDecodifica"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private IdDecodifica idDecodifica;

	/**
	 * @param tipoAccesso
	 * @param profilo
	 * @param idDecodifica
	 */
	public AbilitazioneDecodifica(String tipoAccesso, String profilo, IdDecodifica idDecodifica) {
		super();
		this.tipoAccesso = tipoAccesso;
		this.profilo = profilo;
		this.idDecodifica = idDecodifica;
	}

	/**
	 * @return  Returns the idDecodifica.
	 * @uml.property  name="idDecodifica"
	 */
	public IdDecodifica getIdDecodifica() {
		return idDecodifica;
	}

	/**
	 * @param idDecodifica  The idDecodifica to set.
	 * @uml.property  name="idDecodifica"
	 */
	public void setIdDecodifica(IdDecodifica idDecodifica) {
		this.idDecodifica = idDecodifica;
	}

	/**
	 * @return  Returns the profilo.
	 * @uml.property  name="profilo"
	 */
	public String getProfilo() {
		return profilo;
	}

	/**
	 * @param profilo  The profilo to set.
	 * @uml.property  name="profilo"
	 */
	public void setProfilo(String profilo) {
		this.profilo = profilo;
	}

	/**
	 * @return  Returns the tipoAccesso.
	 * @uml.property  name="tipoAccesso"
	 */
	public String getTipoAccesso() {
		return tipoAccesso;
	}

	/**
	 * @param tipoAccesso  The tipoAccesso to set.
	 * @uml.property  name="tipoAccesso"
	 */
	public void setTipoAccesso(String tipoAccesso) {
		this.tipoAccesso = tipoAccesso;
	}
}
