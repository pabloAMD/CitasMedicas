package modelo;

import controlador.Gestion;

public class Administrador {
	
	private int id;
	
	
	
	public Administrador() { 
		
		
		
	}
	
	//calcular Sueldo Total
	
	public double CalcularSueldo(double sueldo,double comision,double descuento) {
		return ((sueldo+comision)-descuento);
		
	}
	
	
	
	
	
	
	

}
