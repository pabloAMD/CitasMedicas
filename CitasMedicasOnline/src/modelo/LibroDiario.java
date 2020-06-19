package modelo;

import java.util.Date;

public class LibroDiario {
	
	private Date fecha;
	private Factura factura;
	
	
	public LibroDiario(Date fecha, Factura factura) {
		super();
		this.fecha = fecha;
		this.factura = factura;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public Factura getFactura() {
		return factura;
	}


	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	
	
	
	
}
