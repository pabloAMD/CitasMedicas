package modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class OrdenMedica implements Serializable {

	@Id
	private int id;
	private String receta;
	
	
	public OrdenMedica() {
		
	}
 
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getReceta() {
		return receta;
	}


	public void setReceta(String receta) {
		this.receta = receta;
	}
	
	
	
}
