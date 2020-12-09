/*
 * Created on 4-apr-2006
 */
package it.csi.stacore.staon.integration.dao.oracle.query.select.agevolazione;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.AbstractSelectAbilitazioneDecodifica;



/**
 * @author Andrea Curtoni
 *
 * Query in OracleQueryList.xml: it.csi.stacore.staon.integration.oracle.query.select.agevolazione.SelectAbilitazioneAgevolazione
 */
public class SelectAbilitazioneAgevolazione extends AbstractSelectAbilitazioneDecodifica {

	/* (non-Javadoc)
	 * @see it.csi.stacore.staon.integration.oracle.query.select.decodifica.AbstractSelectAbilitazioneDecodifica#buildIdDecodifica(java.lang.Long)
	 */
	protected IdDecodifica buildIdDecodifica(TAURDEResultSet rs) throws SQLException {
		return new IdDecodifica(rs.getLong("ID_TIPO_AGEVOLAZIONE").longValue());
	}

}
