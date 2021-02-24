package it.csi.stacore.staon.interfacecsi;

import it.csi.stacore.staon.dto.RegioneDto;

public interface ServizioConsultazioneInterface extends BusinessComponent  {

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	boolean testResources() throws Exception;

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public RegioneDto [] findRegione() throws Exception;
	
	/**
	 * 
	 * @param codice
	 * @return
	 * @throws Exception
	 */
	public RegioneDto findRegioneByCodice(String codice) throws Exception;


}
