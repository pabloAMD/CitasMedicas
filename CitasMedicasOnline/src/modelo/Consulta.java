package modelo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Consulta {
	
	private String hora;
	private OrdenMedica ordenMedica;
	private Medico medico;
	private CitaMedica citaMedica;
	private Certificado certificado;
	private String observaciones;
	private Date fechaConsulta;

	
	
	public Consulta() {
		
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
	public CitaMedica getCitaMedica() {
		return citaMedica;
	}

	public void setCitaMedica(CitaMedica citaMedica) {
		this.citaMedica = citaMedica;
	}
	
	
	

	


	public static boolean crearCertificado(int id, String entrada, String motivo, Consulta consulta) {
	
		Certificado certific = new Certificado();
		
		DateFormat format = new SimpleDateFormat("DD/MM/YYYY"); // Creamos un formato de fecha
		Date fecha = null;
		try {
			fecha = format.parse(entrada);
			certific.setCodigo(id);
			certific.setMotivo(motivo);
			certific.setFecha(fecha);
			consulta.setCertificado(certific);
			
			
			return true;
		} catch (ParseException e) {
			
	
			return false;
		} 
		
		
		
		
	}
	
	
	


}
