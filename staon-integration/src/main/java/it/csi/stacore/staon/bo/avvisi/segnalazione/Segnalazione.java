package it.csi.stacore.staon.bo.avvisi.segnalazione;

import java.io.Serializable;
import java.util.Date;

import it.csi.stacore.staon.bo.Proprietario;
import it.csi.stacore.staon.bo.TipoVeicolo;
import it.csi.stacore.staon.bo.id.avvisi.scadenza.IdAvvisoScadenzaVeicolo;
import it.csi.stacore.staon.util.EqualsUtil;


/**
 * DOCUMENT ME!
 *
 * @author mdferrua
 */
public class Segnalazione implements Serializable {
	//~ Static fields/initializers ===============================================

	static final long serialVersionUID = 889959897946401369L;

	//~ Instance fields ==========================================================
	/**
	 * @uml.property  name="idSegnalazione"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private IdSegnalazione idSegnalazione = null;
	/**
	 * @uml.property  name="dataSegnalazione"
	 */
	private Date dataSegnalazione = null;
	/**
	 * @uml.property  name="tipoVeicolo"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private TipoVeicolo tipoVeicolo = null;
	/**
	 * @uml.property  name="idFiscaleProprietario"
	 */
	private String idFiscaleProprietario = null;
	/**
	 * @uml.property  name="numeroProtocollo"
	 */
	private String numeroProtocollo = null;
	/**
	 * @uml.property  name="data1"
	 */
	private Date data1 = null;
	/**
	 * @uml.property  name="data2"
	 */
	private Date data2 = null;
	/**
	 * @uml.property  name="targa"
	 */
	private String targa = null;
	/**
	 * @uml.property  name="note"
	 */
	private String note = null;
	/**
	 * @uml.property  name="proprietario"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Proprietario proprietario = null;
	/**
	 * @uml.property  name="statoSegnalazione"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private StatoSegnalazione statoSegnalazione = null;
	/**
	 * @uml.property  name="motivoSegnalazione"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private MotivoSegnalazione motivoSegnalazione = null;
	/**
	 * @uml.property  name="causaleSegnalazione"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private CausaleSegnalazione causaleSegnalazione = null;
	/**
	 * @uml.property  name="sottoCausaleSegnalazione"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private SottoCausaleSegnalazione sottoCausaleSegnalazione = null;
	/**
	 * @uml.property  name="idAvvisoScadenzaVeicolo"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private IdAvvisoScadenzaVeicolo idAvvisoScadenzaVeicolo = null;

	//~ Constructors =============================================================
	/**
	 * @param idSegnalazione
	 * @param dataSegnalazione
	 * @param tipoVeicolo
	 * @param idFiscaleProprietario
	 * @param numeroProtocollo
	 * @param data1
	 * @param data2
	 * @param targa
	 * @param note
	 * @param proprietario
	 * @param statoSegnalazione
	 * @param motivoSegnalazione
	 * @param tipoAvviso
	 * @param causaleSegnalazione
	 * @param sottoCausaleSegnalazione
	 * @param idAvvisoScadenzaPersona
	 */
	public Segnalazione(IdSegnalazione idSegnalazione, Date dataSegnalazione,
			TipoVeicolo tipoVeicolo, String idFiscaleProprietario,
			String numeroProtocollo, Date data1, Date data2, String targa,
			String note, Proprietario proprietario,
			StatoSegnalazione statoSegnalazione,
			MotivoSegnalazione motivoSegnalazione,
			CausaleSegnalazione causaleSegnalazione,
			SottoCausaleSegnalazione sottoCausaleSegnalazione,
			IdAvvisoScadenzaVeicolo idAvvisoScadenzaVeicolo) {
		super();
		this.idSegnalazione = idSegnalazione;
		this.dataSegnalazione = dataSegnalazione;
		this.tipoVeicolo = tipoVeicolo;
		this.idFiscaleProprietario = idFiscaleProprietario;
		this.numeroProtocollo = numeroProtocollo;
		this.data1 = data1;
		this.data2 = data2;
		this.targa = targa;
		this.note = note;
		this.proprietario = proprietario;
		this.statoSegnalazione = statoSegnalazione;
		this.motivoSegnalazione = motivoSegnalazione;
		this.causaleSegnalazione = causaleSegnalazione;
		this.sottoCausaleSegnalazione = sottoCausaleSegnalazione;
		this.idAvvisoScadenzaVeicolo = idAvvisoScadenzaVeicolo;
	}

	//~ Methods ==================================================================
	/**
	 * @return  Returns the causaleSegnalazione.
	 * @uml.property  name="causaleSegnalazione"
	 */
	public CausaleSegnalazione getCausaleSegnalazione() {
		return causaleSegnalazione;
	}
	/**
	 * @param causaleSegnalazione  The causaleSegnalazione to set.
	 * @uml.property  name="causaleSegnalazione"
	 */
	public void setCausaleSegnalazione(CausaleSegnalazione causaleSegnalazione) {
		this.causaleSegnalazione = causaleSegnalazione;
	}
	/**
	 * @return  Returns the data1.
	 * @uml.property  name="data1"
	 */
	public Date getData1() {
		return data1;
	}
	/**
	 * @param data1  The data1 to set.
	 * @uml.property  name="data1"
	 */
	public void setData1(Date data1) {
		this.data1 = data1;
	}
	/**
	 * @return  Returns the data2.
	 * @uml.property  name="data2"
	 */
	public Date getData2() {
		return data2;
	}
	/**
	 * @param data2  The data2 to set.
	 * @uml.property  name="data2"
	 */
	public void setData2(Date data2) {
		this.data2 = data2;
	}
	/**
	 * @return  Returns the dataSegnalazione.
	 * @uml.property  name="dataSegnalazione"
	 */
	public Date getDataSegnalazione() {
		return dataSegnalazione;
	}
	/**
	 * @param dataSegnalazione  The dataSegnalazione to set.
	 * @uml.property  name="dataSegnalazione"
	 */
	public void setDataSegnalazione(Date dataSegnalazione) {
		this.dataSegnalazione = dataSegnalazione;
	}
	/**
	 * @return  Returns the idFiscaleProprietario.
	 * @uml.property  name="idFiscaleProprietario"
	 */
	public String getIdFiscaleProprietario() {
		return idFiscaleProprietario;
	}
	/**
	 * @param idFiscaleProprietario  The idFiscaleProprietario to set.
	 * @uml.property  name="idFiscaleProprietario"
	 */
	public void setIdFiscaleProprietario(String idFiscaleProprietario) {
		this.idFiscaleProprietario = idFiscaleProprietario;
	}
	/**
	 * @return  Returns the idSegnalazione.
	 * @uml.property  name="idSegnalazione"
	 */
	public IdSegnalazione getIdSegnalazione() {
		return idSegnalazione;
	}
	/**
	 * @param idSegnalazione  The idSegnalazione to set.
	 * @uml.property  name="idSegnalazione"
	 */
	public void setIdSegnalazione(IdSegnalazione idSegnalazione) {
		this.idSegnalazione = idSegnalazione;
	}
	/**
	 * @return  Returns the motivoSegnalazione.
	 * @uml.property  name="motivoSegnalazione"
	 */
	public MotivoSegnalazione getMotivoSegnalazione() {
		return motivoSegnalazione;
	}
	/**
	 * @param motivoSegnalazione  The motivoSegnalazione to set.
	 * @uml.property  name="motivoSegnalazione"
	 */
	public void setMotivoSegnalazione(MotivoSegnalazione motivoSegnalazione) {
		this.motivoSegnalazione = motivoSegnalazione;
	}
	/**
	 * @return  Returns the note.
	 * @uml.property  name="note"
	 */
	public String getNote() {
		return note;
	}
	/**
	 * @param note  The note to set.
	 * @uml.property  name="note"
	 */
	public void setNote(String note) {
		this.note = note;
	}
	/**
	 * @return  Returns the numeroProtocollo.
	 * @uml.property  name="numeroProtocollo"
	 */
	public String getNumeroProtocollo() {
		return numeroProtocollo;
	}
	/**
	 * @param numeroProtocollo  The numeroProtocollo to set.
	 * @uml.property  name="numeroProtocollo"
	 */
	public void setNumeroProtocollo(String numeroProtocollo) {
		this.numeroProtocollo = numeroProtocollo;
	}
	/**
	 * @return  Returns the proprietario.
	 * @uml.property  name="proprietario"
	 */
	public Proprietario getProprietario() {
		return proprietario;
	}
	/**
	 * @param proprietario  The proprietario to set.
	 * @uml.property  name="proprietario"
	 */
	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	/**
	 * @return  Returns the sottoCausaleSegnalazione.
	 * @uml.property  name="sottoCausaleSegnalazione"
	 */
	public SottoCausaleSegnalazione getSottoCausaleSegnalazione() {
		return sottoCausaleSegnalazione;
	}
	/**
	 * @param sottoCausaleSegnalazione  The sottoCausaleSegnalazione to set.
	 * @uml.property  name="sottoCausaleSegnalazione"
	 */
	public void setSottoCausaleSegnalazione(
			SottoCausaleSegnalazione sottoCausaleSegnalazione) {
		this.sottoCausaleSegnalazione = sottoCausaleSegnalazione;
	}
	/**
	 * @return  Returns the statoSegnalazione.
	 * @uml.property  name="statoSegnalazione"
	 */
	public StatoSegnalazione getStatoSegnalazione() {
		return statoSegnalazione;
	}
	/**
	 * @param statoSegnalazione  The statoSegnalazione to set.
	 * @uml.property  name="statoSegnalazione"
	 */
	public void setStatoSegnalazione(StatoSegnalazione statoSegnalazione) {
		this.statoSegnalazione = statoSegnalazione;
	}
	/**
	 * @return  Returns the targa.
	 * @uml.property  name="targa"
	 */
	public String getTarga() {
		return targa;
	}
	/**
	 * @param targa  The targa to set.
	 * @uml.property  name="targa"
	 */
	public void setTarga(String targa) {
		this.targa = targa;
	}
	/**
	 * @return  Returns the tipoVeicolo.
	 * @uml.property  name="tipoVeicolo"
	 */
	public TipoVeicolo getTipoVeicolo() {
		return tipoVeicolo;
	}
	/**
	 * @param tipoVeicolo  The tipoVeicolo to set.
	 * @uml.property  name="tipoVeicolo"
	 */
	public void setTipoVeicolo(TipoVeicolo tipoVeicolo) {
		this.tipoVeicolo = tipoVeicolo;
	}
	/**
	 * @return  Returns the idAvvisoScadenzaVeicolo.
	 * @uml.property  name="idAvvisoScadenzaVeicolo"
	 */
	public IdAvvisoScadenzaVeicolo getIdAvvisoScadenzaVeicolo() {
		return idAvvisoScadenzaVeicolo;
	}
	/**
	 * @param idAvvisoScadenzaVeicolo  The idAvvisoScadenzaVeicolo to set.
	 * @uml.property  name="idAvvisoScadenzaVeicolo"
	 */
	public void setIdAvvisoScadenzaVeicolo(
			IdAvvisoScadenzaVeicolo idAvvisoScadenzaVeicolo) {
		this.idAvvisoScadenzaVeicolo = idAvvisoScadenzaVeicolo;
	}
	/**
	 * DOCUMENT ME!
	 *
	 * @param object DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public boolean equals(Object object) {
	    boolean equals = false;

	    if((object != null) && object instanceof Segnalazione) {
	        Segnalazione altro = (Segnalazione) object;
	      equals =
	        EqualsUtil.objectEquals(getCausaleSegnalazione(), altro.getCausaleSegnalazione()) &&
	        EqualsUtil.objectEquals(getData1(), altro.getData1()) &&
	        EqualsUtil.objectEquals(getData2(), altro.getData2()) &&
	        EqualsUtil.objectEquals(getDataSegnalazione(), altro.getDataSegnalazione()) &&
	        EqualsUtil.objectEquals(getIdFiscaleProprietario(), altro.getIdFiscaleProprietario()) &&
	        EqualsUtil.objectEquals(getIdSegnalazione(), altro.getIdSegnalazione()) &&
	        EqualsUtil.objectEquals(getMotivoSegnalazione(), altro.getMotivoSegnalazione()) &&
	        EqualsUtil.objectEquals(getNote(), altro.getNote()) &&
	        EqualsUtil.objectEquals(getNumeroProtocollo(), altro.getNumeroProtocollo()) &&
	        EqualsUtil.objectEquals(getProprietario(), altro.getProprietario()) &&
	        EqualsUtil.objectEquals(getSottoCausaleSegnalazione(), altro.getSottoCausaleSegnalazione()) &&
	        EqualsUtil.objectEquals(getStatoSegnalazione(), altro.getStatoSegnalazione()) &&
	        EqualsUtil.objectEquals(getTarga(), altro.getTarga()) &&
	        EqualsUtil.objectEquals(getIdAvvisoScadenzaVeicolo(), altro.getIdAvvisoScadenzaVeicolo()) &&
	        EqualsUtil.objectEquals(getTipoVeicolo(), altro.getTipoVeicolo());
	    }

	    return equals;
	}

	public static long getSerialVersionUID() {
	    return serialVersionUID;
	}
}
