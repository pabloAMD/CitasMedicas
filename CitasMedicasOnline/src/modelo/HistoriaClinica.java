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
	
	
	public HistoriaClinica(int id, String observaciones) {
		super();
		this.id = id;
		this.observaciones = observaciones;
	}
	 
	

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


	public List<CitaMedica> getCitamedicaList() {
		return citamedicaList;
	}


	public void setCitamedicaList(List<CitaMedica> citamedicaList) {
		this.citamedicaList = citamedicaList;
	}
	
	
	public static boolean guardarHistoriaClinica(int id, String observacion) {
		HistoriaClinica hc = new HistoriaClinica();
		hc.setId(id);
		hc.setObservaciones(observacion);
		System.out.println("Historia Clinica Creada");
		return true;
	}
	
}
