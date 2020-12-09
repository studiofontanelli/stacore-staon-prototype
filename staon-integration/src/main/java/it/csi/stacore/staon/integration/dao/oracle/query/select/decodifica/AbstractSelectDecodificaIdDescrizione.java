/*
 * Created on 15-nov-2005
 */
package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.text.MessageFormat;

import it.csi.stacore.staon.bo.id.LongId;

/**
 * Classe utilizzata per le tabelle di decodifica composte solo
 * da id e descrizione.
 * Estende AbstractSelectDecodifica che invece si occupa di
 * tabelle di decodifica composte da id,codice e descrizione.
 *
 * @author mdferrua
 */
public abstract class AbstractSelectDecodificaIdDescrizione extends
		AbstractSelectDecodifica {
	protected static final String COMMON_QUERY = "SELECT {0} id, {1} descrizione FROM {2} ";

	/**
	 * Creates a new AbstractSelectDecodificaIdDescrizione object.
	 */
	protected AbstractSelectDecodificaIdDescrizione() {
		super();
	}

	/**
	 * Creates a new AbstractSelectDecodificaIdDescrizione object.
	 *
	 * @param id DOCUMENT ME!
	 */
	protected AbstractSelectDecodificaIdDescrizione(LongId id) {
		super(id);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param idName DOCUMENT ME!
	 * @param tableName DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	protected String getSQLStatement(String idName, String descName,
			String tableName) {
		String strRet = null;
		MessageFormat format = new MessageFormat(COMMON_QUERY);
		Object[] arguments = { idName, descName, tableName };
		strRet = format.format(arguments);
		strRet += getWhereCondition(idName);
		strRet += ORDER_BY;

		return strRet;
	}

}
