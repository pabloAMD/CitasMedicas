package modelo;

public class PagoSuscripcion {
	
	
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
