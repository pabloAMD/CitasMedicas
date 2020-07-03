package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Agenda implements Serializable{
	@Id
	private int id;
	private List<Consulta> consultalist;
	
	public Agenda() {
		consultalist = new ArrayList<Consulta>();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Consulta> getConsultalist() {
		return consultalist;
	}

	public void setConsultalist(List<Consulta> consultalist) {
		this.consultalist = consultalist;
	}
	
	public void agregarConsulta( Consulta consulta) {
		
		this.consultalist.add(consulta);
		
	}
	
	

}
