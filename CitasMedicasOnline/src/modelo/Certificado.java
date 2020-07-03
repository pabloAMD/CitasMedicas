package modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Certificado {
	
	@Id
	private int codigo;
	private Date fecha;
	private String motivo;
	private boolean estadoVlidacion;
	
	public Certificado() {
		
	}

	public Certificado(int codigo, Date fecha, String motivo) {
	
		this.codigo = codigo;
		this.fecha = fecha;
		this.motivo = motivo;
		this.estadoVlidacion = false;
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

	@Override
	public String toString() {
		return "Certificado [codigo=" + codigo + ", fecha=" + fecha + ", motivo=" + motivo + ", estadoVlidacion="
				+ estadoVlidacion + "]";
	}
	
	
	

}
