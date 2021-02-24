
package it.csi.stacore.staon.ws.impl;
import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.csi.stacore.staon.exception.BusinessException;
import it.csi.stacore.staon.interfacecsi.ServizioConsultazioneInterface;
import it.csi.stacore.staon.ws.ServizioConsultazioneWs;
import it.csi.stacore.staon.util.Tracer;
import it.csi.stacore.staon.etc.Constants;

/**
 *  @generated
 package=  it.csi.stacore.staon.ws.impl
 beanName= servizioConsultazioneWsImpl
 className= ServizioConsultazioneWsImpl
 interface= ServizioConsultazioneWs
*/
@WebService(endpointInterface = "it.csi.stacore.staon.ws.ServizioConsultazioneWs")
@Component("servizioConsultazioneWsImpl")
public class ServizioConsultazioneWsImpl implements ServizioConsultazioneWs {

	protected final static Logger LOG = LoggerFactory.getLogger(Constants.APPLICATION_NAME);
	
	@Autowired
	private it.csi.stacore.staon.interfacecsi.ServizioConsultazioneInterface servizioConsultazioneWsImpl;

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
        	return servizioConsultazioneWsImpl.testResources();
		}
		catch(BusinessException e) {
			Tracer.error(LOG,  getClass().getName(), method, "BusinessException " + e);
			throw new Exception(e.getMessage());
		}
		catch(Exception e) {
			Tracer.error(LOG,  getClass().getName(), method, "Exception " + e);
			throw new Exception(e.getMessage());
		}
		finally{

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
        	return servizioConsultazioneWsImpl.findRegione();
		}
		catch(BusinessException e) {
			Tracer.error(LOG,  getClass().getName(), method, "BusinessException " + e);
			throw new Exception(e.getMessage());
		}
		catch(Exception e) {
			Tracer.error(LOG,  getClass().getName(), method, "Exception " + e);
			throw new Exception(e.getMessage());
		}
		finally{

		}
	}

}
