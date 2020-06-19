package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import controlador.Gestion;

public class GestionTest {
/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	*/
	
	@Test 
	public void testgestio() {
		
		int resultado = Gestion.suma(1);
		System.out.println(resultado);
		int esperado = 6;
		
		assertEquals(resultado, esperado);
	}

}
