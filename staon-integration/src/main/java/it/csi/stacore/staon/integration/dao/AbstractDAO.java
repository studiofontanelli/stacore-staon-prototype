package it.csi.stacore.staon.integration.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.csi.stacore.staon.etc.Constants;



/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class AbstractDAO {


	protected final static Logger LOG = LoggerFactory.getLogger(Constants.APPLICATION_NAME);

  //~ Methods ==================================================================

	public Logger getLogger() {
		return LOG;
	}


}
