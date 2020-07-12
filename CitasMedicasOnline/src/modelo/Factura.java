package modelo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Factura implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@OneToOne
	@JoinColumn
	private CitaMedica citaFactura;
	
	@ManyToOne
	@JoinColumn
	private PagoSuscripcion facturas;
	
	@ManyToOne
	@JoinColumn
	private LibroDiario libroDiario;
	
	private double total;
	

	public Factura() {
		
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public CitaMedica getCitaFactura() {
		return citaFactura;
	}


	public void setCitaFactura(CitaMedica citaFactura) {
		this.citaFactura = citaFactura;
	}


	public PagoSuscripcion getFacturas() {
		return facturas;
	}


	public void setFacturas(PagoSuscripcion facturas) {
		this.facturas = facturas;
	}


	public LibroDiario getLibroDiario() {
		return libroDiario;
	}


	public void setLibroDiario(LibroDiario libroDiario) {
		this.libroDiario = libroDiario;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Factura other = (Factura) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	
	

	
}
