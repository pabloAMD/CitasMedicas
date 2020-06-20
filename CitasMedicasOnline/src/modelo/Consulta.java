package modelo;

import java.util.Date;

public class Consulta {
	
	private String hora;
	private OrdenMedica ordenMedica;
	private Medico medico;
	private Certificado certificado;
	private String observaciones;
	private Date fechaConsulta;
	
	
	
	public Consulta() {
		
	}
	
	public Consulta(String hora, OrdenMedica ordenMedica, Medico medico, Certificado certificado, String observaciones,
			Date fechaConsulta) {
		super();
		this.hora = hora;
		this.ordenMedica = ordenMedica;
		this.medico = medico;
		this.certificado = certificado;
		this.observaciones = observaciones;
		this.fechaConsulta = fechaConsulta;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public OrdenMedica getOrdenMedica() {
		return ordenMedica;
	}
	public void setOrdenMedica(OrdenMedica ordenMedica) {
		this.ordenMedica = ordenMedica;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Certificado getCertificado() {
		return certificado;
	}
	public void setCertificado(Certificado certificado) {
		this.certificado = certificado;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public Date getFechaConsulta() {
		return fechaConsulta;
	}
	public void setFechaConsulta(Date fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}
	
	
	

}
