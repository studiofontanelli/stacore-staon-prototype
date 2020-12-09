package it.csi.stacore.staon.interfacecsi;

import it.csi.stacore.staon.dto.RegioneDto;

public interface ServizioConsultazioneInterface extends BusinessComponent  {



	boolean testResources() throws Exception;

	
	public RegioneDto [] findRegione() throws Exception;

}
