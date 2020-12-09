/*
 * Created on 13-nov-2006
 */
package it.csi.stacore.staon.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class PackageToAppName {

	private static PackageToAppName instance = null;

	private HashMap packageToAppNameMap = null;

	private static final String DEFAULT_APPNAME = "taurde";

	private PackageToAppName() {
		packageToAppNameMap = new HashMap();
//		packageToAppNameMap.put("it.csi.stacore.staon.integration.oracle.query.select.veicolo", "diretta");
		packageToAppNameMap.put("it.csi.stacore.staon", "staon");
		packageToAppNameMap.put("it.csi.stacore.stasrv", "stasrv");
		packageToAppNameMap.put("it.csi.stacore.staoff", "staoff");
		packageToAppNameMap.put("it.csi.staris.starison", "starison");
		packageToAppNameMap.put("it.csi.staris.starisws", "starisws");
		packageToAppNameMap.put("it.csi.stareg.starimon", "starimon");
		packageToAppNameMap.put("it.csi.stareg.staeseon", "staeseon");
		packageToAppNameMap.put("it.csi.stareg.staginon", "staginon");
		packageToAppNameMap.put("it.csi.stages.stageson", "stageson");
		packageToAppNameMap.put("it.csi.stasp.starivon", "starivon");
	}

	public static PackageToAppName getInstance() {
		if (instance == null) {
			instance = new PackageToAppName();
		}

		return instance;
	}

	public String getAppNameFromPackage(String packageName) {
		String appName = DEFAULT_APPNAME;

		Set keys = packageToAppNameMap.keySet();
		int lenKey = 0;
		for (Iterator iter = keys.iterator(); iter.hasNext();) {
			String key = (String) iter.next();
			if (packageName.startsWith(key) && key.length() > lenKey) {
				lenKey = key.length();
				appName = (String) packageToAppNameMap.get(key);
			}
		}

		return appName;
	}

	//	public static void main(String[] args) {
	//		String name = "it.csi.staris.starisws.ciao";
	//		System.out.println(name);
	//		System.out.println(PackageToAppName.getInstance().getAppNameFromPackage(name));
	//	}
}
