package it.csi.stacore.staon.integration.dao;

import java.sql.Connection;
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
import it.csi.stacore.staon.integration.exception.ResourceAccessException;

/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */


public interface DecodificaDAO {
    //~ Methods ==================================================================

    /**
     * DOCUMENT ME!
     *
     * @param connection DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws ResourceAccessException DOCUMENT ME!
     */
    public List findDestinazioneVeicolo(Connection connection) throws ResourceAccessException;

    public List findPercentualeInteresseESanzioniContenzioso(Connection connection) throws ResourceAccessException;

    /**
     * DOCUMENT ME!
     *
     * @param connection DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws ResourceAccessException DOCUMENT ME!
     */
    public List findDivisa(Connection connection) throws ResourceAccessException;

    /**
     * DOCUMENT ME!
     *
     * @param connection DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws ResourceAccessException DOCUMENT ME!
     */
    public List findFonte(Connection connection) throws ResourceAccessException;

    /**
     * DOCUMENT ME!
     *
     * @param connection DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws ResourceAccessException DOCUMENT ME!
     */

    public List<Regione> findRegione(Connection connection) throws ResourceAccessException;


    public List findRegioneIcar(Connection connection) throws ResourceAccessException;

    /**
     * DOCUMENT ME!
     *
     * @param connection DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws ResourceAccessException DOCUMENT ME!
     */
    public List findTipoCarrozzeriaVeicolo(Connection connection) throws ResourceAccessException;

    /**
     * DOCUMENT ME!
     *
     * @param connection DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws ResourceAccessException DOCUMENT ME!
     */
    public List findTipoCombustibile(Connection connection) throws ResourceAccessException;

    public List findTipoCombustibileImpiantoGas(Connection connection) throws ResourceAccessException;

    /**
     * DOCUMENT ME!
     *
     * @param connection DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws ResourceAccessException DOCUMENT ME!
     */
    public List findTipoEvento(Connection connection) throws ResourceAccessException;

    /**
     * DOCUMENT ME!
     *
     * @param connection DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws ResourceAccessException DOCUMENT ME!
     */
    public List findTipoUsoVeicolo(Connection connection) throws ResourceAccessException;

    /**
     * DOCUMENT ME!
     *
     * @param connection DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws ResourceAccessException DOCUMENT ME!
     */
    public List findTipoVeicolo(Connection connection) throws ResourceAccessException;

    /**
     * DOCUMENT ME!
     *
     * @param connection DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws ResourceAccessException DOCUMENT ME!
     */
    public List findProvince(Connection connection) throws ResourceAccessException;

    /**
     * DOCUMENT ME!
     *
     * @param connection DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws ResourceAccessException DOCUMENT ME!
     */
    public List findTipoAgevolazione(Connection connection) throws ResourceAccessException;

    public List findAbilitazioneAgevolazione(Connection connection) throws ResourceAccessException;

    /**
     * DOCUMENT ME!
     *
     * @param connection DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws ResourceAccessException DOCUMENT ME!
     */
    public List findTipoOperazioneLogica(Connection connection) throws ResourceAccessException;

    /**
     * DOCUMENT ME!
     *
     * @param connection DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws ResourceAccessException DOCUMENT ME!
     */
    public List findTipoIntermediario(Connection connection) throws ResourceAccessException;

    /**
     * DOCUMENT ME!
     *
     * @param connection DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws ResourceAccessException DOCUMENT ME!
     */
    public List findEsplicativo(Connection connection) throws ResourceAccessException;

    /**
     * DOCUMENT ME!
     *
     * @param connection DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws ResourceAccessException DOCUMENT ME!
     */
    public List findTipoSanzionamento(Connection connection) throws ResourceAccessException;

    /**
     * DOCUMENT ME!
     *
     * @param connection DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws ResourceAccessException DOCUMENT ME!
     */
    public List findTipoContributo(Connection connection) throws ResourceAccessException;

    /**
     * DOCUMENT ME!
     *
     * @param connection DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws ResourceAccessException DOCUMENT ME!
     */
    public List findTipoCalcolo(Connection connection) throws ResourceAccessException;

    /**
     * DOCUMENT ME!
     *
     * @param connection DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws ResourceAccessException DOCUMENT ME!
     */
    public List findTipoCalcoloRimorchiabilita(Connection connection) throws ResourceAccessException;

    /**
     * DOCUMENT ME!
     *
     * @param connection DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws ResourceAccessException DOCUMENT ME!
     */
    public List findTipoCompensazione(Connection connection) throws ResourceAccessException;

    /**
     * DOCUMENT ME!
     *
     * @param connection DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws ResourceAccessException DOCUMENT ME!
     */
    public List findTipoAggregazione(Connection connection) throws ResourceAccessException;

    /**
     * DOCUMENT ME!
     *
     * @param connection DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws ResourceAccessException DOCUMENT ME!
     */
    public List findTipiAggregazioneByIdEnte(Connection connection, IdDecodifica idEnte) throws ResourceAccessException;

    /**
     * DOCUMENT ME!
     *
     * @param connection DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws ResourceAccessException DOCUMENT ME!
     */
    public List findTipoOperazioneBonificaIR(Connection connection) throws ResourceAccessException;


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
    public DestinazioneVeicolo loadDestinazioneVeicoloById(Connection connection, IdDecodifica id) throws ResourceAccessException;

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
    public Divisa loadDivisaById(Connection connection, IdDecodifica id) throws ResourceAccessException;

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
    public Fonte loadFonteById(Connection connection, IdFonte id) throws ResourceAccessException;

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
    public Regione loadRegioneById(Connection connection, IdRegione id) throws ResourceAccessException;

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
    public Carrozzeria loadTipoCarrozzeriaVeicoloById(Connection connection, IdDecodifica id) throws ResourceAccessException;

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
    public Combustibile loadTipoCombustibileById(Connection connection, IdDecodifica id) throws ResourceAccessException;

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
    public TipoEvento loadTipoEventoById(Connection connection, IdTipoEvento id) throws ResourceAccessException;

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
    public UsoVeicolo loadTipoUsoVeicoloById(Connection connection, IdDecodifica id) throws ResourceAccessException;


    public CategoriaEuro loadCategoriaEuroById(Connection connection, IdDecodifica id) throws ResourceAccessException;

    public CategoriaEuro loadCategoriaEuroByCodice(Connection connection, String codice) throws ResourceAccessException;

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
    public TipoVeicolo loadTipoVeicoloById(Connection connection, IdDecodifica id) throws ResourceAccessException;

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
    public TipoAgevolazione loadTipoAgevolazioneById(Connection connection, IdDecodifica id) throws ResourceAccessException;

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
    public TipoOperazioneLogica loadTipoOperazioneLogicaById(Connection connection, IdDecodifica id) throws ResourceAccessException;

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
    public TipoIntermediario loadTipoIntermediarioById(Connection connection, IdDecodifica id) throws ResourceAccessException;

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
    public Esplicativo loadEsplicativoById(Connection connection, IdDecodifica id) throws ResourceAccessException;

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
    public TipoSanzionamento loadTipoSanzionamentoById(Connection connection, IdDecodifica id) throws ResourceAccessException;

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
    public TipoContributo loadTipoContributoById(Connection connection, IdDecodifica id) throws ResourceAccessException;

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
    public TipoCalcolo loadTipoCalcoloById(Connection connection, IdDecodifica id) throws ResourceAccessException;

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
    public TipoCalcoloRimorchiabilita loadTipoCalcoloRimorchiabilitaById(Connection connection,
            IdDecodifica id) throws ResourceAccessException;

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
    public TipoCompensazione loadTipoCompensazioneById(Connection connection, IdDecodifica id) throws ResourceAccessException;

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
    public DestinazioneVeicolo loadDestinazioneVeicoloByCodice(Connection connection, String codice) throws ResourceAccessException;

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
    public Divisa loadDivisaByCodice(Connection connection, String codice) throws ResourceAccessException;

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
    public Fonte loadFonteByCodice(Connection connection, String codice) throws ResourceAccessException;

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
    public Regione loadRegioneByCodice(Connection connection, String codice) throws ResourceAccessException;

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
    public Carrozzeria loadTipoCarrozzeriaVeicoloByCodice(Connection connection, String codice) throws ResourceAccessException;

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
    public Combustibile loadTipoCombustibileByCodice(Connection connection, String codice) throws ResourceAccessException;

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
    public TipoEvento loadTipoEventoByCodice(Connection connection, String codice) throws ResourceAccessException;

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
    public UsoVeicolo loadTipoUsoVeicoloByCodice(Connection connection, String codice) throws ResourceAccessException;

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
    public TipoVeicolo loadTipoVeicoloByCodice(Connection connection, String codice) throws ResourceAccessException;

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
    public TipoAgevolazione loadTipoAgevolazioneByCodice(Connection connection, String codice) throws ResourceAccessException;

    //  public Operazione loadTipoOperazioneByCodice(Connection connection) throws ResourceAccessException;

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
    public TipoIntermediario loadTipoIntermediarioByCodice(Connection connection, String codice) throws ResourceAccessException;

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
    public Esplicativo loadEsplicativoByCodice(Connection connection, String codice) throws ResourceAccessException;

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
    public TipoSanzionamento loadTipoSanzionamentoByCodice(Connection connection, String codice) throws ResourceAccessException;

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
    public TipoContributo loadTipoContributoByCodice(Connection connection, String codice) throws ResourceAccessException;

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
    public TipoCalcolo loadTipoCalcoloByCodice(Connection connection, String codice) throws ResourceAccessException;

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
    public TipoCalcoloRimorchiabilita loadTipoCalcoloRimorchiabilitaByCodice(Connection connection,
            String codice) throws ResourceAccessException;

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
    public TipoCompensazione loadTipoCompensazioneByCodice(Connection connection, String codice) throws ResourceAccessException;

    public List findComuni(Connection connection, String comune) throws ResourceAccessException;

    public List findSiglaToponomastica(Connection connection) throws ResourceAccessException;

    public List findEnte(Connection connection) throws ResourceAccessException;

    public List findTipoVeicoloPerRiscossione(Connection connection) throws ResourceAccessException;

    public List findEnteByUtente(Connection connection, Utente utente) throws ResourceAccessException;

    public List findSportelloByEnte(Connection connection, Ente ente) throws ResourceAccessException;

    public List findSportelloByEnteUtente(Connection connection, Ente ente, Utente utente) throws ResourceAccessException;

    public List findStatoSegnalazione(Connection connection) throws ResourceAccessException;

    public StatoSegnalazione loadStatoSegnalazioneById(Connection connection, IdDecodifica id) throws ResourceAccessException;

    public List findMotivoSegnalazione(Connection connection) throws ResourceAccessException;

    public MotivoSegnalazione loadMotivoSegnalazioneById(Connection connection, IdDecodifica id) throws ResourceAccessException;

    public List findCausaleSegnalazione(Connection connection) throws ResourceAccessException;

    public CausaleSegnalazione loadCausaleSegnalazioneById(Connection connection, IdDecodifica id) throws ResourceAccessException;

    public List findTipoAvvisoSegnalazione(Connection connection) throws ResourceAccessException;

    public TipoAvvisoSegnalazione loadTipoAvvisoSegnalazioneById(Connection connection,
            IdDecodifica id) throws ResourceAccessException;

    public List findTipoAvvisoScadenza(Connection connection) throws ResourceAccessException;

    public TipoAvvisoScadenza loadTipoAvvisoScadenzaById(Connection connection, IdDecodifica id) throws ResourceAccessException;

    public List findStatoAvvisoScadenza(Connection connection) throws ResourceAccessException;

    public StatoAvvisoScadenza loadStatoAvvisoScadenzaById(Connection connection, IdDecodifica id) throws ResourceAccessException;

    public List findCausaleChiusura(Connection connection) throws ResourceAccessException;

    public List findCausaleSospensione(Connection connection) throws ResourceAccessException;

    public List findCategoriaEuro(Integer tipoVeicolo, Connection connection) throws ResourceAccessException;

    public CausaleChiusura loadCausaleChiusuraById(Connection connection, IdDecodifica id) throws ResourceAccessException;

    public List findStatoAccertamento(Connection connection) throws ResourceAccessException;

    public StatoAccertamento loadStatoAccertamentoById(Connection connection, IdDecodifica id) throws ResourceAccessException;

    public List findTipoAvvisoAccertamento(Connection connection) throws ResourceAccessException;

    public TipoAvvisoAccertamento loadTipoAvvisoAccertamentoById(Connection connection,
            IdDecodifica id) throws ResourceAccessException;

    public List findTipoPeriodicita(Connection connection) throws ResourceAccessException;

    public TipoPeriodicita loadTipoPeriodicitaById(Connection connection, IdDecodifica id) throws ResourceAccessException;

    public List findTipoTassazione(Connection connection) throws ResourceAccessException;

    public TipoTassazione loadTipoTassazioneById(Connection connection, IdDecodifica id) throws ResourceAccessException;

    public List findStatoTributo(Connection connection) throws ResourceAccessException;

    public StatoTributo loadStatoTributoById(Connection connection, IdDecodifica id) throws ResourceAccessException;

    public List findTipoCredito(Connection connection) throws ResourceAccessException;

    public List findStatoPagamentoAvviso(Connection connection) throws ResourceAccessException;

    public List findRegoleCalcolo(Connection connection) throws ResourceAccessException;

    public TipoRiduzione loadTipoRiduzioneByCodiceAllaData(
			Connection connection, String codice, Date data)
			throws ResourceAccessException;

	public List findTipoRiduzioneAllaData(Connection connection, Date data)
			throws ResourceAccessException;

	public TipoRiduzione loadTipoRiduzioneByIdAllaData(Connection connection,
			IdDecodifica id, Date data) throws ResourceAccessException;

	public List findEntiRiscossori(Connection connection) throws ResourceAccessException;

	public Ente getEnteByIdSportello(Connection connection, Long idSportello) throws ResourceAccessException;

	public FonteComunicazione loadFonteComunicazioneByCodice(Connection connection, String codice) throws ResourceAccessException;

	public TipoComunicazContrib loadTipoComunicazContribByCodice(Connection connection, String codice) throws ResourceAccessException;

	public StatoComunicazione loadStatoComunicazioneByCodice(Connection connection, String codice) throws ResourceAccessException;

	public StatoLavorazione loadStatoLavorazioneByCodice(Connection connection, String codice) throws ResourceAccessException;

	public List findEsitoNotifica(Connection connection) throws ResourceAccessException;

	public List findFonteComunicazione(Connection connection) throws ResourceAccessException;

	public List findStatoComunicazione(Connection connection) throws ResourceAccessException;

	public List findStatoLavorazione(Connection connection) throws ResourceAccessException;

	public List findChiusuraComunicazione(Connection connection) throws ResourceAccessException;

	public List findStatiLavorazioneByStatoAttuale(Connection connection, IdStatoLavorazione idStatoLavorazione, IdTipoComunicazContrib idTipoComunicazContrib) throws ResourceAccessException;

	public List findFonteComunicazioneAttiva(Connection connection) throws ResourceAccessException;

	public StatoComunicazione findStatoComunicazioneByStatoLav(Connection connection, IdStatoLavorazione idStatoLavorazione, IdStatoLavorazione idStatoLavPrec, IdTipoComunicazContrib idTipoComunicazContrib) throws ResourceAccessException;

	public List findParentela(Connection connection) throws ResourceAccessException;

	public List findEnteUA(Connection connection, String codiceFiscale) throws ResourceAccessException;

	public List findAgenziaUA(Connection connection, String enteDescrizione) throws ResourceAccessException;

	public List findUtenteUA(Connection connection, String codiceAgenzia) throws ResourceAccessException;

	public List findTipologiaBonifica(Connection conn)  throws ResourceAccessException;

	public List ricercaBonifiche(Connection conn, List idBonifica) throws ResourceAccessException;

	public List ricercaIdBonifiche(Connection conn, RicercaBonificheRequest request) throws ResourceAccessException;

	public List findTipoDocumento(Connection connection) throws ResourceAccessException;

	public List ricercaReportBonifiche(Connection conn, ReportBonificheRequest request)  throws ResourceAccessException;

	public List findCasseConUtenteDaSportello(Connection connection, Long idSportello) throws ResourceAccessException;

}