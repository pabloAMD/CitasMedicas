package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

import modelo.Agenda;
import modelo.Consulta;
import modelo.Medico;
import modelo.OrdenMedica;

public class AgendaTest {

	@Test
	public void guardarConsulta() {
		OrdenMedica om= new OrdenMedica();
		om.setId(3);
		om.setReceta("lemonflu");
		
		
		Consulta c= new Consulta();
		c.setHora("15:00");
		c.setOrdenMedica(om);
		
		Medico m = new Medico();
		m.setId_medico(1);
		m.setHorarioAtencion("9:00");
		c.setMedico(m);
		c.setObservaciones("dolor de estomago");
		c.setFechaConsulta(new Date());
		
		assertTrue(Agenda.guardarConsulta(c)==true);
		
	}
	
	@Test
	public void actualizarConsulta() {
		OrdenMedica om= new OrdenMedica();
		om.setId(3);
		om.setReceta("lemonflu");
		
		Agenda a= new Agenda();
		a.setId(23);
		a.setConsultalist(new ArrayList<Consulta>());
		a.getId();
		a.getConsultalist();
		
		Consulta c= new Consulta();
		c.setHora("15:00");
		c.setOrdenMedica(om);
		
		Medico m = new Medico();
		m.setId_medico(1);
		m.setHorarioAtencion("9:00");
		c.setMedico(m);
		c.setObservaciones("dolor de estomago");
		c.setFechaConsulta(new Date());
		
		assertTrue(Agenda.actualizarConsulta(c)==true);
		
	}

}
