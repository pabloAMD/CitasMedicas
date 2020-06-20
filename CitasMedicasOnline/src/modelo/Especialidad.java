package modelo;

public class Especialidad {
	
	public int id;
	public String nombreEspecialidad;
	
	public Especialidad() {
		 
	}
	

	public Especialidad(int id, String nombreEspecialidad) {
		super();
		this.id = id;
		this.nombreEspecialidad = nombreEspecialidad;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setNombreEspecialidad(String nombreEspecialidad) {
		this.nombreEspecialidad = nombreEspecialidad;
	}
	
	

}
