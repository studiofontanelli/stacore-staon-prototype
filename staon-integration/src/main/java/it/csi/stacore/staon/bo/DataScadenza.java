/*
 * Created on 31-mar-2005
 *
 */
package it.csi.stacore.staon.bo;

import java.io.Serializable;

import it.csi.stacore.staon.bo.id.IdDecodifica;

/**
 * DOCUMENT ME!
 *
 * @author curtoni
 */
public class DataScadenza implements Serializable, Comparable {
	//~ Instance fields ==========================================================

	/**
	 *
	 */
	private static final long serialVersionUID = -971468655099759166L;

	/**
	 * @uml.property  name="mese"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Mese mese;

	/**
	 * @uml.property  name="anno"
	 */
	private Integer anno;

	//~ Constructors =============================================================

	/**
	 * Creates a new DataScadenza object.
	 *
	 * @param annoMese DOCUMENT ME!
	 */
	public DataScadenza(Integer annoMese) {
		if (annoMese != null) {
			if (annoMese.toString().length() == 6) {
				String annoString = annoMese.toString().substring(0, 4);
				anno = new Integer(annoString);

				String meseString = annoMese.toString().substring(4, 6);
				mese = Mese.getMeseById(new IdDecodifica(Long.parseLong(meseString)));
			} else if (annoMese.toString().length() == 4) {
				String annoString = annoMese.toString().substring(0, 4);
				anno = new Integer(annoString);
				mese = null;
			} else if (annoMese.toString().length() == 2) {
				anno = null;

				String meseString = annoMese.toString().substring(0, 2);
				mese = Mese.getMeseById(new IdDecodifica(Long.parseLong(meseString)));
			} else if (annoMese.toString().length() == 1) {
				anno = null;

				String meseString = annoMese.toString().substring(0, 1);
				mese = Mese.getMeseById(new IdDecodifica(Long.parseLong(meseString)));
			} else {
				anno = null;
				mese = null;
			}
		}
	}

	//~ Methods ==================================================================

	//  public DataScadenza(Integer annoMese) {
	//    if (annoMese!=null) {
	//      if (annoMese.toString().length()==6) {
	//  		String annoString=annoMese.toString().substring(0,4);
	//  		anno=new Integer(annoString);
	//  	  	String meseString=annoMese.toString().substring(4,6);
	//  	  	mese=Mese.getMeseById(new IdDecodifica(Long.parseLong(meseString)));
	//      } else if (annoMese.toString().length()==4) {
	//  		String annoString=annoMese.toString().substring(0,4);
	//  		anno=new Integer(annoString);
	//  		mese=null;
	//      } else if (annoMese.toString().length()==2) {
	//        anno=null;
	//        String meseString=annoMese.toString().substring(0,2);
	//	  	mese=Mese.getMeseById(new IdDecodifica(Long.parseLong(meseString)));
	//      } else {
	//        anno=null;
	//        mese=null;
	//      }
	//    }
	//  }
	public Integer toInteger() {
		if ((anno != null) && (mese != null)) {
			String result = anno.toString() + mese.toTwoDigitString();

			if (result.length() == 6) {
				return new Integer(result);
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	/**
	 * DOCUMENT ME!
	 * @return  DOCUMENT ME!
	 * @uml.property  name="anno"
	 */
	public Integer getAnno() {
		return anno;
	}

	/**
	 * DOCUMENT ME!
	 * @param anno  DOCUMENT ME!
	 * @uml.property  name="anno"
	 */
	public void setAnno(Integer anno) {
		this.anno = anno;
	}

	/**
	 * DOCUMENT ME!
	 * @return  DOCUMENT ME!
	 * @uml.property  name="mese"
	 */
	public Mese getMese() {
		return mese;
	}

	/**
	 * DOCUMENT ME!
	 * @param mese  DOCUMENT ME!
	 * @uml.property  name="mese"
	 */
	public void setMese(Mese mese) {
		this.mese = mese;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public String toString() {
		String result;

		if (!isValida()) {
			result = "";// Scadenza NON VALIDA
		} else {
			result = getMese().toTwoDigitString() + "/" + getAnno();
		}

		return result;
	}

	public boolean isValida() {
		if (getAnno() == null || getMese() == null) return false;
		if (getAnno().equals(new Integer(1000))) return false;

		return true;
	}

	public int compareTo(Object o) {
		DataScadenza altraDataScadenza = (DataScadenza) o;

		if (toInteger() != null)
			return toInteger().compareTo(altraDataScadenza.toInteger());
		else if (altraDataScadenza.toInteger() == null)
			return 0;
		else
			return 1;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anno == null) ? 0 : anno.hashCode());
		result = prime * result + ((mese == null) ? 0 : mese.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataScadenza other = (DataScadenza) obj;
		if (anno == null) {
			if (other.anno != null)
				return false;
		} else if (!anno.equals(other.anno))
			return false;
		if (mese == null) {
			if (other.mese != null)
				return false;
		} else if (!mese.equals(other.mese))
			return false;
		return true;
	}


}
