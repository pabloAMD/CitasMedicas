package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.Factura;

public class Factur {
	
	Factura fac = new Factura();
	
	@Test
	public void actualizarSaldo() {
		
		assertTrue(Factura.TotalFact(80.0,12,10.0)==88.64);
	}

}
