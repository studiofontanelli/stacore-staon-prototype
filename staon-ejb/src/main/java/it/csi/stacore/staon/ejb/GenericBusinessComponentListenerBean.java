package it.csi.stacore.staon.ejb;

import java.rmi.RemoteException;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class GenericBusinessComponentListenerBean implements SessionBean {
	/** The session context */
	private SessionContext context;


	public void ejbActivate() throws EJBException {
		// TODO Auto-generated method stub

	}

	public void ejbPassivate() throws EJBException {
		// TODO Auto-generated method stub

	}

	public void ejbRemove() throws EJBException {
		// TODO Auto-generated method stub

	}

	public void setSessionContext(SessionContext currentContext) throws EJBException, RemoteException {
		this.context=currentContext;

	}



}
