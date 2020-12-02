package it.csi.stacore.staon.business.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.csi.stacore.staon.bo.Regione;
import it.csi.stacore.staon.business.adapter.RegioneDtoAdapter;
import it.csi.stacore.staon.dto.RegioneDto;
import it.csi.stacore.staon.integration.service.ServiziDecodifica;
import it.csi.stacore.staon.interfacecsi.ServizioConsultazioneInterface;

@Service("servizioConsultazione")
public class ServizioConsultazioneImpl extends CommonServiceImpl implements ServizioConsultazioneInterface {


	@Autowired
	private ServiziDecodifica serviziDecodifica;

	@Autowired
	RegioneDtoAdapter regioneDtoAdapter;

	@Override
	public boolean testResources() throws Exception {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public RegioneDto[] findRegione() throws Exception {
		final String method = "findRegione";

		//List<Regione> list = serviziDecodifica.findRegione();
		List<RegioneDto> ll= regioneDtoAdapter.convertTo(serviziDecodifica.findRegione());
		/*
		RegioneDto r = new RegioneDto();
		List<RegioneDto> l = new ArrayList<RegioneDto>();
		r.setId(13l);
		r.setCodice("13");
		r.setDescrizione("Piemonte");
		l.add(r);
		*/
		return ll.stream().toArray(RegioneDto[]::new);
	}

}
