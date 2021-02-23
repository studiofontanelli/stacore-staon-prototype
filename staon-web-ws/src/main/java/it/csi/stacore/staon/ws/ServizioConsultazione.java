package it.csi.stacore.staon.ws;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import it.csi.stacore.staon.dto.RegioneDto;


@WebService(name = "servizioConsultazione")
public interface ServizioConsultazione {

	@WebResult(name = "result")
	@WebMethod
	boolean testResources() throws Exception;

	@WebResult(name = "result")
	@WebMethod
	public RegioneDto [] findRegione() throws Exception;




}
