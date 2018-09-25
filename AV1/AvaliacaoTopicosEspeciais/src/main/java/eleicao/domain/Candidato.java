package eleicao.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javassist.SerialVersionUID;

@Entity
public class Candidato implements Serializable {
	private static final long SerialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;	
	private String nomeCandidato;
	private Integer numeroCandidato;
	private String partido;
	
	
	public Candidato() {
		
	}

	public Candidato(Integer id, String nomeCandidato, Integer numeroCandidato, String partido) {
		super();
		this.id = id;
		this.nomeCandidato = nomeCandidato;
		this.numeroCandidato = numeroCandidato;
		this.partido = partido;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the nomeCandidato
	 */
	public String getNomeCandidato() {
		return nomeCandidato;
	}

	/**
	 * @param nomeCandidato the nomeCandidato to set
	 */
	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}

	/**
	 * @return the numeroCandidato
	 */
	public Integer getNumeroCandidato() {
		return numeroCandidato;
	}

	/**
	 * @param numeroCandidato the numeroCandidato to set
	 */
	public void setNumeroCandidato(Integer numeroCandidato) {
		this.numeroCandidato = numeroCandidato;
	}

	/**
	 * @return the partido
	 */
	public String getPartido() {
		return partido;
	}

	/**
	 * @param partido the partido to set
	 */
	public void setPartido(String partido) {
		this.partido = partido;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomeCandidato == null) ? 0 : nomeCandidato.hashCode());
		result = prime * result + ((numeroCandidato == null) ? 0 : numeroCandidato.hashCode());
		result = prime * result + ((partido == null) ? 0 : partido.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidato other = (Candidato) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomeCandidato == null) {
			if (other.nomeCandidato != null)
				return false;
		} else if (!nomeCandidato.equals(other.nomeCandidato))
			return false;
		if (numeroCandidato == null) {
			if (other.numeroCandidato != null)
				return false;
		} else if (!numeroCandidato.equals(other.numeroCandidato))
			return false;
		if (partido == null) {
			if (other.partido != null)
				return false;
		} else if (!partido.equals(other.partido))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Candidato [id=" + id + ", nomeCandidato=" + nomeCandidato + ", numeroCandidato=" + numeroCandidato
				+ ", partido=" + partido + "]";
	}
	
	
	
	
}
