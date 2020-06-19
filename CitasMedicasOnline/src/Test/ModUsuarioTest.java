package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.Suscripcion;

public class ModUsuarioTest {

	
	@Test
	public void agregarSaldo() {
		assertTrue(Suscripcion.agregarSaldo(50.50)==181.00);
	}
	
	@Test
	public void actualizarSaldo() {
		assertTrue(Suscripcion.actualizarSaldo(50.50)==130.50);
	}

}
