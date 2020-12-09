package it.csi.stacore.staon.bo;

import java.util.Date;

import it.csi.stacore.staon.bo.id.IdAgevolazione;
import it.csi.stacore.staon.bo.id.IdDatiTecnici;
import it.csi.stacore.staon.bo.id.IdVeicolo;
import it.csi.stacore.staon.util.EqualsUtil;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class EcoincentivoImpiantoGas extends Agevolazione implements
		java.io.Serializable {

	private static final long serialVersionUID = -7688721924539630114L;

	private Date dataFineCalcolata;

	private IdDatiTecnici idDatiTecniciInizio;

	private IdDatiTecnici idDatiTecniciFine;

	// ~ Constructors
	// =============================================================
	public EcoincentivoImpiantoGas(final IdAgevolazione id,
			final IdVeicolo idVeicolo, final TipoVeicolo tipoVeicolo,
			final Fonte fonte, final TipoAgevolazione tipoAgevolazione,
			final Date dataInizio, final String numProtocolloApertura,
			final Date dataFine, final String numProtocolloChiusura,
			final String tipoVeicoloOriginale, final String targaOriginale,
			final String identificativoFiscaleProprietarioOriginale,
			final String tipoAgevolazioneOriginale,
			final Date dataAcquisizione, final String numeroPatente,
			final Date dataScadenzaPatente, final Date dataFineCalcolata,
			final IdDatiTecnici idDatiTecniciInizio,
			final IdDatiTecnici idDatiTecniciFine,
			final String prorogaEuro6) {
		super(id, idVeicolo, tipoVeicolo, fonte, tipoAgevolazione, dataInizio,
				numProtocolloApertura, dataFine, numProtocolloChiusura,
				tipoVeicoloOriginale, targaOriginale,
				identificativoFiscaleProprietarioOriginale,
				tipoAgevolazioneOriginale, dataAcquisizione, numeroPatente,
				dataScadenzaPatente,
				prorogaEuro6 //Euro6 proroga scadenza
				);

		this.dataFineCalcolata = dataFineCalcolata;

		this.idDatiTecniciInizio = idDatiTecniciInizio;

		this.idDatiTecniciFine = idDatiTecniciFine;
	}

	public EcoincentivoImpiantoGas(IdAgevolazione id, IdVeicolo idVeicolo,
			TipoVeicolo tipoVeicolo, Fonte fonte,
			TipoAgevolazione tipoAgevolazione, Date dataInizio,
			String numProtocolloApertura, Date dataFine,
			String numProtocolloChiusura, String tipoVeicoloOriginale,
			String targaOriginale,
			String identificativoFiscaleProprietarioOriginale,
			String tipoAgevolazioneOriginale, Date dataAcquisizione,
			Date dataFineCalcolata, IdDatiTecnici idDatiTecniciInizio,
			IdDatiTecnici idDatiTecniciFine) {

		super(id, idVeicolo, tipoVeicolo, fonte, tipoAgevolazione, dataInizio,
				numProtocolloApertura, dataFine, numProtocolloChiusura,
				tipoVeicoloOriginale, targaOriginale,
				identificativoFiscaleProprietarioOriginale,
				tipoAgevolazioneOriginale, dataAcquisizione, null, null,
				null //Euro6 proroga scadenza
				);

		this.dataFineCalcolata = dataFineCalcolata;

		this.idDatiTecniciInizio = idDatiTecniciInizio;

		this.idDatiTecniciFine = idDatiTecniciFine;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((dataFineCalcolata == null) ? 0 : dataFineCalcolata
						.hashCode());
		result = prime
				* result
				+ ((idDatiTecniciFine == null) ? 0 : idDatiTecniciFine
						.hashCode());
		result = prime
				* result
				+ ((idDatiTecniciInizio == null) ? 0 : idDatiTecniciInizio
						.hashCode());
		result = prime
				* result
				+ super.hashCode();

		return result;
	}

	public boolean equals(Object object) {
		boolean equals = false;

		if ((object != null) && object instanceof EcoincentivoImpiantoGas) {
			EcoincentivoImpiantoGas altro = (EcoincentivoImpiantoGas) object;

			equals = super.equals(altro);
			equals &= EqualsUtil.objectEquals(getDataFineCalcolata(), altro
					.getDataFineCalcolata())
					&& EqualsUtil.objectEquals(getIdDatiTecniciInizio(), altro
							.getIdDatiTecniciInizio())
					&& EqualsUtil.objectEquals(getIdDatiTecniciFine(), altro
							.getIdDatiTecniciFine());
		}

		return equals;
	}

	public Date getDataFineCalcolata() {
		return dataFineCalcolata;
	}

	public IdDatiTecnici getIdDatiTecniciFine() {
		return idDatiTecniciFine;
	}

	public IdDatiTecnici getIdDatiTecniciInizio() {
		return idDatiTecniciInizio;
	}
}
