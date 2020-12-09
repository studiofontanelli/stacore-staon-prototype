/*
 * Created on 4-dic-2006
 */
package it.csi.stacore.staon.bo;

import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.util.EqualsUtil;

public class TipoDocumento extends Decodifica {

	private static final long serialVersionUID = -4947119026964968566L;

	//TO DO

//	public static final int AUTOVEICOLO = 1;
//
//	public static final int MOTOVEICOLO = 2;
//
//	public static final String CODICE_NON_DEFINITO = "NN";
//
//	public static final String CODICE_EURO_0 = "E0";
//
//	public static final String CODICE_EURO_1 = "E1";
//
//	public static final String CODICE_EURO_2 = "E2";
//
//	public static final String CODICE_EURO_3 = "E3";
//
//	public static final String CODICE_EURO_4 = "E4";
//
//	public static final String CODICE_EURO_5 = "E5";
//
//	public static final String CODICE_EURO_6 = "E6";
//
//	public static final TipoDocumento CATEGORIA_NON_DEFINITO = new TipoDocumento(new IdDecodifica(0), CODICE_NON_DEFINITO, "NON DEFINITO");
//
//	public static final TipoDocumento CATEGORIA_EURO_0 = new TipoDocumento(new IdDecodifica(1), CODICE_EURO_0, "EURO 0");
//
//	public static final TipoDocumento CATEGORIA_EURO_1 = new TipoDocumento(new IdDecodifica(2), CODICE_EURO_1, "EURO 1");
//
//	public static final TipoDocumento CATEGORIA_EURO_2 = new TipoDocumento(new IdDecodifica(3), CODICE_EURO_2, "EURO 2");
//
//	public static final TipoDocumento CATEGORIA_EURO_3 = new TipoDocumento(new IdDecodifica(4), CODICE_EURO_3, "EURO 3");
//
//	public static final TipoDocumento CATEGORIA_EURO_4 = new TipoDocumento(new IdDecodifica(5), CODICE_EURO_4, "EURO 4");
//
//	public static final TipoDocumento CATEGORIA_EURO_5 = new TipoDocumento(new IdDecodifica(6), CODICE_EURO_5, "EURO 5");
//
//	public static final TipoDocumento CATEGORIA_EURO_6 = new TipoDocumento(new IdDecodifica(7), CODICE_EURO_6, "EURO 6");

	public TipoDocumento(IdDecodifica idDecodifica, String codice, String descrizione) {
		super(idDecodifica, codice, descrizione);
	}

	public boolean equals(Object object) {
		boolean equals = false;

		if ((object != null) && object instanceof TipoDocumento) {
			TipoDocumento altro = (TipoDocumento) object;
			equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
		}

		return equals;
	}
}