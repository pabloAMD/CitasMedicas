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
public class Medico  implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_medico;
	
	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	private String cedula;
	private String email;
	private String horarioAtencion;
	private double sueldo;
	
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "medico")
	private CitaMedica citamedica;
	
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "mEspecialidad")
	private Especialidad especialidad;
	


	@OneToOne(cascade = CascadeType.ALL, mappedBy = "mSecretaria")
	private Secretaria secretaria;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "consulta")
	private List<Consulta> cMedico;
	
	
	
	
	
	
	
	public Medico() {
		
		
	}




	public Medico(int id_medico, String nombre, String apellido, String direccion, String telefono, String cedula,
			String email, String horarioAtencion, double sueldo) {
		
		this.id_medico = id_medico;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.cedula = cedula;
		this.email = email;
		this.horarioAtencion = horarioAtencion;
		this.sueldo = sueldo;
	}




	public Medico(String nombre, String apellido, String direccion, String telefono, String cedula, String email,
			String horarioAtencion, double sueldo, CitaMedica citamedica, Secretaria secretaria) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.cedula = cedula;
		this.email = email;
		this.horarioAtencion = horarioAtencion;
		this.sueldo = sueldo;
		this.citamedica = citamedica;
		this.secretaria = secretaria;
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




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getApellido() {
		return apellido;
	}




	public void setApellido(String apellido) {
		this.apellido = apellido;
	}




	public String getDireccion() {
		return direccion;
	}




	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}




	public String getTelefono() {
		return telefono;
	}




	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}




	public String getCedula() {
		return cedula;
	}




	public void setCedula(String cedula) {
		this.cedula = cedula;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
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
