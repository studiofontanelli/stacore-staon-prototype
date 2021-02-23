package it.csi.stacore.staon.ws.impl;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.csi.stacore.staon.dto.RegioneDto;
import it.csi.stacore.staon.etc.Constants;
import it.csi.stacore.staon.interfacecsi.ServizioConsultazioneInterface;
import it.csi.stacore.staon.util.Tracer;
import it.csi.stacore.staon.ws.ServizioConsultazione;


@WebService(endpointInterface = "it.csi.stacore.staon.ws.ServizioConsultazione")
@Component("servizioConsultazioneWs")
public class ServizioConsultazioneImpl implements ServizioConsultazione{

	protected final static Logger LOG = LoggerFactory.getLogger(Constants.APPLICATION_NAME);

	@Autowired
	ServizioConsultazioneInterface servizioConsultazioneInterface;

	@Override
	public boolean testResources() throws Exception {

		final String method = "testResources";

		try {
			return servizioConsultazioneInterface.testResources();
		}
		catch(Exception e) {
			Tracer.error(LOG,  getClass().getName(), method, "Exception " + e);
			throw e;
		}
	}

	@Override
	public RegioneDto[] findRegione() throws Exception {
		final String method = "findRegione";

		try {
			return servizioConsultazioneInterface.findRegione();
		}
		catch(Exception e) {
			Tracer.error(LOG,  getClass().getName(), method, "Exception " + e);
			throw e;
		}
	}

}
