package it.csi.stacore.staon.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import it.csi.stacore.staon.dto.RegioneDto;
import it.csi.stacore.staon.etc.Constants;
import it.csi.stacore.staon.util.Tracer;
import it.csi.stacore.staon.util.XmlSerializer;
import it.csi.stacore.staon.ws.ServizioConsultazioneWs;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/spring-web-ws-junit.xml")
public class ServizioConsultazioneTestCase {

	protected final Logger LOG = LoggerFactory.getLogger(Constants.APPLICATION_NAME);
	
	@Autowired
	private ServizioConsultazioneWs servizioConsultazione;
	
	@Test
	public final void testResources() throws Exception{
		final String method = "testResources";
		Tracer.debug(LOG, getClass().getName(), method, "BEGIN");
		try {
			boolean result = servizioConsultazione.testResources();
			assertTrue(result);
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getSimpleName(), method, "Exception: " + e);
			fail();
		}
		finally {
			Tracer.debug(LOG, getClass().getName(), method, "END");
		}
	}
	
	@Test
	public final void findRegione() throws Exception{
		final String method = "findRegione";
		Tracer.debug(LOG, getClass().getName(), method, "BEGIN");
		try {
			RegioneDto [] result= servizioConsultazione.findRegione();
			Tracer.debug(LOG, getClass().getName(), method, "result\n " + XmlSerializer.objectToXml(result));
			assertNotNull(result);
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getSimpleName(), method, "Exception: " + e);
			fail();
		}
		finally {
			Tracer.debug(LOG, getClass().getName(), method, "END");
		}
	}
}
