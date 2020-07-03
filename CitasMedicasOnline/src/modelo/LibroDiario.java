package modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LibroDiario implements Serializable {
	
	@Id
	private int codigo;
	private Date fecha;
	private Factura factura;
	
	
	
	public LibroDiario() {
		super();
		// TODO Auto-generated constructor stub
	}


	public LibroDiario(Date fecha, Factura factura) {
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
	
	public static double calcularEgresos(Factura f) {
		return f.getTotal();
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	
	
	
}
