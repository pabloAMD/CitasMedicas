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
	
import modelo.Suscripcion;
import modelo.Especialidad;

public class Gestion {
	
	private HistoriaClinica historiaClinica;
	private List<Paciente> pacienetslist;
	private List<Medico> medicosList;
	private LibroDiarioEmpresa libroDiarioEmpresa;
	
	
	
	public Gestion() {
		
	}
	
	
	public static boolean crearEspecialidad(int codigo,String nombre) {
		Especialidad es = new Especialidad();
		es.setId(codigo);
		es.setNombreEspecialidad(nombre);
		System.out.println("creada especialidad");
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
