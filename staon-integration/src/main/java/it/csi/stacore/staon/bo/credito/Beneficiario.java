package it.csi.stacore.staon.bo.credito;

import java.util.Date;

import it.csi.stacore.staon.bo.AbstractBO;
import it.csi.stacore.staon.bo.id.IdBeneficiario;
import it.csi.stacore.staon.bo.id.IdCredito;

public class Beneficiario extends AbstractBO {

	private static final long serialVersionUID = 5039039577772023473L;

	private IdBeneficiario idBeneficiario;
	private IdCredito idCredito;
	private String identificativoFiscale;
	private Date dataFineValidita;

	public Beneficiario(IdBeneficiario idBeneficiario, IdCredito idCredito, String identificativoFiscale, Date dataFineValidita) {
		super();

		this.idBeneficiario = idBeneficiario;
		this.idCredito = idCredito;
		this.identificativoFiscale = identificativoFiscale;
		this.dataFineValidita = dataFineValidita;
	}

	public Date getDataFineValidita() {
		return dataFineValidita;
	}

	public void setDataFineValidita(Date dataFineValidita) {
		this.dataFineValidita = dataFineValidita;
	}

	public IdBeneficiario getIdBeneficiario() {
		return idBeneficiario;
	}

	public void setIdBeneficiario(IdBeneficiario idBeneficiario) {
		this.idBeneficiario = idBeneficiario;
	}

	public IdCredito getIdCredito() {
		return idCredito;
	}

	public void setIdCredito(IdCredito idCredito) {
		this.idCredito = idCredito;
	}

	public String getIdentificativoFiscale() {
		return identificativoFiscale;
	}

	public void setIdentificativoFiscale(String identificativoFiscale) {
		this.identificativoFiscale = identificativoFiscale;
	}

}
