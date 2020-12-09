package it.csi.stacore.staon.bo.id;

public class IdCredito extends LongId implements java.io.Serializable {

  private static final long serialVersionUID = -5994927400003468222L;

	public IdCredito(long id) {
    super(id);
  }

  public boolean equals(Object object) {
    boolean equals = false;

    if((object != null) && object instanceof IdCredito) {
      IdCredito altro = (IdCredito) object;
      equals = (this.getId() == altro.getId());
    }

    return equals;
  }
}
