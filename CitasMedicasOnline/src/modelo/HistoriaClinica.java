package modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class HistoriaClinica implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;


	private String observaciones;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "historiaClinica")
	private List<CitaMedica> citamedicaList;

	public HistoriaClinica() {
		
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
		HistoriaClinica other = (HistoriaClinica) obj;
		if (id != other.id)
			return false;
		return true;
	}
	

	

}
