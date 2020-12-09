package it.csi.stacore.staon.integration.exception;



import java.util.Date;


public class IntegrationException extends Exception {
	//~ Constructors =============================================================

	/**
	 *
	 */
	private static final long serialVersionUID = -3344650488267771041L;


	public IntegrationException(String string, Throwable cause) {
		super("[TS: "+new Date().getTime()+"] "+string, cause);
	}
}
