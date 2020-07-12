package modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Especialidad  implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private  String nombreEspecialidad;
	
	@OneToOne
	@JoinColumn
	private Medico mEspecialidad;
	
	
	public Especialidad() {
		 
	}

	

	public Especialidad( String nombreEspecialidad) {
		
		
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


	public Medico getmEspecialidad() {
		return mEspecialidad;
	}


	public void setmEspecialidad(Medico mEspecialidad) {
		this.mEspecialidad = mEspecialidad;
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
		Especialidad other = (Especialidad) obj;
		if (id != other.id)
			return false;
		return true;
	}
	

	
}
