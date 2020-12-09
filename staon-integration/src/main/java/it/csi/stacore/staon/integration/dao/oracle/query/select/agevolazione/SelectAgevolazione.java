package it.csi.stacore.staon.integration.dao.oracle.query.select.agevolazione;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.Agevolazione;
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
public class SelectAgevolazione extends AbstractSelect {
  //~ Instance fields ==========================================================

  /**
	 * @uml.property  name="vincoliRicercaAgevolazione"
	 * @uml.associationEnd
	 */
  private Agevolazione vincoliRicercaAgevolazione;

  /**
	 * identifica se fare la ricerca per idVeicolo o per proprietario, targa, tipo veicolo
	 * @uml.property  name="bRicercaIdVeicolo"
	 */
  private boolean bRicercaIdVeicolo;

  //~ Constructors =============================================================

  /**
   * Creates a new SelectAgevolazione object.
   */
  public SelectAgevolazione() {
    super();
  }

  /**
   * Creates a new SelectAgevolazione object.
   *
   * @param vincoliRicercaAgevolazione
   */
  public SelectAgevolazione(Agevolazione vincoliRicercaAgevolazione) {
    super();
    this.vincoliRicercaAgevolazione   = vincoliRicercaAgevolazione;
    bRicercaIdVeicolo                 = this.vincoliRicercaAgevolazione.getIdVeicolo() != null;
  }

  //~ Methods ==================================================================

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
    DecodificaFactory decodFactory    = DecodificaFactory.getInstance();
    Long              lIdAgevolazione = rs.getLong("ID_AGEVOLAZIONE");
    IdAgevolazione    idAgevolazione  =
      (lIdAgevolazione != null)
      ? new IdAgevolazione(lIdAgevolazione.longValue()) : null;
    Long      lIdVeicolo = rs.getLong("id_veicolo");
    IdVeicolo idVeicolo =
      (lIdVeicolo != null) ? new IdVeicolo(lIdVeicolo.longValue()) : null;

    Fonte fonte =
      decodFactory.getFonte(
                            rs.getLong("ID_FONTE"), rs.getString("cod_fonte"),
                            rs.getString("DESC_fonte")
                           );
    TipoAgevolazione tipoAgevolazione =
      decodFactory.getTipoAgevolazione(
                                       rs.getLong("ID_TIPO_AGEVOLAZIONE"),
                                       rs.getString("cod_tipoagevolazione"),
                                       rs.getString("desc_tipoagevolazione")
                                      );
    TipoVeicolo tipoVeicolo =
      decodFactory.getTipoVeicolo(
                                  rs.getLong("ID_TIPO_VEICOLO"),
                                  rs.getString("codTipoVeicolo"),
                                  rs.getString("descTipoVeicolo")
                                 );

    Agevolazione agevolazione = new Agevolazione(idAgevolazione, // idAgevolazione
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
				rs.getString("NUMERO_PATENTE"), // numeroPatenteSpeciale
				rs.getDate("DATA_SCADENZA"), // dataScadenzaPatenteSpeciale
				rs.getString("PROROGA_EURO6") //Euro6 proroga scadenza
				);

    if(rs.getLong("ID_DATI_TECNICI") != null) {
    	Long id = rs.getLong("ID_DATI_TECNICI");
	    IdDatiTecnici idDatiTecnici = new IdDatiTecnici(id.longValue());
		agevolazione.setIdDatiTecnici(idDatiTecnici);
    }

    agevolazione.setIdOperazione(rs.getLong("ID_OPERAZIONE"));

		return agevolazione;
  }

  /**
	 * ritorna la stringa SQL
	 *
	 * @return
	 *
	 * @throws InvalidSearchObjectException
	 */
  public String getSQLStatement() throws InvalidSearchObjectException {
    if(vincoliRicercaAgevolazione == null) {
      throw new InvalidSearchObjectException("Ricerca agevolazione: vincoliRicercaAgevolazione non pu� essere null");
    }

    OracleQuery q =
      OracleQueryList.getInstance().getQuery(getClass().getName());
    String      query = q.getBody() + q.getFieldBody("progCorrezioneT");
    query += (q.getFrom() + q.getParamFrom("tabT"));
    query += q.getWhere();
    // Questa where serve solo con FieldBody "progCorrezioneT" e ParamFrom "tabT"
	query += q.getParamWhere("patenteSpeciale");

    if(bRicercaIdVeicolo) {
      // faccio la ricerca per idVeicolo
      query += q.getParamWhere("idVeicolo");
    } else {
      boolean bInsertParameter = false;

      // faccio la ricerca per targa, tipoVeicolo, idTipoVeicolo, codiceFiscale, numProtocolloApertura e/o idTipoAgevolazione
      if(
         (vincoliRicercaAgevolazione.getTargaOriginale() != null) &&
             (vincoliRicercaAgevolazione.getTargaOriginale().length() != 0)
        ) {
        bInsertParameter = true;
        query += q.getParamWhere("targa");
      }

      if(
         (vincoliRicercaAgevolazione.getTipoVeicoloOriginale() != null) &&
             (vincoliRicercaAgevolazione.getTipoVeicoloOriginale().length() != 0)
        ) {
        bInsertParameter = true;
        query += q.getParamWhere("tipoVeicolo");
      }

      if(
         (vincoliRicercaAgevolazione.getIdentificativoFiscaleProprietarioOriginale() != null) &&
             (vincoliRicercaAgevolazione.getIdentificativoFiscaleProprietarioOriginale()
                                            .length() != 0)
        ) {
        bInsertParameter = true;
        query += q.getParamWhere("codiceFiscale");
      }

      if(
         (vincoliRicercaAgevolazione.getNumProtocolloApertura() != null) &&
             (vincoliRicercaAgevolazione.getNumProtocolloApertura().length() != 0)
        ) {
        bInsertParameter = true;
        query += q.getParamWhere("numProtocolloApertura");
      }

      TipoVeicolo tipoVeicolo=vincoliRicercaAgevolazione.getTipoVeicolo();
      if(
          (tipoVeicolo != null) && (tipoVeicolo.getId() != null)
        ) {
        bInsertParameter = true;
        query += q.getParamWhere("idTipoVeicolo");
      }

      TipoAgevolazione tipoAgevolazione=vincoliRicercaAgevolazione.getTipoAgevolazione();
      if(
          (tipoAgevolazione != null) && (tipoAgevolazione.getId() != null)
        ) {
        bInsertParameter = true;
        query += q.getParamWhere("idTipoAgevolazione");
      }

      if(vincoliRicercaAgevolazione.isFlagRicercaAg()){
    	  query += q.getParamWhere("ricercaAg");
      }
      else{
    	  query += q.getParamWhere("notRicercaAg");
      }

      if(!bInsertParameter) {
        throw new InvalidSearchObjectException("Ricerca agevolazione: vincoliRicercaAgevolazione popolare almeno uno dei campi di ricerca");
      }
    }

    query += q.getOrderBy();

    return query;
  }

  /**
   * DOCUMENT ME!
   *
   * @param stmt DOCUMENT ME!
   *
   * @throws SQLException DOCUMENT ME!
   */
  protected void setPreparedStatement(TAURDEPreparedStatement stmt)
                               throws SQLException {
    int iPos = 1;

    if(bRicercaIdVeicolo) {
      // faccio la ricerca per idVeicolo
      stmt.setLongId(iPos++, vincoliRicercaAgevolazione.getIdVeicolo());
    } else {
      // faccio la ricerca per targa, tipoVeicolo e/o codiceFiscale
      if(
         (vincoliRicercaAgevolazione.getTargaOriginale() != null) &&
             (vincoliRicercaAgevolazione.getTargaOriginale().length() != 0)
        ) {
        stmt.setUpperCaseString(iPos++, vincoliRicercaAgevolazione.getTargaOriginale());
      }

      if(
         (vincoliRicercaAgevolazione.getTipoVeicoloOriginale() != null) &&
             (vincoliRicercaAgevolazione.getTipoVeicoloOriginale().length() != 0)
        ) {
        stmt.setUpperCaseString(
                       iPos++,
                       vincoliRicercaAgevolazione.getTipoVeicoloOriginale()
                      );
      }

      if(
         (vincoliRicercaAgevolazione.getIdentificativoFiscaleProprietarioOriginale() != null) &&
             (vincoliRicercaAgevolazione.getIdentificativoFiscaleProprietarioOriginale()
                                            .length() != 0)
        ) {
        stmt.setUpperCaseString(
                       iPos++,
                       vincoliRicercaAgevolazione.getIdentificativoFiscaleProprietarioOriginale()
                      );
      }

      if(
         (vincoliRicercaAgevolazione.getNumProtocolloApertura() != null) &&
             (vincoliRicercaAgevolazione.getNumProtocolloApertura().length() != 0)
        ) {
        stmt.setUpperCaseString(
                       iPos++,
                       vincoliRicercaAgevolazione.getNumProtocolloApertura()
                      );
      }

      TipoVeicolo tipoVeicolo =
        vincoliRicercaAgevolazione.getTipoVeicolo();

      if((tipoVeicolo != null) && (tipoVeicolo.getId() != null)) {
        stmt.setLongId(iPos++, tipoVeicolo.getId());
      }

      TipoAgevolazione tipoAgevolazione=vincoliRicercaAgevolazione.getTipoAgevolazione();
      if(
          (tipoAgevolazione != null) && (tipoAgevolazione.getId() != null)
        ) {
      	stmt.setLongId(iPos++, tipoAgevolazione.getId());
      }
    }
  }
}
