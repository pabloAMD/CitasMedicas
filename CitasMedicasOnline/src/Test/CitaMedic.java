package Test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import modelo.CitaMedica;
import modelo.Paciente;
import modelo.Suscripcion;

public class CitaMedic {
	
	Suscripcion s = new Suscripcion(1,500.00);

	
	
	
	@Test
	public void crearCita() {
		Paciente p = new Paciente();
		p.setId_Paciente(1);
		p.setSuscripcion(s);
		assertTrue(CitaMedica.crearCita(2,p,"Infeccion",2,20.40)==true);
	}
	
	

}
