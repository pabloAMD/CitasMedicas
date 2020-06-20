package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import controlador.Gestion;
import modelo.Administrador;
import modelo.Agenda;
import modelo.Especialidad;
import modelo.Paciente;
import modelo.Secretaria;
import modelo.Sueldo;
import modelo.Suscripcion;


public class GestionTest {
	
 
	@Test
	public void CrearEspecialidad() {
		
	Especialidad es = new Especialidad(1,"odontologia");
	Gestion g= new Gestion();
	
		assertTrue(Gestion.crearEspecialidad(1,"odontologia")==true);	
	}
	
	
	
	@Test
	public void CrearMedico() {
	Sueldo s = new Sueldo();
	s.setComisiones(430.45);
	s.setMultas(30.40);
	s.setValor(400.5);
	s.getComisiones();
	s.getMultas();
	s.getValor();
	Especialidad es = new Especialidad(1,"odontologia");
	Agenda a = new Agenda();
	Secretaria se= new Secretaria("Karla","Loja","Bella Union","0939002232","0105243423","karlaloja@gmailcom",a);
	Gestion g= new Gestion();
	
		assertTrue(Gestion.crearMedico(1,es,"8am - 17pm ",se)==true);
		
	}
	  
	
	
	@Test
	public void CrearPaciente() {
	Administrador ad= new Administrador();
	double n= ad.CalcularSueldo(123.55, 123.55, 23.55);
		
	Suscripcion su= new Suscripcion(23,235.00);	
	Gestion g= new Gestion();
	
		assertTrue(Gestion.crearPaciente("Veronica","Loja","Bella Union","4031738","cedula","karlaloja123@gmail.com",su)==true);
		
	}
	
	

}
