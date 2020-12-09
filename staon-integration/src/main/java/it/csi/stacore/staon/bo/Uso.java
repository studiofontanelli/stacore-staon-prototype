package it.csi.stacore.staon.bo;

import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.util.EqualsUtil;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class Uso
extends Decodifica
implements java.io.Serializable
{
    //~ Static fields/initializers /////////////////////////////////////////////////////////////////

    /**
     * DOCUMENT ME!
     */

    // static final long serialVersionUID = 6202223421824711616L;
    static final long serialVersionUID = -2793222863409529173L;

    //~ Constructors ///////////////////////////////////////////////////////////////////////////////

    /**
     * Creates a new Uso object.
     *
     * @param idDecodifica DOCUMENT ME!
     * @param codice DOCUMENT ME!
     * @param descrizione DOCUMENT ME!
     */
    public Uso(IdDecodifica idDecodifica,
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

        if((object != null) && object instanceof Uso)
        {
            Uso altro = (Uso) object;
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
