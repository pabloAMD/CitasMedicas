package modelo;

public class OrdenMedica {

	
	private int id;
	private String receta;
	
	
	public OrdenMedica() {
		
	}


	public OrdenMedica(int id, String receta) {
	
		this.id = id;
		this.receta = receta;
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
