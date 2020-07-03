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

	public PagoSuscripcion(int id, Factura factura) {
		super();
		this.id = id;
		this.factura = factura;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	
	

}
