package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.Consulta;
import modelo.Medico;

public class ConsultaTest {

	
	/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	*/
	
	@Test
	public void crearCertificado() {
		
		Medico medico = new Medico();
		medico.setId_medico(1);
		medico.setNombre("Andres");
		medico.setApellido("Perez");
		medico.setDireccion("Av. Americas");
		medico.setTelefono("0990085649");
		medico.setCedula("0107145899");
		medico.setEmail("andres@gmail.com");
		medico.setHorarioAtencion("7 am : 5 pm");
		
		Consulta con3 = new Consulta();
		con3.setHora(" 1 pm");
		con3.setMedico(medico);
		con3.setObservaciones("Padese de mareos.....");
		
		assertTrue(Consulta.crearCertificado(2,"12/12/1997","dolor de pansa",con3)==true);
	}
	
	

}
