package it.csi.stacore.staon.ejb;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class CommonBean implements SessionBean {


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	protected SessionContext sessionContext;

	public void ejbCreate() throws CreateException {
		final String method = "ejbCreate";

		//Tracer.debug(LOG, getClass().getName(), method, "BEGIN");
		try{

			}
		catch(Exception e){
			//Tracer.error(LOG,getClass().getName(), method, "Exception " + e);
			throw new CreateException(e.getMessage());
		}
		finally{
			//Tracer.debug(LOG,getClass().getName(), method, "END");
		}

	}

	@Override
	public void ejbActivate() throws EJBException, RemoteException {
		final String method = "ejbActivate";
		//Tracer.debug(LOG, getClass().getName(), method, "called");


	}

	@Override
	public void ejbPassivate() throws EJBException, RemoteException {
		final String method = "ejbPassivate";
		//Tracer.debug(LOG, getClass().getName(), method, "called");

	}

	@Override
	public void ejbRemove() throws EJBException, RemoteException {
		final String method = "ejbRemove";
		//Tracer.debug(LOG, getClass().getName(), method, "called");

	}

	@Override
	public void setSessionContext(SessionContext sessionContext) throws EJBException, RemoteException {
		final String method = "setSessionContext";
		//Tracer.debug(LOG, getClass().getName(), method, "called");
		this.sessionContext = sessionContext;

	}

	public boolean testResources() throws Exception {
		final String method = "testResources";
		//Tracer.debug(LOG, getClass().getName(), method, "BEGIN");
		try{
			return true;
		}
		finally{
			//Tracer.debug(LOG,getClass().getName(), method, "END");
		}
	}

}
