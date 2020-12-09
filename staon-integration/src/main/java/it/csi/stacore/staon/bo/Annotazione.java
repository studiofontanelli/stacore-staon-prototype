package it.csi.stacore.staon.bo;

import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.util.EqualsUtil;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class Annotazione
extends Decodifica
implements java.io.Serializable
{
    //~ Static fields/initializers /////////////////////////////////////////////////////////////////

    /**
     * DOCUMENT ME!
     */

    // static final long serialVersionUID = 629848041519664146L;
    static final long serialVersionUID = 2099703329522633235L;

    //~ Constructors ///////////////////////////////////////////////////////////////////////////////

    /**
     * Creates a new Annotazione object.
     *
     * @param idDecodifica DOCUMENT ME!
     * @param codice DOCUMENT ME!
     * @param descrizione DOCUMENT ME!
     */
    public Annotazione(IdDecodifica idDecodifica,
                       String       codice,
                       String       descrizione)
    {
        super(idDecodifica, codice, descrizione);
    }

    //~ Methods ////////////////////////////////////////////////////////////////////////////////////

    /**
     * DOCUMENT ME!
     *
     * @param object DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public boolean equals(Object object)
    {
        boolean equals = false;

        if((object != null) && object instanceof Annotazione)
        {
            Annotazione altro = (Annotazione) object;
            equals = EqualsUtil.objectEquals(getId(),
                                             altro.getId()) &&
                     EqualsUtil.objectEquals(getCodice(),
                                             altro.getCodice()) &&
                     EqualsUtil.objectEquals(getDescrizione(),
                                             altro.getDescrizione());
        }

        return equals;
    }
}
