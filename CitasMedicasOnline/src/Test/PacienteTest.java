package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.Paciente;

public class PacienteTest {

	
	
	@Test
	public void actualizarPaciente() {
		Paciente p= new Paciente();
		p.setId_Paciente(1);
		p.setNombre("Juan");
		p.setApellido("Castro");
		p.setCedula("0102344306");
		p.setDireccion("Av Americas");
		p.setEmail("jcastro@gmail.com");
		p.setTelefono("0987823123");
		assertTrue(Paciente.actualizar(p)==true);
		
		
	}

}
