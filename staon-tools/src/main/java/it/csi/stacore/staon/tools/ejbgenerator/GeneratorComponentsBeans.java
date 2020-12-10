package it.csi.stacore.staon.tools.ejbgenerator;



import java.util.Map;

import it.csi.stacore.staon.interfacecsi.BusinessComponent;
import it.csi.stacore.staon.tools.AbstractGenerator;
import it.csi.stacore.staon.tools.ClassDiscovery;

public class GeneratorComponentsBeans extends AbstractGenerator {

	public GeneratorComponentsBeans(String baseSourceDir, String baseOutputDir) {
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
			new GeneratorComponentsBeans(sourceDir,destDir).generate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void generate() throws Exception {

		System.out.println("GENERATE");

		Class c[]=ClassDiscovery.listClassesByImplementedClass(baseSourceDir, BusinessComponent.class);
		for (Class currentClass:c)
		{
			System.out.println("Genero gli ejb per "+currentClass.getName());
			generateSingleEjb(currentClass, currentClass.getName(), currentClass.getSimpleName());
		}
		// c[1].getPackage().getName()
	}

	private void generateSingleEjb(Class c, String className, String simpleClassName) throws Exception {

		//Genero il bean
		Map<String, Object> model = createModel("interfaceClass",c, className, simpleClassName);
		model.get("ejbName");

		String ejbName = (String)model.get("ejbName");


		String outputFileNameBean="/"+c.getPackage().getName().replace(".", "/")+"/ejb/"+ejbName+"Bean.java";
		generate("template_GeneratorComponentsBean.txt",model, outputFileNameBean);
		//Genero la home
		String outputFileNameHome="/"+c.getPackage().getName().replace(".", "/")+"/ejb/"+ejbName+"Home.java";
		generate("template_GeneratorComponentsHome.txt",model, outputFileNameHome);
		//Genero la remote
		String outputFileNameRemote="/"+c.getPackage().getName().replace(".", "/")+"/ejb/"+ejbName+"Remote.java";
		generate("template_GeneratorComponentsRemote.txt",model, outputFileNameRemote);

		String outputFileNamePA="/"+c.getPackage().getName().replace(".", "/")+"/ejb/defPA_"+ejbName+".xml";
		generate("template_portaApplicativaComponents.xml.txt",model, outputFileNamePA);

		String outputFileNamePD="/"+c.getPackage().getName().replace(".", "/")+"/ejb/defPD_"+ejbName+".xml";
		generate("template_portaDelegataComponents.xml.txt",model, outputFileNamePD);

	}

	private void generatePaPd(Class c, String className, String simpleClassName) throws Exception {

		//Genero il bean
		Map<String, Object> model = createModel("interfaceClass",c, className, simpleClassName);
		String ejbName = (String)model.get("ejbName");

		String outputFileNamePA="/"+c.getPackage().getName().replace(".", "/")+"/ejb/defPA_"+ejbName+".xml";
		generate("template_portaApplicativaComponents.xml.txt",model, outputFileNamePA);

		String outputFileNamePD="/"+c.getPackage().getName().replace(".", "/")+"/ejb/defPD_"+ejbName+".xml";
		generate("template_portaDelegataComponents.xml.txt",model, outputFileNamePD);

	}
}
