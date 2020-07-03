package modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import controlador.Gestion;

@Entity
public class Administrador  extends Persona implements Serializable{
	
	
	private int id;
	
	public Administrador() { 
		
	}
	
	//calcular Sueldo Total
	
	public double CalcularSueldo(double sueldo,double comision,double descuento) {
		return ((sueldo+comision)-descuento);
		
	}
	

	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void validarCedula() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validarCorreo() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	

}
