package it.csi.stacore.staon.bo.id.avvisi.accertamento;

import it.csi.stacore.staon.bo.id.LongId;

public class IdAvvisoAccertamento extends LongId implements java.io.Serializable {

	private static final long serialVersionUID = 3325917735362476289L;

	public IdAvvisoAccertamento(long id) {
		super(id);
	}

	public boolean equals(Object object) {
		boolean equals = false;

		if ((object != null) && object instanceof IdAvvisoAccertamento) {
			IdAvvisoAccertamento altro = (IdAvvisoAccertamento) object;
			equals = (this.getId() == altro.getId());
		}

		return equals;
	}
}
