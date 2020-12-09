package it.csi.stacore.staon.bo.id;

public class IdBeneficiario extends LongId implements java.io.Serializable {

  private static final long serialVersionUID = -5994927400003468222L;

	public IdBeneficiario(long id) {
    super(id);
  }

  public boolean equals(Object object) {
    boolean equals = false;

    if((object != null) && object instanceof IdBeneficiario) {
      IdBeneficiario altro = (IdBeneficiario) object;
      equals = (this.getId() == altro.getId());
    }

    return equals;
  }
}
