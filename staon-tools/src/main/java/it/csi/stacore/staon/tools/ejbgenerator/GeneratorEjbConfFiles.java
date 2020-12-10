package it.csi.stacore.staon.tools.ejbgenerator;



import java.util.Map;

import it.csi.stacore.staon.interfacecsi.BusinessComponent;
import it.csi.stacore.staon.tools.AbstractGenerator;
import it.csi.stacore.staon.tools.ClassDiscovery;

public class GeneratorEjbConfFiles extends AbstractGenerator {

	public GeneratorEjbConfFiles(String baseSourceDir, String baseOutputDir) {
		super(baseSourceDir, baseOutputDir);
	}

	public static void main(String[] args) {
		if (args.length!=2)
		{
			System.err.println("Questo tool richiede 3 parametri. (directory dei sorgenti,directory di output)");
			System.exit(-1);
		}
		String sourceDir=args[0];
		String destDir=args[1];

		try {
			new GeneratorEjbConfFiles(sourceDir,destDir).generate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void generate() throws Exception {

		Class c[]=ClassDiscovery.listClassesByImplementedClass(baseSourceDir, BusinessComponent.class);
		Map m=createModel("classlist",c);
		generateEjbJar(m);
		//generateWebLogicEjbJar(m);
		//generateJbossEjbJar(m);
	}

	public void generateEjbJar(Map m) throws Exception
	{
		String outputFileNameHome="/META-INF/ejb-jar.xml";
		generate("template_ejb-jar-components.xml.txt",m, outputFileNameHome);
	}



}
