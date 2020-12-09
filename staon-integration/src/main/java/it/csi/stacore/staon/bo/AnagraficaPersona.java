package it.csi.stacore.staon.bo;

import java.io.Serializable;
import java.util.Date;

import it.csi.stacore.staon.util.EqualsUtil;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision$
 */
public class AnagraficaPersona implements Serializable {
	//~ Static fields/initializers ===============================================
	
	/**
	 * DOCUMENT ME!
	 */
	static final long serialVersionUID = 888959897946401369L;
	
	//~ Instance fields ==========================================================

	/**
	 * @uml.property  name="cognome"
	 */
	private String cognome = null;
	/**
	 * @uml.property  name="nome"
	 */
	private String nome = null;
	/**
	 * @uml.property  name="sesso"
	 */
	private String sesso = null;
	/**
	 * @uml.property  name="comune"
	 */
	private String comune = null;
	/**
	 * @uml.property  name="provincia"
	 */
	private String provincia = null;
	/**
	 * @uml.property  name="idFiscale"
	 */
	private String idFiscale = null;
	/**
	 * @uml.property  name="tipoPersona"
	 */
	private String tipoPersona = null;
	/**
	 * @uml.property  name="dataNascita"
	 */
	private Date dataNascita = null;
	
	
	//~ Constructors =============================================================
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param tipoOperazioneLogica
	 * @param utente
	 * @param dataInizio
	 * @param dataFine
	 */
	public AnagraficaPersona( String cognome,
							  String nome,
							  String sesso,
							  String comune,
							  String provincia,
							  String idFiscale,
							  String tipoPersona,
							  Date dataNascita) {
	    
	   super();
	   this.cognome = cognome;
	   this.nome = nome;
	   this.sesso = sesso;
	   this.comune = comune;
	   this.provincia = provincia;
	   this.idFiscale = idFiscale;
	   this.tipoPersona = tipoPersona;
	   this.dataNascita = dataNascita;
	  
	}
	
	//~ Methods ==================================================================
	
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param object DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public boolean equals(Object object) {
	    boolean equals = false;
	    if((object != null) && object instanceof AnagraficaPersona) {
	        AnagraficaPersona altro = (AnagraficaPersona) object;
	      equals =
	        EqualsUtil.objectEquals(getCognome(), altro.getCognome()) &&
	        EqualsUtil.objectEquals(getNome(), altro.getNome()) &&
	        EqualsUtil.objectEquals(getIdFiscale(), altro.getIdFiscale()) &&
	        EqualsUtil.objectEquals(getProvincia(), altro.getProvincia()) &&
	        EqualsUtil.objectEquals(getSesso(), altro.getSesso()) &&
	        EqualsUtil.objectEquals(getDataNascita(), altro.getDataNascita()) && 
	        EqualsUtil.objectEquals(getTipoPersona(), altro.getTipoPersona()) && 
	        EqualsUtil.objectEquals(getComune(), altro.getComune());
	    }
	
	    return equals;
	}
  
	public static long getSerialVersionUID() {
	    return serialVersionUID;
	}
	
	
    /**
		 * @return  Returns the comune.
		 * @uml.property  name="comune"
		 */
    public String getComune() {
        return comune;
    }
    /**
		 * @return  Returns the dataNascita.
		 * @uml.property  name="dataNascita"
		 */
    public Date getDataNascita() {
        return dataNascita;
    }
    /**
		 * @return  Returns the idFiscale.
		 * @uml.property  name="idFiscale"
		 */
    public String getIdFiscale() {
        return idFiscale;
    }
    /**
		 * @return  Returns the nome.
		 * @uml.property  name="nome"
		 */
    public String getNome() {
        return nome;
    }
    /**
		 * @return  Returns the provincia.
		 * @uml.property  name="provincia"
		 */
    public String getProvincia() {
        return provincia;
    }
    /**
		 * @return  Returns the sesso.
		 * @uml.property  name="sesso"
		 */
    public String getSesso() {
        return sesso;
    }
    /**
		 * @return  Returns the tipoPersona.
		 * @uml.property  name="tipoPersona"
		 */
    public String getTipoPersona() {
        return tipoPersona;
    }
    /**
		 * @return  Returns the cognome.
		 * @uml.property  name="cognome"
		 */
    public String getCognome() {
        return cognome;
    }
    
    
}
