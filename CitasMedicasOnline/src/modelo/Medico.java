package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Medico extends Persona implements Serializable{
	
	private int id_medico;
	
	private Especialidad especialidad;
	
	private String horarioAtencion;
	
	
	private List<Certificado> certificados;
	
	
	private CitaMedica citamedica;
	
	
	private Secretaria secretaria;
	
	public Medico() {
		
		
	}
	

	public int getId_medico() {
		return id_medico;
	}

	public void setId_medico(int id_medico) {
		this.id_medico = id_medico;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public String getHorarioAtencion() {
		return horarioAtencion;
	}

	public void setHorarioAtencion(String horarioAtencion) {
		this.horarioAtencion = horarioAtencion;
	}

	
	public static boolean actualizarHorarioAtencion(Medico medico,String horarioNuevo) {
		
			medico.setHorarioAtencion(horarioNuevo);
			return true;	
		
	}
	
	public static boolean validarCertificado(Consulta consulta) {

		consulta.getCertificado().setEstadoVlidacion(true);
		return true;
		
		
	}
	
	
	public static boolean crearOrdenMedica(Consulta consulta, OrdenMedica ordenMedica) {
		
			consulta.setOrdenMedica(ordenMedica);
			return true;
		
	
	}
	
	
	
		
	
	
	
	
	
	

}
