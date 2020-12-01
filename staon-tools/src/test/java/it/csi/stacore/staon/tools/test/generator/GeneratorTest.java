package it.csi.stacore.staon.tools.test.generator;


import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import it.csi.stacore.staon.tools.ejbgenerator.GeneratorComponentsBeans;



public class GeneratorTest {



	@Test
	public final void testGenerateComponents() {
		final String method = "testGenerateComponents";


		try {

			GeneratorComponentsBeans g=new GeneratorComponentsBeans(
					"/opt/java/projects/studiofontanelli/stacore-staon-prototype/staon-csi/src/main/java/",
					"/opt/java/projects/studiofontanelli/stacore-staon-prototype/staon-ejb/src/main/java/","online");
			g.generate();

			boolean result = true;

			System.out.println("OK");

			assertTrue(result);
		} catch (Exception e) {

			fail();
		}

	}

}
