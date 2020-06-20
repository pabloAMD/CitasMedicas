package modelo;

import java.util.Date;

public class LibroDiario {
	
	private Date fecha;
	private Factura factura;
	
	

	public LibroDiario(Date fecha, Factura factura) {
		this.fecha = fecha;
		this.factura = factura;
	}


	public LibroDiario() {
		// TODO Auto-generated constructor stub
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	
	public static double calcularEgresos(Factura f) {
		double n= Factura.TotalFact(300, 12, 20);
		System.out.println("total"+n);
		return n;
	}
	
	
	
	
}
