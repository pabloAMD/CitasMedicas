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
			
		
	
	
	
	

	
	

}
