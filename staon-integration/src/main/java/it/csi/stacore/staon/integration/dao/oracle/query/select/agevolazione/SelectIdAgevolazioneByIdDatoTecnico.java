package it.csi.stacore.staon.integration.dao.oracle.query.select.agevolazione;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.Identificativo;
import it.csi.stacore.staon.bo.id.IdDatiTecnici;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEPreparedStatement;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;
import it.csi.stacore.staon.integration.dao.oracle.query.select.AbstractSelect;
import it.csi.stacore.staon.integration.exception.InvalidSearchObjectException;

public class SelectIdAgevolazioneByIdDatoTecnico extends AbstractSelect {
  //~ Instance fields ==========================================================

	  private IdDatiTecnici idDatiTecnici;

  //~ Constructors =============================================================

	  public SelectIdAgevolazioneByIdDatoTecnico(IdDatiTecnici idDatiTecnici) {
			super();
			this.idDatiTecnici = idDatiTecnici;
		}

  //~ Methods ==================================================================

  public Object createBO(TAURDEResultSet rs) throws SQLException {

	  Identificativo id = new Identificativo();

    if(rs.getLong("ID_AGEVOLAZIONE") != null) {
    	id.setId(rs.getLong("ID_AGEVOLAZIONE"));
    }

	return id;
  }

  public String getSQLStatement() throws InvalidSearchObjectException {
    if(idDatiTecnici == null) {
      throw new InvalidSearchObjectException("SelectIdAgevolazioneByIdDatoTecnico: IdDatiTecnici non pu� essere null");
    }

    return super.getSQLStatement();
  }

  protected void setPreparedStatement(TAURDEPreparedStatement stmt)
                               throws SQLException {
    int iPos = 1;

    stmt.setLongId(iPos++, idDatiTecnici);
  }
}
