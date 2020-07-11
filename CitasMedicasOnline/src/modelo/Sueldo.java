package modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sueldo implements Serializable{
	
	
	@Id
	private int codigo;
	private double valor;
	private double comisiones;
	private double multas;
	
	public Sueldo() {
		
	}




	public Sueldo(int codigo, double valor, double comisiones, double multas) {
		
		this.codigo = codigo;
		this.valor = valor;
		this.comisiones = comisiones;
		this.multas = multas;
	}




	public double getValor() {
		return valor;
	}



	public void setValor(double valor) {
		this.valor = valor;
	}



	public double getComisiones() {
		return comisiones;
	}



	public void setComisiones(double comisiones) {
		this.comisiones = comisiones;
	}



	public double getMultas() {
		return multas;
	}



	public void setMultas(double multas) {
		this.multas = multas;
	}
	
	
	
	
	

}
