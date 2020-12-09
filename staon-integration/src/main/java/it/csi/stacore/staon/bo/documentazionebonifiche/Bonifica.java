package it.csi.stacore.staon.bo.documentazionebonifiche;

import it.csi.stacore.staon.bo.AllegatoBonificaVO;
import it.csi.stacore.staon.bo.BonificaVO;
import it.csi.stacore.staon.bo.TipoVeicolo;
import it.csi.stacore.staon.bo.utente.Cassa;
import it.csi.stacore.staon.bo.utente.Ente;
import it.csi.stacore.staon.bo.utente.Sportello;
import it.csi.stacore.staon.bo.utente.TipologiaBonifica;

public class Bonifica extends BonificaVO{

	private static final long serialVersionUID = -1025796356450208597L;

	private Ente enteVO;
	private Cassa cassaVO;
	private Sportello sportelloVO;
	private TipologiaBonifica tipologiaBonifica;
	private AllegatoBonificaVO allegatoBonificaVO;
	private TipoVeicolo tipoVeicolo;

	private Integer risultatiPerPagina;

	public Bonifica(long idBonifica) {
		super(idBonifica);
	}

	public Ente getEnteVO() {
		return enteVO;
	}
	public void setEnteVO(Ente enteVO) {
		this.enteVO = enteVO;
	}
	public Cassa getCassaVO() {
		return cassaVO;
	}
	public void setCassaVO(Cassa cassaVO) {
		this.cassaVO = cassaVO;
	}
	public Sportello getSportelloVO() {
		return sportelloVO;
	}
	public void setSportelloVO(Sportello sportelloVO) {
		this.sportelloVO = sportelloVO;
	}
	public TipologiaBonifica getTipologiaBonifica() {
		return tipologiaBonifica;
	}
	public void setTipologiaBonifica(TipologiaBonifica tipologiaBonifica) {
		this.tipologiaBonifica = tipologiaBonifica;
	}

	public Integer getRisultatiPerPagina() {
		return risultatiPerPagina;
	}

	public void setRisultatiPerPagina(Integer risultatiPerPagina) {
		this.risultatiPerPagina = risultatiPerPagina;
	}

	public AllegatoBonificaVO getAllegatoBonificaVO() {
		return allegatoBonificaVO;
	}

	public void setAllegatoBonificaVO(AllegatoBonificaVO allegatoBonificaVO) {
		this.allegatoBonificaVO = allegatoBonificaVO;
	}

	public TipoVeicolo getTipoVeicolo() {
		return tipoVeicolo;
	}

	public void setTipoVeicolo(TipoVeicolo tipoVeicolo) {
		this.tipoVeicolo = tipoVeicolo;
	}
}
