package it.csi.stacore.staon.integration.service;

import java.util.List;

import it.csi.stacore.staon.bo.Regione;
import it.csi.stacore.staon.integration.exception.ServiceException;



public interface ServiziDecodifica {



	public List<Regione> findRegione() throws ServiceException;

}
