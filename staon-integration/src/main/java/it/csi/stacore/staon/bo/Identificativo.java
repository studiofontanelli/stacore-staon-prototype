package it.csi.stacore.staon.bo;


public class Identificativo extends AbstractBO implements java.io.Serializable {

	private static final long serialVersionUID = 1389212510545384802L;
	private Long id;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
