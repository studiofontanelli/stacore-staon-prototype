package it.csi.stacore.staon.exception;

import it.csi.csi.wrapper.SystemException;

import java.util.Date;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class ServiceException extends SystemException {
  //~ Constructors =============================================================

  /**
	 *
	 */
	private static final long serialVersionUID = -3344650488267771041L;

/**
   * Creates a new ServiceException object.
   *
   * @param string DOCUMENT ME!
   * @param cause DOCUMENT ME!
   */
  public ServiceException(String string, Throwable cause) {
    super("[TS: "+new Date().getTime()+"] "+string, cause);
  }
}
