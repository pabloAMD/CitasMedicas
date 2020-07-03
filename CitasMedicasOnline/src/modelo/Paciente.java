package modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Paciente extends Persona implements Serializable{
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente")
	
	private List<CitaMedica> citamedica;
	
	private int id_Paciente;
	
	@OneToOne
	@JoinColumn
	private Suscripcion suscripcion;
	

	public Paciente() {
		super();
	}
	
	

	


	public Paciente(int codigo, String nombre, String apellido, String direccion, String telefono, String cedula,
			String email) {
		super(codigo, nombre, apellido, direccion, telefono, cedula, email);
		// TODO Auto-generated constructor stub
	}






	@Override
	public void validarCedula() {
		
		if (this.getCedula().length()<10) {
			System.out.println("cedula Correcta");
		}else {
			System.out.println("cedula Incorrecta");
		}
			
	}
	@Override
	public void validarCorreo() {
		// TODO Auto-generated method stub
		
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
	
	public static boolean actualizar(Paciente p) {
		if (p.getId_Paciente()!=0) {
			p.setDireccion("Juan Pablo ||");
			return true;
		}
		return false;
	}
	/**
	 * @param nombre
	 * @param apellido
	 * @param direccion
	 * @param telefono
	 * @param cedula
	 * @param email
	 */
	

	
	
}
