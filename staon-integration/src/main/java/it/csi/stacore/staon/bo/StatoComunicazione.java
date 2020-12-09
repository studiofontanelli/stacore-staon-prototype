package it.csi.stacore.staon.bo;

import java.util.Date;

import it.csi.stacore.staon.util.EqualsUtil;


public class StatoComunicazione extends Decodifica implements java.io.Serializable {


	/**
	 *
	 */
	private static final long serialVersionUID = 4740291252472819846L;

	private Date dataStato = null;



	public StatoComunicazione(IdStatoComunicazione idStatoComunicazione, String codice, String descrizione) {
		super(idStatoComunicazione, codice, descrizione);
	}


	public IdStatoComunicazione getIdStatoComunicazione() {
		return (IdStatoComunicazione) getId();
	}


	public Date getDataStato() {
		return dataStato;
	}


	public void setDataStato(Date dataStato) {
		this.dataStato = dataStato;
	}


	public boolean equals(Object object) {
		boolean equals = false;

		if((object != null) && object instanceof StatoComunicazione) {
			StatoComunicazione altro = (StatoComunicazione) object;
			equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
		}

		return equals;
	}


}
