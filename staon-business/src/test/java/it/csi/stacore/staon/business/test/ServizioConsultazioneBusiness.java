package it.csi.stacore.staon.business.test;

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
import it.csi.stacore.staon.interfacecsi.ServizioConsultazioneInterface;
import it.csi.stacore.staon.util.Tracer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/spring-business-junit.xml")
public class ServizioConsultazioneBusiness {

	protected final Logger LOG = LoggerFactory.getLogger(Constants.APPLICATION_NAME);


	@Autowired
	ServizioConsultazioneInterface servizioConsultazioneInterface;


	@Test
	public final void testResources() {
		final String method = "testResource";
		Tracer.debug(LOG, getClass().getName(), method, "BEGIN");
		try {
			boolean result = servizioConsultazioneInterface.testResources();




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
	public final void testFindRegione() {
		final String method = "testFindRegione";
		Tracer.debug(LOG, getClass().getName(), method, "BEGIN");
		try {
			RegioneDto[] result = servizioConsultazioneInterface.findRegione();




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
