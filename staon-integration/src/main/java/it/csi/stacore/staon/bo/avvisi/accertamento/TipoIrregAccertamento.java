/*
 * Created on 20-lug-2006
 */
package it.csi.stacore.staon.bo.avvisi.accertamento;

import it.csi.stacore.staon.bo.Decodifica;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.util.EqualsUtil;

public class TipoIrregAccertamento extends Decodifica {

	private static final long serialVersionUID = 1232132321121L;

	public TipoIrregAccertamento(IdDecodifica id, String codice, String descrizione) {
		super(id, codice, descrizione);
	}

  public boolean equals(Object object) {
    boolean equals = false;

    if((object != null) && object instanceof TipoIrregAccertamento) {
    	TipoIrregAccertamento altro = (TipoIrregAccertamento) object;
      equals = EqualsUtil.objectEquals(getId(), altro.getId());
    }

    return equals;
  }

  public boolean isVersamentoMancante() {
  	return getCodice().equals("VM");
  }

  public boolean isVersamentoInsuff() {
  	return getCodice().equals("TI");
  }

  public boolean isVersamentoInsuffRitardato() {
  	return getCodice().equals("TE");
  }

  public boolean isVersamentoRitardato() {
  	return getCodice().equals("TR");
  }
}
