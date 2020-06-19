package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.Factura;
import modelo.LibroDiarioEmpresa;

public class LibroDiarioEmpresaTest {


	
	
	@Test
	public void guardarSuscripcion() {
		Factura f=new Factura();
		f.setCodigo(1);
		f.setTotal(20.0);
		assertTrue(LibroDiarioEmpresa.guardarSuscripcionPagos(1, f)==true);
	}

}
