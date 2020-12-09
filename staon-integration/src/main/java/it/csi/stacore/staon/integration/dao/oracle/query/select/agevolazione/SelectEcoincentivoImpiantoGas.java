package it.csi.stacore.staon.integration.dao.oracle.query.select.agevolazione;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.EcoincentivoImpiantoGas;
import it.csi.stacore.staon.bo.Fonte;
import it.csi.stacore.staon.bo.TipoAgevolazione;
import it.csi.stacore.staon.bo.TipoVeicolo;
import it.csi.stacore.staon.bo.factory.DecodificaFactory;
import it.csi.stacore.staon.bo.id.IdAgevolazione;
import it.csi.stacore.staon.bo.id.IdDatiTecnici;
import it.csi.stacore.staon.bo.id.IdVeicolo;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEPreparedStatement;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;
import it.csi.stacore.staon.integration.dao.oracle.query.select.AbstractSelect;
import it.csi.stacore.staon.integration.dao.oracle.util.OracleQuery;
import it.csi.stacore.staon.integration.dao.oracle.util.OracleQueryList;
import it.csi.stacore.staon.integration.exception.InvalidSearchObjectException;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class SelectEcoincentivoImpiantoGas extends AbstractSelect {
	// ~ Instance fields
	// ==========================================================

	/**
	 * @uml.property name="vincoliRicercaEcoincentivoImpiantoGas"
	 * @uml.associationEnd
	 */
	private EcoincentivoImpiantoGas vincoliRicercaEcoincentivoImpiantoGas;

	/**
	 * identifica se fare la ricerca per idVeicolo o per proprietario, targa,
	 * tipo veicolo
	 *
	 * @uml.property name="bRicercaIdVeicolo"
	 */
	private boolean bRicercaIdVeicolo;

	private final boolean soloAttivi;

	// ~ Constructors
	// =============================================================

	/**
	 * Creates a new SelectAgevolazione object.
	 */
	public SelectEcoincentivoImpiantoGas() {
		super();
		soloAttivi = false;
	}

	/**
	 * Creates a new SelectAgevolazione object.
	 *
	 * @param vincoliRicercaEcoincentivoImpiantoGas
	 */
	public SelectEcoincentivoImpiantoGas(
			EcoincentivoImpiantoGas vincoliRicercaEcoincentivoImpiantoGas,
			boolean soloAttivi) {
		super();
		this.vincoliRicercaEcoincentivoImpiantoGas = vincoliRicercaEcoincentivoImpiantoGas;
		bRicercaIdVeicolo = this.vincoliRicercaEcoincentivoImpiantoGas
				.getIdVeicolo() != null;
		this.soloAttivi = soloAttivi;
	}

	// ~ Methods
	// ==================================================================

	/**
	 * ritorna il BO
	 *
	 * @param rs
	 *
	 * @return
	 *
	 * @throws SQLException
	 */
	public Object createBO(TAURDEResultSet rs) throws SQLException {
		DecodificaFactory decodFactory = DecodificaFactory.getInstance();
		Long lIdAgevolazione = rs.getLong("ID_AGEVOLAZIONE");
		IdAgevolazione idAgevolazione = (lIdAgevolazione != null) ? new IdAgevolazione(
				lIdAgevolazione.longValue())
				: null;
		Long lIdVeicolo = rs.getLong("id_veicolo");
		IdVeicolo idVeicolo = (lIdVeicolo != null) ? new IdVeicolo(lIdVeicolo
				.longValue()) : null;

		Fonte fonte = decodFactory.getFonte(rs.getLong("ID_FONTE"), rs
				.getString("cod_fonte"), rs.getString("DESC_fonte"));
		TipoAgevolazione tipoAgevolazione = decodFactory.getTipoAgevolazione(rs
				.getLong("ID_TIPO_AGEVOLAZIONE"), rs
				.getString("cod_tipoagevolazione"), rs
				.getString("desc_tipoagevolazione"));
		TipoVeicolo tipoVeicolo = decodFactory.getTipoVeicolo(rs
				.getLong("ID_TIPO_VEICOLO"), rs.getString("codTipoVeicolo"), rs
				.getString("descTipoVeicolo"));

		Long lIdDatiTecniciInizio = rs.getLong("ID_DATI_TECNICI_INIZIO");
		IdDatiTecnici idDatiTecniciInizio = (lIdDatiTecniciInizio != null) ? new IdDatiTecnici(
				lIdDatiTecniciInizio.longValue())
				: null;

		Long lIdDatiTecniciFine = rs.getLong("ID_DATI_TECNICI_FINE");
		IdDatiTecnici idDatiTecniciFine = (lIdDatiTecniciFine != null) ? new IdDatiTecnici(
				lIdDatiTecniciFine.longValue())
				: null;

		return new EcoincentivoImpiantoGas(idAgevolazione, // idAgevolazione
				idVeicolo, // idVeicolo
				tipoVeicolo, // tipoVeicolo
				fonte, // fonte
				tipoAgevolazione, // tipoAgevolazione
				rs.getDate("DATA_INIZIO"), // dataInizio
				rs.getString("NUM_PROTOCOLLO_APERTURA"), // numProtocolloApertura
				rs.getDate("DATA_FINE"), // dataFine
				rs.getString("NUM_PROTOCOLLO_CHIUSURA"), // numProtocolloChiusura
				rs.getString("TIPO_VEICOLO"), // tipoVeicoloOriginale,
				rs.getString("TARGA"), // targaOriginale,
				rs.getString("IDENTIFICATIVO_FISCALE_PROPRIE"), // identificativoFiscaleProprietarioOriginale
				rs.getString("TIPO_AGEVOLAZIONE"), // tipoAgevolazioneOriginale
				rs.getDate("DATA_ACQUISIZIONE"), // dataAcquisizione
				rs.getDate("DATA_FINE_CALCOLATA"), // dataFineCalcolata
				idDatiTecniciInizio, // idDatiTecnciInizio
				idDatiTecniciFine // idDatiTecnciFine
		);
	}

	/**
	 * ritorna la stringa SQL
	 *
	 * @return
	 *
	 * @throws InvalidSearchObjectException
	 */
	public String getSQLStatement() throws InvalidSearchObjectException {
		if (vincoliRicercaEcoincentivoImpiantoGas == null) {
			throw new InvalidSearchObjectException(
					"Ricerca agevolazione: vincoliRicercaEcoincentivoImpiantoGas non pu� essere null");
		}

		OracleQuery q = OracleQueryList.getInstance().getQuery(
				getClass().getName());
		String query = q.getBody() + q.getFieldBody("progCorrezioneT");
		query += (q.getFrom() + q.getParamFrom("tabT"));
		query += q.getWhere();

		if (soloAttivi){
			query += q.getParamWhere("soloAttivi");
		}

		if (bRicercaIdVeicolo) {
			// faccio la ricerca per idVeicolo
			query += q.getParamWhere("idVeicolo");
		} else {
			boolean bInsertParameter = false;

			// faccio la ricerca per targa, tipoVeicolo, idTipoVeicolo,
			// codiceFiscale, numProtocolloApertura e/o idTipoAgevolazione
			if ((vincoliRicercaEcoincentivoImpiantoGas.getTargaOriginale() != null)
					&& (vincoliRicercaEcoincentivoImpiantoGas.getTargaOriginale().length() != 0)) {
				bInsertParameter = true;
				query += q.getParamWhere("targa");
			}

			if ((vincoliRicercaEcoincentivoImpiantoGas.getTipoVeicoloOriginale() != null)
					&& (vincoliRicercaEcoincentivoImpiantoGas.getTipoVeicoloOriginale()
							.length() != 0)) {
				bInsertParameter = true;
				query += q.getParamWhere("tipoVeicolo");
			}

			if ((vincoliRicercaEcoincentivoImpiantoGas
					.getIdentificativoFiscaleProprietarioOriginale() != null)
					&& (vincoliRicercaEcoincentivoImpiantoGas
							.getIdentificativoFiscaleProprietarioOriginale()
							.length() != 0)) {
				bInsertParameter = true;
				query += q.getParamWhere("codiceFiscale");
			}

			if ((vincoliRicercaEcoincentivoImpiantoGas.getNumProtocolloApertura() != null)
					&& (vincoliRicercaEcoincentivoImpiantoGas.getNumProtocolloApertura()
							.length() != 0)) {
				bInsertParameter = true;
				query += q.getParamWhere("numProtocolloApertura");
			}

			TipoVeicolo tipoVeicolo = vincoliRicercaEcoincentivoImpiantoGas
					.getTipoVeicolo();
			if ((tipoVeicolo != null) && (tipoVeicolo.getId() != null)) {
				bInsertParameter = true;
				query += q.getParamWhere("idTipoVeicolo");
			}

			if (vincoliRicercaEcoincentivoImpiantoGas.getDataFineCalcolata() != null) {
				bInsertParameter = true;
				query += q.getParamWhere("dataFineCalcolata");
			}
			IdDatiTecnici idDatiTecniciInizio = vincoliRicercaEcoincentivoImpiantoGas
					.getIdDatiTecniciInizio();
			if (idDatiTecniciInizio != null) {
				bInsertParameter = true;
				query += q.getParamWhere("idDatiTecniciInizio");
			}

			IdDatiTecnici idDatiTecniciFine = vincoliRicercaEcoincentivoImpiantoGas
					.getIdDatiTecniciFine();
			if (idDatiTecniciFine != null) {
				bInsertParameter = true;
				query += q.getParamWhere("idDatiTecniciFine");
			}

			if (!bInsertParameter) {
				throw new InvalidSearchObjectException(
						"Ricerca agevolazione: vincoliRicercaEcoincentivoImpiantoGas popolare almeno uno dei campi di ricerca");
			}
		}

		query += q.getOrderBy();

		return query;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param stmt
	 *            DOCUMENT ME!
	 *
	 * @throws SQLException
	 *             DOCUMENT ME!
	 */
	protected void setPreparedStatement(TAURDEPreparedStatement stmt)
			throws SQLException {
		int iPos = 1;

		if (bRicercaIdVeicolo) {
			// faccio la ricerca per idVeicolo
			stmt.setLongId(iPos++, vincoliRicercaEcoincentivoImpiantoGas.getIdVeicolo());
		} else {
			// faccio la ricerca per targa, tipoVeicolo e/o codiceFiscale
			if ((vincoliRicercaEcoincentivoImpiantoGas.getTargaOriginale() != null)
					&& (vincoliRicercaEcoincentivoImpiantoGas.getTargaOriginale().length() != 0)) {
				stmt.setUpperCaseString(iPos++, vincoliRicercaEcoincentivoImpiantoGas
						.getTargaOriginale());
			}

			if ((vincoliRicercaEcoincentivoImpiantoGas.getTipoVeicoloOriginale() != null)
					&& (vincoliRicercaEcoincentivoImpiantoGas.getTipoVeicoloOriginale()
							.length() != 0)) {
				stmt.setUpperCaseString(iPos++, vincoliRicercaEcoincentivoImpiantoGas
						.getTipoVeicoloOriginale());
			}

			if ((vincoliRicercaEcoincentivoImpiantoGas
					.getIdentificativoFiscaleProprietarioOriginale() != null)
					&& (vincoliRicercaEcoincentivoImpiantoGas
							.getIdentificativoFiscaleProprietarioOriginale()
							.length() != 0)) {
				stmt.setUpperCaseString(iPos++, vincoliRicercaEcoincentivoImpiantoGas
						.getIdentificativoFiscaleProprietarioOriginale());
			}

			if ((vincoliRicercaEcoincentivoImpiantoGas.getNumProtocolloApertura() != null)
					&& (vincoliRicercaEcoincentivoImpiantoGas.getNumProtocolloApertura()
							.length() != 0)) {
				stmt.setUpperCaseString(iPos++, vincoliRicercaEcoincentivoImpiantoGas
						.getNumProtocolloApertura());
			}

			TipoVeicolo tipoVeicolo = vincoliRicercaEcoincentivoImpiantoGas
					.getTipoVeicolo();

			if ((tipoVeicolo != null) && (tipoVeicolo.getId() != null)) {
				stmt.setLongId(iPos++, tipoVeicolo.getId());
			}

			if (vincoliRicercaEcoincentivoImpiantoGas.getDataFineCalcolata() != null) {
				stmt.setDate(iPos++, vincoliRicercaEcoincentivoImpiantoGas
						.getDataFineCalcolata());
			}
			IdDatiTecnici idDatiTecniciInizio = vincoliRicercaEcoincentivoImpiantoGas
					.getIdDatiTecniciInizio();
			if (idDatiTecniciInizio != null) {
				stmt.setLongId(iPos++, idDatiTecniciInizio);
			}

			IdDatiTecnici idDatiTecniciFine = vincoliRicercaEcoincentivoImpiantoGas
					.getIdDatiTecniciFine();
			if (idDatiTecniciFine != null) {
				stmt.setLongId(iPos++, idDatiTecniciFine);
			}

		}
	}

}