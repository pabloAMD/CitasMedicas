package modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Especialidad  implements Serializable{
	
	@Id
	private int id;
	private  String nombreEspecialidad;
	
	public Especialidad() {
		 
	}
	

	public Especialidad(int id, String nombreEspecialidad) {
		super();
		this.id = id;
		this.nombreEspecialidad = nombreEspecialidad;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreEspecialidad() {
		return nombreEspecialidad;
	}

	public void setNombreEspecialidad(String nombreEspecialidad) {
		this.nombreEspecialidad = nombreEspecialidad;
	}
	
	

}
