package it.csi.stacore.staon.integration.service.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import it.csi.stacore.staon.bo.Regione;
import it.csi.stacore.staon.bo.id.IdRegione;
import it.csi.stacore.staon.etc.Constants;
import it.csi.stacore.staon.integration.dao.DecodificaDAO;
import it.csi.stacore.staon.integration.exception.ServiceException;
import it.csi.stacore.staon.integration.service.ServiziDecodifica;
import it.csi.stacore.staon.util.Tracer;
import it.csi.stacore.staon.util.XmlSerializer;

@Service("serviziDecodifica")
public class ServiziDecodificaImpl implements ServiziDecodifica {

	protected final static Logger LOG = LoggerFactory.getLogger(Constants.APPLICATION_NAME);

	@Autowired
	protected JdbcTemplate jdbcTemplate;

	@Autowired
	private DecodificaDAO decodificaDAO;

	public Connection getConnection() throws ServiceException{
		final String method = "getConnection";
		try {
			return jdbcTemplate.getDataSource().getConnection();
		}
		catch(SQLException e) {
			Tracer.error(LOG, getClass().getName(), method, "SQLException " + e);
			throw new ServiceException("Cannot get connection", e);
		}
	}

	public void releaseConnection(Connection conn){
		final String method = "releaseConnection";
		try {
			if(conn != null) {
				conn.close();
			}
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
		}
	}

	@Override
	public List<Regione> findRegione() throws ServiceException {

		final String method = "findRegione";
		Connection connection = null;
		try{
			connection = getConnection();
			List<Regione> minimmi = decodificaDAO.findRegione(connection);


			Tracer.debug(LOG,getClass().getName(), method, "minimmi\n " + XmlSerializer.objectToXml(minimmi));

			List<Regione> l = new ArrayList<Regione>();
			Regione r = new Regione(new IdRegione(13), "13", "Piemonte");
			l.add(r);
			Regione rr = new Regione(new IdRegione(1), "1", "Rocciamelone");
			l.add(rr);
			return l;
		}
		finally{
			Tracer.debug(LOG,getClass().getName(), method, "END");
			releaseConnection(connection);
		}



	}

}
/*


List returnList = new ArrayList();
ConnectionFactory connectionFactory = getConnectionFactory();
Connection conn = null;

try {
	conn = connectionFactory.getConnection();

	DecodificaDAO decodDAO = OracleDAOFactory.getInstance().getDecodificaDAO();
	returnList.addAll(decodDAO.findRegione(conn));
} catch (ResourceAccessException ex) {
	if (getLogger().isErrorEnabled()) {
		getLogger().error("ResourceAccessException findRegione: " + ex.getNestedExcClassName() + ":" + ex.getNestedExcMsg(), ex);
	}

	throw new ServiceException(CLASS_NAME + ".findRegione", ex);
} finally {
	connectionFactory.releaseConnection(conn);
}

return returnList;
 */