package it.csi.stacore.staon.ejb;

import java.rmi.RemoteException;

import javax.ejb.EJBObject;

import it.csi.stacore.staon.dto.RegioneDto;


public interface ServizioConsultazione extends EJBObject {


	public boolean testResources() throws Exception, RemoteException;

	public RegioneDto[] findRegione() throws Exception, RemoteException;



}
