package modelo;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Certificado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private Date fecha;
	private String motivo;
	private boolean estadoVlidacion;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "certificado")
	private Consulta consultaCertificado;
	
	public Certificado() {
		
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

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public boolean isEstadoVlidacion() {
		return estadoVlidacion;
	}

	public void setEstadoVlidacion(boolean estadoVlidacion) {
		this.estadoVlidacion = estadoVlidacion;
	}

	public Consulta getConsultaCertificado() {
		return consultaCertificado;
	}

	public void setConsultaCertificado(Consulta consultaCertificado) {
		this.consultaCertificado = consultaCertificado;
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
		Certificado other = (Certificado) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}


	
	
	

}
