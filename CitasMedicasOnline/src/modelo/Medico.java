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
	
	

	public Medico(int id_medico, Especialidad especialidad, String horarioAtencion,
			Secretaria secretaria) {
		
		this.id_medico = id_medico;
		this.especialidad = especialidad;
		this.horarioAtencion = horarioAtencion;
		this.secretaria = secretaria;
		this.certificados = new ArrayList<Certificado>();
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



	@Override
	public void validarCedula() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void validarCorreo() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public String toString() {
		return "Medico [id_medico=" + id_medico + ", especialidad=" + especialidad + ", horarioAtencion="
				+ horarioAtencion + ", certificados=" + certificados + ", secretaria=" + secretaria + "]";
	}
	
	
	
	public static boolean actualizarHorarioAtencion(Medico medico,String horarioNuevo) {
		
		if(medico != null) {
			medico.setHorarioAtencion(horarioNuevo);
			return true;
		}else {
			return false;
		}
		
		
	}
	
	public static boolean validarCertificado(Consulta consulta) {
		if(consulta != null) {
		consulta.getCertificado().setEstadoVlidacion(true);
		return true;
		}else {
			return false;
		}
		
		
		
	}
	
	
	public static boolean crearOrdenMedica(Consulta consulta, OrdenMedica ordenMedica) {
		
		if((consulta != null)&&(ordenMedica != null)) {
			consulta.setOrdenMedica(ordenMedica);
			return true;
		}else {
			return false;
		}
	
	}
	
	
	
	public boolean crearOrdenMedica(int id, String textoReceta) {
		if( textoReceta != null) {
			OrdenMedica receta = new OrdenMedica();
			receta.setId(id);
			receta.setReceta(textoReceta);
		return true;
		}
		return false;
	}
		
	
	
	
	
	
	

}
