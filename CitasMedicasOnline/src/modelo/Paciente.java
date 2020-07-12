package modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Paciente extends Persona implements Serializable{
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente")
	
	private List<CitaMedica> citamedica;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Paciente;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "pacient")
	private Suscripcion suscripcion;
	

	public Paciente() {
		super();
	}


	public List<CitaMedica> getCitamedica() {
		return citamedica;
	}


	public void setCitamedica(List<CitaMedica> citamedica) {
		this.citamedica = citamedica;
	}


	public int getId_Paciente() {
		return id_Paciente;
	}


	public void setId_Paciente(int id_Paciente) {
		this.id_Paciente = id_Paciente;
	}


	public Suscripcion getSuscripcion() {
		return suscripcion;
	}


	public void setSuscripcion(Suscripcion suscripcion) {
		this.suscripcion = suscripcion;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_Paciente;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		if (id_Paciente != other.id_Paciente)
			return false;
		return true;
	}
	
	



	
	
}
