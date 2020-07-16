package modelo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import controlador.Gestion;

@Entity
public class Administrador   implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	private String cedula;
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "libroDiarioEmpresa")
	private LibroDiarioEmpresa libEmp;
	
	
	//calcular Sueldo Total
	
	public Administrador() {
		super();
	}


	public double CalcularSueldo(double sueldo,double comision,double descuento) {
		return ((sueldo+comision)-descuento);
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public LibroDiarioEmpresa getLibEmp() {
		return libEmp;
	}


	public void setLibEmp(LibroDiarioEmpresa libEmp) {
		this.libEmp = libEmp;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Administrador other = (Administrador) obj;
		if (id != other.id)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Administrador [id=" + id + ", libEmp=" + libEmp + "]";
	}
	
	

	
	
	
	
	
	
	
	

}
