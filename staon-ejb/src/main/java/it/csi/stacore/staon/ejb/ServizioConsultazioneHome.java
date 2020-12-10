

package it.csi.stacore.staon.ejb;

import javax.ejb.EJBHome;
import java.rmi.RemoteException;
import javax.ejb.CreateException;

/**
 *  @generated
*/
public interface ServizioConsultazioneHome extends EJBHome {

	/**
	 * @generated
	 */
	public ServizioConsultazione create()throws CreateException, RemoteException;
}