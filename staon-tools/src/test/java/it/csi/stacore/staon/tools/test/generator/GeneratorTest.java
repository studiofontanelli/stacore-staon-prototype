package it.csi.stacore.staon.tools.test.generator;


import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import it.csi.stacore.staon.tools.ejbgenerator.GeneratorComponentsBeans;
import it.csi.stacore.staon.tools.ejbgenerator.GeneratorEjbConfFiles;
import it.csi.stacore.staon.tools.ejbgenerator.GeneratorPaBrFiles;
import it.csi.stacore.staon.tools.ejbgenerator.GeneratorPaPdFiles;
import it.csi.stacore.staon.tools.ejbgenerator.GeneratorSoapEjbFiles;



public class GeneratorTest {



	@Test
	public final void testGenerateComponents() {
		final String method = "testGenerateComponents";
		try {

			/*
			final String sourcePath = "/opt/java/projects/studiofontanelli/stacore-staon-prototype/staon-csi/src/main/java/";
			final String targetEjbPath = "/opt/java/tmp/projects/studiofontanelli/stacore-staon-prototype/staon-ejb/src/main/java/";
			final String targetPaPdPath = "/opt/java/tmp/projects/studiofontanelli/stacore-staon-prototype/staon-ejb/src/main/resources/";
			final String targetWebPath = "/opt/java/tmp/projects/studiofontanelli/stacore-staon-prototype/staon-web-pabr/src/main/webapp/";
			*/

			final String rootSrcProject = "/opt/java/projects/studiofontanelli/stacore-staon-prototype";
			final String rootTargetProject = "/opt/java/projects/studiofontanelli/stacore-staon-prototype";


			final String sourcePath = rootSrcProject + "/staon-csi/src/main/java/";
			final String targetEjbPath = rootTargetProject + "/staon-ejb/src/main/java/";
			final String targetPaPdPath = rootTargetProject + "/staon-ejb/src/main/resources/";
			final String targetWebPath = rootTargetProject + "/staon-web-pabr/src/main/webapp/";


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

			GeneratorEjbConfFiles generatorEjbConfFiles = new GeneratorEjbConfFiles(
					sourcePath,
					targetPaPdPath);
			generatorEjbConfFiles.generate();

			System.out.println("Generator EJB JAR CONFIGURATION OK");


			GeneratorPaBrFiles generatorPaBrFiles = new GeneratorPaBrFiles(
					sourcePath,
					targetWebPath);
			generatorPaBrFiles.generate();

			System.out.println("Generator WEB CONFIGURATION OK");


			GeneratorSoapEjbFiles generatorSoapEjbFiles = new GeneratorSoapEjbFiles(
					sourcePath,
					targetWebPath);
			generatorSoapEjbFiles.generate();

			System.out.println("Generator SOAP EJB WEB CONFIGURATION OK");


			boolean result = true;

			System.out.println("OK");

			assertTrue(result);
		} catch (Exception e) {
			System.out.println("Exception " + e);
			fail();
		}

	}

}
