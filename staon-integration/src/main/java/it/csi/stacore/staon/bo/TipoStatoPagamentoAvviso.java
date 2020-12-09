package it.csi.stacore.staon.bo;

import java.io.Serializable;

import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.util.EqualsUtil;

public class TipoStatoPagamentoAvviso extends Decodifica implements Serializable {

	private static final long serialVersionUID = 2391207854183368423L;

	public static final TipoStatoPagamentoAvviso ERRORE = new TipoStatoPagamentoAvviso(new IdDecodifica(1),"01","ERRORE");
	public static final TipoStatoPagamentoAvviso CAMBIO_DI_PROPRIETA = new TipoStatoPagamentoAvviso(new IdDecodifica(2),"02","CAMBIO DI PROPRIETA");
	public static final TipoStatoPagamentoAvviso VARIATO = new TipoStatoPagamentoAvviso(new IdDecodifica(3),"03","VARIATO");
	public static final TipoStatoPagamentoAvviso TARDIVO = new TipoStatoPagamentoAvviso(new IdDecodifica(4),"04","TARDIVO");
	public static final TipoStatoPagamentoAvviso PAGATO = new TipoStatoPagamentoAvviso(new IdDecodifica(5),"05","PAGATO");

	public TipoStatoPagamentoAvviso(
			IdDecodifica idDecodifica, String codice,
			String descrizione
	) {
		super(idDecodifica, codice, descrizione);
	}

	public boolean equals(Object object) {
		boolean equals = false;

		if((object != null) && object instanceof TipoStatoPagamentoAvviso) {
			TipoStatoPagamentoAvviso altro = (TipoStatoPagamentoAvviso) object;
			equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
		}

		return equals;
	}

	public static boolean isStatoPagato(TipoStatoPagamentoAvviso statoPAgamentoAvviso){
		boolean result = false;
		if(statoPAgamentoAvviso != null && "05".equals(statoPAgamentoAvviso.getCodice()))
			result = true;
		return result;
	}

}
