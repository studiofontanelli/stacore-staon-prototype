package it.csi.stacore.staon.tools.ejbgenerator;



import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import it.csi.stacore.staon.interfacecsi.BusinessComponent;
import it.csi.stacore.staon.tools.AbstractGenerator;
import it.csi.stacore.staon.tools.ClassDiscovery;

public class GeneratorSoapEjbFiles extends AbstractGenerator {

	public GeneratorSoapEjbFiles(String baseSourceDir, String baseOutputDir) {
		super(baseSourceDir, baseOutputDir);
	}

	public static void main(String[] args) {
		if (args.length!=2)
		{
			System.err.println("Questo tool richiede 2 parametri. (directory dei sorgenti,directory di output)");
			System.exit(-1);
		}
		String sourceDir=args[0];
		String destDir=args[1];

		try {
			new GeneratorSoapEjbFiles(sourceDir,destDir).generate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void generate() throws Exception {

		System.out.println("GENERATE");

		Class c[]=ClassDiscovery.listClassesByImplementedClass(baseSourceDir, BusinessComponent.class);
		for (Class currentClass:c){
			System.out.println("Genero il file bridge soap Ejb per "+currentClass.getName());
			generateSoapEjb(currentClass);
		}
	}
	private void generateSoapEjb(Class c) throws Exception {
		//Genero il bean
		Map<String, Object> model = createModel("interfaceClass",c);
		String ejbName = StringUtils.remove(c.getSimpleName(), "Interface");

		String outputFileName="/WEB-INF/deploysoapejb-staon"+ ejbName+".xml";
		generate("template_WEB_deploysoapejb.xml.txt",model, outputFileName);




	}
}
