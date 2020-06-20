package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.Factura;
import modelo.LibroDiario;

public class LibroDiarioTest {

	@Test
	public void calcularEgresos() {
		Factura f= new Factura();
		assertTrue(LibroDiario.calcularEgresos(f)==316.0);
	}

}
