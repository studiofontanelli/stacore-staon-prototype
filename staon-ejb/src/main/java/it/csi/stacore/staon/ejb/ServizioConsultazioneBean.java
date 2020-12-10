
package it.csi.stacore.staon.ejb;

import it.csi.csi.wrapper.CSIException;
import javax.ejb.CreateException;
import java.rmi.RemoteException;
import it.csi.stacore.staon.exception.BusinessException;
import it.csi.stacore.staon.interfacecsi.ServizioConsultazioneInterface;
import it.csi.stacore.staon.util.Tracer;

/**
 *  @generated
*/
public class ServizioConsultazioneBean extends CommonServiceBean implements ServizioConsultazioneInterface{

	private static final long serialVersionUID = 1L;

    private ServizioConsultazioneInterface servizioConsultazione = null;

	/**
	 * @generated
	 */
	public void ejbCreate() throws CreateException {
		String method = "ejbCreate";
		Tracer.debug(LOG,  getClass().getName(), method, "BEGIN");
		try {
			super.ejbCreate();
			if (beanFactoryReference.getFactory().containsBean("servizioConsultazione")){
				servizioConsultazione = (ServizioConsultazioneInterface) beanFactoryReference.getFactory().getBean("servizioConsultazione");
				Tracer.debug(LOG,  getClass().getName(), method, "found service servizioConsultazione");
			}
			else
				throw new CreateException("No service servizioConsultazione found");

		} catch (Exception e) {
			Tracer.error(LOG,  getClass().getName(), method, "Exception " + e);
			throw new CreateException(e.getMessage());
		}
		finally{
			Tracer.debug(LOG,  getClass().getName(), method, "END");
		}
	}

	/**
	 * @generated
	 */
	public it.csi.stacore.staon.dto.RegioneDto[] findRegione (
    	)
           throws 
            java.lang.Exception 
    	{
    	final String method = "findRegione";
    	try{
        	return servizioConsultazione.findRegione();
		}
		catch(BusinessException e) {
			sessionContext.setRollbackOnly();
			Tracer.error(LOG,  getClass().getName(), method, "BusinessException " + e);
			throw new CSIException(e.getMessage());
		}
		catch(Exception e) {
			sessionContext.setRollbackOnly();
			Tracer.error(LOG,  getClass().getName(), method, "Exception " + e);
			throw new CSIException(e.getMessage());
		}
		finally{

		}
	}

	/**
	 * @generated
	 */
	public boolean testResources (
    	)
           throws 
            java.lang.Exception 
    	{
    	final String method = "testResources";
    	try{
        	return servizioConsultazione.testResources();
		}
		catch(BusinessException e) {
			sessionContext.setRollbackOnly();
			Tracer.error(LOG,  getClass().getName(), method, "BusinessException " + e);
			throw new CSIException(e.getMessage());
		}
		catch(Exception e) {
			sessionContext.setRollbackOnly();
			Tracer.error(LOG,  getClass().getName(), method, "Exception " + e);
			throw new CSIException(e.getMessage());
		}
		finally{

		}
	}

}
