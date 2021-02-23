package it.csi.stacore.staon.business.adapter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.stacore.staon.bo.Regione;
import it.csi.stacore.staon.business.adapter.RegioneDtoAdapter;
import it.csi.stacore.staon.dto.RegioneDto;
import it.csi.stacore.staon.util.adapter.AbstractDtoAdapter;
import it.csi.stacore.staon.util.adapter.exception.DtoConversionException;


@Component
public class RegioneAdapterImpl extends AbstractDtoAdapter <Regione, RegioneDto> implements RegioneDtoAdapter {

	/**
	 *
	 */
	private static final long serialVersionUID = -6245855714589096062L;


	@Autowired
	private ApplicationContext applicationContext;

	@Override
	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}
	
	
	@Override
	public RegioneDto convertTo(Regione t) throws DtoConversionException {
		RegioneDto dto =  super.convertTo(t);
		return dto;
	}



}
