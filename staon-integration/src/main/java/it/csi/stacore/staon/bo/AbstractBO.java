package it.csi.stacore.staon.bo;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public abstract class AbstractBO implements java.io.Serializable {
  //~ Methods ==================================================================

  /**
   * DOCUMENT ME!
   *
   * @param msg DOCUMENT ME!
   * @param length DOCUMENT ME!
   * @param errMsg DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  protected String verifyLength(String msg, int length, String errMsg) {
    if(msg != null) {
      if(msg.length() > length) {
        throw new IllegalArgumentException(errMsg);
      }
    }

    return msg;
  }

  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }


}
