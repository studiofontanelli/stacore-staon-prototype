package it.csi.stacore.staon.integration.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.csi.stacore.staon.bo.Mese;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.etc.Constants;
import it.csi.stacore.staon.util.DateUtil;


public class CalcoloDateUtil implements java.io.Serializable {
	private static final long serialVersionUID = 1674623737L;


	protected final static Logger LOG = LoggerFactory.getLogger(Constants.APPLICATION_NAME);


	static int ONE_HOUR = 60 * 60 * 1000;

	public static int calcoloNumeroMesiBis(Date primaData, Date ultimaData) {
		int result = -1;
		Calendar cal0 = Calendar.getInstance();
		Calendar cal1 = Calendar.getInstance();
		cal0.setTime(primaData);
		cal1.setTime(ultimaData);

		int anno0 = cal0.get(Calendar.YEAR);
		int mese0 = cal0.get(Calendar.MONTH);
		//		int giorno0 = cal0.get(Calendar.DAY_OF_MONTH);

		int anno1 = cal1.get(Calendar.YEAR);
		int mese1 = cal1.get(Calendar.MONTH);
		//		int giorno1 = cal1.get(Calendar.DAY_OF_MONTH);

		result = mese1 - mese0 + (anno1 - anno0) * 12;
		getLogger().debug("primaData " + DateUtil.format(primaData));
		getLogger().debug("ultimaData " + DateUtil.format(ultimaData));
		getLogger().debug("Numero mesi BIS " + result);

		return result;
	}

	public static int calcoloNumeroMesi(Date primaData, Date ultimaData) {
		int result = -1;
		long millis;
		millis = ultimaData.getTime() - primaData.getTime();

		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date(millis));

		result = cal.get(Calendar.MONTH) + (12 * (cal.get(Calendar.YEAR) - 1970));

		return result;
	}

	//	public static final int getMonthLapse(Date primaData, Date ultimaData) {
	//		Calendar calStart = Calendar.getInstance();
	//		Calendar calEnd = Calendar.getInstance();
	//
	//		calStart.setTime(primaData);
	//		calEnd.setTime(ultimaData);
	//
	//		// convert endDate to be exclusive, but remember original endOrgDate
	//		calEnd = (GregorianCalendar) calEnd.clone();
	//		calEnd.add(Calendar.DAY_OF_YEAR, 1);
	//
	//		int count = 0;
	//		Calendar tmpCal;
	//		do {
	//			tmpCal = (Calendar) calStart.clone();
	//			++count;
	//			int orgDay = tmpCal.get(GregorianCalendar.DAY_OF_MONTH);
	//			tmpCal.add(GregorianCalendar.MONTH, count);
	//			int newDay = tmpCal.get(GregorianCalendar.DAY_OF_MONTH);
	//			if (newDay < orgDay) tmpCal.add(GregorianCalendar.DAY_OF_YEAR, 1);
	//		} while (tmpCal.before(calEnd) || tmpCal.equals(calEnd));
	//
	//		int result = count - 1;
	//
	//		return result;
	//	}

	public static Date addYearsToDate(Date data, int numberOfYears) {
		Date future = null;
		int year;

		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		if(cal.get(Calendar.DAY_OF_MONTH)==29 && cal.get(Calendar.MONTH)==Calendar.FEBRUARY){
			cal.set(Calendar.DAY_OF_MONTH, 28);
		}
		year = cal.get(Calendar.YEAR);
		year = year + numberOfYears;
		cal.set(Calendar.YEAR, year);
		future = cal.getTime();
		return future;
	}

	public static Date addMonthsToDate(Date data, int numberOfMonths) {
		Date newDate = null;

		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH, numberOfMonths);
		newDate = cal.getTime();

		return newDate;
	}

	public static Date addDaysToDate(Date data, int numberOfDays) {
		Date newDate = null;

		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.DAY_OF_MONTH, numberOfDays);
		newDate = cal.getTime();

		return newDate;
	}


	public static boolean compareYear(Date data1, Date data2) {
		boolean result = false;
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();

		cal1.setTime(data1);
		cal2.setTime(data2);

		if (cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)) {
			result = true;
		}

		return result;
	}

	public static boolean compareMonthAndYear(Date data1, Date data2) {
		boolean result = false;
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();

		cal1.setTime(data1);
		cal2.setTime(data2);

		if (cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)) {
			if (cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH)) {
				result = true;
			}
		}

		return result;
	}

	public static boolean compareDayMonthAndYear(Date data1, Date data2) {
		boolean result = false;
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();

		cal1.setTime(data1);
		cal2.setTime(data2);

		if (cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)) {
			if (cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH)) {
				if (cal1.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH)) {
					result = true;
				}
			}
		}

		return result;
	}

	public static boolean isGratherThan(Date data, Date riferimento) {
		boolean result = false;
		long lData;
		long lRiferimento;

		lData = setOraZero(data).getTime();
		lRiferimento = setOraZero(riferimento).getTime();

		if (lData > lRiferimento) {
			result = true;
		}

		return result;
	}

	public static boolean isGratherEqualsThan(Date data, Date riferimento) {
		boolean result = false;
		long lData;
		long lRiferimento;

		lData = setOraZero(data).getTime();
		lRiferimento = setOraZero(riferimento).getTime();

		if (lData >= lRiferimento) {
			result = true;
		}

		return result;
	}

	public static boolean isLessThan(Date data, Date riferimento) {
		boolean result = false;
		long lData;
		long lRiferimento;

		lData = setOraZero(data).getTime();
		lRiferimento = setOraZero(riferimento).getTime();

		if (lData < lRiferimento) {
			result = true;
		}

		return result;
	}

	public static boolean isLessEqualsThan(Date data, Date riferimento) {
		boolean result = false;
		long lData;
		long lRiferimento;

		lData = setOraZero(data).getTime();
		lRiferimento = setOraZero(riferimento).getTime();

		if (lData <= lRiferimento) {
			result = true;
		}

		return result;
	}

	public static boolean isGratherEqualAndLessEqual(Date myDate, Date lowerDate, Date upperDate) {
		boolean result = false;

		boolean r1 = false;
		boolean r2 = false;

		r1 = isLessEqualsThan(myDate, upperDate);
		r2 = isGratherEqualsThan(myDate, lowerDate);

		if (r1 && r2) {
			result = true;
		}

		return result;
	}

	public static int calcoloNumeroSemestri(Date primaData, Date ultimaData) {
		int result = -1;
		result = calcoloNumeroMesi(primaData, ultimaData);

		return result / 6;
	}

	public static int calcoloNumeroGiorni(Date dataInizio, Date dataFine) {
		int result = -1;
		long calc = -1;

		Calendar inizio = Calendar.getInstance();
		inizio.setTime(dataInizio);


		Calendar fine = Calendar.getInstance();
		fine.setTime(dataFine);

		inizio.set(Calendar.AM_PM, Calendar.AM);
		inizio.set(Calendar.HOUR, 0);
		inizio.set(Calendar.MINUTE, 0);
		inizio.set(Calendar.SECOND, 0);
		inizio.set(Calendar.MILLISECOND, 0);

		fine.set(Calendar.AM_PM, Calendar.AM);
		fine.set(Calendar.HOUR, 0);
		fine.set(Calendar.MINUTE, 0);
		fine.set(Calendar.SECOND, 0);
		fine.set(Calendar.MILLISECOND, 0);

		getLogger().debug("Inizio " + inizio.getTime());
		getLogger().debug("Fine " + fine.getTime());

		if(!inizio.before(fine)){
			return 0;
		}


		calc = fine.getTime().getTime() - inizio.getTime().getTime();

		calc = calc + ONE_HOUR;
		calc = calc / (ONE_HOUR * 24);

		result = (int) calc;

		//		getLogger().debug("calcoloNumeroGiorni::dataInizio " + dataInizio.toString());
		//		getLogger().debug("calcoloNumeroGiorni::dataFine " + dataFine.toString());
		//		getLogger().debug("calcoloNumeroGiorni::return " + result);
		return result;
	}


	public static Date calcolaUltimoDelAnno(Date dataRiferimento) {
		Date ultimoDelAnno = null;

		Calendar ultimo = Calendar.getInstance();
		ultimo.setTime(dataRiferimento);
		ultimo.set(Calendar.MONTH, Calendar.DECEMBER);
		ultimo.set(Calendar.AM_PM, Calendar.AM);
		ultimo.set(Calendar.DAY_OF_MONTH, 31);
		ultimo.set(Calendar.HOUR, 0);
		ultimo.set(Calendar.MINUTE, 0);
		ultimo.set(Calendar.SECOND, 0);
		ultimo.set(Calendar.MILLISECOND, 0);

		ultimoDelAnno = ultimo.getTime();

		return ultimoDelAnno;
	}

	public static Date calcolaPrimoDelAnno(Date dataRiferimento) {
		Date primoDelAnno = null;

		Calendar primo = Calendar.getInstance();
		primo.setTime(dataRiferimento);
		primo.set(Calendar.MONTH, Calendar.JANUARY);
		primo.set(Calendar.DAY_OF_MONTH, 1);
		primo.set(Calendar.AM_PM, Calendar.AM);
		primo.set(Calendar.HOUR, 0);
		primo.set(Calendar.MINUTE, 0);
		primo.set(Calendar.SECOND, 0);
		primo.set(Calendar.MILLISECOND, 0);

		primoDelAnno = primo.getTime();

		return primoDelAnno;
	}

	public static Date calcolaPrimoDelMese(Date dataRiferimento) {
		Date primoDelMese = null;
		int actualMinimum = 0;

		Calendar primo = Calendar.getInstance();
		primo.setTime(dataRiferimento);
		actualMinimum = primo.getActualMinimum(Calendar.DAY_OF_MONTH);

		primo.set(Calendar.DAY_OF_MONTH, actualMinimum);
		primo.set(Calendar.AM_PM, Calendar.AM);
		primo.set(Calendar.HOUR, 0);
		primo.set(Calendar.MINUTE, 0);
		primo.set(Calendar.SECOND, 0);
		primo.set(Calendar.MILLISECOND, 0);

		primoDelMese = primo.getTime();

		return primoDelMese;
	}

	public static Date calcolaUltimoDelMese(Date dataRiferimento) {
		Date ultimoDelMese = null;
		int actualMaximum = 0;

		Calendar ultimo = Calendar.getInstance();
		ultimo.setTime(dataRiferimento);
		actualMaximum = ultimo.getActualMaximum(Calendar.DAY_OF_MONTH);

		ultimo.set(Calendar.DAY_OF_MONTH, actualMaximum);
		ultimo.set(Calendar.AM_PM, Calendar.AM);
		ultimo.set(Calendar.HOUR, 0);
		ultimo.set(Calendar.MINUTE, 0);
		ultimo.set(Calendar.SECOND, 0);
		ultimo.set(Calendar.MILLISECOND, 0);

		ultimoDelMese = ultimo.getTime();

		return ultimoDelMese;
	}

	public static Mese getMese(Date data) {
		Mese mese = null;
		int meseNumero = 0;

		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		meseNumero = cal.get(Calendar.MONTH);
		getLogger().debug("Numero Mese calcolato " + meseNumero);

		mese = Mese.getMeseById(new IdDecodifica(meseNumero + 1));
		return mese;
	}

	public static int getAnno(Date data) {
		int anno = 0;

		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		anno = cal.get(Calendar.YEAR);
		getLogger().debug("Anno calcolato " + anno);

		return anno;
	}

	private static Date setOraZero(Date dataRiferimento) {
		Date oraZero = null;
		Calendar primo = Calendar.getInstance();
		primo.setTime(dataRiferimento);
		primo.set(Calendar.AM_PM, Calendar.AM);
		primo.set(Calendar.HOUR, 0);
		primo.set(Calendar.MINUTE, 0);
		primo.set(Calendar.SECOND, 0);
		primo.set(Calendar.MILLISECOND, 0);
		oraZero = primo.getTime();
		return oraZero;
	}

	public static Date getProssimoLunedi(Date dataRiferimento) {
		Date lunedi = null;
		int dayOffWeek = -1;
		Calendar cal = Calendar.getInstance(Locale.ITALY);
		cal.setTime(dataRiferimento);
		dayOffWeek = cal.get(Calendar.DAY_OF_WEEK);
		if (dayOffWeek == Calendar.SATURDAY) {
			cal.add(Calendar.DAY_OF_WEEK, 2);
			lunedi = cal.getTime();
			return lunedi;
		}

		if (dayOffWeek == Calendar.SUNDAY) {
			cal.add(Calendar.DAY_OF_WEEK, 1);
			lunedi = cal.getTime();
			return lunedi;
		}
		return null;
	}


	private static Logger getLogger() {
		return LOG;
	}


	public static void main(String[] args) throws Exception {
		//		Calendar cal1 = Calendar.getInstance();
		//		int c1 = cal1.get(Calendar.AM_PM);
		//		if (c1==Calendar.PM)
		//			System.out.println("1-PM");
		//		else if (c1==Calendar.AM)
		//			System.out.println("1-AM");
		//		else
		//			System.out.println("c1: "+c1);
		//		//cal1.set(Calendar.AM_PM, Calendar.AM);
		////		cal1.set(Calendar.HOUR, 0);
		////		cal1.set(Calendar.MINUTE, 0);
		////		cal1.set(Calendar.SECOND, 0);
		////		cal1.set(Calendar.MILLISECOND, 0);
		//		Calendar cal2 = Calendar.getInstance();
		//		cal2.setTime(DateUtil.decodeFromTextInput("02/04/2007"));
		//		int c2 = cal2.get(Calendar.AM_PM);
		//		if (c2==Calendar.PM)
		//			System.out.println("2-PM");
		//		else if (c2==Calendar.AM)
		//			System.out.println("2-AM");
		//		else
		//			System.out.println("c2: "+c2);
		//
		//		//cal2.set(Calendar.AM_PM, Calendar.PM);
		//		//cal2.set(Calendar.HOUR, 13);
		//		//cal2.set(Calendar.MINUTE, 0);
		//		//cal2.set(Calendar.SECOND, 0);
		//		//cal2.set(Calendar.MILLISECOND, 0);
		//
		//		calcoloNumeroMesiBis(cal2.getTime(), cal1.getTime());
		//		System.out.println(isLessEqualsThan(cal1.getTime(), cal2.getTime()));
		//
		//		int n = calcoloNumeroGiorni(DateUtil.decodeFromTextInput("02/04/2007"), DateUtil.decodeFromTextInput("05/04/2007"));
		//		System.out.println("Numero Giorni " + n);
		//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		//		Date date1 = simpleDateFormat.parse("01/07/2007");
		//		Date date2 = simpleDateFormat.parse("31/01/2004");
		//
		//		System.out.println("Calcolo 1: " + calcoloNumeroMesi(date2, date1));
		//		System.out.println("Calcolo 2: " + calcoloNumeroMesiBis(date2, date1));
		//		System.out.println("Calcolo 3: " + getMonthLapse(date2, date1));

		//		Date data0 = DateUtil.decodeFromTextInput("29/02/2008");
		//		data0 = setOraZero(data0);
		//
		//		Date data1 = addYearsToDate(data0, 1);
		//
		//		System.out.println("data 0 " + data0);
		//		System.out.println("data 1 " + data1);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(simpleDateFormat.parse("31/12/2005"));
		cal1.set(Calendar.HOUR, 0);
		cal1.set(Calendar.MINUTE, 0);
		cal1.set(Calendar.SECOND, 0);
		cal1.set(Calendar.MILLISECOND, 0);

		Date dataUGUProrogato = cal1.getTime();

		cal1.setTime(simpleDateFormat.parse("16/01/2006"));
		cal1.set(Calendar.HOUR, 0);
		cal1.set(Calendar.MINUTE, 0);
		cal1.set(Calendar.SECOND, 0);
		cal1.set(Calendar.MILLISECOND, 0);
		Date dataPrimoPagamento = cal1.getTime();

		//int calcoloNumeroMesi = calcoloNumeroMesiBis(dataUGUProrogato, dataPrimoPagamento);
		int numeroGiorni = calcoloNumeroGiorni(dataUGUProrogato, dataPrimoPagamento);

		System.out.println(dataUGUProrogato);
		System.out.println(dataPrimoPagamento);
		System.out.println(numeroGiorni);
		//System.out.println(calcoloNumeroMesi);
	}

}
