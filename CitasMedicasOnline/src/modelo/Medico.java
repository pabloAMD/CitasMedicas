package modelo;

import java.util.ArrayList;
import java.util.List;

public class Medico {
	
	private int id_medico;
	private Especialidad especialidad;
	private String horarioAtencion;
	private List<Certificado> certificados;
	private Secretaria secretaria;
	
	public Medico() {
		this.certificados = new ArrayList<Certificado>();
		
	}
	
	

	public Medico(int id_medico, Especialidad especialidad, String horarioAtencion,
			Secretaria secretaria) {
		super();
		this.id_medico = id_medico;
		this.especialidad = especialidad;
		this.horarioAtencion = horarioAtencion;
	
		this.secretaria = secretaria;
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

	public List<Certificado> getCertificados() {
		return certificados;
	}

	public void setCertificados(List<Certificado> certificados) {
		this.certificados = certificados;
	}

	public Secretaria getSecretaria() {
		return secretaria;
	}

	public void setSecretaria(Secretaria secretaria) {
		this.secretaria = secretaria;
	}
	
	public void agregarCertificados( Certificado certificado) {
		this.certificados.add(certificado);
		
	}
	
	
	
	
	
	
	

}
