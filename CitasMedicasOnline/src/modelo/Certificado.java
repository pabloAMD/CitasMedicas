package modelo;

import java.util.Date;

public class Certificado {
	
	private int codigo;
	private Date fecha;
	private String motivo;
	
	public Certificado() {
		
	}

	public Certificado(int codigo, Date fecha, String motivo) {
		super();
		this.codigo = codigo;
		this.fecha = fecha;
		this.motivo = motivo;
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
	
	

}
