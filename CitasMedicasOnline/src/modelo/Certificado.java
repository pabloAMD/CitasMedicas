package modelo;

import java.util.Date;

public class Certificado {
	
	private int codigo;
	private Date fecha;
	private String motivo;
	private boolean estadoVlidacion;
	
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


	public void setEstadoVlidacion(boolean estadoVlidacion) {
		this.estadoVlidacion = estadoVlidacion;
	}

	
	
	
	

}
