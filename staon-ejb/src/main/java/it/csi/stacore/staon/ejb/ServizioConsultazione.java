package it.csi.stacore.staon.ejb;

import java.rmi.RemoteException;

import javax.ejb.EJBObject;


public interface ServizioConsultazione extends EJBObject {

	/*
	 *
	 */
	boolean testResources() throws Exception, RemoteException;



}
