package it.csi.stacore.staon.tools.ejbgenerator;



import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import it.csi.stacore.staon.interfacecsi.BusinessComponent;
import it.csi.stacore.staon.tools.AbstractGenerator;
import it.csi.stacore.staon.tools.ClassDiscovery;

public class GeneratorPaBrFiles extends AbstractGenerator {

	public GeneratorPaBrFiles(String baseSourceDir, String baseOutputDir) {
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
			new GeneratorPaBrFiles(sourceDir,destDir).generate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void generate() throws Exception {
		Class c[]=ClassDiscovery.listClassesByImplementedClass(baseSourceDir, BusinessComponent.class);
		Map m=createModel("classlist",c);
		generateWeb(m);
	}

	public void generateWeb(Map m) throws Exception{
		String outputFileName="/WEB-INF/web.xml";
		generate("template_WEB-INF_PaBr.xml.txt",m, outputFileName);
	}




}
