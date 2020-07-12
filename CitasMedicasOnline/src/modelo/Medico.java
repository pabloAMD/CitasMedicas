package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Medico extends Persona implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_medico;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "medico")
	private CitaMedica citamedica;
	
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "mEspecialidad")
	private Especialidad especialidad;
	


	@OneToOne(cascade = CascadeType.ALL, mappedBy = "mSecretaria")
	private Secretaria secretaria;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "consulta")
	private List<Consulta> cMedico;
	
	
	private String horarioAtencion;
	
	
	private double sueldo;
	
	
	
	
	public Medico() {
		
		
	}




	public int getId_medico() {
		return id_medico;
	}




	public void setId_medico(int id_medico) {
		this.id_medico = id_medico;
	}




	public CitaMedica getCitamedica() {
		return citamedica;
	}




	public void setCitamedica(CitaMedica citamedica) {
		this.citamedica = citamedica;
	}




	public Especialidad getEspecialidad() {
		return especialidad;
	}




	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}




	public Secretaria getSecretaria() {
		return secretaria;
	}




	public void setSecretaria(Secretaria secretaria) {
		this.secretaria = secretaria;
	}




	public List<Consulta> getcMedico() {
		return cMedico;
	}




	public void setcMedico(List<Consulta> cMedico) {
		this.cMedico = cMedico;
	}




	public String getHorarioAtencion() {
		return horarioAtencion;
	}




	public void setHorarioAtencion(String horarioAtencion) {
		this.horarioAtencion = horarioAtencion;
	}




	public double getSueldo() {
		return sueldo;
	}




	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_medico;
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
		Medico other = (Medico) obj;
		if (id_medico != other.id_medico)
			return false;
		return true;
	}
	

	
}
