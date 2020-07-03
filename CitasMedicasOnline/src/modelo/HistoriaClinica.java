package modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HistoriaClinica implements Serializable{
	
	@Id
	private int id;
	private String observaciones;
	private List<CitaMedica> citamedicaList;
	

	

	public HistoriaClinica() {
		super();
	}


	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getObservaciones() {
		return observaciones;
	}


	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public static boolean guardarHistoriaClinica(int id, String observacion) {
		HistoriaClinica hc = new HistoriaClinica();
		hc.setId(hc.getId());
		hc.setObservaciones(hc.getObservaciones());
		System.out.println("Historia Clinica Creada");
		return true;
	}
	
}
