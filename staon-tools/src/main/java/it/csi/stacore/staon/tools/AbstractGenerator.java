package it.csi.stacore.staon.tools;

import java.io.File;
import java.io.FileWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;

public abstract class AbstractGenerator {


	protected String baseSourceDir;
	protected String baseOutputDir;




	public AbstractGenerator(String baseSourceDir, String baseOutputDir) {
		super();
		this.baseSourceDir = baseSourceDir;
		this.baseOutputDir = baseOutputDir;

	}


	/*
	 * Metodo che ritorna una mappa contenente oltre agli oggetti
	 * di default disponibili per tutti i generatori il modello
	 * specializzato per ogni generatore
	 */
	protected Map createModel(String modelKey, Object model) {
		Map freeMarkerModel=new HashMap<String, Object>();
		freeMarkerModel.put(modelKey, model);


		return freeMarkerModel;
	}

	public abstract void generate() throws Exception;

	protected void generate(String templateName, Map rootModel, String outputFileName) throws Exception {
		Configuration cfg = new Configuration();
		cfg.setClassForTemplateLoading(this.getClass(), "");
		//cfg.setDirectoryForTemplateLoading(new File(baseTemplateDir));
		cfg.setObjectWrapper(new DefaultObjectWrapper());

		Template temp = cfg.getTemplate(templateName);

		String fileName;
		if (baseOutputDir.endsWith("/")|| baseOutputDir.endsWith("\\"))
			fileName=baseOutputDir+outputFileName;
		else
			fileName=baseOutputDir+"/"+outputFileName;
		File f=generateFileAndDir(fileName);

		FileWriter fw=new FileWriter(f);
		System.out.println("Genero il file "+f.getAbsolutePath());
		temp.process(rootModel, fw);
		fw.flush();
		fw.close();
	}

	private File generateFileAndDir(String fileName){
		String fileDir=fileName.substring(0, fileName.lastIndexOf("/"));
		File dir=new File(fileDir);
		dir.mkdirs();
		File f=new File(fileName);
		return f;
	}

	/**
	 * list Classes inside a given package
	 * @author Jon Peck http://jonpeck.com (adapted from http://www.javaworld.com/javaworld/javatips/jw-javatip113.html)
	 * @param pckgname String name of a Package, EG "java.lang"
	 * @return Class[] classes inside the root of the given package
	 * @throws ClassNotFoundException if the Package is invalid
	 */
	public static Class[] getClasses(String pckgname) throws ClassNotFoundException {
		ArrayList classes=new ArrayList();
		// Get a File object for the package
		File directory=null;

		try {
			String resourceName='/'+pckgname.replace('.', '/');
			URL current = Thread.currentThread().getContextClassLoader().getResource(resourceName);
			directory=new File(current.getFile());
		} catch(NullPointerException x) {
			throw new ClassNotFoundException(pckgname+" does not appear to be a valid package");
		}

		if(directory.exists()) {
			// Get the list of the files contained in the package
			String[] files=directory.list();
			for(int i=0; i<files.length; i++) {
				// we are only interested in .class files
				if(files[i].endsWith(".class")) {
					// removes the .class extension
					classes.add(Class.forName(pckgname+'.'+files[i].substring(0, files[i].length()-6)));
				}
			}
		} else {
			throw new ClassNotFoundException(pckgname+" does not appear to be a valid package");
		}

		Class[] classesA=new Class[classes.size()];
		classes.toArray(classesA);
		return classesA;
	}


	public String getBaseSourceDir() {
		return baseSourceDir;
	}


	public void setBaseSourceDir(String baseSourceDir) {
		this.baseSourceDir = baseSourceDir;
	}


	public String getBaseOutputDir() {
		return baseOutputDir;
	}


	public void setBaseOutputDir(String baseOutputDir) {
		this.baseOutputDir = baseOutputDir;
	}





}
