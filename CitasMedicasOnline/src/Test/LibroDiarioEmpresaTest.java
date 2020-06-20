package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.CitaMedica;
import modelo.Factura;
import modelo.LibroDiarioEmpresa;
import modelo.Paciente;
import modelo.PagoSuscripcion;
import modelo.Suscripcion;

public class LibroDiarioEmpresaTest {


	
	
	@Test
	public void guardarSuscripcion() {
		Suscripcion s=new Suscripcion(1,5000);
		
		Paciente p=new Paciente(1,"Henry","Guaman","San cristobal","3014330","0106662158","henry96guaman@gmail.com",s);
		
		CitaMedica cm=new CitaMedica(1,p,"Dolor Estomacal",5,null,20);		
		Factura f=new Factura(1, cm, 20.50);
		
		assertTrue(LibroDiarioEmpresa.guardarSuscripcionPagos(1, f)==true);
		
		
	}

}
