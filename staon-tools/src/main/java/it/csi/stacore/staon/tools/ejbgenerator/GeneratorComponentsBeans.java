package it.csi.stacore.staon.tools.ejbgenerator;



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
			generateSingleEjb(currentClass);
		}
		// c[1].getPackage().getName()
	}

	private void generateSingleEjb(Class c) throws Exception {

		//Genero il bean
		String outputFileNameBean="/"+c.getPackage().getName().replace(".", "/")+"/ejb/"+c.getSimpleName()+"Bean.java";
		generate("template_GeneratorComponentsBean.txt",createModel("interfaceClass",c), outputFileNameBean);
		//Genero la home
		String outputFileNameHome="/"+c.getPackage().getName().replace(".", "/")+"/ejb/"+c.getSimpleName()+"Home.java";
		generate("template_GeneratorComponentsHome.txt",createModel("interfaceClass",c), outputFileNameHome);
		//Genero la remote
		String outputFileNameRemote="/"+c.getPackage().getName().replace(".", "/")+"/ejb/"+c.getSimpleName()+"Remote.java";
		generate("template_GeneratorComponentsRemote.txt",createModel("interfaceClass",c), outputFileNameRemote);

		String outputFileNamePA="/"+c.getPackage().getName().replace(".", "/")+"/ejb/defPA_"+c.getSimpleName()+".xml";
		generate("template_portaApplicativaComponents.xml.txt",createModel("interfaceClass",c), outputFileNamePA);

		String outputFileNamePD="/"+c.getPackage().getName().replace(".", "/")+"/ejb/defPD_"+c.getSimpleName()+".xml";
		generate("template_portaDelegataComponents.xml.txt",createModel("interfaceClass",c), outputFileNamePD);

	}
}
