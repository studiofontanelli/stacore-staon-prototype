package it.csi.stacore.staon.integration.dao.oracle.query.select.documentazionebonifiche;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import it.csi.stacore.staon.bo.TipoVeicolo;
import it.csi.stacore.staon.bo.documentazionebonifiche.Bonifica;
import it.csi.stacore.staon.bo.id.IdBonifica;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.bo.utente.Cassa;
import it.csi.stacore.staon.bo.utente.Ente;
import it.csi.stacore.staon.bo.utente.Sportello;
import it.csi.stacore.staon.bo.utente.TipologiaBonifica;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEPreparedStatement;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;
import it.csi.stacore.staon.integration.dao.oracle.query.select.AbstractSelect;
import it.csi.stacore.staon.integration.dao.oracle.util.OracleQuery;
import it.csi.stacore.staon.integration.dao.oracle.util.OracleQueryList;
import it.csi.stacore.staon.integration.exception.InvalidSearchObjectException;
import it.csi.stacore.staon.util.DateUtil;

public class SelectRicercaDocumentazioneBonifiche extends AbstractSelect{

	private List idBonificheList;
	private boolean singola = false;

	public SelectRicercaDocumentazioneBonifiche(List idBonificheList) {
		super();
		this.idBonificheList = idBonificheList;
		this.singola = (idBonificheList != null && idBonificheList.size() == 1);
	}

	public Object createBO(TAURDEResultSet rs) throws SQLException {

		Bonifica bonifica = new Bonifica(rs.getLong("ID_BONIFICA").longValue());
		bonifica.setEnte(rs.getLong("ID_ENTE").toString());
		bonifica.setSportello(rs.getLong("ID_SPORTELLO").toString());
		bonifica.setCassa(rs.getLong("ID_CASSA").toString());
		bonifica.setIdOperazione(rs.getLong("ID_OPERAZIONE").toString());
		bonifica.setDataOperazione(DateUtil.format_yyyyMMdd((rs.getDate("DATA_OPERAZIONE")))); // yyyyMMdd
		bonifica.setIdOperazioneLogica(rs.getLong("ID_OPE_LOGICA").toString());
		bonifica.setTarga(rs.getString("TARGA"));
		bonifica.setTipoOperazioneLogica(rs.getLong("ID_TIPO_OPE_LOGICA").toString());
		Long idVeicolo = rs.getLong("ID_VEICOLO");
		bonifica.setIdVeicolo(idVeicolo != null ? idVeicolo.toString() : null);

		Boolean abilitazioneRiscossione = (rs.getString("ABILITAZIONE_RISCOSSIONE") != null && rs.getString("ABILITAZIONE_RISCOSSIONE").equals("1")) ? Boolean.TRUE : Boolean.FALSE;

		Ente ente = new Ente(rs.getLong("ID_ENTE"),
				rs.getString("EMAIL_E"), // email,
				rs.getString("INDIRIZO_E"), // indirizzo,
				rs.getString("CIVICO_E"), // civico,
				rs.getInteger("CAP_E"), // cap,
				rs.getString("COMUNE_E"), // comune,
				rs.getString("CF_E"), // codiceFiscale,
				rs.getString("PROVINCIA_E"), // provincia,
				rs.getString("SIGLATOP"), // siglaTop,
			    rs.getString("CODICE_ENTE"), // codice,
			    rs.getString("DESCRIZIONE_ENTE"),// descrizione,
			    rs.getDate("DATA_INIZIO_ATTIVITA"), // dataInizioAttivita,
			    abilitazioneRiscossione // abilitazioneRiscossione
		);
		bonifica.setEnteVO(ente);

		Sportello sportelloVO = new Sportello(rs.getLong("ID_SPORTELLO"),
				rs.getLong("ID_ENTE"), // idEnte,
				rs.getString("EMAIL_S"), // email,
				rs.getString("INDIRIZZO_S"), // indirizzo,
				rs.getString("CIVICO_S"), // civico,
				rs.getInteger("CAP_S"), // cap,
				rs.getString("COMUNE_S"), // comune,
				rs.getString("PROVINCIA_S"), // provincia,
				rs.getString("CODICE_SPORTELLO"), // codice,
				rs.getString("DESCRIZIONE_SPORTELLO") //descrizione
		);
		sportelloVO.setCodmctc(rs.getString("CODMCTC"));
		bonifica.setSportelloVO(sportelloVO);

		Cassa cassaVO = new Cassa(rs.getLong("ID_SPORTELLO"),
				 rs.getString("DENOMINAZIONE_CASSA"), //denominazione,
				 rs.getString("CODICE_CASSA"), // codice,
				 rs.getString("DESCRIZIONE_CASSA"), // descrizione,
				 rs.getLong("ID_SPORTELLO")// idSportello
		);
		cassaVO.setIdUtente(rs.getString("IDENTIFICATIVO_UTENTE"));
		bonifica.setCassaVO(cassaVO);

		TipologiaBonifica tipologiaBonifica = new TipologiaBonifica(rs.getLong("ID_TIPO_OPE_LOGICA"),
				 rs.getString("CODICE_TIPO"), // codice,
				 rs.getString("DESCRIZIONE_TIPO")// descrizione
		);
		bonifica.setTipologiaBonifica(tipologiaBonifica);

		TipoVeicolo tipoVeicolo = new TipoVeicolo(new IdDecodifica(rs.getLong("ID_TIPO_VEICOLO").longValue()), //idDecodifica,
				rs.getString("CODICE_TIPO_VEICOLO"), // codice,
				rs.getString("DESCRIZIONE_TIPO_VEICOLO") // descrizione
        );
		bonifica.setTipoVeicolo(tipoVeicolo);

//		if (rs.getLong("ID_ALLEGATO_BONIFICA") != null) {
//			AllegatoBonificaVO allegatoBonificaVO = new AllegatoBonificaVO();
//
//			if(rs.getLong("ID_ARCHIVIAZIONE_INDEX") != null)
//				allegatoBonificaVO.setIdentificativoArchivio(rs.getLong("ID_ARCHIVIAZIONE_INDEX").toString());
//
//			if(rs.getLong("ID_TIPO_DOCUMENTO") != null)
//				allegatoBonificaVO.setIdTipoDocumento(rs.getLong("ID_TIPO_DOCUMENTO").toString());
//
//			if(rs.getLong("ID_OPERAZIONE") != null)
//				allegatoBonificaVO.setIdOperazione(rs.getLong("ID_OPERAZIONE").toString());
//
//			if(rs.getDate("DATA_INSERIMENTO") != null)
//				allegatoBonificaVO.setDataInserimento(rs.getDate("DATA_INSERIMENTO").toString());
//
//			allegatoBonificaVO.setNomeFile(rs.getString("NOME_FILE"));
//			allegatoBonificaVO.setIdBonifica(rs.getLong("ID_BONIFICA").longValue());
//			allegatoBonificaVO.setIdBonifica(rs.getLong("ID_ALLEGATO_BONIFICA").longValue());
//
//			bonifica.setAllegatoBonificaVO(allegatoBonificaVO);
//		}

		return bonifica;
	}

	public String getSQLStatement() throws InvalidSearchObjectException {
		OracleQuery q = OracleQueryList.getInstance().getQuery(getClass().getName());
		String query = q.getBody();
		query += q.getFrom();
		query += q.getWhere();

		query = StringUtils.replace(query, "$$idBonificheList",
				createCondition(idBonificheList));

		 query += q.getOrderBy();

		return query;

	}

	protected void setPreparedStatement(TAURDEPreparedStatement stmt) throws java.sql.SQLException {
		int iPos = 1;

		if (idBonificheList != null) {
			for (int i = 0; i < idBonificheList.size(); i++) {
				stmt.setLongId(iPos++, (IdBonifica) idBonificheList.get(i));
			}
		}

	}

	private String createCondition(List lista) {
		final String parameter = "?";
		final String comma     = ",";
		StringBuffer condition = new StringBuffer();
		if (singola){
			condition.append("= ?");
		} else {
			condition.append("IN (?");
			for (int y = 1;y < lista.size();y++) {
				condition.append(comma).append(parameter);
			}
			condition.append(")");
		}

		return condition.toString();
	}

}
