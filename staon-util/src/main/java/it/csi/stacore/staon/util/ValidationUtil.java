package it.csi.stacore.staon.util;

/**
 * DOCUMENT ME!
 *
 * @author curtoni
 */
public class ValidationUtil {
	//~ Methods ==================================================================

	/**
	 * DOCUMENT ME!
	 *
	 * @param string DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public static boolean isEmpty(String string) {
		return ((string == null) || (string.length() == 0));
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param string DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public static boolean isLong(String string) {
		boolean bOK = false;

		try {
			Long l = new Long(string);

			if (l != null) {
				bOK = true;
			}
		} catch (Exception e) {
			bOK = false;
		}

		return bOK;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param string DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public static boolean isInteger(String string) {
		boolean bOK = false;

		try {
			Integer integer = new Integer(string);

			if (integer != null) {
				bOK = true;
			}
		} catch (Exception e) {
			bOK = false;
		}

		return bOK;
	}

	public static boolean verifyLength(String targa, int length) {
		if (targa != null) {
			if (targa.length() > length) {
				return false;
			}
		}
		return true;
	}
}
