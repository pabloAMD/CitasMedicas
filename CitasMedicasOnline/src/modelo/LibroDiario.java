package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class LibroDiario implements Serializable {
	
	@Id
	private int codigo;
	private Date fecha;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "libroDiario")
	private List<Factura> factura;
	
	

	@ManyToOne
	@JoinColumn
	private Suscripcion suscripcion;


	public LibroDiario() {
		// TODO Auto-generated constructor stub
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public List<Factura> getFactura() {
		return factura;
	}


	public void setFactura(List<Factura> factura) {
		this.factura = factura;
	}


	public Suscripcion getSuscripcion() {
		return suscripcion;
	}


	public void setSuscripcion(Suscripcion suscripcion) {
		this.suscripcion = suscripcion;
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
		LibroDiario other = (LibroDiario) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}


	
	
}
