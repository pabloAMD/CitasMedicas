package modelo;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	
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
