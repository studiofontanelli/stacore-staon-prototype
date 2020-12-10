
package it.csi.stacore.staon.ejb;

import javax.ejb.EJBObject;
import java.rmi.RemoteException;

public interface ServizioConsultazione extends EJBObject{


	/**
	 * @generated
	 */
	public boolean testResources(
       ) throws
       	java.lang.Exception,
      	RemoteException;

	/**
	 * @generated
	 */
	public it.csi.stacore.staon.dto.RegioneDto[] findRegione(
       ) throws
       	java.lang.Exception,
      	RemoteException;

}
