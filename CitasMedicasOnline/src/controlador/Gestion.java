package controlador;

import java.util.List;

import modelo.HistoriaClinica;
import modelo.LibroDiario;
import modelo.LibroDiarioEmpresa;
import modelo.Medico;
import modelo.Paciente;
import modelo.Secretaria;
import modelo.Sueldo;
import modelo.Suscripcion;
import modelo.Especialidad;

public class Gestion {
	
	private HistoriaClinica historiaClinica;
	private Suscripcion suscripcion;
	private List<Paciente> pacienetslist;
	private List<Medico> medicosList;
	private LibroDiarioEmpresa libroDiarioEmpresa;
	private Sueldo asignarSueldo;
	
	
	public Gestion() {
		
	}
	
	
	
	public static int suma(int numero) {
		numero = numero * 2;
		return numero*2;
		
		
	}
	
	public static int resta(int numero) {
		numero = numero - 2;
		return numero*2;
		
		
	}
	
	public int calcular(int numero) {
		numero = numero +5;
		return numero;
	}



	/**
	 * @return the historiaClinica
	 */
	public HistoriaClinica getHistoriaClinica() {
		return historiaClinica;
	}



	/**
	 * @param historiaClinica the historiaClinica to set
	 */
	public void setHistoriaClinica(HistoriaClinica historiaClinica) {
		this.historiaClinica = historiaClinica;
	}



	/**
	 * @return the suscripcion
	 */
	public Suscripcion getSuscripcion() {
		return suscripcion;
	}



	/**
	 * @param suscripcion the suscripcion to set
	 */
	public void setSuscripcion(Suscripcion suscripcion) {
		this.suscripcion = suscripcion;
	}



	/**
	 * @return the pacienetslist
	 */
	public List<Paciente> getPacienetslist() {
		return pacienetslist;
	}



	/**
	 * @param pacienetslist the pacienetslist to set
	 */
	public void setPacienetslist(List<Paciente> pacienetslist) {
		this.pacienetslist = pacienetslist;
	}



	/**
	 * @return the medicosList
	 */
	public List<Medico> getMedicosList() {
		return medicosList;
	}



	/**
	 * @param medicosList the medicosList to set
	 */
	public void setMedicosList(List<Medico> medicosList) {
		this.medicosList = medicosList;
	}



	/**
	 * @return the libroDiarioEmpresa
	 */
	public LibroDiarioEmpresa getLibroDiarioEmpresa() {
		return libroDiarioEmpresa;
	}



	/**
	 * @param libroDiarioEmpresa the libroDiarioEmpresa to set
	 */
	public void setLibroDiarioEmpresa(LibroDiarioEmpresa libroDiarioEmpresa) {
		this.libroDiarioEmpresa = libroDiarioEmpresa;
	}



	/**
	 * @return the asignarSueldo
	 */
	public Sueldo getAsignarSueldo() {
		return asignarSueldo;
	}



	/**
	 * @param asignarSueldo the asignarSueldo to set
	 */
	public void setAsignarSueldo(Sueldo asignarSueldo) {
		this.asignarSueldo = asignarSueldo;
	}
	
	
	public static boolean crearEspecialidad(int codigo,String nombre) {
		Especialidad es = new Especialidad();
		es.setId(codigo);
		es.setNombreEspecialidad(nombre);
		System.out.println("creada especialidad");
		return true;
	}
	
	public static boolean crearMedico(int codigo, Especialidad especialidad, String horarioAtencion,
			Secretaria secretaria) {
		
		Especialidad es = new Especialidad();
		Medico me = new Medico();
		Secretaria se = new Secretaria();
		me.setId_medico(codigo);
		es.setId(especialidad.id);
		es.setNombreEspecialidad(especialidad.nombreEspecialidad);
		me.setHorarioAtencion(horarioAtencion);
		
		se.setNombre(secretaria.nombre);
		se.setApellido(secretaria.apellido);
		se.setDireccion(secretaria.direccion);
		se.setTelefono(secretaria.telefono);
		se.setCedula(secretaria.cedula);
		se.setEmail(secretaria.email);
		se.setAgenda(secretaria.agenda);
		
		System.out.println("medico creado");
		return true;
	} 
	
	public static boolean crearPaciente(String nombre, String apellido, String direccion, String telefono, String cedula, 
			String email,Suscripcion suscripcion) {
		
		Paciente pa = new Paciente();
		
		pa.setNombre(nombre);
		pa.setNombre(apellido);
		pa.setNombre(direccion);
		pa.setNombre(telefono);
		pa.setNombre(cedula);
		pa.setEmail(email);
		
		
		
		System.out.println("Paciente creado");
		return true;
	}
	
	

}
