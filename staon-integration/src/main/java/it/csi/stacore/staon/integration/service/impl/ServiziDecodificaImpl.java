package it.csi.stacore.staon.integration.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import it.csi.stacore.staon.bo.Regione;
import it.csi.stacore.staon.bo.id.IdRegione;
import it.csi.stacore.staon.etc.Constants;
import it.csi.stacore.staon.integration.exception.ServiceException;
import it.csi.stacore.staon.integration.service.ServiziDecodifica;

@Service("serviziDecodifica")
public class ServiziDecodificaImpl implements ServiziDecodifica {

	protected final static Logger LOG = LoggerFactory.getLogger(Constants.APPLICATION_NAME);

	@Override
	public List<Regione> findRegione() throws ServiceException {
		List<Regione> l = new ArrayList<Regione>();
		Regione r = new Regione(new IdRegione(13), "13", "Piemonte");
		l.add(r);
		Regione rr = new Regione(new IdRegione(1), "1", "Rocciamelone");
		l.add(rr);
		return l;
	}

}
