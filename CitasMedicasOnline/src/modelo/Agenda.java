package modelo;

import java.io.Serializable;
import java.util.ArrayList;
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

	@OneToOne
	@JoinColumn
	private Secretaria agenda;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "agendaConsulta")
	private List<Consulta> consultas;
	
	

	public Agenda() {
		
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	

	public Secretaria getAgenda() {
		return agenda;
	}


	public void setAgenda(Secretaria agenda) {
		this.agenda = agenda;
	}


	public List<Consulta> getConsultas() {
		return consultas;
	}


	public void setConsultas(List<Consulta> consultas) {
		this.consultas = consultas;
	}


	public static boolean guardarConsulta(Consulta consulta) {
		List<Consulta> consultalist = new ArrayList<Consulta>();
		consultalist.add(consulta);
		System.out.println(consultalist.size());
		return true;

	}

	public static boolean actualizarConsulta(Consulta consulta) {
		List<Consulta> consultalist = new ArrayList<Consulta>();
		consultalist.add(consulta);
		consulta.setObservaciones("cancer terminal");
		consultalist.add(consultalist.indexOf(consulta), consulta);
		return true;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Agenda other = (Agenda) obj;
		if (id != other.id)
			return false;
		return true;
	}


	
	
	

}
