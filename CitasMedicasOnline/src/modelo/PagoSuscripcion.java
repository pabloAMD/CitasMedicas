package modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PagoSuscripcion implements Serializable{
	
	@Id
	private int id;
	private Factura factura;
	
	public PagoSuscripcion() {
		
	}

	public void setId(int id) {
		this.id = id;
	}

	

}
