package it.csi.stacore.staon.util;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.regex.Pattern;

//import org.apache.oro.text.regex.MalformedPatternException;
//import org.apache.oro.text.regex.Perl5Compiler;
//import org.apache.oro.text.regex.Perl5Matcher;

public class NumberUtil {
	//~ Static fields/initializers ===============================================

	private static NumberFormat nf = NumberFormat.getInstance();

	//    static private String NUMBER_EXPRESSION = "[0-9]*([\\.,]?[0-9]+)";

	/*
	 * Espressione aggiornata per matchare solo le prime due cifre dopo la virgola
	 *
	 * Esempi:
	 * - validi: "0" ; "2" ; "1,0" ; "1.20" ; "0123" ;
	 * - non validi: "1," ; "1.200" ; "1.2.3"
	 */
	private static String NUMBER_EXPRESSION = "[-]{0,1}[0-9]+([,.]{1}[0-9]{1,2}){0,1}";

	//~ Methods ==================================================================

	/**
	 * DOCUMENT ME!
	 *
	 * @param textInput DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public static BigDecimal decodeBigDecimalFromTextInput(String textInput) {
		//      NumberFormat df=new DecimalFormat(DECIMAL_FORMAT);
		//
		//      df.parse(textInput);
		BigDecimal result = null;

		if ((textInput != null) && isNumber(textInput)) {
			String decimalString = textInput.replace(',', '.');

			result = new BigDecimal(decimalString);
		}

		return result;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param arg DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public static boolean isNumber(String arg) {
		/*
		if (arg == null) return false;

		boolean result = false;
		try {
			// verifico che contenga solo numeri
			Perl5Compiler compiler = new Perl5Compiler();
			Pattern pattern = null;

			try {
				pattern = compiler.compile(NUMBER_EXPRESSION);
			} catch (MalformedPatternException e) {
				e.printStackTrace();
			}

			Perl5Matcher matcher = new Perl5Matcher();

			if (matcher.matches(arg, pattern)) {
				Number number = nf.parse(arg);
				result = true;
				getLogger().debug("number is " + number.toString());
			} else {
				getLogger().debug("la stringa >>" + arg + "<< non � un numero");
			}
		} catch (ParseException pe) {
			getLogger().debug("la stringa >>" + arg + "<< non � un numero");
		}

		return result;
		*/
		return true;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param bigDecimal DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public static String format(BigDecimal bigDecimal) {
//		 TODO [Ivano Canella] Vedere se modificare il nome del metodo in formatEuroCent
		String result = null;

		if (bigDecimal == null) {
			result = "";
		} else {
			// Corretto per supportare il Locale Italiano
			NumberFormat df = NumberFormat.getNumberInstance(Locale.ITALIAN);
			df.setGroupingUsed(false);
			df.setMinimumFractionDigits(2);

			BigDecimal scaledBigDecimal = new BigDecimal(bigDecimal.unscaledValue(), 2);

			result = df.format(scaledBigDecimal);
		}

		return result;
	}


	public static String format(BigDecimal bigDecimal, int numeroDecimali, boolean separatoreMigliaia) {
//		 TODO [Ivano Canella] Vedere se modificare il nome del metodo in formatEuroCent
		String result = null;

		if (bigDecimal == null) {
			result = "";
		} else {
			// Corretto per supportare il Locale Italiano
			NumberFormat df = NumberFormat.getNumberInstance(Locale.ITALIAN);
			df.setGroupingUsed(separatoreMigliaia);
			df.setMinimumFractionDigits(numeroDecimali);

			BigDecimal scaledBigDecimal = new BigDecimal(bigDecimal.unscaledValue(), numeroDecimali);

			result = df.format(scaledBigDecimal);
		}

		return result;
	}



}