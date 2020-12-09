package it.csi.stacore.staon.bo;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import it.csi.stacore.staon.bo.id.IdProprietario;
import it.csi.stacore.staon.bo.id.IdVeicolo;

/**
 * DOCUMENT ME!
 *
 * @author curtoni TODO To change the template for this generated type comment
 *         go to Window - Preferences - Java - Code Style - Code Templates
 */
public class EsitoCalcoloRegionale implements Serializable {
	//~ Instance fields ==========================================================

	/**
	 *
	 */
	private static final long serialVersionUID = -4439645509965364943L;

	/**
	 * @uml.property  name="ultimoGiornoUtile"
	 */
	private Date ultimoGiornoUtileVerifica;
	private Date ultimoGiornoUtilePagamento;
	private Date dataCambioUso;
	private boolean isPrimoBollo;

	/**
	 * @uml.property  name="tipoSanzionamento"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private TipoSanzionamento tipoSanzionamento;

	/**
	 * @uml.property  name="protocolloAccertamento"
	 */
	private String protocolloAccertamento;

	/**
	 * @uml.property  name="destinazioneVeicolo"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private DestinazioneVeicolo destinazioneVeicolo;

	/**
	 * @uml.property  name="importoMassimoCompensabile"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Valuta importoMassimoCompensabile;

	/**
	 * @uml.property  name="importoCompensato"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Valuta importoCompensato;

	/**
	 * @uml.property  name="mensilitaCompensate"
	 */
	private Integer mensilitaCompensate;

	/**
	 * @uml.property  name="idProprietario"
	 * @uml.associationEnd
	 */
	private IdProprietario idProprietario;

	/**
	 * @uml.property  name="idVeicolo"
	 * @uml.associationEnd
	 */
	private IdVeicolo idVeicolo;

	/**
	 * @uml.property  name="tipoAlgoritmoCalcolo"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private TipoAlgoritmoCalcolo tipoAlgoritmoCalcolo;

	private EsitoIntegrazione esitoIntegrazione;

	private EsitoCambioUso esitoCambioUso;

	private EsitoAccertamentoInsufficenti esitoAccertamentoInsufficenti = null;

	private EsitoCalcoloSenzaRiduzione esitoCalcoloSenzaRiduzione = null;

	//~ Constructors =============================================================

	/**
	 * DOCUMENT ME!
	 *
	 * @param ultimoGiornoUtile
	 * @param tipoSanzionamento
	 * @param protocolloAccertamento
	 * @param destinazioneVeicolo
	 * @param importoCompensato
	 * @param mensilitaCompensate
	 */
	public EsitoCalcoloRegionale(boolean isPrimoBollo,
			Date ultimoGiornoUtileVerifica,
			Date ultimoGiornoUtilePagamento,
			TipoSanzionamento tipoSanzionamento,
			String protocolloAccertamento,
			DestinazioneVeicolo destinazioneVeicolo,
			Valuta importoMassimoCompensabile,
			Valuta importoCompensato,
			Integer mensilitaCompensate,
			TipoAlgoritmoCalcolo tipoAlgoritmoCalcolo) {
		super();
		this.isPrimoBollo=isPrimoBollo;
		this.ultimoGiornoUtileVerifica = ultimoGiornoUtileVerifica;
		this.ultimoGiornoUtilePagamento = ultimoGiornoUtilePagamento;
		this.tipoSanzionamento = tipoSanzionamento;
		this.protocolloAccertamento = protocolloAccertamento;
		this.destinazioneVeicolo = destinazioneVeicolo;
		this.importoMassimoCompensabile = importoMassimoCompensabile;
		this.importoCompensato = importoCompensato;
		this.mensilitaCompensate = mensilitaCompensate;
		this.tipoAlgoritmoCalcolo = tipoAlgoritmoCalcolo;
	}

	//~ Methods ==================================================================

	/**
	 * DOCUMENT ME!
	 * @return  Returns the destinazioneVeicolo.
	 * @uml.property  name="destinazioneVeicolo"
	 */
	public DestinazioneVeicolo getDestinazioneVeicolo() {
		return destinazioneVeicolo;
	}

	/**
	 * DOCUMENT ME!
	 * @return  Returns the importoCompensato.
	 * @uml.property  name="importoCompensato"
	 */
	public Valuta getImportoCompensato() {
		return importoCompensato;
	}

	/**
	 * DOCUMENT ME!
	 * @return  Returns the mensilitaCompensate.
	 * @uml.property  name="mensilitaCompensate"
	 */
	public Integer getMensilitaCompensate() {
		return mensilitaCompensate;
	}

	/**
	 * DOCUMENT ME!
	 * @return  Returns the protocolloAccertamento.
	 * @uml.property  name="protocolloAccertamento"
	 */
	public String getProtocolloAccertamento() {
		return protocolloAccertamento;
	}

	/**
	 * DOCUMENT ME!
	 * @return  Returns the tipoSanzionamento.
	 * @uml.property  name="tipoSanzionamento"
	 */
	public TipoSanzionamento getTipoSanzionamento() {
		return tipoSanzionamento;
	}


	/**
	 * DOCUMENT ME!
	 * @return  DOCUMENT ME!
	 * @uml.property  name="idVeicolo"
	 */
	public IdVeicolo getIdVeicolo() {
		return idVeicolo;
	}

	/**
	 * DOCUMENT ME!
	 * @return  DOCUMENT ME!
	 * @uml.property  name="idProprietario"
	 */
	public IdProprietario getIdProprietario() {
		return idProprietario;
	}

	/**
	 * DOCUMENT ME!
	 * @return  DOCUMENT ME!
	 * @uml.property  name="idProprietario"
	 */
	public void setIdProprietario(IdProprietario idProprietario) {
		this.idProprietario = idProprietario;
	}

	/**
	 * DOCUMENT ME!
	 * @return  DOCUMENT ME!
	 * @uml.property  name="idVeicolo"
	 */
	public void setIdVeicolo(IdVeicolo idVeicolo) {
		this.idVeicolo = idVeicolo;
	}

	/**
	 * DOCUMENT ME!
	 * @return  DOCUMENT ME!
	 * @uml.property  name="importoMassimoCompensabile"
	 */
	public Valuta getImportoMassimoCompensabile() {
		return importoMassimoCompensabile;
	}

	/**
	 * DOCUMENT ME!
	 * @return  DOCUMENT ME!
	 * @uml.property  name="tipoAlgoritmoCalcolo"
	 */
	public TipoAlgoritmoCalcolo getTipoAlgoritmoCalcolo() {
		return tipoAlgoritmoCalcolo;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
		.append("IdProprietario", getIdProprietario())
		.append("IdVeicolo",getIdVeicolo())
		.append("ProtocolloAccertamento", getProtocolloAccertamento())
		.append("DestinazioneVeicolo", getDestinazioneVeicolo())
		.append("isPrimoBollo", isPrimoBollo())
		.append("UltimoGiornoUtileVerifica", getUltimoGiornoUtileVerifica())
		.append("UltimoGiornoUtilePagamento", getUltimoGiornoUtilePagamento())
		.append("DataCambioUso", getDataCambioUso())
		.append("TipoSanzionamentoProrogato", getTipoSanzionamento())
		.append("ImportoCompensato",getImportoCompensato())
		.append("ImportoMassimoCompensabile", getImportoMassimoCompensabile())
		.append("MensilitaCompensate",getMensilitaCompensate())
		.append("TipoAlgoritmoCalcolo", getTipoAlgoritmoCalcolo())
		.append("EsitoIntegrazione",(getEsitoIntegrazione() != null) ? getEsitoIntegrazione().getIntegrazioneEsplicativo() : "")
		.append("EsitoCalcoloSenzaRiduzione",getEsitoCalcoloSenzaRiduzione())
		.append("EsitoAccertamentoInsufficenti",getEsitoAccertamentoInsufficenti())
		.append("EsitoCambioUso",getEsitoCambioUso())
		.toString();
	}



	public EsitoIntegrazione getEsitoIntegrazione() {
		return esitoIntegrazione;
	}

	public void setEsitoIntegrazione(EsitoIntegrazione esitoIntegrazione) {
		this.esitoIntegrazione = esitoIntegrazione;
	}


	public Date getDataCambioUso() {
		return dataCambioUso;
	}

	public void setDataCambioUso(Date dataCambioUso) {
		this.dataCambioUso = dataCambioUso;
	}

	public EsitoCambioUso getEsitoCambioUso() {
		return esitoCambioUso;
	}

	public void setEsitoCambioUso(EsitoCambioUso esitoCambioUso) {
		this.esitoCambioUso = esitoCambioUso;
	}

	public EsitoAccertamentoInsufficenti getEsitoAccertamentoInsufficenti() {
		return esitoAccertamentoInsufficenti;
	}

	public void setEsitoAccertamentoInsufficenti(
			EsitoAccertamentoInsufficenti esitoAccertamentoInsufficenti) {
		this.esitoAccertamentoInsufficenti = esitoAccertamentoInsufficenti;
	}

	public boolean isPrimoBollo() {
		return isPrimoBollo;
	}

	public EsitoCalcoloSenzaRiduzione getEsitoCalcoloSenzaRiduzione() {
		return esitoCalcoloSenzaRiduzione;
	}

	public void setEsitoCalcoloSenzaRiduzione(EsitoCalcoloSenzaRiduzione esitoCalcoloSenzaRiduzione) {
		this.esitoCalcoloSenzaRiduzione = esitoCalcoloSenzaRiduzione;
	}

	public Date getUltimoGiornoUtileVerifica() {
		return ultimoGiornoUtileVerifica;
	}

	public Date getUltimoGiornoUtilePagamento() {
		return ultimoGiornoUtilePagamento;
	}



}
