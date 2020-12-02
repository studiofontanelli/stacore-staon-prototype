package it.csi.stacore.staon.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import it.csi.stacore.staon.dto.RegioneDto;
import it.csi.stacore.staon.interfacecsi.ServizioConsultazioneInterface;
import it.csi.stacore.staon.util.Tracer;

@Service("servizioConsultazione")

public class ServizioConsultazioneImpl extends CommonServiceImpl implements ServizioConsultazioneInterface {

	@Override
	public boolean testResources() throws Exception {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public RegioneDto[] findRegione() throws Exception {
		final String method = "findRegione";
		Tracer.debug(LOG,  getClass().getName(), method, "BEGIN");

		List<RegioneDto> list = new ArrayList<RegioneDto>();


		RegioneDto r = new RegioneDto();
		r.setCodice("13");
		r.setId(13l);
		r.setDescrizione("Piemonte");
		list.add(r);
		return list.stream().toArray(RegioneDto[]::new);
	}

}
