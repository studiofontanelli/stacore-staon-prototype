package it.csi.stacore.staon.tools.ws;



import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import it.csi.stacore.staon.interfacecsi.BusinessComponent;
import it.csi.stacore.staon.tools.AbstractGenerator;
import it.csi.stacore.staon.tools.ClassDiscovery;

public class GeneratorWsModule extends AbstractGenerator {

	public GeneratorWsModule(String baseSourceDir, String baseOutputDir) {
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
			new GeneratorWsModule(sourceDir,destDir).generate();
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
		
		//String wsName = StringUtils.remove(c.getSimpleName(), "Interface");
		//String wsPackage = StringUtils.replace(c.getPackage().getName(), "interfacecsi", "ws").replace(".", "/");

		//System.out.println("wsPackage= "+wsPackage);

		String outputFileNameSpring="/src/main/resources/spring/spring-web-ws.xml";

		generate("templateWsModuleSpring.txt",model, outputFileNameSpring);
		
		
		
		
		

	}
	
	private void generateService(Class c) throws Exception {

		//Genero il bean
		Map<String, Object> model = createModel("interfaceClass",c);
		
		String wsName = StringUtils.remove(c.getSimpleName(), "Interface");
		String wsPackage = StringUtils.replace(c.getPackage().getName(), "interfacecsi", "ws").replace(".", "/");


		System.out.println("wsPackage= "+wsPackage);

		String outputFileNameInterface="/src/main/java/"+wsPackage+"/"+wsName+"Ws.java";
		String outputFileNameClass="/src/main/java/"+wsPackage+"/impl/"+wsName+"WsImpl.java";
		String outputFileNameSpring="/src/main/resources/spring/spring-web-ws.xml";

		System.out.println("outputFileNameInterface= "+outputFileNameInterface);
		System.out.println("outputFileNameClass= "+outputFileNameClass);

		generate("templateWsModuleInterface.txt",model, outputFileNameInterface);
		generate("templateWsModuleClass.txt",model, outputFileNameClass);
		//generate("templateWsModuleSpring.txt",model, outputFileNameSpring);
		
		
		
		
		

	}
}
