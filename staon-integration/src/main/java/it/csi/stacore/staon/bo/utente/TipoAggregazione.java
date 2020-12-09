/*
 * Created on 18-lug-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package it.csi.stacore.staon.bo.utente;

import it.csi.stacore.staon.bo.Decodifica;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.util.EqualsUtil;


/**
 * @author fguglielmelli
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class TipoAggregazione extends Decodifica implements java.io.Serializable {

	private static final long serialVersionUID = -8201636193539039195L;

	public final static TipoAggregazione PER_GESTORE_RID = new TipoAggregazione(
			new IdDecodifica(2), "2", "Per gestore RID");

	public TipoAggregazione(IdDecodifica idDecodifica, String codice,
			String descrizione) {
		super(idDecodifica, codice, descrizione);
	}

	public boolean equals(Object object) {
		boolean equals = false;
		if (object != null && object instanceof TipoAggregazione) {
			TipoAggregazione altro = (TipoAggregazione) object;
			equals = EqualsUtil.objectEquals(getId(), altro.getId())
					&& EqualsUtil.objectEquals(getCodice(), altro.getCodice())
					&& EqualsUtil.objectEquals(getDescrizione(), altro
							.getDescrizione());
		}
		return equals;
	}
}
