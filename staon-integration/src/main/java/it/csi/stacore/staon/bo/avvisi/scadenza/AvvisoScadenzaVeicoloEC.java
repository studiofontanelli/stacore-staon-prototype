package it.csi.stacore.staon.bo.avvisi.scadenza;

import java.io.Serializable;

import it.csi.stacore.staon.bo.avvisi.accertamento.AvvisoAccertamento;
import it.csi.stacore.staon.bo.consultazione.StatoScadenza;

public class AvvisoScadenzaVeicoloEC implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer annoTributo;
	private String scadenza;
	private StatoScadenza statoScadenza;
	private AvvisoAccertamento avvisoAccertamento;

	public AvvisoScadenzaVeicoloEC() {
	}

	public AvvisoScadenzaVeicoloEC(Integer annoTributo, String scadenza, StatoScadenza statoScadenza, AvvisoAccertamento avvisoAccertamento) {
		this.annoTributo = annoTributo;
		this.scadenza = scadenza;
		this.statoScadenza = statoScadenza;
		this.avvisoAccertamento = avvisoAccertamento;
	}

	public Integer getAnnoTributo() {
		return annoTributo;
	}

	public void setAnnoTributo(Integer annoTributo) {
		this.annoTributo = annoTributo;
	}

	public String getScadenza() {
		return scadenza;
	}

	public void setScadenza(String scadenza) {
		this.scadenza = scadenza;
	}

	public StatoScadenza getStatoScadenza() {
		return statoScadenza;
	}

	public void setStatoScadenza(StatoScadenza statoScadenza) {
		this.statoScadenza = statoScadenza;
	}

	public AvvisoAccertamento getAvvisoAccertamento() {
		return avvisoAccertamento;
	}

	public void setAvvisoAccertamento(AvvisoAccertamento avvisoAccertamento) {
		this.avvisoAccertamento = avvisoAccertamento;
	}

}
