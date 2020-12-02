package it.csi.stacore.staon.helper;

import java.util.List;

import it.csi.stacore.staon.dto.RegioneDto;
import it.csi.stacore.staon.exception.ServiceException;



public interface ServiziDecodifica {



	public List<RegioneDto> findRegione() throws ServiceException;

}
