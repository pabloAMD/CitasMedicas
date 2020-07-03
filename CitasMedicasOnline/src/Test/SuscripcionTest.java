package Test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import modelo.Factura;
import modelo.LibroDiario;
import modelo.Suscripcion;

public class SuscripcionTest {

	@Test
	public void agregarSaldo() {
		assertTrue(Suscripcion.agregarSaldo(50.50)==181.0);
	}
	
	@Test
	public void actualizarSaldo() {
		assertTrue(Suscripcion.actualizarSaldo(50.50)==130.5);
	}
	
	@Test
	public void agregaLibroDiario() {
		LibroDiario l= new LibroDiario();
		l.setFecha(new Date());
		Factura f= new Factura(); 
		
		f.setCodigo(1);
		f.setTotal(350.87);
		
		
		
		assertTrue(Suscripcion.agregarLibroDiario(l.getFecha(), f));
	}

}
