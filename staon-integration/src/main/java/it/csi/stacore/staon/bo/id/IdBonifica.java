package it.csi.stacore.staon.bo.id;

public class IdBonifica extends LongId implements java.io.Serializable {
	
	private static final long serialVersionUID = -7104044503214930132L;

	public IdBonifica(long id) {
		super(id);
	}
	
	public IdBonifica(Long id) {
		super(id.longValue());
	}

	public boolean equals(Object object) {
		boolean equals = false;

		if ((object != null) && object instanceof IdBonifica) {
			IdBonifica altro = (IdBonifica) object;
			equals = (this.getId() == altro.getId());
		}

		return equals;
	}
}
