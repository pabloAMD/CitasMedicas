package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.HistoriaClinica;



public class HistoriaClinicaTest {

	
	@Test
	public void guardarRegistroClinico() {
		
	assertTrue(HistoriaClinica.guardarHistoriaClinica(1,"Tomar Mucha agua")==true);
		
	}
	
	
 
}
