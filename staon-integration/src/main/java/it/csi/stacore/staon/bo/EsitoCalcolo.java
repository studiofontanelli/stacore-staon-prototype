/*
 * Created on 5-mag-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package it.csi.stacore.staon.bo;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import it.csi.stacore.staon.bo.credito.Compensabile;
import it.csi.stacore.staon.bo.id.IdProprietario;

/**
 * DOCUMENT ME!
 *
 * @author sobrero TODO To change the template for this generated type comment
 *         go to Window - Preferences - Java - Code Style - Code Templates
 */
public class EsitoCalcolo implements Serializable, Compensabile {
	//~ Instance fields ==========================================================

	/**
	 *
	 */
	private static final long serialVersionUID = -6414381422722436200L;

	/**
	 * @uml.property  name="identificativoFiscale"
	 */
	private String identificativoFiscale;

	/**
	 * @uml.property  name="idProprietario"
	 */
	private IdProprietario idProprietario;

	/**
	 * @uml.property  name="dataScadenza"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private DataScadenza dataScadenza;

	/**
	 * @uml.property  name="validita"
	 */
	private Integer validita;

	/**
	 * @uml.property  name="tipoRiduzione"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private TipoRiduzione tipoRiduzione;

	/**
	 * @uml.property  name="percentualeRiduzione"
	 */
	private Integer percentualeRiduzione;

	/**
	 * @uml.property  name="importo"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Importo importo;

	/**
	 * @uml.property  name="esplicativo"
	 */
	private String esplicativo;

	private Valuta rimorchiabilita;

	/**
	 * @uml.property  name="esitoCalcoloRegionale"
	 * @uml.associationEnd
	 */
	private EsitoCalcoloRegionale esitoCalcoloRegionale;

	/**
	 * @uml.property  name="esitoCalcoloFuoriRegione"
	 * @uml.associationEnd
	 */
	private EsitoCalcoloFuoriRegione esitoCalcoloFuoriRegione;

	//~ Constructors =============================================================

	/**
	 * DOCUMENT ME!
	 *
	 * @param identificativoFiscale
	 * @param dataScadenza
	 * @param validita
	 * @param tipoRiduzione
	 * @param percentualeRiduzione
	 * @param importo
	 * @param esplicativo
	 * @param esitoCalcoloFuoriRegione DOCUMENT ME!
	 */
	public EsitoCalcolo(String identificativoFiscale, DataScadenza dataScadenza, Integer validita, TipoRiduzione tipoRiduzione,
			Integer percentualeRiduzione, Importo importo, String esplicativo, EsitoCalcoloFuoriRegione esitoCalcoloFuoriRegione) {
		super();
		this.identificativoFiscale = identificativoFiscale;
		this.dataScadenza = dataScadenza;
		this.validita = validita;
		this.tipoRiduzione = tipoRiduzione;
		this.percentualeRiduzione = percentualeRiduzione;
		this.importo = importo;
		this.esplicativo = esplicativo;
		this.esitoCalcoloFuoriRegione = esitoCalcoloFuoriRegione;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param identificativoFiscale
	 * @param dataScadenza
	 * @param validita
	 * @param tipoRiduzione
	 * @param percentualeRiduzione
	 * @param importo
	 * @param esplicativo
	 * @param esitoCalcoloRegionale
	 */
	public EsitoCalcolo(String identificativoFiscale, DataScadenza dataScadenza, Integer validita, TipoRiduzione tipoRiduzione,
			Integer percentualeRiduzione, Importo importo, Valuta rimorchiabilita , String esplicativo, IdProprietario idProprietario,
			EsitoCalcoloRegionale esitoCalcoloRegionale) {
		super();
		this.identificativoFiscale = identificativoFiscale;
		this.dataScadenza = dataScadenza;
		this.validita = validita;
		this.tipoRiduzione = tipoRiduzione;
		this.percentualeRiduzione = percentualeRiduzione;
		this.importo = importo;
		this.rimorchiabilita = rimorchiabilita;
		this.esplicativo = esplicativo;
		this.esitoCalcoloRegionale = esitoCalcoloRegionale;
	}

	//~ Methods ==================================================================

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public boolean hasEsitoCalcoloRegionale() {
		return esitoCalcoloRegionale != null;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public boolean hasEsitoCalcoloFuoriRegione() {
		return esitoCalcoloFuoriRegione != null;
	}

	/**
	 * DOCUMENT ME!
	 * @return  Returns the dataScadenza.
	 * @uml.property  name="dataScadenza"
	 */
	public DataScadenza getDataScadenza() {
		return dataScadenza;
	}

	/**
	 * DOCUMENT ME!
	 * @return  Returns the esitoCalcoloRegionale.
	 * @uml.property  name="esitoCalcoloRegionale"
	 */
	public EsitoCalcoloRegionale getEsitoCalcoloRegionale() {
		return esitoCalcoloRegionale;
	}

	/**
	 * DOCUMENT ME!
	 * @return  Returns the esitoCalcoloFuoriRegione
	 * @uml.property  name="esitoCalcoloFuoriRegione"
	 */
	public EsitoCalcoloFuoriRegione getEsitoCalcoloFuoriRegione() {
		return esitoCalcoloFuoriRegione;
	}

	/**
	 * DOCUMENT ME!
	 * @return  Returns the esplicativo.
	 * @uml.property  name="esplicativo"
	 */
	public String getEsplicativo() {
		return esplicativo;
	}

	/**
	 * DOCUMENT ME!
	 * @return  Returns the identificativoFiscale.
	 * @uml.property  name="identificativoFiscale"
	 */
	public String getIdentificativoFiscale() {
		return identificativoFiscale;
	}

	/**
	 * DOCUMENT ME!
	 * @return  Returns the importo.
	 * @uml.property  name="importo"
	 */
	public Importo getImporto() {
		return importo;
	}

	public Valuta getRimorchiabilita() {
		return rimorchiabilita;
	}

	/**
	 * DOCUMENT ME!
	 * @return  Returns the percentualeRiduzione.
	 * @uml.property  name="percentualeRiduzione"
	 */
	public Integer getPercentualeRiduzione() {
		return percentualeRiduzione;
	}

	/**
	 * DOCUMENT ME!
	 * @return  Returns the tipoRiduzione.
	 * @uml.property  name="tipoRiduzione"
	 */
	public TipoRiduzione getTipoRiduzione() {
		return tipoRiduzione;
	}

	/**
	 * DOCUMENT ME!
	 * @return  Returns the validita.
	 * @uml.property  name="validita"
	 */
	public Integer getValidita() {
		return validita;
	}

	/**
	 * @param identificativoFiscale  The identificativoFiscale to set.
	 * @uml.property  name="identificativoFiscale"
	 */
	public void setIdentificativoFiscale(String identificativoFiscale) {
		this.identificativoFiscale = identificativoFiscale;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
		.append("IdentificativoFiscale", getIdentificativoFiscale())
		.append("DataScadenza", getDataScadenza())
		.append("Validita", getValidita())
		.append("Esplicativo", getEsplicativo())
		.append("Importo",getImporto())
		.append("Rimorchiabilita",getRimorchiabilita())
		.append("TipoRiduzione", getTipoRiduzione())
		.append("PercentualeRiduzione", getPercentualeRiduzione())
		.append("EsitoCalcoloRegionale", getEsitoCalcoloRegionale())
		.append("EsitoCalcoloFuoriRegione", getEsitoCalcoloFuoriRegione()).toString();
	}

	public IdProprietario getIdProprietario() {
		return idProprietario;
	}

	public void setIdProprietario(IdProprietario idProprietario) {
		this.idProprietario = idProprietario;
	}
}
