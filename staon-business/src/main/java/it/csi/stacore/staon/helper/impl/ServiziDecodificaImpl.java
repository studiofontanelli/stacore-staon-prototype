package it.csi.stacore.staon.helper.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import it.csi.stacore.staon.dto.RegioneDto;
import it.csi.stacore.staon.exception.ServiceException;
import it.csi.stacore.staon.helper.ServiziDecodifica;

@Service("serviziDecodifica")
public class ServiziDecodificaImpl implements ServiziDecodifica{

	@Override
	public List<RegioneDto> findRegione() throws ServiceException {
		RegioneDto r = new RegioneDto();
		r.setCodice("13");
		r.setDescrizione("Piemonte");
		r.setId(13l);
		List<RegioneDto> l = new ArrayList<RegioneDto>();
		l.add(r);

		return l;
	}

}
