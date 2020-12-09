package it.csi.stacore.staon.bo.id;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class IdTipoFlottista extends IdDecodifica {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6905289984146255879L;
	/**
	 * 1	Flottista BIG
	 */
	public static final IdTipoFlottista FLOTTISTA_BIG = new IdTipoFlottista(1L);
	/**
	 * 2	Flottista NON BIG
	 */
	public static final IdTipoFlottista FLOTTISTA_NON_BIG = new IdTipoFlottista(2L);


  
  /**
   *    999	999	OPERAZIONE TEST ORACLE
   */
  public static final IdTipoFlottista TEST = new IdTipoFlottista(999L);

  //~ Constructors =============================================================

  /**
   *
   * @param id
   */
  private IdTipoFlottista(long id) {
    super(id);
  }
}
