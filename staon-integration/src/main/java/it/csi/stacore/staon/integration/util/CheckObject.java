/*
 * Created on 20-gen-2005
 */
package it.csi.stacore.staon.integration.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.slf4j.Logger;

import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.util.DataFilter;



/**
 * DOCUMENT ME!
 *
 * @author apiccirilli
 */
public class CheckObject {
	//~ Static fields/initializers ===============================================

	/**
	 * DOCUMENT ME!
	 */
	public static String DESCRIZIONE_OGGETTO_NULLO = "";

	//~ Methods ==================================================================

	/**
	 * DOCUMENT ME!
	 *
	 * @param obj DOCUMENT ME!
	 * @param methodName DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public static String get(Object obj, String methodName) {
		String result = "";
		Method method = null;
		Class  c      = null;

		if(obj == null) {
			return DESCRIZIONE_OGGETTO_NULLO;
		}

		c = obj.getClass();

		try {
			method = c.getMethod(methodName, null);

			Object objFromMethod = method.invoke(obj, null);
			result = DataFilter.removeNull(objFromMethod);
		} catch(NoSuchMethodException e) {
			//getLogger().error(e);
		} catch(IllegalAccessException e) {
			//getLogger().error(e);
		} catch(InvocationTargetException e) {
			//getLogger().error(e);
		}

		return result;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param obj DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public static String getDescrizione(Object obj) {
		return get(obj, "getDescrizione");
	}

	/*
	 * Attenzione: questo metodo va chiamato solo su un oggetto custom che
	 * ha un metodo getData per l'appunto; non va chiamato per restituire una
	 * stringa da un oggetto java.util.Date
	 *
	 */
	public static String getData(Object obj) {
		return get(obj, "getData");
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param obj DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public static String getId(Object obj) {
		return get(obj, "toString");
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param obj DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public static String getIdDecodifica(Object obj) {
		String result = DESCRIZIONE_OGGETTO_NULLO;

		if(obj == null) {
			return DESCRIZIONE_OGGETTO_NULLO;
		}

		Class c = obj.getClass();

		try {
			Method       method       = c.getMethod("getId", null);
			IdDecodifica idDecodifica = (IdDecodifica) method.invoke(obj, null);

			if(idDecodifica != null) {
				result = DataFilter.removeNull(idDecodifica.toString());
			}
		} catch(NoSuchMethodException e) {
			//getLogger().error(e);
		} catch(IllegalAccessException e) {
			//getLogger().error(e);
		} catch(InvocationTargetException e) {
			//getLogger().error(e);
		}

		return result;
	}


}
