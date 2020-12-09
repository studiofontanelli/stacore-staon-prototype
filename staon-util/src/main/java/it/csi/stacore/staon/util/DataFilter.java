/*
 * Created on 17-gen-2005
 *
 */
package it.csi.stacore.staon.util;

import java.math.BigDecimal;
import java.util.Date;


/**
 * DOCUMENT ME!
 *
 * @author apiccirilli
 */
public class DataFilter {
  //~ Static fields/initializers ===============================================

  /**
   * DOCUMENT ME!
   */
  public static final String NULL_STRING_INDICATOR = "";

  /**
   * DOCUMENT ME!
   */
  public static final String EMPTY_STRING_INDICATOR = "";

  /**
   * DOCUMENT ME!
   */
  public static final String NULL_INTEGER_INDICATOR = "";

  /**
   * DOCUMENT ME!
   */
  public static final String EMPTY_INTEGER_INDICATOR = "0";

  /**
   * DOCUMENT ME!
   */
  public static final String NULL_LONG_INDICATOR = "";

  /**
   * DOCUMENT ME!
   */
  public static final String EMPTY_LONG_INDICATOR = "0";

  /**
   * DOCUMENT ME!
   */
  public static final String TRUE_BOOLEAN_INDICATOR = "SI";

  /**
   * DOCUMENT ME!
   */
  public static final String FALSE_BOOLEAN_INDICATOR = "NO";

  //~ Methods ==================================================================

  /**
   * DOCUMENT ME!
   *
   * @param value DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public static String removeNull(Object value) {
    String valueToReturn = EMPTY_STRING_INDICATOR;

    if(value instanceof String) {
      valueToReturn = removeNullString((String) value);
    } else if(value instanceof Integer) {
      valueToReturn = removeNullInteger((Integer) value);
    } else if(value instanceof Date) {
      valueToReturn = removeNullDate((Date) value);
    } else if(value instanceof Boolean) {
      valueToReturn = removeNullBoolean((Boolean) value);
    } else if(value instanceof BigDecimal) {
      valueToReturn = removeNullBigDecimal((BigDecimal) value);
    } else if(value instanceof Long) {
      valueToReturn = removeNullLong((Long) value);
    }

    return valueToReturn;
  }

  /**
   * Metodo che trasforma il null in NULL_STRING_INDICATOR.
   *
   * @param value
   *
   * @return
   */
  public static String removeNullString(String value) {
    if(value == null) {
      value = NULL_STRING_INDICATOR;
    }

    /*else
    if(value.trim().equals("")) {
        value =  EMPTY_STRING_INDICATOR;
    }*/
    return value;
  }

  /**
   * DOCUMENT ME!
   *
   * @param value DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public static String removeNullInteger(Integer value) {
    String valueToReturn = EMPTY_STRING_INDICATOR;

    if(value == null) {
      valueToReturn = NULL_INTEGER_INDICATOR;
    } else {
      try {
        valueToReturn = value.toString();
      } catch(NumberFormatException nfe) {
        nfe.printStackTrace();
        valueToReturn = NULL_INTEGER_INDICATOR;
      }
    }

    return valueToReturn;
  }

  /**
   * DOCUMENT ME!
   *
   * @param value DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public static String removeNullBigDecimal(BigDecimal value) {
    String valueToReturn = EMPTY_STRING_INDICATOR;

    if(value == null) {
      valueToReturn = NULL_INTEGER_INDICATOR;
    } else {
      try {
        valueToReturn = value.toString();
      } catch(NumberFormatException nfe) {
        nfe.printStackTrace();
        valueToReturn = NULL_INTEGER_INDICATOR;
      }
    }

    return valueToReturn;
  }

  /**
   * DOCUMENT ME!
   *
   * @param value DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public static String removeNullLong(Long value) {
    String valueToReturn = EMPTY_LONG_INDICATOR;

    if(value == null) {
      valueToReturn = NULL_LONG_INDICATOR;
    } else {
      try {
        valueToReturn = value.toString();
      } catch(NumberFormatException nfe) {
        nfe.printStackTrace();
        valueToReturn = NULL_LONG_INDICATOR;
      }
    }

    return valueToReturn;
  }

  /**
   * DOCUMENT ME!
   *
   * @param value DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public static String removeNullDate(Date value) {
    return DateUtil.format(value);
  }

  /**
   * DOCUMENT ME!
   *
   * @param value DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public static String removeNullBoolean(Boolean value) {
    String valueToReturn = EMPTY_STRING_INDICATOR;

    if(value == null) {
      valueToReturn = NULL_STRING_INDICATOR;
    } else if(value.booleanValue() == true) {
      valueToReturn = TRUE_BOOLEAN_INDICATOR;
    } else {
      valueToReturn = FALSE_BOOLEAN_INDICATOR;
    }

    return valueToReturn;
  }

  /**
   * DOCUMENT ME!
   *
   * @param value DOCUMENT ME!
   * @param replacement DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public static String replaceNull(String value, String replacement) {
    if(value == null) {
      return replacement;
    } else {
      return value;
    } 
  }
  
  public static String replaceNull(Object value, String replacement) {
      
      String result;
      if(value == null) {
        return replacement;
      } 
      else {
        result = removeNull(value);  
        return result;
      }
  }
    
  public static boolean isTrue(String value) {
      
      if (value == null) return false;
      
      value = value.toUpperCase();
      
      if (value.equals("TRUE")) return true;
      if (value.equals("SI")) return true;
      if (value.equals("YES")) return true;
      
      return false;
      
  }
  
  public static boolean isEmptyString(String value) {
      
      boolean result = true;
      
      if (value != null && !value.equals("")) result = false;
      
      return result;
  }
  
  
  public static String replaceEmpty(String value, String replacement) {
      
      if (isEmptyString(value)) return replacement;
      
      else return value;

  }
    
  
}
