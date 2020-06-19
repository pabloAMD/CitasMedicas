package modelo;

public class Sueldo {
	
	
	private double valor;
	private double comisiones;
	private double multas;
	
	public Sueldo() {
		
	}
	
	public Sueldo(double valor, double comisiones, double multas) {
		
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
