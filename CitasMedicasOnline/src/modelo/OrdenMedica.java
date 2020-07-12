package modelo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class OrdenMedica implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String receta;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "recetaMedica")
	private Consulta recetaConsulta;
	
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

	public Consulta getRecetaConsulta() {
		return recetaConsulta;
	}

	public void setRecetaConsulta(Consulta recetaConsulta) {
		this.recetaConsulta = recetaConsulta;
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
		OrdenMedica other = (OrdenMedica) obj;
		if (id != other.id)
			return false;
		return true;
	}
 
	
	
}
