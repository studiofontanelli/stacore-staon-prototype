package it.csi.stacore.staon.ejb;

public class ServizioConsultazioneBean  extends CommonBean  {

	private static final long serialVersionUID = 1L;

	/*
	 * (non-Javadoc)
	 * @see it.csi.stacore.staon.ejb.CommonBean#testResources()
	 */

	public boolean testResources() throws Exception {
		final String method = "testResources";
		//Tracer.debug(LOG, getClass().getName(), method, "BEGIN");
		try{
			init();
			return true;
		}
		finally{
			//Tracer.debug(LOG,getClass().getName(), method, "END");
		}
	}


   public void init() {

		System.out.println("INIT");

    }

}
