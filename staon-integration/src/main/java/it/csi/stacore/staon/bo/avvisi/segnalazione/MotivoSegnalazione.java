package it.csi.stacore.staon.bo.avvisi.segnalazione;

import it.csi.stacore.staon.bo.Decodifica;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.util.EqualsUtil;

public class MotivoSegnalazione extends Decodifica {
    /**
	 *
	 */
	private static final long serialVersionUID = -2045033380818504240L;
	public static final int ID_MOTIVO_SEGNALAZIONE_PER_AVVISO = 1;

    public MotivoSegnalazione(IdDecodifica id, String descrizione) {
        super(id, descrizione);
    }

    public boolean equals(Object object) {
        boolean equals = false;

        if ((object != null) && object instanceof MotivoSegnalazione) {
            MotivoSegnalazione altro = (MotivoSegnalazione) object;
            equals = EqualsUtil.objectEquals(getId(), altro.getId());
        }

        return equals;
    }
}
