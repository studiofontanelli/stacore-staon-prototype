package it.csi.stacore.staon.integration.dao.oracle;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import it.csi.stacore.staon.bo.Carrozzeria;
import it.csi.stacore.staon.bo.CategoriaEuro;
import it.csi.stacore.staon.bo.Combustibile;
import it.csi.stacore.staon.bo.DestinazioneVeicolo;
import it.csi.stacore.staon.bo.Divisa;
import it.csi.stacore.staon.bo.Esplicativo;
import it.csi.stacore.staon.bo.Fonte;
import it.csi.stacore.staon.bo.FonteComunicazione;
import it.csi.stacore.staon.bo.Regione;
import it.csi.stacore.staon.bo.ReportBonificheRequest;
import it.csi.stacore.staon.bo.RicercaBonificheRequest;
import it.csi.stacore.staon.bo.StatoComunicazione;
import it.csi.stacore.staon.bo.StatoLavorazione;
import it.csi.stacore.staon.bo.TipoAgevolazione;
import it.csi.stacore.staon.bo.TipoCalcolo;
import it.csi.stacore.staon.bo.TipoCalcoloRimorchiabilita;
import it.csi.stacore.staon.bo.TipoCompensazione;
import it.csi.stacore.staon.bo.TipoComunicazContrib;
import it.csi.stacore.staon.bo.TipoContributo;
import it.csi.stacore.staon.bo.TipoEvento;
import it.csi.stacore.staon.bo.TipoIntermediario;
import it.csi.stacore.staon.bo.TipoOperazioneLogica;
import it.csi.stacore.staon.bo.TipoRiduzione;
import it.csi.stacore.staon.bo.TipoSanzionamento;
import it.csi.stacore.staon.bo.TipoVeicolo;
import it.csi.stacore.staon.bo.UsoVeicolo;
import it.csi.stacore.staon.bo.avvisi.accertamento.CausaleChiusura;
import it.csi.stacore.staon.bo.avvisi.accertamento.StatoAccertamento;
import it.csi.stacore.staon.bo.avvisi.accertamento.StatoTributo;
import it.csi.stacore.staon.bo.avvisi.accertamento.TipoAvvisoAccertamento;
import it.csi.stacore.staon.bo.avvisi.accertamento.TipoPeriodicita;
import it.csi.stacore.staon.bo.avvisi.accertamento.TipoTassazione;
import it.csi.stacore.staon.bo.avvisi.scadenza.StatoAvvisoScadenza;
import it.csi.stacore.staon.bo.avvisi.scadenza.TipoAvvisoScadenza;
import it.csi.stacore.staon.bo.avvisi.segnalazione.CausaleSegnalazione;
import it.csi.stacore.staon.bo.avvisi.segnalazione.MotivoSegnalazione;
import it.csi.stacore.staon.bo.avvisi.segnalazione.StatoSegnalazione;
import it.csi.stacore.staon.bo.avvisi.segnalazione.TipoAvvisoSegnalazione;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.bo.id.IdFonte;
import it.csi.stacore.staon.bo.id.IdRegione;
import it.csi.stacore.staon.bo.id.IdStatoLavorazione;
import it.csi.stacore.staon.bo.id.IdTipoComunicazContrib;
import it.csi.stacore.staon.bo.id.IdTipoEvento;
import it.csi.stacore.staon.bo.utente.Ente;
import it.csi.stacore.staon.bo.utente.Utente;
import it.csi.stacore.staon.integration.dao.AbstractDAO;
import it.csi.stacore.staon.integration.dao.DecodificaDAO;
import it.csi.stacore.staon.integration.dao.oracle.query.select.AbstractSelect;
import it.csi.stacore.staon.integration.dao.oracle.query.select.agevolazione.SelectAbilitazioneAgevolazione;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectAgenziaUA;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectAllCategorieEuro;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectCarrozzeria;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectCategoriaEuro;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectCategoriaEuroByTipoVeicolo;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectCausaleChiusura;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectCausaleSegnalazione;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectCausaleSospensione;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectChiusuraComunicazione;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectCombustibile;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectCombustibileImpiantoGas;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectCombustibileVeicolo;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectComuni;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectDestinazioneVeicolo;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectDivisa;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectEnteUA;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectEsitoNotifica;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectEsplicativo;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectFonte;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectFonteComunicazione;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectFonteComunicazioneAttiva;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectMotivoSegnalazione;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectParentela;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectPercentualeInteresseESanzioniContenzioso;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectProvince;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectRegione;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectRegioneIcar;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectRegoleCalcolo;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectSiglaToponomastica;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectStatiLavorazioneByIdStatoAttuale;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectStatoAccertamento;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectStatoAvvisoScadenza;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectStatoComunicazione;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectStatoComunicazioneByStatoLav;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectStatoLavorazione;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectStatoSegnalazione;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectStatoTributo;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectTipiAggregazioneByIdEnte;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectTipoAgevolazione;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectTipoAggregazione;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectTipoAvvisoAccertamento;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectTipoAvvisoScadenza;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectTipoAvvisoSegnalazione;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectTipoCalcolo;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectTipoCalcoloRimorchiabilita;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectTipoCompensazione;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectTipoComunicazContrib;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectTipoContributo;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectTipoCredito;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectTipoDocumento;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectTipoEvento;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectTipoIntermediario;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectTipoOperazioneBonIr;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectTipoOperazioneLogica;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectTipoPeriodicita;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectTipoRiduzione;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectTipoSanzionamento;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectTipoStatoPagamentoAvviso;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectTipoTassazione;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectTipoUsoVeicolo;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectTipoVeicolo;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectTipoVeicoloPerRiscossione;
import it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica.SelectUtenteUA;
import it.csi.stacore.staon.integration.dao.oracle.query.select.documentazionebonifiche.SelectIdBonifiche;
import it.csi.stacore.staon.integration.dao.oracle.query.select.documentazionebonifiche.SelectRicercaDocumentazioneBonifiche;
import it.csi.stacore.staon.integration.dao.oracle.query.select.documentazionebonifiche.SelectRicercaReportBonifiche;
import it.csi.stacore.staon.integration.dao.oracle.query.select.utente.SelectEnte;
import it.csi.stacore.staon.integration.dao.oracle.query.select.utente.SelectSportellobyEnte;
import it.csi.stacore.staon.integration.dao.oracle.query.select.utente.SelectSportellobyEnteUtente;
import it.csi.stacore.staon.integration.dao.oracle.query.select.utente.SelectTauDTipoLogica;
import it.csi.stacore.staon.integration.dao.oracle.query.select.utente.SelectUtentiCasseDaSportello;
import it.csi.stacore.staon.integration.exception.ResourceAccessException;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */


@Repository
public class OracleDecodificaDAO extends AbstractDAO implements DecodificaDAO {
	//~ Methods ==================================================================

	private static final String CODICE_TIPO_VEICOLO_NON_DEFINITO = "NN";

	private static final String CODICE_TIPO_VEICOLO_AUTOVEICOLO = "A";

	private static final String CODICE_TIPO_VEICOLO_MOTOVEICOLO = "M";

	private static final String CODICE_TIPO_VEICOLO_CICLOMOTORE = "C";

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public List findDestinazioneVeicolo(Connection connection) throws ResourceAccessException {
		SelectDestinazioneVeicolo select = new SelectDestinazioneVeicolo();

		return find(connection, select);
	}

	public List findPercentualeInteresseESanzioniContenzioso(Connection connection) throws ResourceAccessException {
		SelectPercentualeInteresseESanzioniContenzioso select = new SelectPercentualeInteresseESanzioniContenzioso();
		return find(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public List findDivisa(Connection connection) throws ResourceAccessException {
		SelectDivisa select = new SelectDivisa();

		return find(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public List findFonte(Connection connection) throws ResourceAccessException {
		SelectFonte select = new SelectFonte();

		return find(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public List findRegione(Connection connection) throws ResourceAccessException {
		SelectRegione select = new SelectRegione();

		return find(connection, select);
	}


	public List findRegioneIcar(Connection connection) throws ResourceAccessException {
		SelectRegioneIcar select = new SelectRegioneIcar();

		return find(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public List findTipoCarrozzeriaVeicolo(Connection connection) throws ResourceAccessException {
		SelectCarrozzeria select = new SelectCarrozzeria();

		return find(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public List findTipoCombustibile(Connection connection) throws ResourceAccessException {
		SelectCombustibile select = new SelectCombustibileVeicolo();

		return find(connection, select);
	}

	public List findTipoCombustibileImpiantoGas(Connection connection) throws ResourceAccessException {
		SelectCombustibileImpiantoGas select = new SelectCombustibileImpiantoGas();

		return find(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public List findTipoEvento(Connection connection) throws ResourceAccessException {
		SelectTipoEvento select = new SelectTipoEvento();

		return find(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public List findTipoUsoVeicolo(Connection connection) throws ResourceAccessException {
		SelectTipoUsoVeicolo select = new SelectTipoUsoVeicolo();

		return find(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public List findTipoVeicolo(Connection connection) throws ResourceAccessException {
		SelectTipoVeicolo select = new SelectTipoVeicolo();

		List lista = find(connection, select);
		List result = new ArrayList(lista.size());
		result.addAll(lista);

		TipoVeicolo primoTipo = null;
		TipoVeicolo secondoTipo = null;
		TipoVeicolo terzoTipo = null;

		//Tolgo dalla lista il tipo veicolo 'non definito'
		for (int i=0; lista!=null && i<lista.size(); i++){
			TipoVeicolo tipo = (TipoVeicolo)lista.get(i);
			if (CODICE_TIPO_VEICOLO_NON_DEFINITO.equalsIgnoreCase(tipo.getCodice())){
				getLogger().debug("OracleDecodificaDAO - findTipoVeicolo rimosso tipo veicolo con codice NN");
				result.remove(tipo);
			} else if (CODICE_TIPO_VEICOLO_AUTOVEICOLO.equalsIgnoreCase(tipo.getCodice())){
				getLogger().debug("OracleDecodificaDAO - findTipoVeicolo messo in prima posizione tipo autoveicolo (codice A)");
				result.remove(tipo);
				primoTipo = tipo;
			} else if (CODICE_TIPO_VEICOLO_MOTOVEICOLO.equalsIgnoreCase(tipo.getCodice())){
				getLogger().debug("OracleDecodificaDAO - findTipoVeicolo messo in seconda posizione tipo motoveicolo (codice M)");
				result.remove(tipo);
				secondoTipo = tipo;
			} else if (CODICE_TIPO_VEICOLO_CICLOMOTORE.equalsIgnoreCase(tipo.getCodice())){
				getLogger().debug("OracleDecodificaDAO - findTipoVeicolo messo in terza posizione tipo ciclomotore (codice C)");
				result.remove(tipo);
				terzoTipo = tipo;
			}
		}
		List resultF = new ArrayList(0);
		resultF.add(primoTipo);
		resultF.add(secondoTipo);
		resultF.add(terzoTipo);
		resultF.addAll(result);

		return resultF;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public List findProvince(Connection connection) throws ResourceAccessException {
		SelectProvince select = new SelectProvince();

		return find(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public List findTipoAgevolazione(Connection connection) throws ResourceAccessException {
		SelectTipoAgevolazione select = new SelectTipoAgevolazione();

		return find(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public List findTipoOperazioneLogica(Connection connection) throws ResourceAccessException {
		SelectTipoOperazioneLogica select = new SelectTipoOperazioneLogica();

		return find(connection, select);
	}

	public List findTipoRiduzioneAllaData(Connection connection, Date data) throws ResourceAccessException {
		SelectTipoRiduzione select = new SelectTipoRiduzione(data);

		return find(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public List findTipoIntermediario(Connection connection) throws ResourceAccessException {
		SelectTipoIntermediario select = new SelectTipoIntermediario();

		return find(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public List findEsplicativo(Connection connection) throws ResourceAccessException {
		SelectEsplicativo select = new SelectEsplicativo();

		return find(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public List findTipoSanzionamento(Connection connection) throws ResourceAccessException {
		SelectTipoSanzionamento select = new SelectTipoSanzionamento();

		return find(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public List findTipoContributo(Connection connection) throws ResourceAccessException {
		SelectTipoContributo select = new SelectTipoContributo();

		return find(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public List findTipoCalcolo(Connection connection) throws ResourceAccessException {
		SelectTipoCalcolo select = new SelectTipoCalcolo();

		return find(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public List findTipoCalcoloRimorchiabilita(Connection connection) throws ResourceAccessException {
		SelectTipoCalcoloRimorchiabilita select = new SelectTipoCalcoloRimorchiabilita();

		return find(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public List findTipoCompensazione(Connection connection) throws ResourceAccessException {
		SelectTipoCompensazione select = new SelectTipoCompensazione();

		return find(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public List findTipoAggregazione(Connection connection) throws ResourceAccessException {
		SelectTipoAggregazione select = new SelectTipoAggregazione();

		return find(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public List findTipiAggregazioneByIdEnte(Connection connection, IdDecodifica idEnte) throws ResourceAccessException {
		SelectTipiAggregazioneByIdEnte select = new SelectTipiAggregazioneByIdEnte(idEnte);

		return find(connection, select);
	}

	private List find(Connection connection, AbstractSelect select) throws ResourceAccessException {
		try {
			return select.executeMultipla(connection);
		} catch (SQLException e) {
			if (getLogger().isErrorEnabled()) {
				getLogger().error("SQLException find: " + e.getMessage(), e);
			}

			throw new ResourceAccessException("OracleDecodificaDAO.find", e);
		}
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public List findTipoOperazioneBonificaIR(Connection connection) throws ResourceAccessException {
		SelectTipoOperazioneBonIr select = new SelectTipoOperazioneBonIr();

		return find(connection, select);
	}

	// Caricamento decodifiche in base a ID
	public DestinazioneVeicolo loadDestinazioneVeicoloById(Connection connection, IdDecodifica id) throws ResourceAccessException {
		SelectDestinazioneVeicolo select = new SelectDestinazioneVeicolo(id);

		return (DestinazioneVeicolo) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param id DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public Divisa loadDivisaById(Connection connection, IdDecodifica id) throws ResourceAccessException {
		SelectDivisa select = new SelectDivisa(id);

		return (Divisa) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param id DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public Fonte loadFonteById(Connection connection, IdFonte id) throws ResourceAccessException {
		SelectFonte select = new SelectFonte(id);

		return (Fonte) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param id DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public Regione loadRegioneById(Connection connection, IdRegione id) throws ResourceAccessException {
		SelectRegione select = new SelectRegione(id);

		return (Regione) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param id DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public Carrozzeria loadTipoCarrozzeriaVeicoloById(Connection connection, IdDecodifica id) throws ResourceAccessException {
		SelectCarrozzeria select = new SelectCarrozzeria(id);

		return (Carrozzeria) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param id DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public Combustibile loadTipoCombustibileById(Connection connection, IdDecodifica id) throws ResourceAccessException {
		SelectCombustibile select = new SelectCombustibileVeicolo(id);

		return (Combustibile) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param id DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public TipoEvento loadTipoEventoById(Connection connection, IdTipoEvento id) throws ResourceAccessException {
		SelectTipoEvento select = new SelectTipoEvento(id);

		return (TipoEvento) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param id DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public TipoOperazioneLogica loadTipoOperazioneLogicaById(Connection connection, IdDecodifica id) throws ResourceAccessException {
		SelectTipoOperazioneLogica select = new SelectTipoOperazioneLogica(id);

		return (TipoOperazioneLogica) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param id DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public UsoVeicolo loadTipoUsoVeicoloById(Connection connection, IdDecodifica id) throws ResourceAccessException {
		SelectTipoUsoVeicolo select = new SelectTipoUsoVeicolo(id);

		return (UsoVeicolo) load(connection, select);
	}

	public CategoriaEuro loadCategoriaEuroById(Connection connection, IdDecodifica id) throws ResourceAccessException {
		SelectCategoriaEuro select = new SelectCategoriaEuro(id);

		return (CategoriaEuro) load(connection, select);
	}

	public CategoriaEuro loadCategoriaEuroByCodice(Connection connection, String codice) throws ResourceAccessException {
		SelectCategoriaEuro select = new SelectCategoriaEuro(codice);

		return (CategoriaEuro) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param id DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public TipoVeicolo loadTipoVeicoloById(Connection connection, IdDecodifica id) throws ResourceAccessException {
		SelectTipoVeicolo select = new SelectTipoVeicolo(id);

		return (TipoVeicolo) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param id DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public TipoAgevolazione loadTipoAgevolazioneById(Connection connection, IdDecodifica id) throws ResourceAccessException {
		SelectTipoAgevolazione select = new SelectTipoAgevolazione(id);

		return (TipoAgevolazione) load(connection, select);
	}

	public TipoRiduzione loadTipoRiduzioneByIdAllaData(Connection connection, IdDecodifica id, Date data) throws ResourceAccessException {
		SelectTipoRiduzione select = new SelectTipoRiduzione(id, data);

		return (TipoRiduzione) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param id DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public TipoIntermediario loadTipoIntermediarioById(Connection connection, IdDecodifica id) throws ResourceAccessException {
		SelectTipoIntermediario select = new SelectTipoIntermediario(id);

		return (TipoIntermediario) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param id DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public Esplicativo loadEsplicativoById(Connection connection, IdDecodifica id) throws ResourceAccessException {
		SelectEsplicativo select = new SelectEsplicativo(id);

		return (Esplicativo) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param id DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public TipoSanzionamento loadTipoSanzionamentoById(Connection connection, IdDecodifica id) throws ResourceAccessException {
		SelectTipoSanzionamento select = new SelectTipoSanzionamento(id);

		return (TipoSanzionamento) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param id DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public TipoContributo loadTipoContributoById(Connection connection, IdDecodifica id) throws ResourceAccessException {
		SelectTipoContributo select = new SelectTipoContributo(id);

		return (TipoContributo) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param id DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public TipoCalcolo loadTipoCalcoloById(Connection connection, IdDecodifica id) throws ResourceAccessException {
		SelectTipoCalcolo select = new SelectTipoCalcolo(id);

		return (TipoCalcolo) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param id DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public TipoCalcoloRimorchiabilita loadTipoCalcoloRimorchiabilitaById(Connection connection, IdDecodifica id) throws ResourceAccessException {
		SelectTipoCalcoloRimorchiabilita select = new SelectTipoCalcoloRimorchiabilita(id);

		return (TipoCalcoloRimorchiabilita) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param id DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public TipoCompensazione loadTipoCompensazioneById(Connection connection, IdDecodifica id) throws ResourceAccessException {
		SelectTipoCompensazione select = new SelectTipoCompensazione(id);

		return (TipoCompensazione) load(connection, select);
	}

	// Caricamento decodifiche in base a CODICE
	public DestinazioneVeicolo loadDestinazioneVeicoloByCodice(Connection connection, String codice) throws ResourceAccessException {
		SelectDestinazioneVeicolo select = new SelectDestinazioneVeicolo(codice);

		return (DestinazioneVeicolo) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param codice DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public Divisa loadDivisaByCodice(Connection connection, String codice) throws ResourceAccessException {
		SelectDivisa select = new SelectDivisa(codice);

		return (Divisa) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param codice DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public Fonte loadFonteByCodice(Connection connection, String codice) throws ResourceAccessException {
		SelectFonte select = new SelectFonte(codice);

		return (Fonte) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param codice DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public Regione loadRegioneByCodice(Connection connection, String codice) throws ResourceAccessException {
		SelectRegione select = new SelectRegione(codice);

		return (Regione) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param codice DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public Carrozzeria loadTipoCarrozzeriaVeicoloByCodice(Connection connection, String codice) throws ResourceAccessException {
		SelectCarrozzeria select = new SelectCarrozzeria(codice);

		return (Carrozzeria) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param codice DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public Combustibile loadTipoCombustibileByCodice(Connection connection, String codice) throws ResourceAccessException {
		SelectCombustibile select = new SelectCombustibileVeicolo(codice);

		return (Combustibile) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param codice DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public TipoEvento loadTipoEventoByCodice(Connection connection, String codice) throws ResourceAccessException {
		SelectTipoEvento select = new SelectTipoEvento(codice);

		return (TipoEvento) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param codice DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public UsoVeicolo loadTipoUsoVeicoloByCodice(Connection connection, String codice) throws ResourceAccessException {
		SelectTipoUsoVeicolo select = new SelectTipoUsoVeicolo(codice);

		return (UsoVeicolo) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param codice DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public TipoVeicolo loadTipoVeicoloByCodice(Connection connection, String codice) throws ResourceAccessException {
		SelectTipoVeicolo select = new SelectTipoVeicolo(codice);

		return (TipoVeicolo) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param codice DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public TipoAgevolazione loadTipoAgevolazioneByCodice(Connection connection, String codice) throws ResourceAccessException {
		SelectTipoAgevolazione select = new SelectTipoAgevolazione(codice);

		return (TipoAgevolazione) load(connection, select);
	}

	public TipoRiduzione loadTipoRiduzioneByCodiceAllaData(Connection connection, String codice, Date data) throws ResourceAccessException {
		SelectTipoRiduzione select = new SelectTipoRiduzione(codice, data);

		return (TipoRiduzione) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param codice DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public TipoIntermediario loadTipoIntermediarioByCodice(Connection connection, String codice) throws ResourceAccessException {
		SelectTipoIntermediario select = new SelectTipoIntermediario(codice);

		return (TipoIntermediario) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param codice DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public Esplicativo loadEsplicativoByCodice(Connection connection, String codice) throws ResourceAccessException {
		SelectEsplicativo select = new SelectEsplicativo(codice);

		return (Esplicativo) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param codice DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public TipoSanzionamento loadTipoSanzionamentoByCodice(Connection connection, String codice) throws ResourceAccessException {
		SelectTipoSanzionamento select = new SelectTipoSanzionamento(codice);

		return (TipoSanzionamento) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param codice DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public TipoContributo loadTipoContributoByCodice(Connection connection, String codice) throws ResourceAccessException {
		SelectTipoContributo select = new SelectTipoContributo(codice);

		return (TipoContributo) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param codice DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public TipoCalcolo loadTipoCalcoloByCodice(Connection connection, String codice) throws ResourceAccessException {
		SelectTipoCalcolo select = new SelectTipoCalcolo(codice);

		return (TipoCalcolo) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param codice DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public TipoCalcoloRimorchiabilita loadTipoCalcoloRimorchiabilitaByCodice(Connection connection, String codice) throws ResourceAccessException {
		SelectTipoCalcoloRimorchiabilita select = new SelectTipoCalcoloRimorchiabilita(codice);

		return (TipoCalcoloRimorchiabilita) load(connection, select);
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 * @param codice DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public TipoCompensazione loadTipoCompensazioneByCodice(Connection connection, String codice) throws ResourceAccessException {
		SelectTipoCompensazione select = new SelectTipoCompensazione(codice);

		return (TipoCompensazione) load(connection, select);
	}

	private Object load(Connection connection, AbstractSelect select) throws ResourceAccessException {
		try {
			return select.execute(connection);
		} catch (SQLException e) {
			if (getLogger().isErrorEnabled()) {
				getLogger().error("SQLException loadById: " + e.getMessage(), e);
			}

			throw new ResourceAccessException("OracleDecodificaDAO.loadById", e);
		}
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param connection DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ResourceAccessException DOCUMENT ME!
	 */
	public List findComuni(Connection connection, String comune) throws ResourceAccessException {

		SelectComuni select = new SelectComuni(comune);
		return find(connection, select);
	}

	public List findSiglaToponomastica(Connection connection) throws ResourceAccessException {

		SelectSiglaToponomastica select = new SelectSiglaToponomastica();
		return find(connection, select);
	}

	// --------------------------
	public List findEnte(Connection connection) throws ResourceAccessException {

		SelectEnte select = new SelectEnte();
		return find(connection, select);
	}

	public List findTipoVeicoloPerRiscossione(Connection connection) throws ResourceAccessException {
		return find(connection, new SelectTipoVeicoloPerRiscossione());
	}

	public List findEnteByUtente(Connection connection, Utente utente) throws ResourceAccessException {

		SelectEnte select = new SelectEnte(utente);
		return find(connection, select);
	}

	public List findSportelloByEnte(Connection connection, Ente ente) throws ResourceAccessException {

		SelectSportellobyEnte select = new SelectSportellobyEnte(ente);
		return find(connection, select);
	}

	public List findTipologiaBonifica(Connection connection) throws ResourceAccessException {

		SelectTauDTipoLogica select = new SelectTauDTipoLogica();
		return find(connection, select);
	}

	public List ricercaReportBonifiche(Connection connection, ReportBonificheRequest request)  throws ResourceAccessException {

		SelectRicercaReportBonifiche selectSenza = new SelectRicercaReportBonifiche(request);
		return find(connection, selectSenza);

	}

	public List ricercaBonifiche(Connection connection, List idBonifica) throws ResourceAccessException {

		SelectRicercaDocumentazioneBonifiche select = new SelectRicercaDocumentazioneBonifiche(idBonifica);
		return find(connection, select);
	}

	public List ricercaIdBonifiche (Connection connection, RicercaBonificheRequest request) throws ResourceAccessException {

		SelectIdBonifiche select = new SelectIdBonifiche(request);
		return find(connection, select);
	}

	public List findSportelloByEnteUtente(Connection connection, Ente ente, Utente utente) throws ResourceAccessException {

		SelectSportellobyEnteUtente select = new SelectSportellobyEnteUtente(ente, utente);
		return find(connection, select);
	}

	public List findStatoSegnalazione(Connection connection) throws ResourceAccessException {

		SelectStatoSegnalazione select = new SelectStatoSegnalazione();
		return find(connection, select);
	}

	public StatoSegnalazione loadStatoSegnalazioneById(Connection connection, IdDecodifica id) throws ResourceAccessException {
		SelectStatoSegnalazione select = new SelectStatoSegnalazione(id);
		return (StatoSegnalazione) load(connection, select);
	}

	public List findMotivoSegnalazione(Connection connection) throws ResourceAccessException {

		SelectMotivoSegnalazione select = new SelectMotivoSegnalazione();
		return find(connection, select);
	}

	public MotivoSegnalazione loadMotivoSegnalazioneById(Connection connection, IdDecodifica id) throws ResourceAccessException {
		SelectMotivoSegnalazione select = new SelectMotivoSegnalazione(id);
		return (MotivoSegnalazione) load(connection, select);
	}

	public List findCausaleSegnalazione(Connection connection) throws ResourceAccessException {

		SelectCausaleSegnalazione select = new SelectCausaleSegnalazione();
		return find(connection, select);
	}

	public CausaleSegnalazione loadCausaleSegnalazioneById(Connection connection, IdDecodifica id) throws ResourceAccessException {
		SelectCausaleSegnalazione select = new SelectCausaleSegnalazione(id);
		return (CausaleSegnalazione) load(connection, select);
	}

	public List findTipoAvvisoSegnalazione(Connection connection) throws ResourceAccessException {

		SelectTipoAvvisoSegnalazione select = new SelectTipoAvvisoSegnalazione();
		return find(connection, select);
	}

	public TipoAvvisoSegnalazione loadTipoAvvisoSegnalazioneById(Connection connection, IdDecodifica id) throws ResourceAccessException {
		SelectTipoAvvisoSegnalazione select = new SelectTipoAvvisoSegnalazione(id);
		return (TipoAvvisoSegnalazione) load(connection, select);
	}

	public List findTipoAvvisoScadenza(Connection connection) throws ResourceAccessException {

		SelectTipoAvvisoScadenza select = new SelectTipoAvvisoScadenza();
		return find(connection, select);
	}

	public TipoAvvisoScadenza loadTipoAvvisoScadenzaById(Connection connection, IdDecodifica id) throws ResourceAccessException {
		SelectTipoAvvisoScadenza select = new SelectTipoAvvisoScadenza(id);
		return (TipoAvvisoScadenza) load(connection, select);
	}

	public List findStatoAvvisoScadenza(Connection connection) throws ResourceAccessException {

		SelectStatoAvvisoScadenza select = new SelectStatoAvvisoScadenza();
		return find(connection, select);
	}

	public StatoAvvisoScadenza loadStatoAvvisoScadenzaById(Connection connection, IdDecodifica id) throws ResourceAccessException {
		SelectStatoAvvisoScadenza select = new SelectStatoAvvisoScadenza(id);
		return (StatoAvvisoScadenza) load(connection, select);
	}

	public List findCategoriaEuro(Integer tipoVeicolo, Connection connection) throws ResourceAccessException {
		AbstractSelect select;
		if (tipoVeicolo != null)
			select = new SelectCategoriaEuroByTipoVeicolo(tipoVeicolo);
		else
			select = new SelectAllCategorieEuro();
		return find(connection, select);
	}

	public List findCausaleChiusura(Connection connection) throws ResourceAccessException {
		SelectCausaleChiusura select = new SelectCausaleChiusura();
		return find(connection, select);
	}

	public List findCausaleSospensione(Connection connection) throws ResourceAccessException {
		SelectCausaleSospensione select = new SelectCausaleSospensione(new Date());
		return find(connection, select);
	}

	public List findStatoAccertamento(Connection connection) throws ResourceAccessException {
		SelectStatoAccertamento select = new SelectStatoAccertamento();
		return find(connection, select);
	}

	public List findTipoAvvisoAccertamento(Connection connection) throws ResourceAccessException {
		SelectTipoAvvisoAccertamento select = new SelectTipoAvvisoAccertamento();
		return find(connection, select);
	}

	public List findTipoPeriodicita(Connection connection) throws ResourceAccessException {
		SelectTipoPeriodicita select = new SelectTipoPeriodicita();
		return find(connection, select);
	}

	public List findTipoTassazione(Connection connection) throws ResourceAccessException {
		SelectTipoTassazione select = new SelectTipoTassazione();
		return find(connection, select);
	}

	public CausaleChiusura loadCausaleChiusuraById(Connection connection, IdDecodifica id) throws ResourceAccessException {
		SelectCausaleChiusura select = new SelectCausaleChiusura(id);
		return (CausaleChiusura) load(connection, select);
	}

	public StatoAccertamento loadStatoAccertamentoById(Connection connection, IdDecodifica id) throws ResourceAccessException {
		SelectStatoAccertamento select = new SelectStatoAccertamento(id);
		return (StatoAccertamento) load(connection, select);
	}

	public TipoAvvisoAccertamento loadTipoAvvisoAccertamentoById(Connection connection, IdDecodifica id) throws ResourceAccessException {
		SelectTipoAvvisoAccertamento select = new SelectTipoAvvisoAccertamento(id);
		return (TipoAvvisoAccertamento) load(connection, select);
	}

	public TipoPeriodicita loadTipoPeriodicitaById(Connection connection, IdDecodifica id) throws ResourceAccessException {
		SelectTipoPeriodicita select = new SelectTipoPeriodicita(id);
		return (TipoPeriodicita) load(connection, select);
	}

	public TipoTassazione loadTipoTassazioneById(Connection connection, IdDecodifica id) throws ResourceAccessException {
		SelectTipoTassazione select = new SelectTipoTassazione(id);
		return (TipoTassazione) load(connection, select);
	}

	public List findStatoTributo(Connection connection) throws ResourceAccessException {
		SelectStatoTributo select = new SelectStatoTributo();
		return find(connection, select);
	}

	public StatoTributo loadStatoTributoById(Connection connection, IdDecodifica id) throws ResourceAccessException {
		SelectStatoTributo select = new SelectStatoTributo(id);
		return (StatoTributo) load(connection, select);
	}

	/* (non-Javadoc)
	 * @see it.csi.stacore.staon.integration.DecodificaDAO#findAbilitazioneAgevolazione(java.sql.Connection)
	 */
	public List findAbilitazioneAgevolazione(Connection connection) throws ResourceAccessException {
		SelectAbilitazioneAgevolazione select = new SelectAbilitazioneAgevolazione();
		return find(connection, select);
	}

	public List findTipoCredito(Connection connection) throws ResourceAccessException {
		SelectTipoCredito select = new SelectTipoCredito();
		return find(connection, select);
	}
	public List findStatoPagamentoAvviso(Connection connection) throws ResourceAccessException {
		SelectTipoStatoPagamentoAvviso select = new SelectTipoStatoPagamentoAvviso();
		return find(connection, select);
	}

	public List findRegoleCalcolo(Connection connection) throws ResourceAccessException {
		SelectRegoleCalcolo select = new SelectRegoleCalcolo();
		return find(connection, select);
	}

	public List findEntiRiscossori(Connection connection) throws ResourceAccessException {
		SelectEnte select = new SelectEnte(Boolean.TRUE);
		return find(connection, select);
	}

	public Ente getEnteByIdSportello(Connection connection, Long idSportello) throws ResourceAccessException {
		try {
			return (Ente)new SelectEnte(idSportello).execute(connection);
		} catch (SQLException e) {
			if (getLogger().isErrorEnabled()) {
				getLogger().error("SQLException find: " + e.getMessage(), e);
			}

			throw new ResourceAccessException("OracleDecodificaDAO.getEnteByIdSportello", e);
		}
	}

	public FonteComunicazione loadFonteComunicazioneByCodice(Connection connection, String codice) throws ResourceAccessException {
		SelectFonteComunicazione select = new SelectFonteComunicazione(codice);

		return (FonteComunicazione) load(connection, select);
	}

	public TipoComunicazContrib loadTipoComunicazContribByCodice(Connection connection, String codice) throws ResourceAccessException {
		SelectTipoComunicazContrib select = new SelectTipoComunicazContrib(codice);

		return (TipoComunicazContrib) load(connection, select);
	}

	public StatoComunicazione loadStatoComunicazioneByCodice(Connection connection, String codice) throws ResourceAccessException {
		SelectStatoComunicazione select = new SelectStatoComunicazione(codice);

		return (StatoComunicazione) load(connection, select);
	}

	public StatoLavorazione loadStatoLavorazioneByCodice(Connection connection, String codice) throws ResourceAccessException {
		SelectStatoLavorazione select = new SelectStatoLavorazione(codice);

		return (StatoLavorazione) load(connection, select);
	}

	public List findEsitoNotifica(Connection connection) throws ResourceAccessException {
		SelectEsitoNotifica select = new SelectEsitoNotifica();

		return find(connection, select);
	}

	public List findFonteComunicazione(Connection connection) throws ResourceAccessException {
		SelectFonteComunicazione select = new SelectFonteComunicazione();

		return find(connection, select);
	}

	public List findStatoComunicazione(Connection connection) throws ResourceAccessException {
		SelectStatoComunicazione select = new SelectStatoComunicazione();

		return find(connection, select);
	}

	public List findStatoLavorazione(Connection connection) throws ResourceAccessException {
		SelectStatoLavorazione select = new SelectStatoLavorazione();

		return find(connection, select);
	}

	public List findChiusuraComunicazione(Connection connection) throws ResourceAccessException {
		SelectChiusuraComunicazione select = new SelectChiusuraComunicazione();

		return find(connection, select);
	}

	public List findStatiLavorazioneByStatoAttuale(Connection connection, IdStatoLavorazione idStatoLavorazione, IdTipoComunicazContrib idTipoComunicazContrib) throws ResourceAccessException {
		SelectStatiLavorazioneByIdStatoAttuale select = new SelectStatiLavorazioneByIdStatoAttuale(idStatoLavorazione, idTipoComunicazContrib);
		return find(connection, select);
	}

	public List findFonteComunicazioneAttiva(Connection connection) throws ResourceAccessException {
		SelectFonteComunicazioneAttiva select = new SelectFonteComunicazioneAttiva();

		return find(connection, select);
	}

	public StatoComunicazione findStatoComunicazioneByStatoLav(Connection connection, IdStatoLavorazione idStatoLavorazione, IdStatoLavorazione idStatoLavPrec, IdTipoComunicazContrib idTipoComunicazContrib) throws ResourceAccessException {
		SelectStatoComunicazioneByStatoLav select = new SelectStatoComunicazioneByStatoLav(idStatoLavorazione, idStatoLavPrec, idTipoComunicazContrib);
		try {
			return (StatoComunicazione)select.execute(connection);
		} catch (SQLException e) {
			if (getLogger().isErrorEnabled()) {
				getLogger().error("SQLException getStoricoVariazioniByIdCom: " + e.getMessage(), e);
			}

			throw new ResourceAccessException("OracleComunicazioneUtenteDAO.getStoricoVariazioniByIdCom", e);
		}
	}

	//PARENTELA
	public List findParentela(Connection connection) throws ResourceAccessException {
		SelectParentela select = new SelectParentela();
		return find(connection, select);
	}

	public List findEnteUA(Connection connection, String codiceFiscale) throws ResourceAccessException {
		SelectEnteUA select = new SelectEnteUA(codiceFiscale);

		return find(connection, select);
	}

	public List findAgenziaUA(Connection connection, String enteDescrizione) throws ResourceAccessException {
		SelectAgenziaUA select = new SelectAgenziaUA(enteDescrizione);

		return find(connection, select);
	}

	public List findUtenteUA(Connection connection, String codiceAgenzia) throws ResourceAccessException {
		SelectUtenteUA select = new SelectUtenteUA(codiceAgenzia);

		return find(connection, select);
	}

	public List findTipoDocumento(Connection connection) throws ResourceAccessException {
		SelectTipoDocumento select = new SelectTipoDocumento();

		return find(connection, select);
	}

	public List findCasseConUtenteDaSportello(Connection connection, Long idSportello) throws ResourceAccessException {

		SelectUtentiCasseDaSportello select = new SelectUtentiCasseDaSportello(idSportello);
		return find(connection, select);
	}

}