package it.csi.stacore.staon.integration.dao.oracle.query.select.decodifica;

import java.sql.SQLException;

import it.csi.stacore.staon.bo.AbilitazioneDecodifica;
import it.csi.stacore.staon.bo.id.IdDecodifica;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEPreparedStatement;
import it.csi.stacore.staon.integration.dao.oracle.query.TAURDEResultSet;
import it.csi.stacore.staon.integration.dao.oracle.query.select.AbstractSelect;

public abstract class AbstractSelectAbilitazioneDecodifica extends AbstractSelect {
  //~ Constructors =============================================================

  /**
   * Creates a new SelectAbilitazioneAgevolazione object.
   */
  public AbstractSelectAbilitazioneDecodifica() {
    super();
  }

  public Object createBO(TAURDEResultSet rs) throws SQLException {
    return new AbilitazioneDecodifica(
    		rs.getString("TIPO_ACCESSO"),
    		rs.getString("PROFILO"),
    		buildIdDecodifica(rs)
    );
  }

	protected void setPreparedStatement(TAURDEPreparedStatement stmt) throws SQLException {
	}

	abstract protected IdDecodifica buildIdDecodifica(TAURDEResultSet rs) throws SQLException;
}
