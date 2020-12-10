package it.csi.stacore.staon.tools.ejbgenerator;



import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import it.csi.stacore.staon.interfacecsi.BusinessComponent;
import it.csi.stacore.staon.tools.AbstractGenerator;
import it.csi.stacore.staon.tools.ClassDiscovery;

public class GeneratorPaPdFiles extends AbstractGenerator {

	public GeneratorPaPdFiles(String baseSourceDir, String baseOutputDir) {
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
			new GeneratorPaPdFiles(sourceDir,destDir).generate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void generate() throws Exception {

		System.out.println("GENERATE");

		Class c[]=ClassDiscovery.listClassesByImplementedClass(baseSourceDir, BusinessComponent.class);
		for (Class currentClass:c){
			System.out.println("Genero gli ejb per "+currentClass.getName());
			generatePaPd(currentClass, currentClass.getName(), currentClass.getSimpleName());
		}
	}
	private void generatePaPd(Class c, String className, String simpleClassName) throws Exception {

		//Genero il bean
		Map<String, Object> model = createModel("interfaceClass",c);
		String ejbName = StringUtils.remove(c.getSimpleName(), "Interface");

		String outputFileNamePA="/META-INF/PAConfig/defPA_"+ejbName+".xml";
		generate("template_portaApplicativaComponents.xml.txt",model, outputFileNamePA);

		String outputFileNamePD="/META-INF/PAConfig/defPD_"+ejbName+".xml";
		generate("template_portaDelegataComponents.xml.txt",model, outputFileNamePD);

		///opt/java/projects/studiofontanelli/stacore-staon-prototype/staon-ejb/src/main/resources/META-INF/PAConfig/defPA_ServizioConsultazione.xml
	}
}
