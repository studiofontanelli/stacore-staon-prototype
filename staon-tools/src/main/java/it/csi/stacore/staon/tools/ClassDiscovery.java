package it.csi.stacore.staon.tools;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;

public class ClassDiscovery {

	public static ArrayList<String> listJavaFiles(String sourceDirectoryRoot){



		System.out.println("listJavaFiles");
		ArrayList<String> files=new ArrayList<String>();
		ArrayList<String> returnValue=new ArrayList<String>();

		FilenameFilter filterJava = new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.endsWith(".java");
			}
		};

		listFiles(sourceDirectoryRoot,files,filterJava);
		//Tolgo il nome della directory radice
		Iterator it=files.iterator();
		while (it.hasNext()) {
			String name = (String) it.next();
			System.out.println("name= " + name);

			int lenght=sourceDirectoryRoot.length();
			if (!sourceDirectoryRoot.endsWith("/")) lenght++;
			returnValue.add(name.substring(lenght).replace("\\", ".").replace(".java", ""));
		}
		return returnValue;
	}

	public static ArrayList<String> listJavaFilesOfPackage(String sourceDirectoryRoot,String packageName)
	{

		ArrayList<String> returnValue=new ArrayList<String>();
		ArrayList<String> allJavaFiles=listJavaFiles(sourceDirectoryRoot);
		Iterator it=allJavaFiles.iterator();
		while (it.hasNext()) {
			String name = (String) it.next();
			if (name.startsWith(packageName))
			{
				returnValue.add(name);
			}
		}
		return returnValue;
	}


	public static ArrayList<String> listFilesWithExtension(String sourceDirectoryRoot,String extension)
	{
		ArrayList<String> files=new ArrayList<String>();
		ArrayList<String> returnValue=new ArrayList<String>();

		listFiles(sourceDirectoryRoot,files,new MyExtensionFilter(extension));
		//Tolgo il nome della directory radice
		Iterator it=files.iterator();
		while (it.hasNext()) {
			String name = (String) it.next();
			returnValue.add(name);
		}
		return returnValue;
	}

	private static void listFiles(String directoryName,ArrayList <String> currentList,FilenameFilter filter)
	{
		File dir = new File(directoryName);


		System.out.println("directoryName= " + directoryName);

		File[] children = dir.listFiles(filter);
		if (children == null) {
			// Either dir does not exist or is not a directory
		} else {
			for (int i=0; i<children.length; i++) {
				// Get filename of file or directory
				String filename = children[i].getName();
				currentList.add(children[i].getAbsolutePath());
			}
		}

		// This filter only returns directories
		FileFilter fileFilter = new FileFilter() {
			public boolean accept(File file) {
				return file.isDirectory();
			}
		};
		File[] directory = dir.listFiles(fileFilter);
		for (File currentDirectory:directory)
		{
			listFiles(currentDirectory.getAbsolutePath(),currentList,filter);
		}
	}


	public static Class[] listClasses(String directoryName)
	{
		ArrayList<Class> classes=new ArrayList<Class>();
		ArrayList<String> sources=listJavaFiles(directoryName);
		Iterator it=sources.iterator();
		while (it.hasNext()) {
			String name = (String) it.next();

			System.out.println("adding class= " + name);

			name=name.replaceAll("/", ".");
			//Escludo il package infrastructure
			if (name.indexOf("infrastructure")<0)
			{
				Class c=null;
				try {
					c = Class.forName(name);
					classes.add(c);
				} catch (Throwable e) {
					System.err.println("Errore nel caricamento della classe "+name);
				}
			}
			else {

			}
		}
		return (Class[])classes.toArray(new Class[0]);
	}


	public static Class[] listClassesByPackageName(String directoryName,String packageName)
	{
		ArrayList<Class> classes=new ArrayList<Class>();
		ArrayList<String> sources=listJavaFilesOfPackage(directoryName,packageName);
		Iterator it=sources.iterator();
		while (it.hasNext()) {
			String name = (String) it.next();
			name=name.replaceAll("/", ".");
			Class c=null;
			try {
				c = Class.forName(name);
				classes.add(c);
			} catch (Throwable e) {
				System.err.println("Errore nel caricamento della classe "+name);
			}
		}
		return (Class[])classes.toArray(new Class[0]);
	}



	public static Class[] listClassesByImplementedClass(String directoryName, Class interfaceClass ) throws Exception {

		try {


			System.out.println("directoryName= " + directoryName);
			System.out.println("interfaceClass= " + interfaceClass);


			ArrayList<Class> returnValue=new ArrayList<Class>();

			Class c[]=ClassDiscovery.listClasses(directoryName);

			for (Class x : c) {

				Class elencoInterfacceImplementate[] = x.getInterfaces();

				for (Class i : elencoInterfacceImplementate) {
					if (i==interfaceClass)
						returnValue.add(x);
					else
						System.out.println("skip= " + x);
				}
			}
			System.out.println("returnValue= " + returnValue);

			return (Class[])returnValue.toArray(new Class[0]);
		}
		catch(Exception e) {
			System.out.println("Exception= " + e);
			throw new Exception("Impossibile effettuare la list della class");
		}
	}

	public static Class[] listClassesThatInetithAClass(String directoryName,Class interfaceClass ){
		ArrayList<Class> returnValue=new ArrayList<Class>();

		Class c[]=ClassDiscovery.listClasses(directoryName);

		for (Class x:c)
		{
			Class tempc=x;
			while (tempc.getSuperclass()!=null && tempc.getSuperclass()!=interfaceClass )
			{
				tempc=tempc.getSuperclass();
			}
			if (tempc.getSuperclass()!=null){ // Ho trovato
				returnValue.add(x);
			}
		}
		return (Class[])returnValue.toArray(new Class[0]);
	}


}
class MyExtensionFilter implements FilenameFilter{
	String ext;
	public MyExtensionFilter(String extension)
	{
		this.ext=extension;
	}

	public boolean accept(File dir, String name) {
		return name.endsWith(ext);
	}
};