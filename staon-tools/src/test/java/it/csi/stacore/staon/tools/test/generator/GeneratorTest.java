package it.csi.stacore.staon.tools.test.generator;


import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import it.csi.stacore.staon.tools.ejbgenerator.GeneratorComponentsBeans;
import it.csi.stacore.staon.tools.ejbgenerator.GeneratorPaPdFiles;



public class GeneratorTest {



	@Test
	public final void testGenerateComponents() {
		final String method = "testGenerateComponents";


		try {


			final String sourcePath = "/opt/java/projects/studiofontanelli/stacore-staon-prototype/staon-csi/src/main/java/";
			final String targetEjbPath = "/opt/java/tmp/projects/studiofontanelli/stacore-staon-prototype/staon-ejb/src/main/java/";
			final String targetPaPdPath = "/opt/java/tmp/projects/studiofontanelli/stacore-staon-prototype/staon-ejb/src/main/resources/";

			/*
			GeneratorComponentsBeans g=new GeneratorComponentsBeans(
					"/opt/java/projects/studiofontanelli/stacore-staon-prototype/staon-csi/src/main/java/",
					"/opt/java/projects/studiofontanelli/stacore-staon-prototype/staon-ejb/src/main/java/");
			g.generate();
			*/

			GeneratorComponentsBeans g=new GeneratorComponentsBeans(
					sourcePath,
					targetEjbPath);
			g.generate();


			System.out.println("Generator EJB COMPONENTS OK");

			GeneratorPaPdFiles generatorPaPd = new GeneratorPaPdFiles(
					sourcePath,
					targetPaPdPath);
			generatorPaPd.generate();



			System.out.println("Generator PA PD CONFIGURATION OK");


			boolean result = true;

			System.out.println("OK");

			assertTrue(result);
		} catch (Exception e) {

			fail();
		}

	}

}
