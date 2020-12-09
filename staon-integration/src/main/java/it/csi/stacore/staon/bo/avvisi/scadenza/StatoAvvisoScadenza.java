package it.csi.stacore.staon.bo.avvisi.scadenza;

import it.csi.stacore.staon.bo.Decodifica;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.util.EqualsUtil;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class StatoAvvisoScadenza extends Decodifica {


	public static StatoAvvisoScadenza STATO_CREATO = new StatoAvvisoScadenza(new IdDecodifica(1),"CREATO");
	public static StatoAvvisoScadenza STATO_ESTRATTO = new StatoAvvisoScadenza(new IdDecodifica(2),"ESTRATTO");
	public static StatoAvvisoScadenza STATO_CHIUSO = new StatoAvvisoScadenza(new IdDecodifica(3),"CHIUSO ");

  /**
	 *
	 */
	private static final long serialVersionUID = -3498298756830901174L;

/**
   * Creates a new Stato object.
   *
   * @param id DOCUMENT ME!
   * @param codice DOCUMENT ME!
   * @param descrizione DOCUMENT ME!
   */
  public StatoAvvisoScadenza(IdDecodifica id, String descrizione) {
    super(id, descrizione);
  }

  //~ Methods ==================================================================

  /**
   * DOCUMENT ME!
   *
   * @param object DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean equals(Object object) {
    boolean equals = false;

    if((object != null) && object instanceof StatoAvvisoScadenza) {
      StatoAvvisoScadenza altro = (StatoAvvisoScadenza) object;
      equals = EqualsUtil.objectEquals(getId(), altro.getId());
    }

    return equals;
  }
}
