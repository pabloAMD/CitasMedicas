package modelo;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Consulta implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String hora;
	
	
	private OrdenMedica ordenMedica;
	
	@ManyToOne
	@JoinColumn	
	private Medico consulta;
	
	
	@ManyToOne
	@JoinColumn
	private Agenda agendaConsulta;
	
	@OneToOne
	@JoinColumn
	private OrdenMedica recetaMedica;
	
	@OneToOne
	@JoinColumn
	private Certificado certificado;
	
	@OneToOne
	@JoinColumn
	private CitaMedica citaMedica;
	
	private String observaciones;
	private Date fechaConsulta;

	
	
	public Consulta() {
		
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



	public Medico getConsulta() {
		return consulta;
	}



	public void setConsulta(Medico consulta) {
		this.consulta = consulta;
	}



	public Agenda getAgendaConsulta() {
		return agendaConsulta;
	}



	public void setAgendaConsulta(Agenda agendaConsulta) {
		this.agendaConsulta = agendaConsulta;
	}



	public OrdenMedica getRecetaMedica() {
		return recetaMedica;
	}



	public void setRecetaMedica(OrdenMedica recetaMedica) {
		this.recetaMedica = recetaMedica;
	}



	public Certificado getCertificado() {
		return certificado;
	}



	public void setCertificado(Certificado certificado) {
		this.certificado = certificado;
	}



	public CitaMedica getCitaMedica() {
		return citaMedica;
	}



	public void setCitaMedica(CitaMedica citaMedica) {
		this.citaMedica = citaMedica;
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
		Consulta other = (Consulta) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	

	


}
