package Test;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import modelo.Certificado;
import modelo.Consulta;
import modelo.Especialidad;
import modelo.Medico;
import modelo.OrdenMedica;

public class MedicoTest {

	
	/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	*/

	@Test
	public void cambioHorarioAtencion() {
		
		Especialidad especialidad = new Especialidad();
		especialidad.setId(1);
		especialidad.setNombreEspecialidad("Cirujano");
		
		
		
		Medico medico = new Medico();
		medico.setId_medico(1);
		medico.setNombre("Andres");
		medico.setApellido("Perez");
		medico.setDireccion("Av. Americas");
		medico.setTelefono("0990085649");
		medico.setCedula("0107145899");
		medico.setEmail("andres@gmail.com");
		medico.setHorarioAtencion("7 am : 5 pm");
		medico.setEspecialidad(especialidad);
		
		System.out.println("----------Medico-------------");
		System.out.println(medico.getNombre()+"/"+medico.getCedula()+medico.toString());
		
		
		System.out.println("----------Actualizando hora de trabajo-------------");
		medico.actualizarHorarioAtencion(medico,"8 am - 6 pm");
		System.out.println(medico.getNombre()+"/"+medico.getCedula()+medico.toString());
		
		
		assertTrue(medico.actualizarHorarioAtencion(medico,"8 am - 6 pm")==true);
		
	}
	
	@Test
	public void validarCertificado() {
		
		System.out.println("-----------Validar Certificado------");
		Especialidad especialidad = new Especialidad();
		especialidad.setId(1);
		especialidad.setNombreEspecialidad("Cirujano");
		
		
		
		Medico medico2 = new Medico();
		medico2.setId_medico(2);
		medico2.setNombre("Javier");
		medico2.setApellido("Javaa");
		medico2.setDireccion("Av. Americas");
		medico2.setTelefono("0990085649");
		medico2.setCedula("0107145899");
		medico2.setEmail("andres@gmail.com");
		medico2.setHorarioAtencion("7 am : 5 pm");
		medico2.setEspecialidad(especialidad);
		
		
		
		
		Consulta con2 = new Consulta();
		con2.setHora(" 1 pm");
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
		
		
		
		con2.crearCertificado(8,"12/12/1997","Dolor de pulmon",con2);
		System.out.println(con2.getCertificado().toString());
		System.out.println("Validando el certificado enviado para aprobacion");
		assertTrue(medico2.validarCertificado(con2) == true);
		System.out.println(con2.getCertificado().toString());
		
		System.out.println("Datos de la consulta");
		System.out.println(con2.toString());
	}
	
	@Test
	public void crearOrdenMedica() {
		System.out.println("-----------Crear OrdenMedica (receta)------");
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
		
		
		
		
		Consulta con2 = new Consulta();
		con2.setHora(" 1 pm");
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
		
		OrdenMedica receta = new OrdenMedica();
		receta.setId(1);
		receta.setReceta("Descansar por 12 horas");
		
		assertTrue(Medico.crearOrdenMedica(con2, receta)==true);
		
		System.out.println("Datos de la consulta");
		System.out.println(con2.toString());
		
		
		
	}
	
	
	

}
