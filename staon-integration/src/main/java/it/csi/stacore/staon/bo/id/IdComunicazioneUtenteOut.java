/**
 * 
 */
package it.csi.stacore.staon.bo.id;

/**
 * 
 *
 */
public class IdComunicazioneUtenteOut extends LongId {



	/**
	 * 
	 */
	private static final long serialVersionUID = -1192923548451281042L;


	public IdComunicazioneUtenteOut(long id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	

	public boolean equals(Object object) {
		boolean equals = false;

		if((object != null) && object instanceof IdComunicazioneUtenteOut) {
			IdComunicazioneUtenteOut altro = (IdComunicazioneUtenteOut) object;
			equals = (this.getId() == altro.getId());
		}

		return equals;
	}

}
