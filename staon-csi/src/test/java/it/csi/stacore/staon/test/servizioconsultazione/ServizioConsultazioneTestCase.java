package it.csi.stacore.staon.test.servizioconsultazione;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.csi.csi.porte.InfoPortaDelegata;
import it.csi.csi.porte.proxy.PDProxy;
import it.csi.csi.util.xml.PDConfigReader;
import it.csi.stacore.staon.dto.RegioneDto;
import it.csi.stacore.staon.etc.Constants;
import it.csi.stacore.staon.interfacecsi.ServizioConsultazioneInterface;
import it.csi.stacore.staon.util.Tracer;
import it.csi.stacore.staon.util.XmlSerializer;
import junit.framework.TestCase;

public class ServizioConsultazioneTestCase extends TestCase {


	protected final static Logger LOG = LoggerFactory.getLogger(Constants.APPLICATION_NAME);

	private InfoPortaDelegata infoPortaDelegata = null;


	private ServizioConsultazioneInterface service;

	protected InfoPortaDelegata configuraPortaDelegata() throws Exception {
		String method = "configuraPortaDelegata";

		InfoPortaDelegata info = PDConfigReader.read("src/test/resources/pd/defPD_ServizioConsultazione.xml");
		InfoPortaDelegata[] infoPortaDelegataArray =  info.getPlugins();
		InfoPortaDelegata portaDelegata = infoPortaDelegataArray[0];


		//Tracer.info(logger, getClass().getName(), method, "portaDelegata.getUrlPortaApplicativa()= " + portaDelegata.getUrlPortaApplicativa());

		//String urlPortaApplicativa = StringUtils.replace(portaDelegata.getUrlPortaApplicativa(), URL_PA, urlPa);

		//Tracer.info(logger, getClass().getName(), method, "urlPortaApplicativa= " + urlPortaApplicativa);

		//portaDelegata.setUrlPortaApplicativa(urlPortaApplicativa);


		return info;
	}

	/*
	 * (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	public void setUp() throws Exception {
		final String method = "setUp";
		try {
			System.out.println("setUp");
			//Log4jConfigurer.initLogging( "classpath:log4j.properties" );
			//loadProperties();
			infoPortaDelegata = configuraPortaDelegata();

			service = (ServizioConsultazioneInterface) PDProxy.newInstance(infoPortaDelegata);

			Tracer.info(LOG, getClass().getName(), method, "service load correctly");
			System.out.println("service load correctly");
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw e;
		}


	}


	@Test
	public final void testResources() {
		final String method = "testResources";
		try {
			boolean result = service.testResources();

			assertTrue(result);
		} catch (Exception e) {
			//LOG.error("", e);
			Tracer.error(LOG, getClass().getSimpleName(), method, "Exception: " + e);
			fail();
		}
	}

	@Test
	public final void testFindRegione() {
		final String method = "findRegione";
		try {
			RegioneDto[] result = service.findRegione();

			Tracer.info(LOG, getClass().getSimpleName(), method, "result\n " + XmlSerializer.objectToXml(result));
			assertNotNull(result);
		} catch (Exception e) {

			Tracer.error(LOG, getClass().getSimpleName(), method, "Exception: " + e);
			fail();
		}
	}

}
