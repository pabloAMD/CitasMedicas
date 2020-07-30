package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity

public class Agenda implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String notas;
	private String fecha;

	@OneToOne
	@JoinColumn
	private Secretaria secretaria;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "agendaConsulta")
	private List<Consulta> consultas;
	
	

	public Agenda() {
		
	}

	
	public Agenda(String notas, String fecha) {
		
		this.notas = notas;
		this.fecha = fecha;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	

	public String getNotas() {
		return notas;
	}


	public void setNotas(String notas) {
		this.notas = notas;
	}


	

	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	


	public Secretaria getSecretaria() {
		return secretaria;
	}


	public void setSecretaria(Secretaria secretaria) {
		this.secretaria = secretaria;
	}


	public List<Consulta> getConsultas() {
		return consultas;
	}


	public void setConsultas(List<Consulta> consultas) {
		this.consultas = consultas;
	}


	





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}


	


	@Override
	public String toString() {
		return "Agenda [id=" + id + ", notas=" + notas + ", fecha=" + fecha + ", agenda=" + secretaria + ", consultas="
				+ consultas + "]";
	}


	
	
	

}
