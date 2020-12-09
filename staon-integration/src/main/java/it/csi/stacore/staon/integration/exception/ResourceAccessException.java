package it.csi.stacore.staon.integration.exception;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class ResourceAccessException extends ServiceException {
	//~ Constructors =============================================================

	/**
	 *
	 */
	private static final long serialVersionUID = 3322004130957872703L;

	/**
	 * Creates a new ResourceAccessException object.
	 *
	 * @param string DOCUMENT ME!
	 * @param cause DOCUMENT ME!
	 */
	public ResourceAccessException(String string, Throwable cause) {
		super(string, cause);
	}
}
