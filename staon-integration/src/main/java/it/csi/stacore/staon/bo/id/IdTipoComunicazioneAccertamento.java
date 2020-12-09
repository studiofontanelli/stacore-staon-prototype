package it.csi.stacore.staon.bo.id;

/**
 * DOCUMENT ME!
 * 
 * @author $author$
 * @version $Revision$
 */
public class IdTipoComunicazioneAccertamento extends IdDecodifica {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2286054259294386985L;
	/**
	 * 1 PreAvviso di Accertamento
	 */
	public static final IdTipoComunicazioneAccertamento PREACC = new IdTipoComunicazioneAccertamento(
			1L);
	/**
	 * 2 Avviso di Accertamento (Raccomandate)
	 */
	public static final IdTipoComunicazioneAccertamento ACCERT = new IdTipoComunicazioneAccertamento(
			2L);
	/**
	 * 3 Ingiunzione
	 */
	public static final IdTipoComunicazioneAccertamento INGIUN = new IdTipoComunicazioneAccertamento(
			3L);
	/**
	 * 4 Pre Contenzioso Gec
	 */
	public static final IdTipoComunicazioneAccertamento PRECONT = new IdTipoComunicazioneAccertamento(
			4L);
	/**
	 * 5 Pre Contenzioso Gec
	 */
	public static final IdTipoComunicazioneAccertamento PRECONT_ORD = new IdTipoComunicazioneAccertamento(
			5L);
	/**
	 * 6 Rinotifica
	 */
	public static final IdTipoComunicazioneAccertamento RINOTIFICA = new IdTipoComunicazioneAccertamento(
			6L);
	/**
	 * 7 Invito al Pagamento
	 */
	public static final IdTipoComunicazioneAccertamento INVITO_PAG = new IdTipoComunicazioneAccertamento(
			7L);

	/**
	 * 999 999 OPERAZIONE TEST ORACLE
	 */
	public static final IdTipoComunicazioneAccertamento TEST = new IdTipoComunicazioneAccertamento(
			999L);

	public IdTipoComunicazioneAccertamento(long id) {
		super(id);
	}

}