package it.csi.stacore.staon.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Log4jConfigurer;
import org.apache.commons.lang3.StringUtils;

import it.csi.csi.porte.InfoPortaDelegata;
import it.csi.csi.util.xml.PDConfigReader;
import it.csi.stacore.staon.etc.Constants;
import it.csi.stacore.staon.util.Tracer;
import junit.framework.TestCase;

public abstract class JunitService extends TestCase {

	protected final static Logger LOG = LoggerFactory.getLogger(Constants.APPLICATION_NAME);

	private final String junitFile      = "src/test/resources/junit.properties";
	private static final String URL_PA  = "@stacore.staon.pabr.server.prefix@";
	private Properties prop;

	private String urlPa;

	protected InfoPortaDelegata infoPortaDelegata = null;

	public abstract String getPdFile();

	protected InfoPortaDelegata configuraPortaDelegata() throws Exception {
		String method = "configuraPortaDelegata";
		InfoPortaDelegata info = PDConfigReader.read(getPdFile());
		Tracer.debug(LOG, getClass().getName(), method,"porta delegata= " + getPdFile());
		InfoPortaDelegata[] infoPortaDelegataArray =  info.getPlugins();
		InfoPortaDelegata portaDelegata = infoPortaDelegataArray[0];
		Tracer.info(LOG, getClass().getName(), method, "portaDelegata.getUrlPortaApplicativa()= " + portaDelegata.getUrlPortaApplicativa());
		String urlPortaApplicativa = StringUtils.replace(portaDelegata.getUrlPortaApplicativa(), URL_PA, urlPa);
		Tracer.info(LOG, getClass().getName(), method, "urlPortaApplicativa= " + urlPortaApplicativa);
		portaDelegata.setUrlPortaApplicativa(urlPortaApplicativa);
		return info;
	}


	protected void loadProperties() throws Exception {
		String method = "loadProperties";

		Tracer.debug(LOG, getClass().getName(), method, "loading properties");

		prop = new Properties();
		InputStream input = null;
		try {
			input = new FileInputStream(junitFile);
			prop.load(input);
			urlPa = prop.getProperty(URL_PA);
			Tracer.debug(LOG, getClass().getName(), method, URL_PA + "= " + urlPa);
			if(StringUtils.isBlank(urlPa))
				throw new Exception(URL_PA  + " is null");
		} catch (IOException ex) {
			Tracer.error(LOG, getClass().getName(), method, "loading IOException " + ex);
			throw new Exception(ex.getMessage());
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void setUp() throws Exception {

		Log4jConfigurer.initLogging( "classpath:log4j.properties" );
		loadProperties();
		infoPortaDelegata = configuraPortaDelegata();

	}

}
