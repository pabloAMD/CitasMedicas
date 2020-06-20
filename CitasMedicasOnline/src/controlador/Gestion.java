package controlador;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import modelo.Agenda;
import modelo.Certificado;
import modelo.Consulta;
import modelo.Especialidad;
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
	private List<Paciente> pacienetslist;
	private List<Medico> medicosList;
	private LibroDiarioEmpresa libroDiarioEmpresa;
	private Sueldo asignarSueldo;
	
	
	public Gestion() {
		
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
