package modelo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Factura implements Serializable {
	
	@Id
	private int codigo;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "factura")
	private CitaMedica citaMedica;
	
	private double total;
	

	public Factura() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Factura(int codigo, CitaMedica citaMedica, double total) {
		
		this.codigo = codigo;
		this.citaMedica = citaMedica;
		this.total = total;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public CitaMedica getCitaMedica() {
		return citaMedica;
	}
	public void setCitaMedica(CitaMedica citaMedica) {
		this.citaMedica = citaMedica;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	
	 
	// calcular total factura
	
	public static double TotalFact(double costoConsulta, int iva, double descuento) {
		double ivas=(costoConsulta*iva)/100;
		double des=(ivas*descuento)/100;
		System.out.println("valor "+((costoConsulta+ivas)-des));
		return ((costoConsulta+ivas)-des);
		
	}

	
}
