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


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	
	
	
	
}
