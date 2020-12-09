package it.csi.stacore.staon.bo.avvisi.accertamento;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import it.csi.stacore.staon.integration.util.CalcoloDateUtil;

public class PercentualeInteressiSanzioni implements Serializable {

	private static final long serialVersionUID = 1L;

	private Date dataInizio;

	private Date dataFine;

	private BigDecimal interesse;

	private BigDecimal sanzioni;

	public PercentualeInteressiSanzioni(Date dataInizio, Date dataFine, BigDecimal interesse, BigDecimal sanzioni) {
		super();
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.interesse = interesse;
		this.sanzioni = sanzioni;
	}

	public Date getDataFine() {
		return dataFine;
	}

	public Date getDataInizio() {
		return dataInizio;
	}

	public BigDecimal getInteresse() {
		return interesse;
	}

	public BigDecimal getSanzioni() {
		return sanzioni;
	}

	public void setSanzioni(BigDecimal sanzioni) {
		this.sanzioni = sanzioni;
	}

	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}

	public void setDataFine(Date dataFine) {
		this.dataFine = dataFine;
	}

	public void setInteresse(BigDecimal interesse) {
		this.interesse = interesse;
	}

	public boolean verifica(Date dataRiferimento) {
		boolean result = false;
		Date fine = null;

		fine = getDataFine();

		if (fine == null) {
			fine = CalcoloDateUtil.addYearsToDate(new Date(), 10);
		}

		if (CalcoloDateUtil.isGratherEqualAndLessEqual(dataRiferimento, getDataInizio(), fine)) {
			result = true;
		}

		return result;
	}

}
