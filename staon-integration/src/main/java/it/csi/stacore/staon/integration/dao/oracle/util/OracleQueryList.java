package it.csi.stacore.staon.integration.dao.oracle.util;

import java.io.InputStream;
import java.util.HashMap;

import org.apache.commons.digester3.Digester;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.csi.stacore.staon.etc.Constants;
import it.csi.stacore.staon.util.Tracer;




/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class OracleQueryList {

	protected final static Logger LOG = LoggerFactory.getLogger(Constants.APPLICATION_NAME);

	//~ Methods ==================================================================

	public Logger getLogger() {
		return LOG;
	}

	//~ Static fields/initializers ===============================================

	private static final String    ORACLEQUERYLIST_XML = "OracleQueryList.xml";
	private static OracleQueryList orclQuery = new OracleQueryList();

	//~ Instance fields ==========================================================

	/**
	 * @uml.property  name="queries"
	 * @uml.associationEnd  qualifier="name:java.lang.String it.csi.stacore.staon.integration.oracle.util.OracleQuery"
	 */
	private HashMap      queries  = new HashMap();
	/**
	 * @uml.property  name="filename"
	 */
	private final String filename;

	//~ Constructors =============================================================

	private OracleQueryList() {
		this(ORACLEQUERYLIST_XML);
	}

	private OracleQueryList(String filename) {
		this.filename = filename;
		getLogger().info("Istanziazione OracleQueryList dal file: "+this.filename);
		setup();
	}

	//~ Methods ==================================================================

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public static OracleQueryList getInstance() {
		if(orclQuery == null) {
			orclQuery = new OracleQueryList();
		}

		return orclQuery;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param filename DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public static OracleQueryList newInstance(String filename) {
		return new OracleQueryList(filename);
	}

	/**
	 * aggiunge una query
	 *
	 * @param query
	 */
	public void addQuery(OracleQuery query) {
		//    getLogger().info("Aggiunta query: "+query.getName());
		//    getLogger().debug("Aggiunta query: "+query.toString());
		queries.put(query.getName(), query);
	}

	/**
	 * restituisce una query
	 *
	 * @param name
	 *
	 * @return
	 */
	public OracleQuery getQuery(String name) {
		final String method = "getQuery";
		//getLogger().debug("Reperimento query: " + name + " in corso...");
		Tracer.debug(getLogger(), getClass().getName(), "getQuery", "Reperimento query: " + name + " in corso...");

		return (OracleQuery) queries.get(name);
	}

	/**
	 * recupera la lista delle query dal file di configurazione
	 */
	private void setup() {
		// Create a Digester instance
		Digester d = new Digester();
		d.setClassLoader(getClass().getClassLoader());

		// Prime the digester stack with an object for rules to
		// operate on. Note that it is quite common for "this"
		// to be the object pushed.
		d.push(this);

		// Add rules to the digester that will be triggered while
		// parsing occurs.
		d.addObjectCreate("list-query/query", OracleQuery.class);
		d.addSetProperties("list-query/query");

		d.addSetNext("list-query/query", "addQuery");
		d.addCallMethod("list-query/query", "setQuery", 0);

		d.addCallMethod("list-query/query/body", "setBody", 0);
		d.addCallMethod("list-query/query/body/field", "setFieldBody", 2);
		d.addCallParam("list-query/query/body/field", 0, "id");
		d.addCallParam("list-query/query/body/field", 1);

		d.addCallMethod("list-query/query/from", "setFrom", 0);
		d.addCallMethod("list-query/query/from/paramFrom", "setParamFrom", 2);
		d.addCallParam("list-query/query/from/paramFrom", 0, "id");
		d.addCallParam("list-query/query/from/paramFrom", 1);

		d.addCallMethod("list-query/query/where", "setWhere", 0);
		d.addCallMethod("list-query/query/where/paramWhere", "setParamWhere", 2);
		d.addCallParam("list-query/query/where/paramWhere", 0, "id");
		d.addCallParam("list-query/query/where/paramWhere", 1);

		d.addCallMethod("list-query/query/orderBy", "setOrderBy", 0);
		d.addCallMethod("list-query/query/orderBy/paramOrderBy", "setParamOrderBy", 2);
		d.addCallParam("list-query/query/orderBy/paramOrderBy", 0, "id");
		d.addCallParam("list-query/query/orderBy/paramOrderBy", 1);

		// Process the input file.
		try {
			InputStream input =
					this.getClass().getClassLoader().getResourceAsStream(filename);

			d.parse(input);
			getLogger().info("Caricamento file " + filename + " completato con successo.");
		} catch(java.io.IOException ioe) {
			getLogger().error("Error reading input file:" + ioe.getMessage());
		} catch(org.xml.sax.SAXException se) {
			getLogger().error("Error parsing input file:" + se.getMessage());
		}
	}


}
