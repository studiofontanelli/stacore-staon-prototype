/**
 * 
 */
package it.csi.stacore.staon.bo.id;

/**
 * 
 *
 */
public class IdComunicazioneUtente extends LongId {


	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7267078916329990519L;

	public IdComunicazioneUtente(long id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	

	public boolean equals(Object object) {
		boolean equals = false;

		if((object != null) && object instanceof IdComunicazioneUtente) {
			IdComunicazioneUtente altro = (IdComunicazioneUtente) object;
			equals = (this.getId() == altro.getId());
		}

		return equals;
	}

}
