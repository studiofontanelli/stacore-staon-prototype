package it.csi.stacore.staon.test.servizioconsultazione;

import org.junit.Test;

import it.csi.csi.porte.InfoPortaDelegata;
import it.csi.csi.porte.proxy.PDProxy;
import it.csi.csi.util.xml.PDConfigReader;
import it.csi.stacore.staon.interfacecsi.ServizioConsultazione;
import junit.framework.TestCase;

public class ServizioConsultazioneTestCase extends TestCase{

	private InfoPortaDelegata infoPortaDelegata = null;


	private ServizioConsultazione service;

	protected InfoPortaDelegata configuraPortaDelegata() throws Exception {
		String method = "configuraPortaDelegata";

		InfoPortaDelegata info = PDConfigReader.read("src/test/resources/pd/defPD_ServizioConsultazione.xml");
		InfoPortaDelegata[] infoPortaDelegataArray =  info.getPlugins();
		InfoPortaDelegata portaDelegata = infoPortaDelegataArray[0];

		//Tracer.info(logger, getClass().getName(), method, "urlPa= " + urlPa);
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
		try {
			System.out.println("setUp");
			//Log4jConfigurer.initLogging( "classpath:log4j.properties" );
			//loadProperties();
			infoPortaDelegata = configuraPortaDelegata();

			service = (ServizioConsultazione) PDProxy.newInstance(infoPortaDelegata);


			System.out.println("service load correctly");
		}
		catch(Exception e) {
			System.out.println("Exception " + e);
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
			//Tracer.error(LOG, getClass().getSimpleName(), method, "Exception: " + e);
			fail();
		}

	}

}
