/*
s * Created on 10-mag-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package it.csi.stacore.staon.bo;

import java.io.Serializable;

/**
 * DOCUMENT ME!
 *
 * @author curtoni
 */
public class EsitoCalcoloFuoriRegione implements Serializable {
	//~ Instance fields ==========================================================

	/**
	 *
	 */
	private static final long serialVersionUID = 8103449527259224697L;

	/**
	 * @uml.property  name="ricevutaPagamentoSGATA"
	 */
	private String ricevutaPagamentoSGATA;

	/**
	 * @uml.property  name="regioneSGATA"
	 */
	private int regioneSGATA;

	//~ Constructors =============================================================

	/**
	 * DOCUMENT ME!
	 *
	 * @param ricevutaPagamentoSGATA
	 */
	public EsitoCalcoloFuoriRegione(final String ricevutaPagamentoSGATA, final int regioneSGATA) {
		super();
		this.ricevutaPagamentoSGATA = ricevutaPagamentoSGATA;
		this.regioneSGATA = regioneSGATA;
	}

	//~ Methods ==================================================================

	/**
	 * DOCUMENT ME!
	 * @return  Returns the ricevutaPagamentoSGATA.
	 * @uml.property  name="ricevutaPagamentoSGATA"
	 */
	public String getRicevutaPagamentoSGATA() {
		return ricevutaPagamentoSGATA;
	}

	/**
	 * @return  Returns the regioneSGATA.
	 * @uml.property  name="regioneSGATA"
	 */
	public int getRegioneSGATA() {
		return regioneSGATA;
	}

}
