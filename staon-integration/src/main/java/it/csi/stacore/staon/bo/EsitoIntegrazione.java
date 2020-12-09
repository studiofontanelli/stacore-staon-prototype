package it.csi.stacore.staon.bo;

import java.io.Serializable;
import java.math.BigDecimal;

public class EsitoIntegrazione implements Serializable {
	private static final long serialVersionUID = -6672147585056862786L;

	private Valuta importoIntegrato = new Valuta(Divisa.EURO, new BigDecimal(0));

	public EsitoIntegrazione(Valuta importoIntegrato) {
		this.importoIntegrato = importoIntegrato;
	}

	public Valuta getImportoIntegrato() {
		return importoIntegrato;
	}

	public String getIntegrazioneEsplicativo() {
		return (getImportoIntegrato() != null) ? "-Integrazione Applicata " + importoIntegrato.getImporto().toString() : "";
	}
}
