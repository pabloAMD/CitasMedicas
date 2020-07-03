package modelo;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Consulta implements Serializable {
	
	@Id
	private int codigo;
	private String hora;
	private OrdenMedica ordenMedica;
	private Medico medico;
	private CitaMedica citaMedica;
	private Certificado certificado;
	private String observaciones;
	private Date fechaConsulta;

	
	
	public Consulta() {
		
	}
	
	public Consulta(int codigo, String hora, OrdenMedica ordenMedica, Medico medico,CitaMedica paciente, Certificado certificado, String observaciones,
			Date fechaConsulta) {
		this.codigo=codigo;
		this.hora = hora;
		this.ordenMedica = ordenMedica;
		this.medico = medico;
		this.citaMedica = paciente;
		this.certificado = certificado;
		this.observaciones = observaciones;
		this.fechaConsulta = fechaConsulta;
	}
	
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	
	
	
	
	@Override
	public String toString() {
		return "Consulta [hora=" + hora + ", ordenMedica=" + ordenMedica + ", medico=" + medico + ", citaMedica="
				+ citaMedica + ", certificado=" + certificado + ", observaciones=" + observaciones + ", fechaConsulta="
				+ fechaConsulta + "]";
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
			
			e.printStackTrace();
			return false;
		} 
		
		
		
		
	}
	
	
	

}
