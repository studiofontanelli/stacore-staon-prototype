package it.csi.stacore.staon.exception;



import java.util.Date;


public class ServiceException extends Exception {
	//~ Constructors =============================================================

	/**
	 *
	 */
	private static final long serialVersionUID = -3344650488267771041L;


	public ServiceException(String string, Throwable cause) {
		super("[TS: "+new Date().getTime()+"] "+string, cause);
	}
}
