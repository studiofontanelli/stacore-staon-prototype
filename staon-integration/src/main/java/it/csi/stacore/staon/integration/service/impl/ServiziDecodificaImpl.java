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
import it.csi.stacore.staon.integration.exception.IntegrationException;
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

	public Connection getConnection() throws IntegrationException{
		final String method = "getConnection";
		try {
			return jdbcTemplate.getDataSource().getConnection();
		}
		catch(SQLException e) {
			Tracer.error(LOG, getClass().getName(), method, "SQLException " + e);
			throw new IntegrationException("Cannot get connection", e);
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
	public List<Regione> findRegione() throws IntegrationException {
		final String method = "findRegione";
		Connection connection = null;
		try{
			connection = getConnection();
			return decodificaDAO.findRegione(connection);
		}
		finally{
			releaseConnection(connection);
		}
	}

}
