package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class LibroDiarioEmpresa implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private Date fecha;
	private double saldo;
	
	@OneToOne
	@JoinColumn
	private Administrador libroDiarioEmpresa;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pagos")
	private List<PagoSuscripcion> pagSubscripcionesList;

	public LibroDiarioEmpresa() {
		
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

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Administrador getLibroDiarioEmpresa() {
		return libroDiarioEmpresa;
	}

	public void setLibroDiarioEmpresa(Administrador libroDiarioEmpresa) {
		this.libroDiarioEmpresa = libroDiarioEmpresa;
	}

	public List<PagoSuscripcion> getPagSubscripcionesList() {
		return pagSubscripcionesList;
	}

	public void setPagSubscripcionesList(List<PagoSuscripcion> pagSubscripcionesList) {
		this.pagSubscripcionesList = pagSubscripcionesList;
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
		LibroDiarioEmpresa other = (LibroDiarioEmpresa) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}
	


	
}
