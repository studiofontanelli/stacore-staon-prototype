package it.csi.stacore.staon.tools.business;



import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import it.csi.stacore.staon.interfacecsi.BusinessComponent;
import it.csi.stacore.staon.tools.AbstractGenerator;
import it.csi.stacore.staon.tools.ClassDiscovery;

public class GeneratorBusinessModule extends AbstractGenerator {

	public GeneratorBusinessModule(String baseSourceDir, String baseOutputDir) {
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
			new GeneratorBusinessModule(sourceDir,destDir).generate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void generate() throws Exception {

		System.out.println("GENERATE");

		Class [] c =  ClassDiscovery.listClassesByImplementedClass(baseSourceDir, BusinessComponent.class);
		for (Class currentClass:c){
			System.out.println("Genero i servizi di business per "+currentClass.getName());
			generateService(currentClass);
		}
		generateSpringFile(c);
	}
	
	private void generateSpringFile(Class [] c) throws Exception {

		//Genero il bean
		Map<String, Object> model = createModel("services",c);
		String outputFileNameSpring="/src/main/resources/spring/spring-business.xml";
		generate("templateBusinessModuleSpring.txt",model, outputFileNameSpring);
		
		
	}
	
	private void generateService(Class c) throws Exception {

		//Genero il bean
		Map<String, Object> model = createModel("interfaceClass",c);
		
		String businessName = StringUtils.remove(c.getSimpleName(), "Interface");
		String businessPackage = StringUtils.replace(c.getPackage().getName(), "interfacecsi", "business").replace(".", "/");

		System.out.println("businessPackage= "+businessPackage);
		String outputFileNameInterface="/src/main/java/"+businessPackage+"/"+businessName+".java";
		System.out.println("outputFileNameInterface= "+outputFileNameInterface);
		generate("templateBusinessModuleInterface.txt",model, outputFileNameInterface);
	
	}
}
