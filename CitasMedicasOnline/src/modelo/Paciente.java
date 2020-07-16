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
public class Paciente implements Serializable{
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente")
	
	private List<CitaMedica> citamedica;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Paciente;
	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	private String cedula;
	private String email;
	
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "pacient")
	private Suscripcion suscripcion;
	

	public Paciente() {
		
	}


	
	public Paciente( String nombre, String apellido, String direccion, String telefono, String cedula,
			String email) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.cedula = cedula;
		this.email = email;
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
		Paciente other = (Paciente) obj;
		if (id_Paciente != other.id_Paciente)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Paciente [citamedica=" + citamedica + ", id_Paciente=" + id_Paciente + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", direccion=" + direccion + ", telefono=" + telefono + ", cedula="
				+ cedula + ", email=" + email + ", suscripcion=" + suscripcion + "]";
	}
	
	



	
	
}
