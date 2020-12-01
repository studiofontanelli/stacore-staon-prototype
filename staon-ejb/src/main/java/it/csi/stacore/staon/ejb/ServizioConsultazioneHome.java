package it.csi.stacore.staon.ejb;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;




public interface ServizioConsultazioneHome extends EJBHome {
	public ServizioConsultazione create() throws CreateException, RemoteException;
}




