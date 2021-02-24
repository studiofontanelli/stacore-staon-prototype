
package it.csi.stacore.staon.ws;


import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *  @generated
*/
@WebService(name = "servizioConsultazioneWs")
public interface ServizioConsultazioneWs {
	
	/**
	 * @generated
	 */
	@WebResult(name = "result")
	@WebMethod 
	public it.csi.stacore.staon.dto.RegioneDto findRegioneByCodice (
			java.lang.String par1 
					    	 )throws 
	        	java.lang.Exception 
	            
	      ;
	
	/**
	 * @generated
	 */
	@WebResult(name = "result")
	@WebMethod 
	public it.csi.stacore.staon.dto.RegioneDto[] findRegione (
	    	 )throws 
	        	java.lang.Exception 
	            
	      ;
	
	/**
	 * @generated
	 */
	@WebResult(name = "result")
	@WebMethod 
	public boolean testResources (
	    	 )throws 
	        	java.lang.Exception 
	            
	      ;

}






