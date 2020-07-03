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
	private Suscripcion suscripcion;
	private List<Paciente> pacienetslist;
	private List<Medico> medicosList;
	private LibroDiarioEmpresa libroDiarioEmpresa;
	private Sueldo asignarSueldo;
	
	
	public Gestion() {
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----------Crear Consultas------");
		Especialidad especialidad = new Especialidad();
		especialidad.setId(1);
		especialidad.setNombreEspecialidad("Cirujano");
		
		Medico medico2 = new Medico();
		medico2.setId_medico(2);
		medico2.setNombre("Anai");
		medico2.setApellido("Paypal");
		medico2.setDireccion("Av. Americas");
		medico2.setTelefono("0990085649");
		medico2.setCedula("0107145899");
		medico2.setEmail("andres@gmail.com");
		medico2.setHorarioAtencion("7 am : 5 pm");
		medico2.setEspecialidad(especialidad);
		
		Consulta con1 = new Consulta();
		con1.setHora(" 1 pm");
		con1.setMedico(medico2);
		con1.setObservaciones("Padese de mareos.....");
		
		
		//----------------------------
		String entrada1 = "12/03/2016"; 
		DateFormat format1 = new SimpleDateFormat("DD/MM/YYYY"); 
		Date fecha1=null;
		try {
			fecha1 = format1.parse(entrada1);
		} catch (ParseException e) {
			
			e.printStackTrace();
		} 
		//--------------------------

		con1.setFechaConsulta(fecha1);
		
		
		
		
		
		
		Consulta con2 = new Consulta();
		con2.setHora(" 2 pm");
		con2.setMedico(medico2);
		con2.setObservaciones("Padese de mareos.....");
		
		
		//----------------------------
		String entrada = "12/03/2016"; 
		DateFormat format = new SimpleDateFormat("DD/MM/YYYY"); 
		Date fecha=null;
		try {
			fecha = format.parse(entrada);
		} catch (ParseException e) {
			
			e.printStackTrace();
		} 
		//--------------------------

		con2.setFechaConsulta(fecha);
		
			
		Agenda agenda = new Agenda();
		agenda.agregarConsulta(con1);
		agenda.agregarConsulta(con2);
		
		Secretaria secretaria =new Secretaria();
		secretaria.setNombre("Anabel");
		secretaria.setApellido("Demonio");
		secretaria.setDireccion("Av, maple");
		secretaria.setTelefono("0995587963");
		secretaria.setCedula("010598765");
		secretaria.setEmail("anabel@gmail.com");
		secretaria.setAgenda(agenda);
		
		
		
	
		medico2.setSecretaria(secretaria);
		
		
		
		for (Consulta consulta : medico2.getSecretaria().getAgenda().getConsultalist() ) {
			System.out.println(consulta.getMedico().getNombre()+consulta.toString());
		
			
		}
		
		
		


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
