package it.csi.stacore.staon.bo;

public class AllegatoBonificaVO extends AbstractBO implements java.io.Serializable {


	private static final long serialVersionUID = -2395946550837753699L;

	private long idAllegatoBonifica;
	private long idBonifica;
	private String identificativoArchivio;
	private String nomeFile;
	private String idTipoDocumento;
	private String dataInserimento;
	private String idOperazione;

	public AllegatoBonificaVO() {}

	public AllegatoBonificaVO(long idBonifica, String identificativoArchivio, String nomeFile,
			String idTipoDocumento, String dataInserimento, String idOperazione) {
		super();
		this.idBonifica = idBonifica;
		this.identificativoArchivio = identificativoArchivio;
		this.nomeFile = nomeFile;
		this.idTipoDocumento = idTipoDocumento;
		this.dataInserimento = dataInserimento;
		this.idOperazione = idOperazione;
	}

	public String getIdentificativoArchivio() {
		return identificativoArchivio;
	}

	public void setIdentificativoArchivio(String identificativoArchivio) {
		this.identificativoArchivio = identificativoArchivio;
	}

	public String getNomeFile() {
		return nomeFile;
	}

	public void setNomeFile(String nomeFile) {
		this.nomeFile = nomeFile;
	}

	public long getIdBonifica() {
		return idBonifica;
	}

	public void setIdBonifica(long idBonifica) {
		this.idBonifica = idBonifica;
	}

	public String getIdTipoDocumento() {
		return idTipoDocumento;
	}

	public void setIdTipoDocumento(String idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}



	public String getDataInserimento() {
		return dataInserimento;
	}

	public void setDataInserimento(String dataInserimento) {
		this.dataInserimento = dataInserimento;
	}

	public String getIdOperazione() {
		return idOperazione;
	}

	public void setIdOperazione(String idOperazione) {
		this.idOperazione = idOperazione;
	}



	public long getIdAllegatoBonifica() {
		return idAllegatoBonifica;
	}



	public void setIdAllegatoBonifica(long idAllegatoBonifica) {
		this.idAllegatoBonifica = idAllegatoBonifica;
	}




}
