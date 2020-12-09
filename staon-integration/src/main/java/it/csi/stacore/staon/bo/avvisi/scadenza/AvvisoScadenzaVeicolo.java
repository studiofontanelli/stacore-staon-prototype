/*
 * Created on 14-nov-2005
 */
package it.csi.stacore.staon.bo.avvisi.scadenza;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import it.csi.stacore.staon.bo.TipoStatoPagamentoAvviso;
import it.csi.stacore.staon.bo.TipoVeicolo;
import it.csi.stacore.staon.bo.Valuta;
import it.csi.stacore.staon.bo.Veicolo;
import it.csi.stacore.staon.bo.avvisi.segnalazione.IdSegnalazione;
import it.csi.stacore.staon.bo.credito.Compensato;
import it.csi.stacore.staon.bo.credito.TipoErogazione;
import it.csi.stacore.staon.bo.id.IdPosizione;
import it.csi.stacore.staon.bo.id.LongId;
import it.csi.stacore.staon.bo.id.avvisi.scadenza.IdAvvisoScadenzaVeicolo;
import it.csi.stacore.staon.util.EqualsUtil;

/**
 * @author mdferrua
 */
public class AvvisoScadenzaVeicolo implements Serializable, Compensato {
	static final long serialVersionUID = 889959897946401369L;

	/**
	 * @uml.property name="idAvvisoScadenzaVeicolo"
	 * @uml.associationEnd multiplicity="(1 1)"
	 */
	private IdAvvisoScadenzaVeicolo idAvvisoScadenzaVeicolo = null;

	/**
	 * @uml.property name="avvisoScadenzaPersona"
	 * @uml.associationEnd multiplicity="(1 1)"
	 */
	private AvvisoScadenzaPersona avvisoScadenzaPersona = null;

	/**
	 * @uml.property name="tipoVeicolo"
	 * @uml.associationEnd multiplicity="(1 1)"
	 */
	private TipoVeicolo tipoVeicolo = null;

	/**
	 * @uml.property name="targa"
	 */
	private String targa = null;

	/**
	 * @uml.property name="veicolo"
	 * @uml.associationEnd multiplicity="(1 1)"
	 */
	private Veicolo veicolo = null;

	/**
	 * @uml.property name="dataImmatricolazione"
	 */
	private Date dataImmatricolazione = null;

	/**
	 * @uml.property name="descCategoriaDestinazione"
	 */
	private String descCategoriaDestinazione = null;

	/**
	 * @uml.property name="descUso"
	 */
	private String descUso = null;

	/**
	 * @uml.property name="descAlimentazione"
	 */
	private String descAlimentazione = null;

	/**
	 * @uml.property name="flagEcodiesel"
	 */
	private String flagEcodiesel = null;

	/**
	 * @uml.property name="ultimoGiornoUtile"
	 */
	private Date ultimoGiornoUtile = null;

	/**
	 * @uml.property name="validita"
	 */
	private BigDecimal validita = null;

	/**
	 * @uml.property name="tassaDovuta"
	 */
	private Valuta tassaDovuta = null;

	/**
	 * @uml.property name="datiCalcolo"
	 */
	private String datiCalcolo = null;

	/**
	 * @uml.property name="idPosizione"
	 */
	private IdPosizione idPosizione;

	/**
	 * @uml.property name="idSegnalazione"
	 * @uml.associationEnd multiplicity="(1 1)"
	 */
	private IdSegnalazione idSegnalazione = null;

	private String riduzione = null;
	private String numeroMAV = null;
	private String indirizzoMail = null;
	private String numeroCellulare = null;
	private String idAvvisoPagamento = null;

	private TipoStatoPagamentoAvviso statoPagamentoAvviso;

	private String kw;
	private String co2;
	private String dataInstalGpl;
	private String peso;
	private String numAssi;
	private String portata;
	private String flagSosp;
	private String flagRim;
	private String posti;
	private String codCatEuro;

	private String email;
	private String telefono;

	/**
	 * @param idAvvisoScadenzaVeicolo
	 * @param avvisoScadenzaPersona
	 * @param tipoVeicolo
	 * @param targa
	 * @param veicolo
	 * @param dataImmatricolazione
	 * @param descCategoriaDestinazione
	 * @param descUso
	 * @param descAlimentazione
	 * @param flagEcodiesel
	 * @param ultimoGiornoUtile
	 * @param validita
	 * @param tassaDovuta
	 * @param datiCalcolo
	 */
	public AvvisoScadenzaVeicolo(
			IdAvvisoScadenzaVeicolo idAvvisoScadenzaVeicolo,
			AvvisoScadenzaPersona avvisoScadenzaPersona,
			TipoVeicolo tipoVeicolo, String targa, Veicolo veicolo,
			Date dataImmatricolazione, String descCategoriaDestinazione,
			String descUso, String descAlimentazione, String flagEcodiesel,
			Date ultimoGiornoUtile, BigDecimal validita, Valuta tassaDovuta,
			String datiCalcolo, IdSegnalazione idSegnalazione,
			TipoStatoPagamentoAvviso statoPagamentoAvviso,
			String indirizzoMail, String numeroCellulare) {
		this.idAvvisoScadenzaVeicolo = idAvvisoScadenzaVeicolo;
		this.avvisoScadenzaPersona = avvisoScadenzaPersona;
		this.tipoVeicolo = tipoVeicolo;
		this.targa = targa;
		this.veicolo = veicolo;
		this.dataImmatricolazione = dataImmatricolazione;
		this.descCategoriaDestinazione = descCategoriaDestinazione;
		this.descUso = descUso;
		this.descAlimentazione = descAlimentazione;
		this.flagEcodiesel = flagEcodiesel;
		this.ultimoGiornoUtile = ultimoGiornoUtile;
		this.validita = validita;
		this.tassaDovuta = tassaDovuta;
		this.datiCalcolo = datiCalcolo;
		this.idSegnalazione = idSegnalazione;
		this.statoPagamentoAvviso = statoPagamentoAvviso;
		this.indirizzoMail = indirizzoMail;
		this.numeroCellulare = numeroCellulare;
	}

	public AvvisoScadenzaVeicolo(
			IdAvvisoScadenzaVeicolo idAvvisoScadenzaVeicolo,
			AvvisoScadenzaPersona avvisoScadenzaPersona,
			TipoVeicolo tipoVeicolo, String targa, Veicolo veicolo,
			Date dataImmatricolazione, String descCategoriaDestinazione,
			String descUso, String descAlimentazione, String flagEcodiesel,
			Date ultimoGiornoUtile, BigDecimal validita, Valuta tassaDovuta,
			String datiCalcolo, IdSegnalazione idSegnalazione,
			TipoStatoPagamentoAvviso statoPagamentoAvviso,
			String indirizzoMail, String numeroCellulare, String idAvvisoPagamento) {
		this.idAvvisoScadenzaVeicolo = idAvvisoScadenzaVeicolo;
		this.avvisoScadenzaPersona = avvisoScadenzaPersona;
		this.tipoVeicolo = tipoVeicolo;
		this.targa = targa;
		this.veicolo = veicolo;
		this.dataImmatricolazione = dataImmatricolazione;
		this.descCategoriaDestinazione = descCategoriaDestinazione;
		this.descUso = descUso;
		this.descAlimentazione = descAlimentazione;
		this.flagEcodiesel = flagEcodiesel;
		this.ultimoGiornoUtile = ultimoGiornoUtile;
		this.validita = validita;
		this.tassaDovuta = tassaDovuta;
		this.datiCalcolo = datiCalcolo;
		this.idSegnalazione = idSegnalazione;
		this.statoPagamentoAvviso = statoPagamentoAvviso;
		this.indirizzoMail = indirizzoMail;
		this.numeroCellulare = numeroCellulare;
		this.idAvvisoPagamento = idAvvisoPagamento;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	/**
	 * @return Returns the avvisoScadenzaPersona.
	 * @uml.property name="avvisoScadenzaPersona"
	 */
	public AvvisoScadenzaPersona getAvvisoScadenzaPersona() {
		return avvisoScadenzaPersona;
	}

	/**
	 * @param avvisoScadenzaPersona
	 *            The avvisoScadenzaPersona to set.
	 * @uml.property name="avvisoScadenzaPersona"
	 */
	public void setAvvisoScadenzaPersona(
			AvvisoScadenzaPersona avvisoScadenzaPersona) {
		this.avvisoScadenzaPersona = avvisoScadenzaPersona;
	}

	/**
	 * @return Returns the dataImmatricolazione.
	 * @uml.property name="dataImmatricolazione"
	 */
	public Date getDataImmatricolazione() {
		return dataImmatricolazione;
	}

	/**
	 * @param dataImmatricolazione
	 *            The dataImmatricolazione to set.
	 * @uml.property name="dataImmatricolazione"
	 */
	public void setDataImmatricolazione(Date dataImmatricolazione) {
		this.dataImmatricolazione = dataImmatricolazione;
	}

	/**
	 * @return Returns the datiCalcolo.
	 * @uml.property name="datiCalcolo"
	 */
	public String getDatiCalcolo() {
		return datiCalcolo;
	}

	/**
	 * @param datiCalcolo
	 *            The datiCalcolo to set.
	 * @uml.property name="datiCalcolo"
	 */
	public void setDatiCalcolo(String datiCalcolo) {
		this.datiCalcolo = datiCalcolo;
	}

	/**
	 * @return Returns the descAlimentazione.
	 * @uml.property name="descAlimentazione"
	 */
	public String getDescAlimentazione() {
		return descAlimentazione;
	}

	/**
	 * @param descAlimentazione
	 *            The descAlimentazione to set.
	 * @uml.property name="descAlimentazione"
	 */
	public void setDescAlimentazione(String descAlimentazione) {
		this.descAlimentazione = descAlimentazione;
	}

	/**
	 * @return Returns the descCategoriaDestinazione.
	 * @uml.property name="descCategoriaDestinazione"
	 */
	public String getDescCategoriaDestinazione() {
		return descCategoriaDestinazione;
	}

	/**
	 * @param descCategoriaDestinazione
	 *            The descCategoriaDestinazione to set.
	 * @uml.property name="descCategoriaDestinazione"
	 */
	public void setDescCategoriaDestinazione(String descCategoriaDestinazione) {
		this.descCategoriaDestinazione = descCategoriaDestinazione;
	}

	/**
	 * @return Returns the descUso.
	 * @uml.property name="descUso"
	 */
	public String getDescUso() {
		return descUso;
	}

	/**
	 * @param descUso
	 *            The descUso to set.
	 * @uml.property name="descUso"
	 */
	public void setDescUso(String descUso) {
		this.descUso = descUso;
	}

	/**
	 * @return Returns the flagEcodiesel.
	 * @uml.property name="flagEcodiesel"
	 */
	public String getFlagEcodiesel() {
		return flagEcodiesel;
	}

	/**
	 * @param flagEcodiesel
	 *            The flagEcodiesel to set.
	 * @uml.property name="flagEcodiesel"
	 */
	public void setFlagEcodiesel(String flagEcodiesel) {
		this.flagEcodiesel = flagEcodiesel;
	}

	/**
	 * @return Returns the idAvvisoScadenzaVeicolo.
	 * @uml.property name="idAvvisoScadenzaVeicolo"
	 */
	public IdAvvisoScadenzaVeicolo getIdAvvisoScadenzaVeicolo() {
		return idAvvisoScadenzaVeicolo;
	}

	/**
	 * @param idAvvisoScadenzaVeicolo
	 *            The idAvvisoScadenzaVeicolo to set.
	 * @uml.property name="idAvvisoScadenzaVeicolo"
	 */
	public void setIdAvvisoScadenzaVeicolo(
			IdAvvisoScadenzaVeicolo idAvvisoScadenzaVeicolo) {
		this.idAvvisoScadenzaVeicolo = idAvvisoScadenzaVeicolo;
	}

	/**
	 * @return Returns the targa.
	 * @uml.property name="targa"
	 */
	public String getTarga() {
		return targa;
	}

	/**
	 * @param targa
	 *            The targa to set.
	 * @uml.property name="targa"
	 */
	public void setTarga(String targa) {
		this.targa = targa;
	}

	/**
	 * @return Returns the tipoVeicolo.
	 * @uml.property name="tipoVeicolo"
	 */
	public TipoVeicolo getTipoVeicolo() {
		return tipoVeicolo;
	}

	/**
	 * @param tipoVeicolo
	 *            The tipoVeicolo to set.
	 * @uml.property name="tipoVeicolo"
	 */
	public void setTipoVeicolo(TipoVeicolo tipoVeicolo) {
		this.tipoVeicolo = tipoVeicolo;
	}

	/**
	 * @return Returns the ultimoGiornoUtile.
	 * @uml.property name="ultimoGiornoUtile"
	 */
	public Date getUltimoGiornoUtile() {
		return ultimoGiornoUtile;
	}

	/**
	 * @param ultimoGiornoUtile
	 *            The ultimoGiornoUtile to set.
	 * @uml.property name="ultimoGiornoUtile"
	 */
	public void setUltimoGiornoUtile(Date ultimoGiornoUtile) {
		this.ultimoGiornoUtile = ultimoGiornoUtile;
	}

	/**
	 * @return Returns the validita.
	 * @uml.property name="validita"
	 */
	public BigDecimal getValidita() {
		return validita;
	}

	/**
	 * @param validita
	 *            The validita to set.
	 * @uml.property name="validita"
	 */
	public void setValidita(BigDecimal validita) {
		this.validita = validita;
	}

	/**
	 * @return Returns the veicolo.
	 * @uml.property name="veicolo"
	 */
	public Veicolo getVeicolo() {
		return veicolo;
	}

	/**
	 * @param veicolo
	 *            The veicolo to set.
	 * @uml.property name="veicolo"
	 */
	public void setVeicolo(Veicolo veicolo) {
		this.veicolo = veicolo;
	}

	/**
	 * @return Returns the idSegnalazione.
	 * @uml.property name="idSegnalazione"
	 */
	public IdSegnalazione getIdSegnalazione() {
		return idSegnalazione;
	}

	/**
	 * @param idSegnalazione
	 *            The idSegnalazione to set.
	 * @uml.property name="idSegnalazione"
	 */
	public void setIdSegnalazione(IdSegnalazione idSegnalazione) {
		this.idSegnalazione = idSegnalazione;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param object
	 *            DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public boolean equals(Object object) {
		boolean equals = false;

		if ((object != null) && object instanceof AvvisoScadenzaVeicolo) {
			AvvisoScadenzaVeicolo altro = (AvvisoScadenzaVeicolo) object;
			equals = EqualsUtil.objectEquals(getAvvisoScadenzaPersona(),
					altro.getAvvisoScadenzaPersona())
					&& EqualsUtil.objectEquals(getDataImmatricolazione(),
							altro.getDataImmatricolazione())
					&& EqualsUtil.objectEquals(getDatiCalcolo(),
							altro.getDatiCalcolo())
					&& EqualsUtil.objectEquals(getDescAlimentazione(),
							altro.getDescAlimentazione())
					&& EqualsUtil.objectEquals(getDescCategoriaDestinazione(),
							altro.getDescCategoriaDestinazione())
					&& EqualsUtil
							.objectEquals(getDescUso(), altro.getDescUso())
					&& EqualsUtil.objectEquals(getFlagEcodiesel(),
							altro.getFlagEcodiesel())
					&& EqualsUtil.objectEquals(getIdAvvisoScadenzaVeicolo(),
							altro.getIdAvvisoScadenzaVeicolo())
					&& EqualsUtil.objectEquals(getTarga(), altro.getTarga())
					&& EqualsUtil.objectEquals(getTassaDovuta(),
							altro.getTassaDovuta())
					&& EqualsUtil.objectEquals(getTipoVeicolo(),
							altro.getTipoVeicolo())
					&& EqualsUtil.objectEquals(getUltimoGiornoUtile(),
							altro.getUltimoGiornoUtile())
					&& EqualsUtil.objectEquals(getValidita(),
							altro.getValidita())
					&& EqualsUtil.objectEquals(getIdSegnalazione(),
							altro.getIdSegnalazione())
					&& EqualsUtil
							.objectEquals(getVeicolo(), altro.getVeicolo())
					&& EqualsUtil.objectEquals(getIndirizzoMail(),
							altro.getIndirizzoMail())
					&& EqualsUtil.objectEquals(getNumeroCellulare(),
							altro.getNumeroCellulare());

		}

		return equals;
	}

	public Valuta getCreditoErogato() {
		// TODO Auto-generated method stub
		return null;
	}

	public LongId getIdCompensato() {
		return idAvvisoScadenzaVeicolo;
	}

	public TipoErogazione getTipoErogazione() {
		return TipoErogazione.TIPO_EROGAZIONE_AVV_SCADENZA;
	}

	public String getTargaCompensato() {
		return getTarga();
	}

	public TipoVeicolo getTipoVeicoloCompensato() {
		return getTipoVeicolo();
	}

	public Integer getScadenzaCompensato() {
		return new Integer(avvisoScadenzaPersona.getAvvisoScadenzaEnte()
				.getScadenza().intValue());
	}

	public Integer getValiditaCompensato() {
		return new Integer(getValidita().intValue());
	}

	public IdPosizione getIdPosizione() {
		return idPosizione;
	}

	public void setIdPosizione(IdPosizione idPosizione) {
		this.idPosizione = idPosizione;
	}

	public TipoStatoPagamentoAvviso getStatoPagamentoAvviso() {
		return statoPagamentoAvviso;
	}

	public void setStatoPagamentoAvviso(
			TipoStatoPagamentoAvviso statoPagamentoAvviso) {
		this.statoPagamentoAvviso = statoPagamentoAvviso;
	}

	public void setTassaDovuta(Valuta tassaDovuta) {
		this.tassaDovuta = tassaDovuta;
	}

	public Valuta getTassaDovuta() {
		return tassaDovuta;
	}

	public String getRiduzione() {
		return riduzione;
	}

	public void setRiduzione(String riduzione) {
		this.riduzione = riduzione;
	}

	public String getNumeroMAV() {
		return numeroMAV;
	}

	public void setNumeroMAV(String numeroMAV) {
		this.numeroMAV = numeroMAV;
	}

	public String getIndirizzoMail() {
		return indirizzoMail;
	}

	public String getNumeroCellulare() {
		return numeroCellulare;
	}

	public String getIdAvvisoPagamento() {
		return idAvvisoPagamento;
	}

	public void setIdAvvisoPagamento(String idAvvisoPagamento) {
		this.idAvvisoPagamento = idAvvisoPagamento;
	}

	public String getKw() {
		return kw;
	}

	public void setKw(String kw) {
		this.kw = kw;
	}

	public String getCo2() {
		return co2;
	}

	public void setCo2(String co2) {
		this.co2 = co2;
	}

	public String getDataInstalGpl() {
		return dataInstalGpl;
	}

	public void setDataInstalGpl(String dataInstalGpl) {
		this.dataInstalGpl = dataInstalGpl;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getNumAssi() {
		return numAssi;
	}

	public void setNumAssi(String numAssi) {
		this.numAssi = numAssi;
	}

	public String getPortata() {
		return portata;
	}

	public void setPortata(String portata) {
		this.portata = portata;
	}

	public String getFlagSosp() {
		return flagSosp;
	}

	public void setFlagSosp(String flagSosp) {
		this.flagSosp = flagSosp;
	}

	public String getFlagRim() {
		return flagRim;
	}

	public void setFlagRim(String flagRim) {
		this.flagRim = flagRim;
	}

	public String getPosti() {
		return posti;
	}

	public void setPosti(String posti) {
		this.posti = posti;
	}

	public String getCodCatEuro() {
		return codCatEuro;
	}

	public void setCodCatEuro(String codCatEuro) {
		this.codCatEuro = codCatEuro;
	}

	public void setIndirizzoMail(String indirizzoMail) {
		this.indirizzoMail = indirizzoMail;
	}

	public void setNumeroCellulare(String numeroCellulare) {
		this.numeroCellulare = numeroCellulare;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
