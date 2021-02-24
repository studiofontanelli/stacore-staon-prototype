package it.csi.stacore.staon.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.csi.stacore.staon.business.adapter.RegioneDtoAdapter;
import it.csi.stacore.staon.dto.RegioneDto;
import it.csi.stacore.staon.exception.BusinessException;
import it.csi.stacore.staon.integration.exception.IntegrationException;
import it.csi.stacore.staon.integration.service.ServiziDecodifica;
import it.csi.stacore.staon.interfacecsi.ServizioConsultazioneInterface;
import it.csi.stacore.staon.util.Environment;
import it.csi.stacore.staon.util.Tracer;

@Service("servizioConsultazione")
public class ServizioConsultazioneImpl extends CommonServiceImpl implements ServizioConsultazioneInterface {


	@Autowired
	private ServiziDecodifica serviziDecodifica;

	@Autowired
	private RegioneDtoAdapter regioneDtoAdapter;
	
	@Autowired
	private Environment environment;

	@Override
	public boolean testResources() throws Exception{
		final String method = "testResources";
		try {
			Tracer.info(LOG,  getClass().getName(), method, "environment= " + environment.getEnvironment());
			return true;
		}
		catch(Exception e) {
			Tracer.error(LOG,  getClass().getName(), method, "IntegrationException " + e);
			throw new BusinessException(e.getMessage(), e);
		}
	}

	@Override
	public RegioneDto[] findRegione() throws Exception{
		final String method = "findRegione";
		try {
			if(1==12)
				throw new Exception("ROMPO TUTO");
			List<RegioneDto> ll = regioneDtoAdapter.convertTo(serviziDecodifica.findRegione());
			return ll.stream().toArray(RegioneDto[]::new);
		}
		catch(IntegrationException e) {
			Tracer.error(LOG,  getClass().getName(), method, "IntegrationException " + e);
			throw new BusinessException(e.getMessage(), e);
		}
	}

	@Override
	public RegioneDto findRegioneByCodice(String codice) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
